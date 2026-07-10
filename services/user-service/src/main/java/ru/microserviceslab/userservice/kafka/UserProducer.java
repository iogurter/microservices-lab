package ru.microserviceslab.userservice.kafka;

import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;
import ru.microserviceslab.userservice.event.UserCreatedEvent;

@Component
public class UserProducer {

    private final KafkaTemplate<String, UserCreatedEvent> kafkaTemplate;

    public UserProducer(KafkaTemplate<String, UserCreatedEvent> kafkaTemplate) {
        this.kafkaTemplate = kafkaTemplate;
    }

    public void send(UserCreatedEvent event) {

        System.out.println("========== KAFKA SEND ==========");
        System.out.println(event);
        System.out.println("================================");

        kafkaTemplate.send("user-events", event);

        System.out.println("========== SENT ==========");

    }

}
