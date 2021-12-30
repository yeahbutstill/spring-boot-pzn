package com.yeahbutstill.learnspring;

import com.yeahbutstill.learnspring.eventlistenerannotation.UserListener;
import com.yeahbutstill.learnspring.listener.LoginAgainSuccessListener;
import com.yeahbutstill.learnspring.listener.LoginSuccessListener;
import com.yeahbutstill.learnspring.service.UserService;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

class EventListenerTest {

    private ConfigurableApplicationContext applicationContext;

    @BeforeEach
    void setUp() {
        applicationContext = new AnnotationConfigApplicationContext(TestConfigurtion.class);
        applicationContext.registerShutdownHook();
    }

    @Test
    void testEvent() {
        UserService userService = applicationContext.getBean(UserService.class);
        userService.login("dani", "rahasia");
        userService.login("maya", "rahasia");
        userService.login("winda", "rahasia");
        Assertions.assertNotNull(userService);
    }

    @Configuration
    @Import({
            LoginSuccessListener.class,
            LoginAgainSuccessListener.class,
            UserService.class,
            UserListener.class
    })
    public static class TestConfigurtion {
    }
}
