package com.yeahbutstill.learnspring.dependson;

import com.yeahbutstill.learnspring.data.Bar;
import com.yeahbutstill.learnspring.data.Foo;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Lazy;

@Configuration
@Slf4j
public class DependsOns {

    @Lazy
    @Bean
    @DependsOn(value = {"bar"})
    public Foo foo() {
        log.info("Create new Foo");
        return new Foo();
    }

    @Bean
    public Bar bar() {
        log.info("Create new Bar");
        return new Bar();
    }

}
