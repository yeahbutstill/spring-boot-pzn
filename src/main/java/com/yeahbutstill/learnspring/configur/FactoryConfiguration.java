package com.yeahbutstill.learnspring.configur;

import com.yeahbutstill.learnspring.factory.PaymentGatewayClientFactoryBean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {
        PaymentGatewayClientFactoryBean.class
})
public class FactoryConfiguration {
}
