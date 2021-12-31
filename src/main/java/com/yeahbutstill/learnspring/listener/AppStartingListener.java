package com.yeahbutstill.learnspring.listener;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.context.event.ApplicationStartingEvent;
import org.springframework.context.ApplicationListener;

@Slf4j
public class AppStartingListener implements ApplicationListener<ApplicationStartingEvent> {

    @Override
    public void onApplicationEvent(ApplicationStartingEvent event) {
        AppStartingListener.log.info("Application starting");
    }
}
