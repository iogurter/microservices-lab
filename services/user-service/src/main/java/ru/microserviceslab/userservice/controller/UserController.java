package ru.microserviceslab.userservice.controller;

import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

import ru.microserviceslab.userservice.dto.CreateUserRequest;
import ru.microserviceslab.userservice.dto.UserResponse;
import ru.microserviceslab.userservice.service.UserService;

@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    private final UserService service;

    public UserController(UserService service) {
        this.service = service;
    }

    @PostMapping
    public UserResponse create(@Valid @RequestBody CreateUserRequest request) {
        return service.create(request);
    }
}
