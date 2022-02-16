package com.tool.doge.config;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2022/02/08 16:52:35
 */
public class DogeException extends RuntimeException
{
    private static final long serialVersionUID = 3722201008774086385L;

    private int code;

    public DogeException()
    {
    }

    public DogeException(String message)
    {
        super(message);
    }

    public DogeException(int code, String message)
    {
        super(message);
        this.code = code;
    }

    public DogeException(String message, Throwable cause)
    {
        super(message, cause);
    }

    public DogeException(Throwable cause)
    {
        super(cause);
    }

    public DogeException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace)
    {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
