package ru.microserviceslab.notificationservice.consumer;

import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;
import ru.microserviceslab.events.UserCreatedEvent;

@Component
public class UserCreatedConsumer {

    @KafkaListener(
            topics = "user-events",
            groupId = "notification-group"
    )
    public void receive(UserCreatedEvent event) {

        System.out.println();
        System.out.println("========================================");
        System.out.println("USER CREATED EVENT RECEIVED");
        System.out.println(event);
        System.out.println("========================================");
        System.out.println();

    }

}
