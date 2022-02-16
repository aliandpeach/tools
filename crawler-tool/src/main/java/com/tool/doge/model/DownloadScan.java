package com.tool.doge.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class DownloadScan implements Serializable
{
    private static final long serialVersionUID = -8323664616301391119L;

    private String id;

    private String url;

    private String fileName;

    private String fileHash;

    private String fileLabel;

    private String fileType;

    private boolean success;
}
