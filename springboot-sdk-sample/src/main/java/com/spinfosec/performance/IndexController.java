package com.spinfosec.performance;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.InitializingBean;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;

@RestController
@RequestMapping("/")
public class IndexController implements InitializingBean
{
    private static final Logger logger = LoggerFactory.getLogger("performance");

    @Autowired
    private SdkController sdkController;

    @Autowired
    private SdkBatchController sdkBatchController;

    @Autowired
    private HttpServletRequest request;

    @Override
    public void afterPropertiesSet() throws Exception
    {

    }

    @GetMapping("")
    public ModelAndView testPage()
    {
        return sdkController.testPage(request, new OrderInfo());
    }

    @GetMapping("concurrent")
    public ModelAndView concurrentPage()
    {
        return sdkBatchController.concurrentPage(request, new OrderInfo());
    }
}