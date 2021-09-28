package com.tool.app.db;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/09/07 11:13:13
 */
public class Task
{
    private int index;

    private String taskId;

    private String jobId;

    private String fileName;

    private String jobName;

    private String ruleName;

    private float secretRate;

    private String breachContent;
    private String matchContent;

    // 检测时间
    private String testDate;

    public String getJobId()
    {
        return jobId;
    }

    public void setJobId(String jobId)
    {
        this.jobId = jobId;
    }

    public String getFileName()
    {
        return fileName;
    }

    public void setFileName(String fileName)
    {
        this.fileName = fileName;
    }

    private String createDate;

    public String getTaskId()
    {
        return taskId;
    }

    public void setTaskId(String taskId)
    {
        this.taskId = taskId;
    }

    public String getCreateDate()
    {
        return createDate;
    }

    public void setCreateDate(String createDate)
    {
        this.createDate = createDate;
    }

    public int getIndex()
    {
        return index;
    }

    public void setIndex(int index)
    {
        this.index = index;
    }

    public String getJobName()
    {
        return jobName;
    }

    public void setJobName(String jobName)
    {
        this.jobName = jobName;
    }

    public String getRuleName()
    {
        return ruleName;
    }

    public void setRuleName(String ruleName)
    {
        this.ruleName = ruleName;
    }

    public float getSecretRate()
    {
        return secretRate;
    }

    public void setSecretRate(float secretRate)
    {
        this.secretRate = secretRate;
    }

    public String getBreachContent()
    {
        return breachContent;
    }

    public void setBreachContent(String breachContent)
    {
        this.breachContent = breachContent;
    }

    public String getTestDate()
    {
        return testDate;
    }

    public void setTestDate(String testDate)
    {
        this.testDate = testDate;
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
