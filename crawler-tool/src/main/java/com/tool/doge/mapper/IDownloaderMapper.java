package com.tool.doge.mapper;

import com.tool.doge.model.DownloadCategories;
import com.tool.doge.model.DownloadScan;

import java.util.List;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2022/02/09 12:03:53
 */
public interface IDownloaderMapper
{
    int saveDownloadCategories(DownloadCategories downloadCategories);

    int saveDownloadCategoriesList(List<DownloadCategories> downloadCategoriesList);

    int updateDownloadCategories(DownloadCategories downloadCategories);

    List<DownloadCategories> selectDownloadCategories(int limit);

    int saveDownloadScan(DownloadScan downloadScan);

    int saveDownloadScanList(List<DownloadScan> downloadScanList);

    int updateDownloadScan(DownloadScan downloadScan);

    List<DownloadScan> selectDownloadScan(int limit);
}
