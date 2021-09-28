package com.tool.app.ui.panel;

import java.util.Objects;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/09/03 16:20:13
 */
public class Item
{
    private String jobId;

    private String name;

    public Item(String jobId, String name)
    {
        this.jobId = jobId;
        this.name = name;
    }

    @Override
    public String toString()
    {
        return name;
    }

    public String getJobId()
    {
        return jobId;
    }

    public void setJobId(String jobId)
    {
        this.jobId = jobId;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Item item = (Item) o;
        return Objects.equals(jobId, item.jobId);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(jobId);
    }
}
