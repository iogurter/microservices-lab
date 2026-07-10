package ru.microserviceslab.userservice.service;

import ru.microserviceslab.userservice.dto.CreateUserRequest;
import ru.microserviceslab.userservice.dto.UserResponse;

public interface UserService {

    UserResponse create(CreateUserRequest request);

}
