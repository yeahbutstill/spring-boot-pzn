package com.yeahbutstill.learnspring;

import com.yeahbutstill.learnspring.data.Bar;
import com.yeahbutstill.learnspring.data.Foo;
import com.yeahbutstill.learnspring.data.FooBar;
import com.yeahbutstill.learnspring.scope.ScopeConfiguration;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScopeTest {

    private ApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(ScopeConfiguration.class);
    }

    @Test
    void testPrototypeScope() { // object yang tidak sama

        Foo bean1 = applicationContext.getBean(Foo.class);
        Foo bean2 = applicationContext.getBean(Foo.class);
        Foo bean3 = applicationContext.getBean(Foo.class);

        Assertions.assertNotSame(bean1, bean2);
        Assertions.assertNotSame(bean1, bean3);
        Assertions.assertNotSame(bean2, bean3);

    }

    @Test
    void testSingleton() { // object yang sama

        Bar bean4 = applicationContext.getBean(Bar.class);
        Bar bean5 = applicationContext.getBean(Bar.class);
        Bar bean6 = applicationContext.getBean(Bar.class);

        Assertions.assertSame(bean4, bean5);
        Assertions.assertSame(bean4, bean6);
        Assertions.assertSame(bean5, bean6);

    }

    @Test
    void testDoubletonScope() {

        FooBar fooBar = applicationContext.getBean(FooBar.class);
        FooBar fooBar1 = applicationContext.getBean(FooBar.class);
        FooBar fooBar2 = applicationContext.getBean(FooBar.class);
        FooBar fooBar3 = applicationContext.getBean(FooBar.class);

        Assertions.assertNotSame(fooBar, fooBar1);
        Assertions.assertNotSame(fooBar2, fooBar3);
        Assertions.assertNotSame(fooBar, fooBar2);
        Assertions.assertNotSame(fooBar1, fooBar3);

    }
}
