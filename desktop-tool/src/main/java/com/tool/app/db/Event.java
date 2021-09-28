package com.tool.app.db;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/09/07 11:13:03
 */
public class Event
{
    private int index;

    private String id;

    private String fileName;

    private String taskId;

    private String rule;

    private float secretRate;

    private int sensitivity;

    private String breachContent;

    private String matchContent;

    private String eventCreateDate;

    public String getId()
    {
        return id;
    }

    public void setId(String id)
    {
        this.id = id;
    }

    public String getTaskId()
    {
        return taskId;
    }

    public void setTaskId(String taskId)
    {
        this.taskId = taskId;
    }

    public String getRule()
    {
        return rule;
    }

    public void setRule(String rule)
    {
        this.rule = rule;
    }

    public float getSecretRate()
    {
        return secretRate;
    }

    public void setSecretRate(float secretRate)
    {
        this.secretRate = secretRate;
    }

    public int getSensitivity()
    {
        return sensitivity;
    }

    public void setSensitivity(int sensitivity)
    {
        this.sensitivity = sensitivity;
    }

    public String getBreachContent()
    {
        return breachContent;
    }

    public void setBreachContent(String breachContent)
    {
        this.breachContent = breachContent;
    }

    public String getEventCreateDate()
    {
        return eventCreateDate;
    }

    public void setEventCreateDate(String eventCreateDate)
    {
        this.eventCreateDate = eventCreateDate;
    }

    public String getFileName()
    {
        return fileName;
    }

    public void setFileName(String fileName)
    {
        this.fileName = fileName;
    }

    public int getIndex()
    {
        return index;
    }

    public void setIndex(int index)
    {
        this.index = index;
    }

    public String getMatchContent()
    {
        return matchContent;
    }

    public void setMatchContent(String matchContent)
    {
        this.matchContent = matchContent;
    }
}
