package com.yeahbutstill.learnspring;

import com.yeahbutstill.learnspring.configur.mainconfigure.MainConfiguration;
import com.yeahbutstill.learnspring.data.Bar;
import com.yeahbutstill.learnspring.data.Foo;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ImportTest {

    private ConfigurableApplicationContext configurableApplicationContext;

    @BeforeEach
    void setUp() {
        configurableApplicationContext = new AnnotationConfigApplicationContext(MainConfiguration.class);
        configurableApplicationContext.registerShutdownHook();
    }

    @Test
    void testImport() {
        Foo foo = configurableApplicationContext.getBean(Foo.class);
        Bar bar = configurableApplicationContext.getBean(Bar.class);
    }
}
