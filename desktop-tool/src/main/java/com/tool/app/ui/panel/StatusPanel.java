package com.tool.app.ui.panel;

import cn.hutool.core.lang.TypeReference;
import com.alibaba.fastjson.JSON;
import com.spinfosec.connector.http.HttpRequest;
import com.spinfosec.connector.sftp.FtpRequest;
import com.spinfosec.core.FileInfo;
import com.spinfosec.core.JSONUtil;
import com.spinfosec.core.Request;
import com.spinfosec.core.Response;
import com.spinfosec.core.SpinfoExecutor;
import com.spinfosec.core.SpinfoInfo;
import com.tool.app.App;
import com.tool.app.db.Event;
import com.tool.app.db.Page;
import com.tool.app.db.Task;
import com.tool.app.ui.UiConsts;
import com.tool.app.ui.component.MyIconButton;
import com.tool.app.ui.listener.DropTargetListenerImpl;
import com.tool.app.util.ConfigManager;
import com.tool.app.util.ConstantsTools;
import com.tool.app.util.DESPlus;
import org.apache.commons.lang3.StringUtils;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.imageio.ImageIO;
import javax.swing.*;
import javax.swing.event.PopupMenuEvent;
import javax.swing.event.PopupMenuListener;
import java.awt.*;
import java.awt.dnd.DnDConstants;
import java.awt.dnd.DropTarget;
import java.awt.dnd.DropTargetListener;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.geom.Rectangle2D;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.Random;
import java.util.UUID;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import java.util.stream.Collectors;
import java.util.stream.IntStream;


/**
 * 状态面板
 */
public class StatusPanel extends JPanel
{
    private static final long serialVersionUID = 1L;

    private static final Logger logger = LoggerFactory.getLogger(StatusPanel.class);

    public static MyIconButton buttonStop;

    public static JProgressBar testProgress;
    public static MyIconButton testProgressStopBtn;

    public static JPanel filePanel;
    public static JPanel clickPanel;
    public static JPanel resultPanel;
    public static JTextArea resultTextArea;

    public static EventModel<Event> eventTableModel;
    public static EventView eventView;

    public static final String[] EVENT_TABLE_COLUMN_NAMES = new String[]{"序号", "文件名称", "命中规则", "涉密概率", "匹配内容", "失败文件", "操作"};

    public static JComboBox<Item> jobComboBox;

    public static DefaultComboBoxModel<Item> comboBoxModel;

    public boolean isRunning = false;

    private String currentActiveMQIp;

    private String currentRunningRequestId;

    public static ExecutorService service = Executors.newFixedThreadPool(2);

    private PagePanel<Event> pagePanel;

    /**
     * 构造
     */
    public StatusPanel()
    {
        super(true);
        initialize();
        addComponent();
        addListener();
    }

    /**
     * 初始化
     */
    private void initialize()
    {
        this.setBackground(Color.WHITE);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
    }

    /**
     * 添加组件
     */
    private void addComponent()
    {
        this.add(getUpPanel(), BorderLayout.NORTH);
        this.add(getCenterPanel(), BorderLayout.CENTER);
        this.add(getDownPanel(), BorderLayout.SOUTH);
    }

    /**
     * 上部面板
     */
    private JPanel getUpPanel()
    {
        JPanel panelUp = new JPanel();
        panelUp.setBackground(Color.WHITE);
        panelUp.setPreferredSize(new Dimension(800, 40));
        panelUp.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

//        JLabel labelTitle = new JLabel(App.resourceBundle.getString("ui.status.title"));
//        labelTitle.setFont(UiConsts.FONT_TITLE);
//        labelTitle.setForeground(UiConsts.TOOL_BAR_BACK_COLOR);
//        panelUp.add(labelTitle);

        JPanel comboBoxPanel = new JPanel();
        comboBoxPanel.setPreferredSize(new Dimension(330, 40));
        comboBoxPanel.setBackground(Color.WHITE);
        comboBoxPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 5));

        JLabel label4ComboBox = new JLabel("检查策略：");
        label4ComboBox.setFont(UiConsts.FONT_NORMAL);
        label4ComboBox.setPreferredSize(new Dimension(80, 30));
        comboBoxPanel.add(label4ComboBox);

        jobComboBox = new JComboBox<>();
        jobComboBox.setPreferredSize(new Dimension(200, 25));
        comboBoxModel = new DefaultComboBoxModel<>();
        comboBoxModel.addElement(new Item("", "请选择策略"));
        jobComboBox.setModel(comboBoxModel);
        comboBoxPanel.add(jobComboBox);
        panelUp.add(comboBoxPanel);

        JPanel progressPanel = new JPanel();
        progressPanel.setPreferredSize(new Dimension(380, 40));
        progressPanel.setBackground(Color.WHITE);
        progressPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 5));

        JLabel labelProgress = new JLabel(App.resourceBundle.getString("ui.status.progress.current"));
        labelProgress.setFont(UiConsts.FONT_NORMAL);
        testProgress = new JProgressBar();

        labelProgress.setPreferredSize(new Dimension(80, 30));
        testProgress.setPreferredSize(new Dimension(300, 20));
        testProgress.setBackground(Color.WHITE);
        testProgress.setForeground(Color.RED);
        testProgress.setStringPainted(true);

        progressPanel.add(labelProgress);
        progressPanel.add(testProgress);

        panelUp.add(progressPanel);

        JPanel progressBtnPanel = new JPanel();
        progressBtnPanel.setPreferredSize(new Dimension(75, 30));
        progressBtnPanel.setBackground(Color.WHITE);
        progressBtnPanel.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));
        testProgressStopBtn = new MyIconButton(UiConsts.ICON_STOP_PROGRESS, UiConsts.ICON_STOP_PROGRESS, UiConsts.ICON_STOP_PROGRESS, "");
        progressBtnPanel.add(testProgressStopBtn);
        panelUp.add(progressBtnPanel);
        return panelUp;
    }

    /**
     * 中部面板
     */
    private JPanel getCenterPanel()
    {
        // 中间面板
        JPanel panelCenter = new JPanel();
        panelCenter.setBackground(UiConsts.MAIN_BACK_COLOR);
        panelCenter.setPreferredSize(new Dimension(800, 480));
        panelCenter.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

        filePanel = new JPanel()
        {
            Rectangle2D rect2d = new Rectangle2D.Float();

            public void paint(Graphics g)
            {
                super.paint(g);
                Graphics2D g2d = (Graphics2D) g;
                g2d.setColor(Color.GRAY);
                rect2d.setRect(5, 5, getWidth() - 10, getHeight() - 10);
                g2d.setStroke(new BasicStroke(1.0f, BasicStroke.CAP_BUTT, BasicStroke.JOIN_MITER, 10.0f, new float[]{5.0f}, 0.0f));
                g2d.draw(rect2d);

//                g2d.setStroke(new BasicStroke(1.0f, BasicStroke.CAP_ROUND, BasicStroke.JOIN_ROUND, 1f));
//                RoundRectangle2D rectBtn = new RoundRectangle2D.Double((int)(getWidth() / 2) - 100, (int)(getHeight() / 2) - 14, 100, 28, 12, 12);
//                g2d.setColor(Color.red);
//                g2d.fillRoundRect((int)(getWidth() / 2) - 100, (int)(getHeight() / 2) - 14, 100, 28, 12, 12);
//                g2d.draw(rectBtn);
//
//                g2d.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
//                g2d.setPaint(Color.WHITE);
//                g2d.setFont(new Font("微软雅黑", Font.PLAIN, 17));
//                g2d.drawString("上传文件", (int) (getWidth() / 2) - 88, (int) (getHeight() / 2 + 8));
            }
        };
        filePanel.setBackground(new Color(242, 242, 242));
        filePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 10));
        filePanel.setPreferredSize(new Dimension(800, 60));

        clickPanel = new JPanel()
        {
            @Override
            public void paint(Graphics g)
            {
                super.paint(g);
                Graphics2D g2d = (Graphics2D) g;
                try
                {
                    InputStream input = App.class.getClassLoader().getResourceAsStream("icon/file_tip.png");
                    g2d.drawImage(ImageIO.read(input), 0, 0, 356, 39, null);
                }
                catch (IOException e)
                {
                }
            }
        };
        clickPanel.setPreferredSize(new Dimension(356, 39));
        clickPanel.setBackground(Color.YELLOW);
        filePanel.add(clickPanel);

        panelCenter.add(filePanel);

//        resultPanel = new JPanel();
//        resultPanel.setBorder(BorderFactory.createLineBorder(Color.red));
//        resultPanel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 0));
//        resultPanel.setPreferredSize(new Dimension(800, 320));

        java.util.List<Event> eventList = new ArrayList<>();
//        IntStream.range(0, 20).forEach(i ->
//        {
//            Event event2 = new Event();
//            event2.setIndex(i + 1);
//            event2.setFileName("2021-04-04测试文档12点20分.tar");
//            event2.setTaskId("uuid-" + i);
//            event2.setRule("rule-" + i);
//
//            String str = ",;'][=-`1.zip/,;'][=-`1/路径10/路径9/路径8/路径7/路径6/路径5/路径4/路径3/路径2/路径1/测试文档.txt\n" +
//                    "服务。c）智慧城市应用提供商。作为机密智慧城市服务提供者，为智慧城市开发应用，;\n" +
//                    "\n" +
//                    ",;'][=-`1.zip/,;'][=-`1/路径10/路径9/路径8/路径7/路径6/路径5/路径4/路径3/路径2/路径1/测试文档.doc\n" +
//                    "询服务。c）智慧城市应用提供商。作为机密智慧城市服务提供者，为智慧城市开发应用，;\n" +
//                    "\n" +
//                    ",;'][=-`1.zip/,;'][=-`1/路径10/路径9/路径8/路径7/路径6/路径5/路径4/路径3/路径2/路径1/测试文档.pdf\n" +
//                    "询服务。c）智慧城市应用提供商。作为机密智慧城市服务提供者，为智慧城市开发应用，;\n" +
//                    "\n" +
//                    ",;'][=-`1.zip/,;'][=-`1/路径10/路径9/路径8/路径7/路径6/路径5/路径4/路径3/路径2/路径1/测试文档.doc\n" +
//                    "询服务。c）智慧城市应用提供商。作为机密智慧城市服务提供者，为智慧城市开发应用，;\n" +
//                    "\n" +
//                    ",;'][=-`1.zip/,;'][=-`1/路径10/路径9/路径8/路径7/路径6/路径5/路径4/路径3/路径2/路径1/测试文档.pptx\n" +
//                    "服务。c）智慧城市应用提供商。作为机密智慧城市服务提供者，为智慧城市开发应用，;\n" +
//                    "\n" +
//                    ",;'][=-`1.zip/,;'][=-`1/路径10/路径9/路径8/路径7/路径6/路径5/路径4/路径3/路径2/路径1/测试文档.txt\n" +
//                    "服务。c）智慧城市应用提供商。作为机密智慧城市服务提供者，为智慧城市开发应用，;\n" +
//                    "\n" +
//                    ",;'][=-`1.zip/,;'][=-`1/路径10/路径9/路径8/路径7/路径6/路径5/路径4/路径3/路径2/路径1/测试文档.docx\n" +
//                    "询服务。c）智慧城市应用提供商。作为机密智慧城市服务提供者，为智慧城市开发应用，;\n" +
//                    "\n" +
//                    ",;'][=-`1.zip/,;'][=-`1/路径10/路径9/路径8/路径7/路径6/路径5/路径4/路径3/路径2/路径1/测试文档.ppt\n" +
//                    "服务。c）智慧城市应用提供商。作为机密智慧城市服务提供者，为智慧城市开发应用，;\n" +
//                    "\n" +
//                    ",;'][=-`1.zip/,;'][=-`1/路径10/路径9/路径8/路径7/路径6/路径5/路径4/路径3/路径2/路径1/测试文档.docx\n" +
//                    "询服务。c）智慧城市应用提供商。作为机密智慧城市服务提供者，为智慧城市开发应用，;\n" +
//                    "\n" +
//                    ",;'][=-`1.zip/,;'][=-`1/路径10/路径9/路径8/路径7/路径6/路径5/路径4/路径3/路径2/路径1/测试文档.xls\n" +
//                    "服务。c）智慧城市应用提供商。作为机密智慧城市服务提供者，为智慧城市开发应用，;\n" +
//                    "\n" +
//                    ",;'][=-`1.zip/,;'][=-`1/路径10/路径9/路径8/路径7/路径6/路径5/路径4/路径3/路径2/路径1/测试文档.xls\n" +
//                    "服务。c）智慧城市应用提供商。作为机密智慧城市服务提供者，为智慧城市开发应用，;\n" +
//                    "\n" +
//                    ",;'][=-`1.zip/,;'][=-`1/路径10/路径9/路径8/路径7/路径6/路径5/路径4/路径3/路径2/路径1/测试文档.rtf\n" +
//                    "询服务。c）智慧城市应用提供商。作为机密智慧城市服务提供者，为智慧城市开发应用，;";
//            str += "\n" + str;
//            String b = "";
//            for (int k = 0; k < str.length(); k++)
//            {
//                int s = new Random().nextInt(str.length());
//                b += str.charAt(s);
//            }
//            event2.setBreachContent(str);
//            event2.setMatchContent("机密;秘密");
//            event2.setSecretRate(3.2f);
//            event2.setSensitivity(1);
//            eventList.add(event2);
//        });

        eventTableModel = new EventModel<>(eventList, EVENT_TABLE_COLUMN_NAMES);
        eventView = new EventView(eventTableModel);
        panelCenter.add(eventView);

//        JPanel panelGridFromTo = new JPanel();
//        panelGridFromTo.setBackground(UiConsts.MAIN_BACK_COLOR);
//        panelGridFromTo.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));

//        JPanel panelGridDetail = new JPanel();
//        panelGridDetail.setBackground(UiConsts.MAIN_BACK_COLOR);
//        panelGridDetail.setLayout(new FlowLayout(FlowLayout.LEFT, 5, 0));
        return panelCenter;
    }

    /**
     * 底部面板
     */
    private JPanel getDownPanel()
    {
        JPanel panelDown = new JPanel();
        panelDown.setPreferredSize(new Dimension(800, 50));
        panelDown.setBackground(Color.WHITE);
        panelDown.setLayout(new FlowLayout(FlowLayout.LEFT, 0, 0));

        buttonStop = new MyIconButton(UiConsts.ICON_STOP, UiConsts.ICON_STOP_ENABLE, UiConsts.ICON_STOP_DISABLE, "");
        buttonStop.setEnabled(false);

        pagePanel = new PagePanel<Event>(new PagePanel.PageActionCallback()
        {
            @Override
            public void callback()
            {
                setContent(currentRunningRequestId);
            }
        });
        panelDown.add(pagePanel);
        return panelDown;
    }

    /**
     * 设置状态面板组件内容
     */
    public void setContent(String taskId)
    {
        try
        {
            int c = 1;
            try
            {
                c = Integer.parseInt(pagePanel.getCurrentPageValue());
            }
            catch (Exception ex)
            {
            }
            int s = 10;
            try
            {
                s = Integer.parseInt(pagePanel.getPageSizeValue());
            }
            catch (Exception ex)
            {
            }
            Page<Event> eventPage = App.h2Store.queryEventsPage(c, s, taskId);
            pagePanel.setPage(new Page<>(eventPage.getTotalRows(), eventPage.getCurrentPage(), eventPage.getPageSize()));
            java.util.List<Event> listEvent = eventPage.getDataList();
            eventTableModel.setRowList(listEvent);
        }
        catch (Exception e)
        {

        }
    }

    /**
     * 为各组件添加事件监听
     */
    private void addListener()
    {
        buttonStop.addActionListener(e ->
        {
            buttonStop.setEnabled(false);
            SpinfoExecutor.create().removeWaiting(currentRunningRequestId);
            SpinfoExecutor.create().clearWaitingTask(currentRunningRequestId);
            testProgress.setValue(0);
            isRunning = false;
        });

//        JTextArea textArea = new JTextArea();
//        textArea.setPreferredSize(new Dimension(800, 100));
//        textArea.setLineWrap(false);
//        textArea.setEditable(false);
//        textArea.setBackground(Color.LIGHT_GRAY);
//        textArea.setText(App.resourceBundle.getString("tips.test.task.choose"));
//        filePanel.add(textArea);

//        resultTextArea = new JTextArea();
//        resultTextArea.setLineWrap(true);
//        resultTextArea.setEditable(false);
//        resultTextArea.setBackground(new Color(234, 233, 234));

//        JScrollPane scrollPane = new JScrollPane(resultTextArea);
//        scrollPane.setPreferredSize(new Dimension(800, 320));
//        scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
//        scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
//        resultPanel.add(scrollPane);

        DropTargetListener listener = new DropTargetListenerImpl(filePanel);
        DropTarget dropTarget = new DropTarget(filePanel, DnDConstants.ACTION_COPY_OR_MOVE, listener, true);

        jobComboBox.addItemListener(new ItemListener()
        {
            @Override
            public void itemStateChanged(ItemEvent e)
            {
                System.out.println();
            }
        });
        jobComboBox.addActionListener(new ActionListener()
        {
            @Override
            public void actionPerformed(ActionEvent e)
            {
                System.out.println();
            }
        });
        jobComboBox.addPopupMenuListener(new PopupMenuListener()
        {
            @Override
            public void popupMenuWillBecomeVisible(PopupMenuEvent e)
            {
                String serverHost = ConfigManager.getConfigManager().getServerHost();
                if (!Objects.isNull(serverHost))
                {
                    StatusPanel.comboBoxModel.removeAllElements();
                    StatusPanel.comboBoxModel.addElement(new Item("0", "加载中..."));
//                    IntStream.range(0, 10).forEach(i -> StatusPanel.comboBoxModel.addElement(new Item("", "")));
                    new Thread(() ->
                    {
                        HttpRequest httpRequest = HttpRequest.create()
                                .uri("/SIMP_DBS_S/event/file/analysis/interface/job/list").method("GET").async()
                                .params(new HashMap<>()).host(serverHost.startsWith("https://") ? serverHost : "https://" + serverHost).build();
                        Response response = SpinfoExecutor.create().execute(httpRequest);
                        if (response.getStatus() != 200)
                        {
                            StatusPanel.comboBoxModel.removeAllElements();
                            StatusPanel.comboBoxModel.addElement(new Item("", "请选择策略"));
                            JOptionPane.showMessageDialog(App.settingPanel, App.resourceBundle.getString("tips.setting.server.host.connect.error"), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        StatusPanel.comboBoxModel.removeAllElements();
                        String result = response.getHttpResult();
                        Map<String, String> resultBean = null;
                        try
                        {
                            resultBean = JSONUtil.fromJson(result, new com.fasterxml.jackson.core.type.TypeReference<Map<String, String>>()
                            {
                            });
                        }
                        catch (IOException ioException)
                        {
                            logger.error("parse /interface/job/list result error {}", result);
                            JOptionPane.showMessageDialog(App.settingPanel, App.resourceBundle.getString("tips.setting.server.host.empty.or.null"), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
                            return;
                        }
                        resultBean.entrySet().stream()
                                .map(t -> new Item(t.getKey(), t.getValue()))
                                .collect(Collectors.toList())
                                .forEach(i -> StatusPanel.comboBoxModel.addElement(i));
                    }).start();
                }
                else
                {
                    JOptionPane.showMessageDialog(App.settingPanel, App.resourceBundle.getString("tips.setting.server.host.empty.or.null"), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
                    return;
                }
            }

            @Override
            public void popupMenuWillBecomeInvisible(PopupMenuEvent e)
            {
                System.out.println();
            }

            @Override
            public void popupMenuCanceled(PopupMenuEvent e)
            {
                System.out.println();
            }
        });

        clickPanel.addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                JFileChooser chooser = new JFileChooser("请选择文件");
                chooser.setFileSelectionMode(JFileChooser.FILES_ONLY);
                if (chooser.showOpenDialog(clickPanel) == JFileChooser.APPROVE_OPTION)
                {
                    File file = chooser.getSelectedFile();
                    if (!file.exists() || !file.isFile())
                    {
                        return;
                    }
                    try
                    {
                        startTest(file.getCanonicalPath());
                    }
                    catch (IOException ioException)
                    {
                        ioException.printStackTrace();
                    }
                }
            }

            @Override
            public void mousePressed(MouseEvent e)
            {

            }

            @Override
            public void mouseReleased(MouseEvent e)
            {

            }

            @Override
            public void mouseEntered(MouseEvent e)
            {
                clickPanel.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                clickPanel.setCursor(Cursor.getDefaultCursor());
            }
        });

        testProgressStopBtn.addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                if (null != currentRunningRequestId)
                {
                    SpinfoExecutor.create().removeWaiting(currentRunningRequestId);
                    SpinfoExecutor.create().clearWaitingTask(currentRunningRequestId);
                }
                testProgress.setValue(0);
                isRunning = false;
            }

            @Override
            public void mousePressed(MouseEvent e)
            {

            }

            @Override
            public void mouseReleased(MouseEvent e)
            {

            }

            @Override
            public void mouseExited(MouseEvent e)
            {
                testProgressStopBtn.setCursor(Cursor.getDefaultCursor());
            }

            @Override
            public void mouseEntered(MouseEvent e)
            {
                testProgressStopBtn.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
            }
        });
    }

    /**
     * 获取指定时间对应的毫秒数
     */
    private static long getTimeMillis(String time)
    {
        try
        {
            DateFormat dateFormat = new SimpleDateFormat("yy-MM-dd HH:mm:ss");
            DateFormat dayFormat = new SimpleDateFormat("yy-MM-dd");
            Date curDate = dateFormat.parse(dayFormat.format(new Date()) + " " + time);
            return curDate.getTime();
        }
        catch (ParseException e)
        {
            e.printStackTrace();
        }
        return 0;
    }

    public void startTest(String filePath)
    {
        DESPlus des = new DESPlus();
        ConfigManager.getConfigManager().reloadDom();
        boolean advancedSetting = ConfigManager.getConfigManager().getAdvancedSetting();

        Object selectedItem = jobComboBox.getSelectedItem();
        if (!(selectedItem instanceof Item))
        {
            JOptionPane.showMessageDialog(App.settingPanel, App.resourceBundle.getString("tips.test.task.job.id.not.exist"), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (StringUtils.isEmpty(((Item) selectedItem).getJobId()) || ((Item) selectedItem).getJobId().length() < 32)
        {
            JOptionPane.showMessageDialog(App.settingPanel, App.resourceBundle.getString("tips.test.task.job.id.not.exist"), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
            return;
        }
        String jobId = ((Item) selectedItem).getJobId();

        String activeMQIp = null;
        String activeMQUsername = null;
        String activeMQPasswd = null;
        String sendTimeout = null;
        String closeTimeout = null;
        String activeMQKeystore = null;
        String activeMQKeystorePasswd = null;
        String activeMQTruststore = null;
        String activeMQTruststorePasswd = null;

        String sftpIp = null;
        String sftpUsername = null;
        String sftpPasswd = null;
        String sftpPort = null;

        if (advancedSetting)
        {
            activeMQIp = ConfigManager.getConfigManager().getActiveMQIp();

            sftpIp = ConfigManager.getConfigManager().getSftpIp();
            sftpUsername = ConfigManager.getConfigManager().getSftpUsername();
            sftpPasswd = ConfigManager.getConfigManager().getSftpPasswd();
            try
            {
                sftpPasswd = des.decrypt(sftpPasswd);
            }
            catch (Exception e)
            {
                sftpPasswd = "";
            }
            sftpPort = ConfigManager.getConfigManager().getSftpPort();
        }
        else
        {
            String serverHost = ConfigManager.getConfigManager().getServerHost();
            HttpRequest httpRequest = HttpRequest.create()
                    .uri("/SIMP_DBS_S/event/file/analysis/interface/job/target/info").method("GET").async()
                    .params(new HashMap<>(Collections.singletonMap("jobId", jobId)))
                    .host(serverHost.startsWith("https://") ? serverHost : "https://" + serverHost).build();
            Response response = SpinfoExecutor.create().execute(httpRequest);
            if (response.getStatus() != 200)
            {
                JOptionPane.showMessageDialog(App.settingPanel, App.resourceBundle.getString("tips.test.task.job.sftp.error"), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
                return;
            }

            String result = response.getHttpResult();
            if (Objects.isNull(result))
            {
                JOptionPane.showMessageDialog(App.settingPanel, App.resourceBundle.getString("tips.test.task.job.sftp.error"), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
                return;
            }
            Map<String, String> map = null;
            try
            {
                map = JSONUtil.fromJson(result, new com.fasterxml.jackson.core.type.TypeReference<Map<String, String>>()
                {
                });
            }
            catch (IOException e)
            {
                logger.error("parse /job/target/info result error {}", result);
                JOptionPane.showMessageDialog(App.settingPanel, App.resourceBundle.getString("tips.test.task.job.sftp.error"), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
                return;
            }
            String[] keys = new String[]{"IP", "USERNAME", "PASSWORD", "PORT"};
            Map<String, String> target = map.entrySet().stream()
                    .flatMap(t -> new HashMap<>(Collections.singletonMap(t.getKey(), des.decryptAes(t.getValue()))).entrySet().stream())
                    .collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (k, v) -> k));

            sftpIp = target.get("IP");
            sftpUsername = target.get("USERNAME");
            sftpPasswd = target.get("PASSWORD");
            sftpPort = target.get("PORT");

            activeMQIp = serverHost;
        }

        activeMQUsername = ConfigManager.getConfigManager().getActiveMQUsername();
        activeMQPasswd = ConfigManager.getConfigManager().getActiveMQPasswd();
        try
        {
            activeMQPasswd = des.decrypt(activeMQPasswd);
        }
        catch (Exception e)
        {
            activeMQPasswd = "";
        }
        activeMQKeystore = ConfigManager.getConfigManager().getActiveMQKeystore();
        activeMQKeystorePasswd = ConfigManager.getConfigManager().getActiveMQKeystorePasswd();
        try
        {
            activeMQKeystorePasswd = des.decrypt(activeMQKeystorePasswd);
        }
        catch (Exception e)
        {
            activeMQKeystorePasswd = "";
        }
        activeMQTruststore = ConfigManager.getConfigManager().getActiveMQTruststore();
        activeMQTruststorePasswd = ConfigManager.getConfigManager().getActiveMQTruststorePasswd();
        try
        {
            activeMQTruststorePasswd = des.decrypt(activeMQTruststorePasswd);
        }
        catch (Exception e)
        {
            activeMQTruststorePasswd = "";
        }
        sendTimeout = ConfigManager.getConfigManager().getSendTimeout();
        closeTimeout = ConfigManager.getConfigManager().getCloseTimeout();

        String serverHost = ConfigManager.getConfigManager().getServerHost();
//        String jobId = ConfigManager.getConfigManager().getJobId();

        final String activeMQIPUsing = activeMQIp;

        SpinfoInfo spinfoInfo = new SpinfoInfo();
        spinfoInfo.setBrokerUrl(String.format(ConstantsTools.ACTIVE_MQ_URL, activeMQIp, activeMQIp));
        spinfoInfo.setUsername(activeMQUsername);
        spinfoInfo.setPassword(activeMQPasswd);
        spinfoInfo.setKeystore(activeMQKeystore);
        spinfoInfo.setKeystorePasswd(activeMQKeystorePasswd);
        spinfoInfo.setTruststore(activeMQTruststore);
        spinfoInfo.setTruststorePasswd(activeMQTruststorePasswd);
        int sendTimeoutInt = 12000;
        try
        {
            sendTimeoutInt = Integer.parseInt(sendTimeout);
        }
        catch (NumberFormatException e)
        {
        }
        spinfoInfo.setSendTimeout(sendTimeoutInt);
        int closeTimeoutInt = 12000;
        try
        {
            closeTimeoutInt = Integer.parseInt(closeTimeout);
        }
        catch (NumberFormatException e)
        {
        }
        spinfoInfo.setCloseTimeout(closeTimeoutInt);

        spinfoInfo.setFtpUsername(sftpUsername);
        spinfoInfo.setFtpPassword(sftpPasswd);
        spinfoInfo.setIp(sftpIp);

        int sftpPortInt = 22;
        try
        {
            sftpPortInt = Integer.parseInt(sftpPort);
        }
        catch (NumberFormatException e)
        {
        }
        spinfoInfo.setPort(sftpPortInt);

        spinfoInfo.setDbsServerHost(serverHost.startsWith("https://") ? serverHost : "https://" + serverHost);
        spinfoInfo.setJobId(jobId);

        if (StringUtils.isEmpty(activeMQIp))
        {
            JOptionPane.showMessageDialog(App.settingPanel, App.resourceBundle.getString("tips.setting.active.ip"), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (StringUtils.isEmpty(activeMQUsername))
        {
            JOptionPane.showMessageDialog(App.settingPanel, App.resourceBundle.getString("tips.setting.active.username"), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (StringUtils.isEmpty(activeMQPasswd))
        {
            JOptionPane.showMessageDialog(App.settingPanel, App.resourceBundle.getString("tips.setting.active.passwd"), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (StringUtils.isEmpty(sftpIp))
        {
            JOptionPane.showMessageDialog(App.settingPanel, App.resourceBundle.getString("tips.setting.sftp.ip"), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (StringUtils.isEmpty(sftpPort))
        {
            JOptionPane.showMessageDialog(App.settingPanel, App.resourceBundle.getString("tips.setting.sftp.port"), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (StringUtils.isEmpty(sftpUsername))
        {
            JOptionPane.showMessageDialog(App.settingPanel, App.resourceBundle.getString("tips.setting.sftp.username"), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (StringUtils.isEmpty(sftpPasswd))
        {
            JOptionPane.showMessageDialog(App.settingPanel, App.resourceBundle.getString("tips.setting.sftp.passwd"), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (StringUtils.isEmpty(serverHost))
        {
            JOptionPane.showMessageDialog(App.settingPanel, App.resourceBundle.getString("tips.setting.server.host"), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
            return;
        }
        if (StringUtils.isEmpty(jobId))
        {
            JOptionPane.showMessageDialog(App.settingPanel, App.resourceBundle.getString("tips.setting.server.job.id"), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
            return;
        }

        if (isRunning)
        {
            JOptionPane.showMessageDialog(App.settingPanel, App.resourceBundle.getString("tips.test.task.running"), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
            return;
        }
        testProgress.setValue(2);
        service.submit(() ->
        {
            Random random = new Random();
            isRunning = true;
            buttonStop.setEnabled(true);
//            resultTextArea.setText("");
            try
            {
                Thread.sleep(1000);
            }
            catch (InterruptedException e)
            {
            }
            testProgress.setValue(5);
            try
            {
                spinfoInfo.setForceReConnectActiveMQ(!activeMQIPUsing.equals(currentActiveMQIp));
                SpinfoExecutor.create().init(spinfoInfo);
                currentActiveMQIp = activeMQIPUsing;
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(App.settingPanel, e.getMessage(), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
                return;
            }

            testProgress.setValue(8);
            File data = new File(filePath);
            if (!data.exists())
            {
                JOptionPane.showMessageDialog(App.settingPanel, App.resourceBundle.getString("tips.test.task.file.not.exist"), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
                return;
            }

            FileInfo fileInfo = new FileInfo(data.getName(), data.getPath());

            try
            {
                TimeUnit.SECONDS.sleep(1);
            }
            catch (InterruptedException e)
            {
            }

            Request request = null;
            try
            {
                if (data.length() > 10 * 1024 * 1024L)
                {
                    request = FtpRequest.upload().file(fileInfo).thenAnalyze().build();
                }
                else
                {
                    request = HttpRequest.uploader().file(fileInfo).build();
                }
            }
            catch (Exception e)
            {
                JOptionPane.showMessageDialog(App.settingPanel, e.getMessage(), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
                return;
            }
            final String requestId = request.getId();
            final Request finalRequest = request;
            currentRunningRequestId = requestId;
            service.submit(() ->
            {
                testProgress.setValue(random.nextInt(20 - 10 + 1) + 10);
                service.submit(() ->
                {
                    while (true)
                    {
                        if (!isRunning)
                        {
                            break;
                        }
                        try
                        {
                            TimeUnit.SECONDS.sleep(1);
                        }
                        catch (InterruptedException e)
                        {
                        }
                        Map<String, String> param = new HashMap<>();
                        param.put("taskId", requestId);
                        HttpRequest httpRequest = HttpRequest.<Integer>create()
                                .uri("/SIMP_DBS_S/event/file/analysis/analyze/progress").method("GET").async()
                                .params(param).build();
                        Response response = null;
                        try
                        {
                            response = SpinfoExecutor.create().execute(httpRequest);
                        }
                        catch (Exception e)
                        {
                        }
                        if (null != response && response.getStatus() == 200)
                        {
                            if (null != response.getHttpResult())
                            {
                                String progress = response.getHttpResult();
                                try
                                {
                                    int p = Integer.parseInt(progress);
                                    int min = Math.min(90, p);
                                    int current = testProgress.getValue();
                                    testProgress.setValue(Math.max(current, min));
                                    if (p == 100)
                                    {
                                        break;
                                    }
                                }
                                catch (Exception e)
                                {
                                    e.printStackTrace();
                                }
                            }
                        }
                        else
                        {
                            break;
                        }
                    }
                });

                try
                {
                    Response result = null;
                    if (finalRequest instanceof FtpRequest)
                    {
                        result = SpinfoExecutor.create().uploadBigFile((FtpRequest) finalRequest);
                    }
                    if (finalRequest instanceof HttpRequest)
                    {
                        result = SpinfoExecutor.create().upload((HttpRequest) finalRequest);
                    }
                    if (result.getStatus() == 200)
                    {
                        String status = result.getEventResult().get("status");
                        String breachContent = result.getEventResult().get("breachContent");
                        String failedFiles = result.getEventResult().get("failedFiles");
                        Task task = new Task();
                        task.setTaskId(requestId);
                        task.setJobId(jobId);
                        task.setFileName(fileInfo.getName());
                        task.setCreateDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
                        App.h2Store.insertTask(task);

                        testProgress.setValue(92);
                        if ("有异常".equals(status))
                        {
                            java.util.List<Map<String, Object>> events = JSON.parseObject(breachContent, new TypeReference<java.util.List<Map<String, Object>>>()
                            {
                            });
                            java.util.List<com.tool.app.db.Event> dbEvents = new ArrayList<>();
                            for (Map<String, Object> event : events)
                            {
                                com.tool.app.db.Event dbEvent = new com.tool.app.db.Event();

                                dbEvent.setTaskId(requestId);
                                dbEvent.setRule(Objects.isNull(event.get("ruleName")) ? "" : event.get("ruleName").toString());
                                dbEvent.setSensitivity(Objects.isNull(event.get("sensitivityId")) ? -1 : Integer.parseInt(event.get("sensitivityId").toString()));
                                dbEvent.setSecretRate(Objects.isNull(event.get("secretRate")) ? 0 : Float.parseFloat(event.get("secretRate").toString()));
                                dbEvent.setId(UUID.randomUUID().toString().replace("-", ""));
                                dbEvent.setFileName(Objects.isNull(event.get("filepath")) ? "" : event.get("filepath").toString());
                                dbEvent.setEventCreateDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
                                dbEvent.setBreachContent(Objects.isNull(event.get("breachContent"))
                                        ? !Objects.isNull(event.get("externalBreachContent")) ? event.get("externalBreachContent").toString() : ""
                                        : event.get("breachContent").toString());
                                dbEvent.setMatchContent(Objects.isNull(event.get("matchContent")) ? "" : event.get("matchContent").toString());
                                dbEvent.setFailedFiles(Objects.isNull(failedFiles) ? "" : failedFiles);
                                dbEvents.add(dbEvent);
                            }
                            testProgress.setValue(95);
                            App.h2Store.insertEvents(dbEvents);
                            testProgress.setValue(99);
                        }
                    }
                    else
                    {
                        String msg = Objects.isNull(result.getHttpResult())
                                ? "后台检测错误"
                                : result.getHttpResult();
                        JOptionPane.showMessageDialog(App.settingPanel, msg, App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
                    }
                }
                catch (Exception e)
                {
                    logger.error("HttpRequest execute error", e);
                    JOptionPane.showMessageDialog(App.settingPanel, e.getMessage(), App.resourceBundle.getString("ui.tips"), JOptionPane.ERROR_MESSAGE);
                }
                finally
                {
                    SpinfoExecutor.create().removeWaiting(requestId);
                    SpinfoExecutor.create().clearWaitingTask(requestId);

                    if (!isRunning)
                    {
                        testProgress.setValue(0);
                    }
                    else
                    {
                        testProgress.setValue(100);
                    }

                    isRunning = false;
                    buttonStop.setEnabled(false);

                    setContent(requestId);
                    testProgress.setValue(100);
                }
            });
        });
    }
}