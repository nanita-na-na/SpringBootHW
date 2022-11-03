package com.cursor.springBootHW;

import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;

@ConditionalOnProperty(name = "email")
@ConditionalOnMissingBean

public class EmailNotification implements NotificationSender {
    @Override
    public String send(String message) {
        return "Email Notification " + message;
    }
}
