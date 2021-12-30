package com.yeahbutstill.learnspring.service;

import com.yeahbutstill.learnspring.data.User;
import com.yeahbutstill.learnspring.event.LoginSuccessEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.stereotype.Component;

@Component
public class UserService implements ApplicationEventPublisherAware {

    private ApplicationEventPublisher applicationEventPublisher;

    @Override
    public void setApplicationEventPublisher(ApplicationEventPublisher applicationEventPublisher) {
        this.applicationEventPublisher = applicationEventPublisher;
    }

    public void login(String username, String password) {
        if (isLoginSuccess(username, password)) {
            applicationEventPublisher.publishEvent(new LoginSuccessEvent(new User(username, password)));
        }
    }

    private boolean isLoginSuccess(String username, String password) {
        return "dani".equals(username) && "rahasia".equals(password);
    }
}
