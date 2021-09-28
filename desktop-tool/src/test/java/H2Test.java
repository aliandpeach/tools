import com.tool.app.db.Event;
import com.tool.app.db.H2Store;
import com.tool.app.db.Page;

import java.sql.Connection;
import java.sql.DatabaseMetaData;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/09/07 09:56:20
 */
public class H2Test
{
    public static void main(String[] args) throws SQLException, ClassNotFoundException
    {
        Class.forName("org.h2.Driver");
        Connection conn = DriverManager.getConnection("jdbc:h2:~/.dbsconfig/db/test", "root", "Spinfo@01234");
        // add application code here
        Statement statement = conn.createStatement();
        statement.execute("DROP TABLE IF EXISTS USER_INFO");
        //创建USER_INFO表
        statement.execute("CREATE TABLE USER_INFO(id VARCHAR(36) PRIMARY KEY,name VARCHAR(100),sex VARCHAR(4))");
        statement.executeUpdate("INSERT INTO USER_INFO VALUES('" + UUID.randomUUID() + "','111','男')");
        statement.executeUpdate("INSERT INTO USER_INFO VALUES('" + UUID.randomUUID() + "','222','男')");
        statement.executeUpdate("INSERT INTO USER_INFO VALUES('" + UUID.randomUUID() + "','333','男')");
        statement.executeUpdate("INSERT INTO USER_INFO VALUES('" + UUID.randomUUID() + "','444','女')");
        statement.executeUpdate("INSERT INTO USER_INFO VALUES('" + UUID.randomUUID() + "','555','男')");
        statement.executeUpdate("INSERT INTO USER_INFO VALUES('" + UUID.randomUUID() + "','666','男')");

        conn.commit();

        ResultSet rs = statement.executeQuery("SELECT * FROM USER_INFO");
        while (rs.next())
        {
            System.out.println(rs.getString("id") + "," + rs.getString("name") + "," + rs.getString("sex"));
        }
        ResultSet rs2 = statement.executeQuery("SELECT * FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_NAME = 'USER_INFO'");
        while (rs2.next())
        {
            DatabaseMetaData metaData = conn.getMetaData();
            System.out.println(rs2.getString("TABLE_NAME"));
        }

        /*===========================================================================================*/
        final String DATABASE_DRIVER_CLASS = "org.h2.Driver";
        final String DATABASE_CONNECTION_URL_PREFIX = "jdbc:h2:~/.dbsconfig/db/dbs";

        final String USERNAME = "root";
        final char[] PASSWD = new char[]{'S', 'p', 'i', 'n', 'f', 'o', '@', '0', '1', '2', '3', '4',};
        Class.forName(DATABASE_DRIVER_CLASS);
        Connection conn3 = DriverManager.getConnection(DATABASE_CONNECTION_URL_PREFIX, USERNAME, new String(PASSWD));
        Statement s3 = conn3.createStatement();
        s3.execute("DROP TABLE IF EXISTS TASK");
        s3.execute("DROP TABLE IF EXISTS EVENT");

        H2Store h2Store = H2Store.getInstance();
        String taskId = "0c2bedb3b9b441b49f70ce93133d9c8d";
        List<Event> list = new ArrayList<>();
        for (int i = 1; i <= 101; i++)
        {
            Event event = new Event();
            event.setId(UUID.randomUUID().toString().replace("-", ""));
            event.setTaskId(taskId);
            event.setFileName("文件" + i);
            event.setBreachContent("机密密码" + i);
            event.setMatchContent("机密;秘密" + i);
            event.setRule("秘密");
            event.setEventCreateDate("2021-01-01 09:10:11");
            event.setSecretRate(2);
            event.setSensitivity(1);
            list.add(event);
        }
        h2Store.insertEvents(list);

        Page<Event> page = h2Store.queryEventsPage(1, 10, "0c2bedb3b9b441b49f70ce93133d9c8d");
        System.out.println(page.getDataList().size() + ", " + page.getTotalPage() + ", " + page.getStartRow() + ", " + page.getTotalRows());
        System.out.println(Optional.ofNullable(page.getDataList().get(0)).orElseGet(Event::new).getFileName());
    }
}
