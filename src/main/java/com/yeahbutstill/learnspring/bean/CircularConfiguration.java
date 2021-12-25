package com.yeahbutstill.learnspring.bean;

import com.yeahbutstill.learnspring.cyclic.CyclicA;
import com.yeahbutstill.learnspring.cyclic.CyclicB;
import com.yeahbutstill.learnspring.cyclic.CyclicC;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CircularConfiguration {

    @Bean
    public CyclicA cyclicA(CyclicB cyclicB) {
        return new CyclicA(cyclicB);
    }

    @Bean
    public CyclicB cyclicB(CyclicC cyclicC) {
        return new CyclicB(cyclicC);
    }

    @Bean
    public CyclicC cyclicC(CyclicA cyclicA) {
        return new CyclicC(cyclicA);
    }

}
