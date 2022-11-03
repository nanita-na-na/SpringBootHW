package com.cursor.springBootHW.cofiguration;

import com.cursor.springBootHW.EmailNotification;
import org.springframework.boot.autoconfigure.AutoConfigureOrder;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.Ordered;


@AutoConfigureOrder(Ordered.HIGHEST_PRECEDENCE)
@Configuration
@ConditionalOnClass(EmailNotification.class)
@PropertySource("classpath:application.properties")

@ConditionalOnProperty(prefix = "notification.service", name = "email")
public class MyAutoConfiguration {
}
