package com.yeahbutstill.learnspring;

import com.yeahbutstill.learnspring.configur.ComponentConfiguration;
import com.yeahbutstill.learnspring.service.ProductService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class ComponentTest {

    private ConfigurableApplicationContext configurableApplicationContext;

    @BeforeEach
    void setUp() {
        configurableApplicationContext = new AnnotationConfigApplicationContext(ComponentConfiguration.class);
        configurableApplicationContext.registerShutdownHook();
    }

    @Test
    void testComponent() {
        ProductService productService1 = configurableApplicationContext.getBean(ProductService.class);
        ProductService productService2 = configurableApplicationContext.getBean("productService", ProductService.class);

        Assertions.assertSame(productService1, productService2);
    }
}
