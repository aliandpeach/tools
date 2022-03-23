package com.tool.doge.model;

import com.google.common.base.Objects;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicInteger;

@NoArgsConstructor
@AllArgsConstructor
public class Category implements Serializable, Cloneable
{
    private static final long serialVersionUID = -8007270211878656712L;

    private static final Logger logger = LoggerFactory.getLogger("crawler");

    @Getter
    @Setter
    private String uuid;

    @Getter
    @Setter
    private String url;

    @Getter
    @Setter
    private String name;

    @Getter
    private final AtomicInteger page = new AtomicInteger(0);

    public void addPage(int i)
    {
        this.page.getAndSet(i);
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Category that = (Category) o;
        return Objects.equal(uuid, that.uuid) && Objects.equal(url, that.url) && Objects.equal(name, that.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hashCode(uuid, url, name);
    }

    @Override
    public Category clone()
    {
        try
        {
            return (Category) super.clone();
        }
        catch (CloneNotSupportedException | NullPointerException e)
        {
            logger.error("clone categories object error {}", e.getMessage());
        }
        return null;
    }
}
