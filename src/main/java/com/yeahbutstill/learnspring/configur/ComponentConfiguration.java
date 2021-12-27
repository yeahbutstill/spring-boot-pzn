package com.yeahbutstill.learnspring.configur;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.yeahbutstill.learnspring.service",
        "com.yeahbutstill.learnspring.repository"
})
public class ComponentConfiguration {
}
