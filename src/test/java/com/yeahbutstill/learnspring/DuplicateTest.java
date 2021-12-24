package com.yeahbutstill.learnspring;

import com.yeahbutstill.learnspring.bean.DuplicateBeanConfiguration;
import com.yeahbutstill.learnspring.data.Foo;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.NoUniqueBeanDefinitionException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class DuplicateTest {

    @Test
    void testBeanDuplicate() {

        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateBeanConfiguration.class);

        // Foo bean = context.getBean(Foo.class); // error
        Assertions.assertThrows(NoUniqueBeanDefinitionException.class, () -> {
            Foo foo = context.getBean(Foo.class);
        });

    }

    @Test
    void getDuplicateBean() {

        ApplicationContext context = new AnnotationConfigApplicationContext(DuplicateBeanConfiguration.class);

        Foo foo1 = context.getBean("foo1", Foo.class);
        Foo foo2 = context.getBean("foo2", Foo.class);

        Assertions.assertNotSame(foo1, foo2);

    }
}
