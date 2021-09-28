package com.tool.doge.controller;

import com.tool.doge.model.Host;
import com.tool.doge.service.HostService;
import com.tool.exception.BaseResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 描述
 *
 * @author yangk
 * @version 1.0
 * @since 2021/09/02 11:30:27
 */
@Controller
@RequestMapping("/doge")
public class DogeController
{
    @Autowired
    private HostService hostService;

    @RequestMapping("/save/host")
    public BaseResponse<String> saveHost(@RequestParam("name") String name)
    {
        Host host = new Host();
        host.setName(name);
        hostService.save(host);
        return BaseResponse.ok("保存成功");
    }
}
