package com.yeahbutstill.learnspring.bean;

import com.yeahbutstill.learnspring.lifecycle.Connections;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleConfiguration {

    @Bean
    public Connections connections() {
        return new Connections();
    }

}
