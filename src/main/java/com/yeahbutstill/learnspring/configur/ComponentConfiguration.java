package com.yeahbutstill.learnspring.configur;

import objectprovider.MultiFoo;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ComponentScan(basePackages = {
        "com.yeahbutstill.learnspring.service",
        "com.yeahbutstill.learnspring.repository",
        "com.yeahbutstill.learnspring.configur"
})

@Import(MultiFoo.class)
public class ComponentConfiguration {
}
