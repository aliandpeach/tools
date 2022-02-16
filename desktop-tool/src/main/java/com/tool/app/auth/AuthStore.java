package com.tool.app.auth;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/12/07 16:15:35
 */
public class AuthStore
{
    private String username;

    private String authorization;

    private String serverHost;

    public AuthStore(String username, String authorization, String serverHost)
    {
        this.username = username;
        this.authorization = authorization;
        this.serverHost = serverHost;
    }

    public String getUsername()
    {
        return username;
    }

    public void setUsername(String username)
    {
        this.username = username;
    }

    public String getAuthorization()
    {
        return authorization;
    }

    public void setAuthorization(String authorization)
    {
        this.authorization = authorization;
    }

    public String getServerHost()
    {
        return serverHost;
    }

    public void setServerHost(String serverHost)
    {
        this.serverHost = serverHost;
    }
}
