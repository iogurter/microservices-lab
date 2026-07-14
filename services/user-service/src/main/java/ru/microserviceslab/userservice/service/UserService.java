package ru.microserviceslab.userservice.service;

import ru.microserviceslab.userservice.dto.request.CreateUserRequest;
import ru.microserviceslab.userservice.dto.response.UserResponse;

public interface UserService {

    UserResponse create(CreateUserRequest request);

}
