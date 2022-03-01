package com.tool.exception;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * 异常类
 */
@EqualsAndHashCode(callSuper = true)
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
        this.status = status;
        this.message = message;
    }

    public CrawlerException(String message, Throwable e)
    {
        super(e);
        this.message = message;
    }

    public CrawlerException(String message, int status)
    {
        super();
        this.status = status;
        this.message = message;
    }

    public CrawlerException(String message)
    {
        super();
        this.message = message;
    }
}
