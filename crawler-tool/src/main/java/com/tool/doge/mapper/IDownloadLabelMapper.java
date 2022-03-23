package com.tool.doge.mapper;

import com.tool.doge.model.DownloadLabel;

import java.util.List;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/09/02 11:20:50
 */
public interface IDownloadLabelMapper
{
    List<DownloadLabel> selectDownloadLabelList();

    int saveDownloadLabel(DownloadLabel downloadLabel);
}
