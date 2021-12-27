package com.yeahbutstill.learnspring.configur;

import com.yeahbutstill.learnspring.service.implement.MerchantServiceImpl;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(MerchantServiceImpl.class)
public class InheritanceConfiguration {

}
