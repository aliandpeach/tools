package com.tool.app.model;

import java.util.Map;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/12/07 16:06:45
 */
public class AuthResponseModel
{
    private Map<String, Object> authorization;

    private String state;

    private String message;

    public Map<String, Object> getAuthorization()
    {
        return authorization;
    }

    public void setAuthorization(Map<String, Object> authorization)
    {
        this.authorization = authorization;
    }

    public String getState()
    {
        return state;
    }

    public void setState(String state)
    {
        this.state = state;
    }

    public String getMessage()
    {
        return message;
    }

    public void setMessage(String message)
    {
        this.message = message;
    }
}
