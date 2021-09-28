import javax.swing.*;
import javax.swing.text.html.HTMLDocument;
import javax.swing.text.html.HTMLEditorKit;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseWheelEvent;
import java.awt.event.MouseWheelListener;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/09/10 16:58:53
 */
public class JScrollPaneTest
{
    public static void main(String[] args)
    {
        JFrame main = new JFrame();
        int width = Toolkit.getDefaultToolkit().getScreenSize().width;
        int height = Toolkit.getDefaultToolkit().getScreenSize().height;
        main.setLayout(new BorderLayout());
        main.setBounds(new Rectangle(new Point(width / 2 - 210, height / 2 - 220), new Dimension(420, 250)));
        main.setResizable(false);

        JPanel panel = new JPanel();
        panel.setPreferredSize(new Dimension(400, 200));
        panel.setLayout(new FlowLayout(FlowLayout.CENTER, 0, 0));
        JTextPane textPane = new JTextPane();
        textPane.setContentType("text/html");
        textPane.setPreferredSize(new Dimension(400, 200));
//        textPane.setText("");
        JScrollPane scrollPane = new JScrollPane(textPane);
        scrollPane.setPreferredSize(new Dimension(400, 200));
        panel.add(scrollPane);

        main.add(panel);
        main.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        main.setVisible(true);

        int getMaximum = scrollPane.getVerticalScrollBar().getMaximum();
        int getMinimum = scrollPane.getVerticalScrollBar().getMinimum();
        int getValue = scrollPane.getVerticalScrollBar().getValue();

        System.out.println(getMaximum + ", " + getMinimum + ", " + getValue);

        textPane.addMouseListener(new MouseListener()
        {
            @Override
            public void mouseClicked(MouseEvent e)
            {
                int getMaximum = scrollPane.getVerticalScrollBar().getMaximum();
                int getMinimum = scrollPane.getVerticalScrollBar().getMinimum();
                int getValue = scrollPane.getVerticalScrollBar().getValue();
                System.out.println(getMaximum + ", " + getMinimum + ", " + getValue);

                textPane.setText("");
                HTMLDocument doc = (HTMLDocument) textPane.getDocument();
                HTMLEditorKit editorKit = (HTMLEditorKit) textPane.getEditorKit();
                try
                {
                    editorKit.insertHTML(doc, doc.getLength(), "<html>\n" +
                            "\n" +
                            "<body>\n" +
                            "<div>\n" +
                            "\n" +
                            "，宁封子只有祭起绛云朱环守护，全力招架猴子的棒子。只是猴子头上有人参果树，剑气不侵，饶是宁封子乃前古金仙，手中法宝也是神物，但终究不及镇元子法器，对付猴子，就有些艰难。\n" +
                            "　　“阿弥陀佛！”乌巢禅师出现在晋南关上空，头上现出一盏莲花，青光闪耀，莲心之中，漂浮有豆大灯火，正是女娲娘娘所赐宝莲灯，威力奇大。\n" +
                            "　　屈指一弹，豆大灯火飞出，晃了一晃，便是幻影重重，随后暴雨一般的灯花漫空打下。这灯花端的是无坚不摧，刚一落下，晋南关禁法吃得一炙，尽数破去，随后灯花余势不衰，层层落下，无数军士连忙抵挡，却发现任何法术法宝都是无用，被灯花一沾身，纷纷扑倒在地，昏死过去了。\n" +
                            "　　后面大军杀来，丝毫没有碰到抵挡，将这些扑倒的士兵拿了，扔到大舰上。当下李圣就占了晋南关，直逼南海关。\n" +
                            "　　却说乌巢禅师破去禁法，鲲鹏却不停留，飞快赶上，就见几万里之外，一团黄云滚滚，知道是猴子地书，当下在两妖神地护持之下，闯进了其中，就见宁封子苦苦争持，猴子虽然厉害，却一时也杀不死这金仙。\n" +
                            "　　鲲鹏祖师当场就使出太玄天妖摄魄大法，朝宁封子抓去。开明兽、陆吾祭起天地炫环，一冲进来，配合鲲鹏祖师用力一绞。\n" +
                            "　　可怜是宁封子如何能抵挡这四妖地手段，当下那绛云朱环光华被破，猴子一棒奔脑门过来，连忙提剑抵挡，冷不防元神浮动，知道不好，正要运法力镇压，那开明兽、陆吾双双打来，直落了肉身粉碎，元神也被鲲鹏摄走。\n" +
                            "　　那口金光闪闪的封魔剑失了主人，在空中颤抖一阵，就朝外飞去。鲲鹏哪里容得，一爪抓住，随后又收了绛云朱环。\n" +
                            "　　这一番收拾，天色微明，晋南关一定，李圣立刻兵发南海关。一路滚滚而来，不到半个时辰，大军驻扎在南海关不远，只见是关前旌旗招展，大舰林立，却有一方士兵正等着呢。\n" +
                            "　　“李圣且出来答话！”一夜功夫，晋南关被破，宁封子身死，王阴阳却听得土地来报，自然知道此事，心中大怒。发兵救援已经是不及了，只得领了所有仙人，阿修罗道，左道邪魔，都立在南海关前，只等李圣前来，就拼个你死我活。\n" +
                            "　　李圣听得王阴阳怒喝，却也按剑而出，大笑道：“你也不必多说。今日你是气数已尽，谁都救不得你。速速领死，才是正道。鲲鹏，开明兽，陆吾，你三人且出阵，先杀一场。”\n" +
                            "　　鲲鹏道：“我等三人昨夜一战，筋骨有些疲劳，恐怕坏了颜面，大是不美。况且对方有金刚镯，擅套兵器。吾等法器，全然无用。如把娘娘所赐的法器丢失了，罪过不小。我知佛门广大，所炼佛光，可不受金刚镯克制。却要佛陀下场才好。”开明兽，陆吾见得王阴阳那边也非泛泛，却也点头附和。\n" +
                            "　　李圣道：“既然如此，可歇息过后，再过争斗。燃灯佛祖，你已将定海珠修成化身，具得血气，可前去立这一大功德。”\n" +
                            "　　燃灯佛祖道：“自不敢违抗，但需无量寿佛所炼无量寿光，才能稳胜。”\n" +
                            "　　</div>\n" +
                            "</body>\n" +
                            "</html>", 0, 0, null);
                }
                catch (Exception ex)
                {
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

            }

            @Override
            public void mouseExited(MouseEvent e)
            {

            }
        });
    }
}
