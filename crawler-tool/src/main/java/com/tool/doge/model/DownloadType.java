package com.tool.doge.model;

import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Data
public class DownloadType implements Serializable
{
    private String id = UUID.randomUUID().toString().replace("-", "");

    private String typeName;
}
