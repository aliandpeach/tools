package com.spinfosec.base.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Component
public class StartUpListener /*implements ApplicationListener<ApplicationReadyEvent>*/
{
    private Logger logger = LoggerFactory.getLogger("performance");

    @EventListener(ApplicationReadyEvent.class)
    public void onApplicationEvent(ApplicationReadyEvent event)
    {
    }
}
