package com.tool.doge.mapper;

import com.tool.doge.model.DownloadType;

import java.util.List;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/09/02 11:20:50
 */
public interface IDownloadTypeMapper
{
    List<DownloadType> selectDownloadTypeList();

    int saveDownloadType(DownloadType downloadType);
}
