package com.yeahbutstill.learnspring.eventlistenerannotation;

import com.yeahbutstill.learnspring.event.LoginSuccessEvent;
import lombok.extern.slf4j.Slf4j;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

@Slf4j
@Component
public class UserListener {

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSuccessEvent(LoginSuccessEvent event) {
        log.info("Success login for user event {}", event.getUser());
    }

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSuccessEvent1(LoginSuccessEvent event) {
        log.info("Success login for user event1 {}", event.getUser());
    }

    @EventListener(classes = LoginSuccessEvent.class)
    public void onLoginSuccessEvent2(LoginSuccessEvent event) {
        log.info("Success login for user event2 {}", event.getUser());
    }

}
