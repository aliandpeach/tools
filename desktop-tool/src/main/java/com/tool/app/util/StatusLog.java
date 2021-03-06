package com.tool.app.util;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 日志封装类，控制系统信息（界面和log文件）的记录
 */
public class StatusLog
{
    private static final Logger logger = LoggerFactory.getLogger(StatusLog.class);

    /**
     * 设置状态面板状态信息
     *
     * @param status
     */
    public static void setStatus(String status)
    {
    }

    /**
     * 设置状态面板状态的详细信息+写入日志文件（Debug模式下）
     *
     * @param statusDetail
     * @param level
     */
    public static void setStatusDetail(String statusDetail, Enum<LogLevel> level)
    {
    }

    /**
     * 设置状态面板中上一次同步时间，并写入conf
     *
     * @param lastTime
     */
    public static void setLastTime(String lastTime)
    {
    }

    /**
     * 设置状态面板中的持续时间，并写入conf
     *
     * @param keepTime
     */
    public static void setKeepTime(String keepTime)
    {
    }

    /**
     * 设置状态面板中下一次同步时间
     *
     * @param nextTime
     */
    public static void setNextTime(String nextTime)
    {
    }

    /**
     * 设置状态面板中的成功总次数，并写入conf
     *
     * @param success
     */
    public static void setSuccess(String success)
    {
    }

    /**
     * 设置状态面板中的失败总次数，并写入conf
     *
     * @param fail
     */
    public static void setFail(String fail)
    {
    }
}