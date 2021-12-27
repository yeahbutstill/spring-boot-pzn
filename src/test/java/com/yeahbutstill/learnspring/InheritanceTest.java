package com.yeahbutstill.learnspring;

import com.yeahbutstill.learnspring.configur.InheritanceConfiguration;
import com.yeahbutstill.learnspring.service.MerchantService;
import com.yeahbutstill.learnspring.service.implement.MerchantServiceImpl;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class InheritanceTest {

    private ConfigurableApplicationContext configurableApplicationContext;

    @BeforeEach
    void setUp() {
        configurableApplicationContext = new AnnotationConfigApplicationContext(InheritanceConfiguration.class);
        configurableApplicationContext.registerShutdownHook();
    }

    @Test
    void testInheritance() {

        MerchantService merchantService = configurableApplicationContext.getBean(MerchantService.class);
        MerchantServiceImpl merchantServiceImpl = configurableApplicationContext.getBean(MerchantServiceImpl.class);

        Assertions.assertSame(merchantService, merchantServiceImpl);

    }
}
