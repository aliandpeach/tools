package com.tool.doge.controller;

import com.tool.base.config.BaseConfiguration;
import com.tool.base.config.EnvCopy;
import com.tool.doge.config.DogeCache;
import com.tool.doge.config.Key;
import com.tool.doge.crawler.task.categories.CategoriesCenter;
import com.tool.doge.crawler.task.scan.ScanCenter;
import com.tool.doge.model.Host;
import com.tool.doge.service.HostService;
import com.tool.exception.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/09/02 11:30:27
 */
@RestController
@RequestMapping("/doge")
public class DogeController
{
    @Autowired
    private HostService hostService;

    @Autowired
    private CategoriesCenter categoriesCenter;

    @Autowired
    private ScanCenter scanCenter;

    @Autowired
    private EnvCopy baseEnvCopy;

    @RequestMapping(value = "/save/host", method = RequestMethod.POST)
    public BaseResponse<String> saveHost(@RequestBody @Validated Host host)
    {
        hostService.save(host);
        return BaseResponse.ok("保存成功");
    }

    @RequestMapping("/crawler/scan/start")
    @Key
    public BaseResponse<String> crawlerScanStart()
    {
        List<Host> hosts = DogeCache.HOST_LIST.get();

        String str = baseEnvCopy.get().resolvePlaceholders("${server.port}");
        String str2 = baseEnvCopy.get().resolveRequiredPlaceholders("${server.port}");
        categoriesCenter.crawler(hosts);
//        categoriesCenter.download(hosts);
        return BaseResponse.ok("启动");
    }

    @RequestMapping("/crawler/scan/stop")
    @Key
    public BaseResponse<String> crawlerScanStop()
    {
        categoriesCenter.stop();
        return BaseResponse.ok("停止");
    }

    @RequestMapping("/crawler/categories/start")
    @Key
    public BaseResponse<String> crawlerCategoriesStart()
    {
        List<Host> hosts = DogeCache.HOST_LIST.get();
        scanCenter.crawler(hosts);
        scanCenter.download(hosts);
        return BaseResponse.ok("启动");
    }

    @RequestMapping("/crawler/categories/stop")
    @Key
    public BaseResponse<String> crawlerCategoriesStop()
    {
        return BaseResponse.ok("停止");
    }
}
