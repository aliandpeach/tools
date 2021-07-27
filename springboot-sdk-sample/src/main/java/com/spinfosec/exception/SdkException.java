package com.spinfosec.exception;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 * BlockchainException
 */
@Data
@AllArgsConstructor
public class SdkException extends RuntimeException
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

    public SdkException(String message, int status, Throwable e)
    {

        super(e);
    }

    public SdkException(String message, Throwable e)
    {
        super(e);
    }

    public SdkException(String message)
    {
        super();
    }
}
