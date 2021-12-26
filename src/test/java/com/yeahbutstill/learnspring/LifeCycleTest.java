package com.yeahbutstill.learnspring;

import com.yeahbutstill.learnspring.bean.LifeCycleConfiguration;
import com.yeahbutstill.learnspring.lifecycle.Connections;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class LifeCycleTest {

    private ConfigurableApplicationContext configurableApplicationContext;

    @BeforeEach
    void setUp() {
        configurableApplicationContext = new AnnotationConfigApplicationContext(LifeCycleConfiguration.class);
        configurableApplicationContext.registerShutdownHook();
    }

    @AfterEach
    void tearDown() {
        // configurableApplicationContext.close(); // manual
    }

    @Test
    void testConnection() {
        Connections connections = configurableApplicationContext.getBean(Connections.class);
    }
}
