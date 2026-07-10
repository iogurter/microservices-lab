package ru.microserviceslab.userservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.microserviceslab.userservice.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {

}
