package com.yeahbutstill.learnspring.springboottest;

import com.yeahbutstill.learnspring.application.FooApplication;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class WithoutSpringBootTest {

    private ConfigurableApplicationContext applicationContext;


    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(FooApplication.class);
        applicationContext.registerShutdownHook();
    }

//    @Test
//    void testFoo() {
//        Foo foo = applicationContext.getBean(Foo.class);
//        System.out.println(foo);
//    }
}
