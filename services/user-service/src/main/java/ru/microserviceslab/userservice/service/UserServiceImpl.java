package ru.microserviceslab.userservice.service;

import org.springframework.stereotype.Service;
import ru.microserviceslab.userservice.dto.CreateUserRequest;
import ru.microserviceslab.userservice.dto.UserResponse;
import ru.microserviceslab.userservice.entity.User;
import ru.microserviceslab.userservice.mapper.UserMapper;
import ru.microserviceslab.userservice.repository.UserRepository;
import ru.microserviceslab.userservice.kafka.UserProducer;
import ru.microserviceslab.events.UserCreatedEvent;

@Service
public class UserServiceImpl implements UserService {

    private final UserRepository repository;
    private final UserProducer producer;    

    public UserServiceImpl(UserRepository repository,
                       UserProducer producer) {

    this.repository = repository;
    this.producer = producer;
}

    @Override
    public UserResponse create(CreateUserRequest request) {

        User user = UserMapper.toEntity(request);

        	user = repository.save(user);

        UserCreatedEvent event = new UserCreatedEvent(
        	user.getId(),
        	user.getFirstName(),
        	user.getLastName(),
        	user.getEmail(),
        	user.getCreatedAt()
);

producer.send(event);

return UserMapper.toResponse(user);
    }
}
