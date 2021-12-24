package com.yeahbutstill.learnspring;

import com.yeahbutstill.learnspring.bean.ChangeBeanNameConfiguration;
import com.yeahbutstill.learnspring.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanNameTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ChangeBeanNameConfiguration.class);
    }

    @Test
    void testBeanName() {
        Foo foo = applicationContext.getBean(Foo.class);
        Foo fooFirst = applicationContext.getBean("fooFirst", Foo.class);
        Foo fooSecond = applicationContext.getBean("fooSecond", Foo.class);

        Assertions.assertSame(foo, fooFirst);
        Assertions.assertNotSame(foo, fooSecond);
    }
}
