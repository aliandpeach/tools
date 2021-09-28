package com.tool.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * 异常类
 */
@Data
@AllArgsConstructor
public class CrawlerException extends RuntimeException
{
    private static final long serialVersionUID = 5420271486826573773L;
    /**
     * 错误码
     */
    protected int status;
    /**
     * 错误信息
     */
    protected String message;

    public CrawlerException(String message, int status, Throwable e)
    {

        super(e);
    }

    public CrawlerException(String message, Throwable e)
    {
        super(e);
    }

    public CrawlerException(String message)
    {
        super();
    }
}
