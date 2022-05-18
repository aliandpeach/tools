import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.TypeReference;
import com.yk.httprequest.HttpConnection;
import lombok.Data;
import org.apache.commons.io.IOUtils;
import org.apache.commons.lang3.StringUtils;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.UnsupportedEncodingException;
import java.io.Writer;
import java.net.HttpURLConnection;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.URL;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import java.util.UUID;
import java.util.stream.Collectors;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/06/18 10:35:11
 */
public class Main
{
    @Data
    private static class EventModel
    {
        private Hits1 hits;
    }

    @Data
    private static class Hits1
    {
        private int total;
        private List<Hit> hits;

    }

    @Data
    private static class Hit
    {
        private String _index;
        private Source _source;
        private String id;

    }

    @Data
    private static class Source
    {
        private String jobId;
        private String filepath;
        private int falsePositive;
        private String ruleName;
        private String breachContent;
    }

    /**
     * 数据更新
     */
    public static void update() throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection2 = DriverManager.getConnection("jdbc:mysql://192.190.20.251:3306/tmc_db?useUnicode=true&useSSL=false&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&allowMultiQueries=true&serverTimezone=GMT%2B8", "root", "root");

        PreparedStatement statement = connection2.prepareStatement("update sp_plc_discovery_tasks_1 set EVENT_COUNT0 = ? WHERE id = ?");

        try (InputStream input = new FileInputStream("E:\\集约化平台\\eventCount.txt"))
        {
            List<EventModel> objects = JSON.parseObject(IOUtils.toString(input, StandardCharsets.UTF_8), new TypeReference<List<EventModel>>()
            {
            });
            for (EventModel eventModel : objects)
            {
                if (null == eventModel.getHits())
                {
                    continue;
                }
                if (eventModel.getHits().getTotal() > 0
                        && (null == eventModel.getHits().getHits() || eventModel.getHits().getHits().size() == 0))
                {
                    System.out.println();
                }
                if (null == eventModel.getHits().getHits() || eventModel.getHits().getHits().size() == 0)
                {
                    continue;
                }
                int total = eventModel.getHits().getTotal();
                String jobId = eventModel.getHits().getHits().get(0).get_source().getJobId();
                statement.setInt(1, total);
                statement.setString(2, jobId);
                statement.addBatch();
            }
            statement.executeBatch();
            System.out.println();
        }
    }

    public static void allJobId() throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection = DriverManager.getConnection("jdbc:mysql://192.190.20.251:3306/tmc_db?useUnicode=true&useSSL=false&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&allowMultiQueries=true&serverTimezone=GMT%2B8", "root", "root");

        PreparedStatement query = connection.prepareStatement("select id from sp_plc_discovery_tasks_1");
        ResultSet rs = query.executeQuery();
        Set<String> jobIdSet = new HashSet<>();
        while (rs.next())
        {
            String jobId = rs.getString(1);
            jobIdSet.add("matching_result_" + jobId);
        }

        try (OutputStream out = new FileOutputStream("E:\\集约化平台\\allJobIdFromDB.txt");
             Writer writer = new OutputStreamWriter(out, StandardCharsets.UTF_8);
             BufferedWriter bufferedWriter = new BufferedWriter(writer))
        {
            String temp = String.join(" ", jobIdSet);
            bufferedWriter.write(temp);
        }
    }

    public static void export() throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection2 = DriverManager.getConnection("jdbc:mysql://192.190.20.251:3306/tmc_db?useUnicode=true&useSSL=false&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&allowMultiQueries=true&serverTimezone=GMT%2B8", "root", "root");
        PreparedStatement statement = connection2.prepareStatement("SELECT `id`, `name` FROM sp_plc_discovery_tasks_1");

        PreparedStatement statement2 = connection2.prepareStatement("insert into sp_plc_discovery_tasks_event (`id`, `name`, `filepath`, `breachContent`, `invalid`) values (?, ?, ?, ?, ?)");

        try (InputStream input = new FileInputStream("E:\\集约化平台\\falsePositive.txt");
             OutputStream out = new FileOutputStream("E:\\集约化平台\\falsePositive_.txt");
             Writer writer = new OutputStreamWriter(out, StandardCharsets.UTF_8);
             BufferedWriter bufferedWriter = new BufferedWriter(writer))
        {
            List<EventModel> objects = JSON.parseObject(IOUtils.toString(input, StandardCharsets.UTF_8), new TypeReference<List<EventModel>>()
            {
            });

            ResultSet resultSet = statement.executeQuery();
            Map<String, String> idName = new HashMap<>();
            while (resultSet.next())
            {
                idName.put(resultSet.getString(1), resultSet.getString(2));
            }
            resultSet.close();

            int count = 0;
            for (EventModel eventModel : objects)
            {
                if (null == eventModel.getHits())
                {
                    continue;
                }
                if (eventModel.getHits().getTotal() == 0)
                {
                    continue;
                }
                if (null == eventModel.getHits().getHits() || eventModel.getHits().getHits().size() == 0)
                {
                    continue;
                }
                int total = eventModel.getHits().getTotal();
                if (total == 1193)
                {
                    System.out.println();
                }

                List<Hit> hitList = eventModel.getHits().getHits();
                for (Hit hit : hitList)
                {
                    if (null == hit.get_source())
                    {
                        continue;
                    }
                    String jobId = hit.get_source().getJobId();
                    String filepath = hit.get_source().getFilepath();
                    String breachContent = hit.get_source().getBreachContent();
                    if (StringUtils.isEmpty(jobId))
                    {
                        continue;
                    }
                    if (StringUtils.isEmpty(filepath))
                    {
                        continue;
                    }
                    if (StringUtils.isEmpty(breachContent))
                    {
                        continue;
                    }
                    if (StringUtils.isEmpty(idName.get(jobId)))
                    {
                        continue;
                    }
                    statement2.setString(1, jobId);
                    statement2.setString(2, idName.get(jobId));
                    statement2.setString(3, filepath);
                    statement2.setString(4, breachContent);
                    statement2.setInt(5, invalid(filepath) ? 1 : 0);
                    statement2.addBatch();
                }
            }
            statement2.executeBatch();
            System.out.println();
        }
    }

    public static boolean invalid(String url)
    {
        try
        {
            String encodedUrl = Arrays.stream(url.split("/")).map(t ->
            {
                try
                {
                    return URLEncoder.encode(t, StandardCharsets.UTF_8.name());
                }
                catch (UnsupportedEncodingException e)
                {
                    return null;
                }
            }).filter(Objects::nonNull).collect(Collectors.joining("/"));
            InetSocketAddress addr = new InetSocketAddress("192.190.10.101", 3128);
            Proxy proxy = new Proxy(Proxy.Type.HTTP, addr); // http 代理
            HttpURLConnection httpURLConnection = (HttpURLConnection) new URL("http://" + encodedUrl).openConnection(proxy);
            httpURLConnection.setRequestMethod("GET");
            httpURLConnection.connect();
            int code = httpURLConnection.getResponseCode();
            return code == 404;
        }
        catch (IOException e)
        {
            return false;
        }
    }

    public static void falsePositive() throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection connection2 = DriverManager.getConnection("jdbc:mysql://192.190.20.251:3306/tmc_db?useUnicode=true&useSSL=false&characterEncoding=utf8&zeroDateTimeBehavior=convertToNull&allowMultiQueries=true&serverTimezone=GMT%2B8", "root", "root");
        PreparedStatement statement = connection2.prepareStatement("update sp_plc_discovery_tasks_1 set FALSE_EVENT_COUNT = ?, FALSE_EVENT_FILES = ?, EVENT = ? WHERE id = ?");

        try (InputStream input = new FileInputStream("E:\\集约化平台\\falsePositive.txt");
             OutputStream out = new FileOutputStream("E:\\集约化平台\\falsePositive_.txt");
             Writer writer = new OutputStreamWriter(out, StandardCharsets.UTF_8);
             BufferedWriter bufferedWriter = new BufferedWriter(writer))
        {
            List<EventModel> objects = JSON.parseObject(IOUtils.toString(input, StandardCharsets.UTF_8), new TypeReference<List<EventModel>>()
            {
            });

            int count = 0;
            for (EventModel eventModel : objects)
            {
                if (null == eventModel.getHits())
                {
                    continue;
                }
                if (eventModel.getHits().getTotal() == 0)
                {
                    continue;
                }
                if (null == eventModel.getHits().getHits() || eventModel.getHits().getHits().size() == 0)
                {
                    continue;
                }
                int total = eventModel.getHits().getTotal();
                statement.setInt(1, total);
                if (total == 1193)
                {
                    System.out.println();
                }

                String filepath = eventModel.getHits().getHits()
                        .stream()
                        .filter(t -> null != t.get_source() && null != t.get_source().getFilepath())
                        .map(t -> t.get_source().getFilepath()).distinct().sorted()
                        .collect(Collectors.joining("\n"));
                statement.setString(2, filepath);

                String breachContent = eventModel.getHits().getHits()
                        .stream()
                        .filter(t -> null != t.get_source() && null != t.get_source().getBreachContent())
                        .map(t -> t.get_source().getBreachContent()).sorted()
                        .collect(Collectors.joining("\n"));
                statement.setString(3, breachContent);

                String jobId = eventModel.getHits().getHits().get(0).get_source().getJobId();
                statement.setString(4, jobId);
                statement.addBatch();
            }
            statement.executeBatch();
            System.out.println();
        }
    }

    public static void main(String args[]) throws Exception
    {
        export();
//        invalid("oss-cn-hangzhou-zwynet-d01-a.internet.cloud.zj.gov.cn/zjjcmspublic/jcms_files/jcms1/web3162/site/picture/0/jsxx/file/复件 gwzsfjjg0606273.xls");
    }

    public static void allMatchingResultIndex() throws Exception
    {
        int i = 0;
        try (InputStream input = new FileInputStream("E:\\集约化平台\\allMatchingResultIndex.txt");
             OutputStream out = new FileOutputStream("E:\\集约化平台\\allMatchingResultIndex_.txt");
             Writer writer = new OutputStreamWriter(out, StandardCharsets.UTF_8);
             BufferedWriter bufferedWriter = new BufferedWriter(writer))
        {
            List<Map<String, String>> objects = JSON.parseObject(IOUtils.toString(input, StandardCharsets.UTF_8), new TypeReference<List<Map<String, String>>>()
            {
            });
            Set<String> result = new HashSet<>();

            int count = 0;
            for (Map<String, String> map : objects)
            {
                String docs = map.get("docs.count");
                count += Integer.parseInt(docs);
                String index = map.get("index");
                if (null == index)
                {
                    System.out.println("index is null" + i++);
                    continue;
                }
                result.add(index);
            }

            String temp = String.join(" ", result);
            bufferedWriter.write(temp);
            System.out.println("count=" + count);
        }
    }

    public static void main2(String args[]) throws ClassNotFoundException, SQLException
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
