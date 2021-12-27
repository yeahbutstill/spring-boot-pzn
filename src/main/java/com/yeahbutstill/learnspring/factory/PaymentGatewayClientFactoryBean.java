package com.yeahbutstill.learnspring.factory;

import com.yeahbutstill.learnspring.data.PaymentGatewayClient;
import org.springframework.beans.factory.FactoryBean;
import org.springframework.stereotype.Component;

@Component(value = "paymentGatewayClient")
public class PaymentGatewayClientFactoryBean implements FactoryBean<PaymentGatewayClient> {

    @Override
    public PaymentGatewayClient getObject() throws Exception {
        PaymentGatewayClient client = new PaymentGatewayClient();
        client.setEndPoint("https://payment.tog/");
        client.setPrivateKey("PRIVATE");
        client.setPublicKey("PUBLIC");
        return client;
    }

    @Override
    public Class<?> getObjectType() {
        return PaymentGatewayClient.class;
    }
}
