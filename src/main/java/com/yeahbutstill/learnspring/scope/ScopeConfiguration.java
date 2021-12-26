package com.yeahbutstill.learnspring.scope;

import com.yeahbutstill.learnspring.data.Bar;
import com.yeahbutstill.learnspring.data.Foo;
import com.yeahbutstill.learnspring.data.FooBar;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.config.CustomScopeConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Slf4j
@Configuration
public class ScopeConfiguration {

    @Bean
    @Scope(value = "prototype")
    public Foo foo() {
        log.info("Create new Foo");
        return new Foo();
    }

    @Bean
    @Scope(value = "singleton")
    public Bar bar() {
        log.info("Create new Foo");
        return new Bar();
    }

    @Bean
    public CustomScopeConfigurer customScopeConfigurer() {
        CustomScopeConfigurer configurer = new CustomScopeConfigurer();
        configurer.addScope("doubleton", new DoubletonScope());
        return configurer;
    }

    @Bean
    @Scope("doubleton")
    public FooBar fooBar() {
        log.info("Create new FooBar");
        return new FooBar();
    }

}
