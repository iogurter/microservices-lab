package ru.microserviceslab.events;

import java.time.LocalDateTime;

public record UserCreatedEvent(
        Long userId,
        String firstName,
        String lastName,
        String email,
        LocalDateTime createdAt
) {
}
