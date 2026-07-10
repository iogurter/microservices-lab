package ru.microserviceslab.userservice.event;

import java.time.LocalDateTime;

public class UserCreatedEvent {

    private Long userId;

    private String firstName;

    private String lastName;

    private String email;

    private LocalDateTime createdAt;

    public UserCreatedEvent() {
    }

    public UserCreatedEvent(Long userId,
                            String firstName,
                            String lastName,
                            String email,
                            LocalDateTime createdAt) {
        this.userId = userId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.createdAt = createdAt;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDateTime createdAt) {
        this.createdAt = createdAt;
    }
}
