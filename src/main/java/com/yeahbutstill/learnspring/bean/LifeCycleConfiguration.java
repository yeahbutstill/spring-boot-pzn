package com.yeahbutstill.learnspring.bean;

import com.yeahbutstill.learnspring.lifecycle.Connections;
import com.yeahbutstill.learnspring.lifecycle.Servers;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleConfiguration {

    @Bean
    public Connections connections() {
        return new Connections();
    }

    // @Bean(initMethod = "start", destroyMethod = "stop")
    @Bean
    public Servers server() {
        return new Servers();
    }

}
