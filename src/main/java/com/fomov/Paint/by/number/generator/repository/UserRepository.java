package com.fomov.Paint.by.number.generator.repository;

import com.fomov.Paint.by.number.generator.model.User;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findByEmail(String email);
}
