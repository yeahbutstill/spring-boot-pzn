package com.yeahbutstill.learnspring.lifecycle;

import lombok.extern.slf4j.Slf4j;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Slf4j
public class Servers {

    @PostConstruct
    public void start() {
        log.info("Start server");
    }

    @PreDestroy
    public void stop() {
        log.info("Stop server");
    }
}
