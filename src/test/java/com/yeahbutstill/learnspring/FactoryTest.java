package com.yeahbutstill.learnspring;

import com.yeahbutstill.learnspring.configur.FactoryConfiguration;
import com.yeahbutstill.learnspring.data.PaymentGatewayClient;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class FactoryTest {

    private ConfigurableApplicationContext configurableApplicationContext;

    @BeforeEach
    void setUp() {
        configurableApplicationContext = new AnnotationConfigApplicationContext(FactoryConfiguration.class);
        configurableApplicationContext.registerShutdownHook();
    }

    @Test
    void testFactory() {
        PaymentGatewayClient paymentGatewayClient = configurableApplicationContext.getBean(PaymentGatewayClient.class);
        Assertions.assertNotNull(paymentGatewayClient);
        Assertions.assertEquals("https://payment.tog/", paymentGatewayClient.getEndPoint());
        Assertions.assertEquals("PRIVATE", paymentGatewayClient.getPrivateKey());
        Assertions.assertEquals("PUBLIC", paymentGatewayClient.getPublicKey());
    }
}
