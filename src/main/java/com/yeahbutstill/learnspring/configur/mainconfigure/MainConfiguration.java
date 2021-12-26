package com.yeahbutstill.learnspring.configur.mainconfigure;

import com.yeahbutstill.learnspring.configur.BarConfiguration;
import com.yeahbutstill.learnspring.configur.FooConfiguration;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@Import(value = {
        FooConfiguration.class,
        BarConfiguration.class
})
public class MainConfiguration {

}
