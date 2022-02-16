package com.tool.doge.service;

import com.tool.doge.mapper.IDownloaderMapper;
import com.tool.doge.model.DownloadCategories;
import com.tool.doge.model.DownloadScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/09/02 11:47:35
 */
@Service
public class DownloaderService
{
    @Autowired
    private IDownloaderMapper downloaderMapper;

    public int saveDownloadCategories(DownloadCategories downloadCategories)
    {
        return downloaderMapper.saveDownloadCategories(downloadCategories);
    }

    public int saveDownloadCategoriesList(List<DownloadCategories> downloadCategoriesList)
    {
        if (null == downloadCategoriesList || downloadCategoriesList.size() == 0)
        {
            return 0;
        }
        return downloaderMapper.saveDownloadCategoriesList(downloadCategoriesList);
    }

    public int updateDownloadCategories(DownloadCategories downloadCategories)
    {
        return downloaderMapper.updateDownloadCategories(downloadCategories);
    }

    public List<DownloadCategories> selectDownloadCategories(int limit)
    {
        return downloaderMapper.selectDownloadCategories(limit);
    }

    public int saveDownloadScan(DownloadScan downloadScan)
    {
        return downloaderMapper.saveDownloadScan(downloadScan);
    }

    public int saveDownloadScanList(List<DownloadScan> downloadScanList)
    {
        if (null == downloadScanList || downloadScanList.size() == 0)
        {
            return 0;
        }
        return downloaderMapper.saveDownloadScanList(downloadScanList);
    }

    public int updateDownloadScan(DownloadScan downloadScan)
    {
        return downloaderMapper.updateDownloadScan(downloadScan);
    }

    public List<DownloadScan> selectDownloadScan(int limit)
    {
        return downloaderMapper.selectDownloadScan(limit);
    }
}
