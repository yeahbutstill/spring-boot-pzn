package com.yeahbutstill.learnspring;

import com.yeahbutstill.learnspring.data.Foo;
import com.yeahbutstill.learnspring.dependson.DependsOns;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DependsOnTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(DependsOns.class);
    }

    @Test
    void testDepenOn() {

    }

    @Test
    void testLazy() {
        Foo foo = applicationContext.getBean(Foo.class);
    }
}
