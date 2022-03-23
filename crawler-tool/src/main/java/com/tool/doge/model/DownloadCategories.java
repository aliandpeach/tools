package com.tool.doge.model;

import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Data
public class DownloadCategories implements Serializable
{
    private static final long serialVersionUID = 8997108884039263875L;

    private String id = UUID.randomUUID().toString().replace("-", "");

    private String url;

    private String fileName;

    private String fileHash;

    private String category;

    private boolean success;
}
