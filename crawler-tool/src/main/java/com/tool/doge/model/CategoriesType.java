package com.tool.doge.model;

import com.google.common.base.Objects;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.Serializable;
import java.util.UUID;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class CategoriesType implements Serializable, Cloneable
{
    private static final long serialVersionUID = -8007270211878656712L;

    private static final Logger logger = LoggerFactory.getLogger("categories");

    private String id = UUID.randomUUID().toString().replace("-", "");

    private String uuid;

    private String url;

    private String name;

    private int page;

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CategoriesType that = (CategoriesType) o;
        return Objects.equal(uuid, that.uuid) && Objects.equal(url, that.url) && Objects.equal(name, that.name);
    }

    @Override
    public int hashCode()
    {
        return Objects.hashCode(uuid, url, name);
    }

    @Override
    public CategoriesType clone()
    {
        try
        {
            return (CategoriesType) super.clone();
        }
        catch (CloneNotSupportedException | NullPointerException e)
        {
            logger.error("clone categories object error {}", e.getMessage());
        }
        return null;
    }
}
