package com.yeahbutstill.learnspring.scan;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = {
        "com.yeahbutstill.learnspring.configur"
})
public class ScanConfiguration {
}
