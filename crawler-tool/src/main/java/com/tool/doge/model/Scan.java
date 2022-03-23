package com.tool.doge.model;

import lombok.Data;

import java.io.Serializable;

@Data
public class Scan implements Serializable
{
    private static final long serialVersionUID = -1432904091729641497L;

    private String type;

    private String url;

    private int page;
}
