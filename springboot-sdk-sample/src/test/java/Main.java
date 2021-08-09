import java.io.File;
import java.io.UnsupportedEncodingException;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/06/18 10:35:11
 */
public class Main
{
    public static void main(String args[]) throws ClassNotFoundException, SQLException
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://192.190.116.205:3306/tmc_db?useUnicode=true&useSSL=false&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&allowMultiQueries=true&serverTimezone=GMT%2B8", "root", "root");

        PreparedStatement query = connection.prepareStatement("select id from sp_task where jobId = 'a89ff75dd9a54876ae92cf571f770a52'");
        ResultSet rs = query.executeQuery();
        List<String> taskIdList = new ArrayList<>();
        while (rs.next())
        {
            String taskId = rs.getString(1);
            taskIdList.add(taskId);
        }

        PreparedStatement statement = connection.prepareStatement("insert into sp_audit_files (`id`, `contentId`, `lastModified`, `name`, taskId, scanTime) VALUES (?, ?, ?, ?, ?, ?)");

        for (int i = 0; i < taskIdList.size(); i++)
        {
            statement.setString(1, UUID.randomUUID().toString().replace("-", ""));
            statement.setString(2, UUID.randomUUID().toString().replace("-", ""));
            statement.setString(3, "2021-08-02 18:17:12");
            statement.setString(4, "name" + i);
            statement.setString(5, taskIdList.get(i));
            statement.setString(6, "2021-08-02 18:16:33");
            statement.addBatch();
            statement.setString(1, UUID.randomUUID().toString().replace("-", ""));
            statement.setString(2, UUID.randomUUID().toString().replace("-", ""));
            statement.setString(3, "2021-08-02 18:17:12");
            statement.setString(4, "name" + i);
            statement.setString(5, taskIdList.get(i));
            statement.setString(6, "2021-08-02 18:16:33");
            statement.addBatch();
        }
        statement.executeBatch();

        PreparedStatement statement2 = connection.prepareStatement("insert into sp_audit_sipped (`id`, `name`, `status`, taskId, scanTime) VALUES (?, ?, ?, ?, ?)");

        for (int i = 0; i < taskIdList.size(); i++)
        {
            statement2.setString(1, UUID.randomUUID().toString().replace("-", ""));
            statement2.setString(2, "name" + i);
            statement2.setString(3, "status");
            statement2.setString(4, taskIdList.get(i));
            statement2.setString(5, "2021-08-03 11:15:18");
            statement2.addBatch();
            statement2.setString(1, UUID.randomUUID().toString().replace("-", ""));
            statement2.setString(2, "name" + i);
            statement2.setString(3, "status");
            statement2.setString(4, taskIdList.get(i));
            statement2.setString(5, "2021-08-03 11:15:18");
            statement2.addBatch();
        }
        statement2.executeBatch();
    }

    private List<File> listFile(File dir)
    {
        File[] files = dir.listFiles();
        List<File> fileAll = new ArrayList<>();
        for (File f : files)
        {
            if (f.isDirectory())
            {
                List<File> te = listFile(f);
                fileAll.addAll(te);
            }
            else
            {
                fileAll.add(f);
            }
        }
        return fileAll;
    }
}
