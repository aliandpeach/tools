package com.tool.app.ui.panel;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.spinfosec.connector.http.HttpRequest;
import com.spinfosec.core.Response;
import com.spinfosec.core.SpinfoExecutor;
import com.tool.app.App;
import com.tool.app.db.Page;
import com.tool.app.db.Task;
import com.tool.app.ui.UiConsts;
import com.tool.app.ui.component.MyIconButton;
import com.tool.app.util.ConfigManager;
import org.apache.commons.lang3.StringUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 历史面板
 */
public class HistoryPanel extends JPanel
{
    public static HistoryModel<Task> historyModel;

    public static HistoryView historyView;

//    public static JLabel total;
//    public static JLabel totalPage;
//    public static JTextField currentPage;
//    public static JTextField pageSize;

//    public static MyIconButton previousPage;
//    public static MyIconButton nextPage;

//    private Page<Task> page;

    private PagePanel<Task> pagePanel;

    /**
     * 构造
     */
    public HistoryPanel()
    {
        initialize();
        addComponent();
        setContent();
    }

    /**
     * 初始化
     */
    private void initialize()
    {
        this.setBackground(UiConsts.MAIN_BACK_COLOR);
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
    }

    /**
     * 添加组件
     */
    private void addComponent()
    {
        JPanel lower = new JPanel();
        lower.setPreferredSize(new Dimension(800, 560));
        lower.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
        lower.setBackground(Color.WHITE);
        this.add(lower);

        java.util.List<Task> taskList = new ArrayList<>();
        historyModel = new HistoryModel<>(taskList, new String[]{"序号", "文件名称", "策略", "命中规则", "涉密概率", "匹配内容", "检测时间", "操作"});
        historyView = new HistoryView(historyModel);

        JPanel tablePanel = new JPanel();
        tablePanel.setPreferredSize(new Dimension(800, 500));
        tablePanel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        tablePanel.setBackground(Color.WHITE);
        tablePanel.add(historyView);
        lower.add(tablePanel);

        pagePanel = new PagePanel<Task>(new PagePanel.PageActionCallback()
        {
            @Override
            public void callback()
            {
                setContent();
            }
        });
        lower.add(pagePanel);
    }

    private ExecutorService service = Executors.newFixedThreadPool(1);

    /**
     * 设置内容
     */
    public void setContent()
    {
        if (null != historyModel)
        {
            service.submit(() ->
            {
                synchronized (HistoryPanel.class)
                {
                    String serverHost = ConfigManager.getConfigManager().getServerHost();

                    pagePanel.setPage(null);

                    Object selectedItem = StatusPanel.jobComboBox.getSelectedItem();
                    if (!(selectedItem instanceof Item))
                    {
                        return;
                    }
                    if (StringUtils.isEmpty(((Item) selectedItem).getJobId()) || ((Item) selectedItem).getJobId().length() < 32)
                    {
                        return;
                    }
                    String jobId = ((Item) selectedItem).getJobId();

                    Map<String, String> params = new HashMap<>();

                    String c = "1";
                    try
                    {
                        c = Integer.parseInt(pagePanel.getCurrentPageValue()) + "";
                    }
                    catch (Exception ex)
                    {

                    }
                    String s = "10";
                    try
                    {
                        s = Integer.parseInt(pagePanel.getPageSizeValue()) + "";
                    }
                    catch (Exception ex)
                    {

                    }

                    params.put("jobId", jobId);
                    params.put("currentPage", c);
                    params.put("pageSize", s);

                    java.util.List<Task> taskList = new ArrayList<>();
                    HttpRequest httpRequest = HttpRequest.create()
                            .uri("/SIMP_DBS_S/event/file/analysis/query/event/page").method("POST").async()
                            .params(params).host(serverHost.startsWith("https://") ? serverHost : "https://" + serverHost).build();
                    Response response = SpinfoExecutor.create().execute(httpRequest);
                    if (response.getStatus() == 200 && null != response.getMessage().get("result"))
                    {
                        String resultString = response.getMessage().get("result");
                        QueryEventModel queryEventModel = JSON.parseObject(resultString, new TypeReference<QueryEventModel>()
                        {
                        });

                        Page<Task> page = new Page<>(
                                queryEventModel.getTotal(),
                                queryEventModel.getCurrentPage() == 0 ? Integer.parseInt(c) : queryEventModel.getCurrentPage(),
                                queryEventModel.getPageSize());
                        pagePanel.setPage(page);

                        int index = 1;
                        for (Map<String, Object> map : queryEventModel.getRowLost())
                        {
                            Task task = new Task();
                            task.setTaskId(Objects.isNull(map.get("taskId")) ? "" : map.get("taskId").toString());
                            task.setFileName(Objects.isNull(map.get("filepath")) ? "" : map.get("filepath").toString());
                            task.setBreachContent(Objects.isNull(map.get("breachContent")) ? "" : map.get("breachContent").toString());
                            task.setIndex(index++ + page.getPageSize() * (page.getCurrentPage() - 1));
                            task.setJobId(Objects.isNull(map.get("jobId")) ? "" : map.get("jobId").toString());
                            task.setJobName(Objects.isNull(map.get("jobName")) ? "" : map.get("jobName").toString());
                            task.setRuleName(Objects.isNull(map.get("ruleName")) ? "" : map.get("ruleName").toString());
                            task.setSecretRate(Objects.isNull(map.get("secretRate")) ? 0 : Float.parseFloat(map.get("secretRate").toString()));
                            task.setMatchContent(Objects.isNull(map.get("matchContent")) ? "" : map.get("matchContent").toString());
                            task.setTestDate(Objects.isNull(map.get("detectDateTs")) ? "" : map.get("detectDateTs").toString());
                            taskList.add(task);
                        }
                        System.out.println(queryEventModel);
                    }
                    historyModel.setRowList(taskList);
                }
            });
        }
    }

    private static class QueryEventModel
    {
        private java.util.List<Map<String, Object>> rowLost = new ArrayList<>();

        private int total;

        private int currentPage;

        private int pageSize = 10;

        private String jobId;

        public java.util.List<Map<String, Object>> getRowLost()
        {
            return rowLost;
        }

        public void setRowLost(List<Map<String, Object>> rowLost)
        {
            this.rowLost = rowLost;
        }

        public int getTotal()
        {
            return total;
        }

        public void setTotal(int total)
        {
            this.total = total;
        }

        public int getCurrentPage()
        {
            return currentPage;
        }

        public void setCurrentPage(int currentPage)
        {
            this.currentPage = currentPage;
        }

        public int getPageSize()
        {
            return pageSize;
        }

        public void setPageSize(int pageSize)
        {
            this.pageSize = pageSize;
        }

        public String getJobId()
        {
            return jobId;
        }

        public void setJobId(String jobId)
        {
            this.jobId = jobId;
        }
    }
}