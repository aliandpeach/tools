package com.spinfosec.performance;

import lombok.Data;
import org.hibernate.validator.constraints.Range;

import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@Data
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class UploaderInfo
{
    @NotNull(groups = {SdkGroup.class, SdkBatchGroup.class})
    @NotEmpty(groups = {SdkGroup.class, SdkBatchGroup.class})
    private String name;

    @NotNull(groups = {SdkGroup.class, SdkBatchGroup.class})
    @NotEmpty(groups = {SdkGroup.class, SdkBatchGroup.class})
    private String path;

    private String size;

    @Range(min = 1, max = Integer.MAX_VALUE, groups = SdkBatchGroup.class)
    private int total;

    @Range(min = 1, max = Integer.MAX_VALUE, groups = SdkBatchGroup.class)
    private long time;

    public UploaderInfo(String name, String path, String size)
    {
        this.name = name;
        this.path = path;
        this.size = size;
    }

    public UploaderInfo(String name, String path)
    {
        this.name = name;
        this.path = path;
    }

    public UploaderInfo()
    {
        this.name = name;
        this.path = path;
    }

    public static interface SdkBatchGroup
    {

    }

    public static interface SdkGroup
    {

    }
}