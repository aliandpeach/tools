package com.tool.app.auth;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/12/07 17:13:30
 */
public class ToolContext
{
    private AuthStore currentUser;

    private ToolContext()
    {
    }

    public static ToolContext getContext()
    {
        return ToolContextHolder.INSTANCE;
    }

    private static class ToolContextHolder
    {
        public static final ToolContext INSTANCE = new ToolContext();
    }

    public AuthStore getCurrentUser()
    {
        return currentUser;
    }

    public void setCurrentUser(AuthStore currentUser)
    {
        this.currentUser = currentUser;
    }
}
