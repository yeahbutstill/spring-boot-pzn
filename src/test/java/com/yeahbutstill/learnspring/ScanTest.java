package com.yeahbutstill.learnspring;

import com.yeahbutstill.learnspring.scan.ScanConfiguration;
import org.junit.jupiter.api.BeforeEach;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ScanTest {

    private ConfigurableApplicationContext configurableApplicationContext;

    @BeforeEach
    void setUp() {
        configurableApplicationContext = new AnnotationConfigApplicationContext(ScanConfiguration.class);
        configurableApplicationContext.registerShutdownHook();
    }

//    @Test
//    void scanTest() {
//        configurableApplicationContext.getBean(Foo.class);
//        configurableApplicationContext.getBean(Bar.class);
//    }
}
