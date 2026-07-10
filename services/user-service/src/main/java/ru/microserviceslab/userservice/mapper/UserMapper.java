package ru.microserviceslab.userservice.mapper;

import java.time.LocalDateTime;

import ru.microserviceslab.userservice.dto.CreateUserRequest;
import ru.microserviceslab.userservice.dto.UserResponse;
import ru.microserviceslab.userservice.entity.User;

public class UserMapper {

    public static User toEntity(CreateUserRequest request) {

        User user = new User();

        user.setFirstName(request.getFirstName());
        user.setLastName(request.getLastName());
        user.setEmail(request.getEmail());
        user.setCreatedAt(LocalDateTime.now());

        return user;
    }

    public static UserResponse toResponse(User user) {

        UserResponse response = new UserResponse();

        response.setId(user.getId());
        response.setFirstName(user.getFirstName());
        response.setLastName(user.getLastName());
        response.setEmail(user.getEmail());
        response.setCreatedAt(user.getCreatedAt());

        return response;
    }
}
