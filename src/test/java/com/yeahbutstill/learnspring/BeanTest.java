package com.yeahbutstill.learnspring;

import com.yeahbutstill.learnspring.bean.BeanConfiguration;
import com.yeahbutstill.learnspring.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class BeanTest {
    @Test
    void testCreateBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        Assertions.assertNotNull(context);
    }

    @Test
    void testGetBean() {
        ApplicationContext context = new AnnotationConfigApplicationContext(BeanConfiguration.class);

        Foo foo1 = context.getBean(Foo.class);
        Foo foo2 = context.getBean(Foo.class);

        Assertions.assertSame(foo1, foo2);
    }
}
