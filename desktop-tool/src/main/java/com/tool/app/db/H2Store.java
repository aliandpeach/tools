package com.tool.app.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

/**
 * 服务式 （Server）
 * jdbc:h2:tcp://localhost/~/test
 * 嵌入式（Embedded）
 * jdbc:h2:~/test
 * 内存式（Memory）
 * jdbc:h2:tcp://localhost/mem:test
 *
 * @author yangk
 * @version 1.0
 * @since 2021/09/07 10:40:27
 */
public class H2Store
{
    private static final String H2_DUPLICATE_KEY_ERROR_CODE = "23505";
    private static final String DATABASE_DRIVER_CLASS = "org.h2.Driver";
    private static final String DATABASE_CONNECTION_URL_PREFIX = "jdbc:h2:~/.dbsconfig/db/dbs";

    private static final String USERNAME = "root";
    private static final char[] PASSWD = new char[]{'S', 'p', 'i', 'n', 'f', 'o', '@', '0', '1', '2', '3', '4',};

    private static final String TASK_TABLE = "TASK";
    private static final String EVENT_TABLE = "EVENT";

    private static final String CREATE_TASK_TABLE = "CREATE TABLE TASK ( "
            + "task_id VARCHAR(64),"
            + "job_id VARCHAR(64),"
            + "file_name VARCHAR(1024),"
            + "create_date VARCHAR(32)"
            + ")";
    private static final String CREATE_EVENT_TABLE = "CREATE TABLE EVENT ( "
            + "id VARCHAR(64),"
            + "file_name VARCHAR(1024),"
            + "task_id VARCHAR(64),"
            + "rule VARCHAR(256),"
            + "secret_rate VARCHAR(32),"
            + "sensitivity VARCHAR(32),"
            + "breach_content longtext,"
            + "match_content VARCHAR(1024),"
            + "event_create_date VARCHAR(32)"
            + ")";

    private H2Store()
    {
        try
        {
            if (!isExist(TASK_TABLE))
            {
                createTable(CREATE_TASK_TABLE);
            }
            if (!isExist(EVENT_TABLE))
            {
                createTable(CREATE_EVENT_TABLE);
            }
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static H2Store getInstance()
    {
        return H2StoreHolder.INSTANCE;
    }

    private boolean isExist(String tableName) throws ClassNotFoundException, SQLException
    {
        Class.forName(DATABASE_DRIVER_CLASS);
        try (Connection conn = DriverManager.getConnection(DATABASE_CONNECTION_URL_PREFIX, USERNAME, new String(PASSWD));
             PreparedStatement statement = conn.prepareStatement("SELECT * FROM INFORMATION_SCHEMA.TABLES WHERE TABLE_NAME = ?"))
        {
            statement.setString(1, tableName);
            ResultSet rs2 = statement.executeQuery();
            return rs2.next();
        }
    }

    private void createTable(String createSQL) throws ClassNotFoundException, SQLException
    {
        Class.forName(DATABASE_DRIVER_CLASS);
        try (Connection conn = DriverManager.getConnection(DATABASE_CONNECTION_URL_PREFIX, USERNAME, new String(PASSWD));
             PreparedStatement statement = conn.prepareStatement(createSQL))
        {
            statement.execute();
        }
    }

    public void insertEvents(List<Event> eventList) throws ClassNotFoundException, SQLException
    {
        Class.forName(DATABASE_DRIVER_CLASS);
        try (Connection conn = DriverManager.getConnection(DATABASE_CONNECTION_URL_PREFIX, USERNAME, new String(PASSWD));
             PreparedStatement statement = conn.prepareStatement("INSERT INTO EVENT (`id`, `file_name`, `task_id`, `rule`, `secret_rate`, `sensitivity`, `breach_content`, `match_content`, `event_create_date`) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)"))
        {
            for (Event event : eventList)
            {
                statement.setString(1, UUID.randomUUID().toString().replace("-", ""));
                statement.setString(2, event.getFileName());
                statement.setString(3, event.getTaskId());
                statement.setString(4, event.getRule());
                statement.setFloat(5, event.getSecretRate());
                statement.setInt(6, event.getSensitivity());
                statement.setString(7, event.getBreachContent());
                statement.setString(8, event.getMatchContent());
                statement.setString(9, event.getEventCreateDate());
                statement.addBatch();
            }
            statement.executeBatch();
        }
    }

    public int queryEventsTotal(String taskId) throws ClassNotFoundException, SQLException
    {
        Class.forName(DATABASE_DRIVER_CLASS);
        try (Connection conn = DriverManager.getConnection(DATABASE_CONNECTION_URL_PREFIX, USERNAME, new String(PASSWD));
             PreparedStatement statement = conn.prepareStatement("SELECT count(0) FROM `EVENT` WHERE task_id = ?"))
        {
            statement.setString(1, taskId);
            ResultSet rs = statement.executeQuery();
            while (rs.next())
            {
                return rs.getInt(1);
            }
            return 0;
        }
    }

    public Page<Event> queryEventsPage(int currentPage, int pageSize, String taskId) throws ClassNotFoundException, SQLException
    {
        int total = queryEventsTotal(taskId);
        Page<Event> pageResult = new Page<>(total, currentPage, pageSize);
        Class.forName(DATABASE_DRIVER_CLASS);
        try (Connection conn = DriverManager.getConnection(DATABASE_CONNECTION_URL_PREFIX, USERNAME, new String(PASSWD));
             PreparedStatement statement = conn.prepareStatement("SELECT * FROM `EVENT` WHERE task_id = ? limit ?, ? ");)
        {
            statement.setString(1, taskId);
            statement.setInt(2, pageResult.getStartRow());
            statement.setInt(3, pageResult.getPageSize());
            ResultSet rs = statement.executeQuery();
            pageResult.setDataList(new ArrayList<>());
            int index = 1;
            while (rs.next())
            {
                Event event = new Event();
                event.setIndex(pageResult.getStartRow() + index++);
                event.setId(rs.getString("id"));
                event.setFileName(rs.getString("file_name"));
                event.setTaskId(rs.getString("task_id"));
                event.setSensitivity(rs.getInt("sensitivity"));
                event.setSecretRate(rs.getFloat("secret_rate"));
                event.setRule(rs.getString("rule"));
                event.setBreachContent(rs.getString("breach_content"));
                event.setMatchContent(rs.getString("match_content"));
                event.setEventCreateDate(rs.getString("event_create_date"));
                pageResult.getDataList().add(event);
            }
        }
        return pageResult;
    }

    private static class H2StoreHolder
    {
        public static H2Store INSTANCE = new H2Store();
    }

    public void insertTask(Task task) throws ClassNotFoundException, SQLException
    {
        Class.forName(DATABASE_DRIVER_CLASS);
        try (Connection conn = DriverManager.getConnection(DATABASE_CONNECTION_URL_PREFIX, USERNAME, new String(PASSWD));
             PreparedStatement statement = conn.prepareStatement("INSERT INTO TASK (`task_id`, `job_id`, `file_name`, `create_date`) VALUES (?, ?, ?, ?)"))
        {
            statement.setString(1, task.getTaskId());
            statement.setString(2, task.getJobId());
            statement.setString(3, task.getFileName());
            statement.setString(4, task.getCreateDate());

            statement.execute();
        }
    }
}
