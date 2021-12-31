package com.yeahbutstill.learnspring.application;

import com.yeahbutstill.learnspring.data.Foo;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

public class CustomizingSpringApplication {

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(CustomizingSpringApplication.class);
        application.setBannerMode(Banner.Mode.OFF);

        ConfigurableApplicationContext runApplicationContext = application.run(args);

        CustomizingSpringApplication bean = runApplicationContext.getBean(CustomizingSpringApplication.class);
        System.out.println(bean);
    }

    @Bean
    public Foo foo() {
        return new Foo();
    }

}
