package com.yeahbutstill.learnspring.application;

import org.springframework.boot.autoconfigure.SpringBootApplication;

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

//    public static void main(String[] args) {
//        SpringApplication application = new SpringApplication(FooApplication.class);
//        application.setBannerMode(Banner.Mode.OFF);
//        application.setListeners(Collections.singletonList(
//                new AppStartingListener()
//        ));
//
//        ConfigurableApplicationContext runApplicationContext = application.run(args);
//        FooApplication fooApplication = runApplicationContext.getBean(FooApplication.class);
//        System.out.println(fooApplication);
//    }
//
//    @Bean
//    public Foo foo() {
//        return new Foo();
//    }
}
