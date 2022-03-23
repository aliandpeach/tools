package com.tool.doge.service;

import com.tool.doge.mapper.IDownloadScanMapper;
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
public class DownloadScanService
{
    @Autowired
    private IDownloadScanMapper downloadScanMapper;

    public int saveDownloadScan(DownloadScan downloadScan)
    {
        return downloadScanMapper.saveDownloadScan(downloadScan);
    }

    public int saveDownloadScanList(List<DownloadScan> downloadScanList)
    {
        if (null == downloadScanList || downloadScanList.size() == 0)
        {
            return 0;
        }
        return downloadScanMapper.saveDownloadScanList(downloadScanList);
    }

    public int updateDownloadScan(DownloadScan downloadScan)
    {
        return downloadScanMapper.updateDownloadScan(downloadScan);
    }

    public List<DownloadScan> selectDownloadScan(int limit)
    {
        return downloadScanMapper.selectDownloadScan(limit);
    }
}
