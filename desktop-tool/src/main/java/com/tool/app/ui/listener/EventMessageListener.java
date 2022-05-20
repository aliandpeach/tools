package com.tool.app.ui.listener;

import cn.hutool.core.lang.TypeReference;
import com.alibaba.fastjson.JSON;
import com.tool.app.App;
import com.tool.app.db.Event;
import com.tool.app.db.Task;
import com.tool.app.ui.panel.StatusPanel;
import com.yk.mq.MessageTaskManager;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.swing.*;
import java.sql.SQLException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.UUID;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2022/04/26 18:18:35
 */
public class EventMessageListener extends MessageTaskManager
{
    private static final Logger logger = LoggerFactory.getLogger(EventMessageListener.class);

    private JProgressBar testProgress;

    private StatusPanel statusPanel;

    public EventMessageListener(JProgressBar testProgress, StatusPanel statusPanel)
    {
        this.testProgress = testProgress;
        this.statusPanel = statusPanel;
    }

    @Override
    public void onMessageTask(Map<String, String> result)
    {
        String status = result.get("status");
        String taskId = result.get("taskId");
        String jobId = result.get("jobId");
        String filename = result.get("filename");
        String breachContent = result.get("breachContent");
        String failedFiles = result.get("failedFiles");
        Task task = new Task();
        task.setTaskId(taskId);
        task.setJobId(jobId);
        task.setFileName(filename);
        task.setCreateDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date()));
        try
        {
            App.h2Store.insertTask(task);
        }
        catch (ClassNotFoundException | SQLException e)
        {
            logger.error("insert task error {}", e.getMessage());
        }

        testProgress.setValue(92);
        if ("SUSPECTED".equals(status))
        {
            java.util.List<Map<String, Object>> events = JSON.parseObject(breachContent, new TypeReference<List<Map<String, Object>>>()
            {
            });
            java.util.List<Event> dbEvents = new ArrayList<>();
            for (Map<String, Object> event : events)
            {
                Event dbEvent = new Event();

                dbEvent.setTaskId(taskId);
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
            try
            {
                App.h2Store.insertEvents(dbEvents);
            }
            catch (ClassNotFoundException | SQLException e)
            {
                logger.error("insert events error {}", e.getMessage());
            }
            testProgress.setValue(99);
        }
        else if ("NONE".equals(status))
        {
            JOptionPane.showMessageDialog(App.settingPanel, "没有检测出异常!", App.resourceBundle.getString("ui.tips"), JOptionPane.PLAIN_MESSAGE);
        }

        statusPanel.setContent(taskId);
        statusPanel.isRunning.set(false);
        testProgress.setValue(100);
    }
}
