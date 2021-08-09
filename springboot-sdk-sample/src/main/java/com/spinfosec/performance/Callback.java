package com.spinfosec.performance;

import com.spinfosec.mq.MessageTaskManager;

import java.util.Map;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/08/05 09:32:52
 */
public class Callback extends MessageTaskManager
{
    @Override
    protected void onMessageTask(Map<String, String> result)
    {
        System.out.println("任务ID : " + result.get("taskId"));
        System.out.println("任务结果状态 : " + result.get("status"));
        System.out.println("任务失败文件列表 : " + result.get("failedFiles"));
        System.out.println("任务事件信息 : " + result.get("breachContent"));
    }
}
