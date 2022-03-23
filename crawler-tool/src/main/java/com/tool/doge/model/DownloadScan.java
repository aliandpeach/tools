package com.tool.doge.model;

import lombok.Data;

import java.io.Serializable;
import java.util.UUID;

@Data
public class DownloadScan implements Serializable
{
    private static final long serialVersionUID = -8323664616301391119L;

    private String id = UUID.randomUUID().toString().replace("-", "");

    private String url;

    private String fileName;

    private String fileHash;

    private String category;

    private boolean success;
}
