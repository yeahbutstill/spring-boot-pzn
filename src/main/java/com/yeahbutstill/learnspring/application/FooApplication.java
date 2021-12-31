package com.yeahbutstill.learnspring.application;

import com.yeahbutstill.learnspring.data.Foo;
import com.yeahbutstill.learnspring.listener.AppStartingListener;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import java.util.Collections;

@SpringBootApplication
public class FooApplication {

//    public static void main(String[] args) {
//        ConfigurableApplicationContext applicationContext = SpringApplication.run(FooApplication.class, args);
//        Foo foo = applicationContext.getBean(Foo.class);
//        System.out.println(foo);
//    }
//
//    @Bean
//    public Foo foo() {
//        return new Foo();
//    }

    public static void main(String[] args) {
        SpringApplication application = new SpringApplication(FooApplication.class);
        application.setBannerMode(Banner.Mode.OFF);
        application.setListeners(Collections.singletonList(
                new AppStartingListener()
        ));

        ConfigurableApplicationContext runApplicationContext = application.run(args);
        FooApplication fooApplication = runApplicationContext.getBean(FooApplication.class);
        System.out.println(fooApplication);
    }

    @Bean
    public Foo foo() {
        return new Foo();
    }
}
