package ru.itis.amvbox.micro.signupservice.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import ru.itis.amvbox.micro.signupservice.models.User;

import java.util.Optional;

public interface UsersRepository extends JpaRepository<User, Long> {
    Optional<User> findUserByEmail(String email);
    Optional<User> findUserById(Long id);
    Optional<User> findUserByConfirmCode(String confirmCode);
}