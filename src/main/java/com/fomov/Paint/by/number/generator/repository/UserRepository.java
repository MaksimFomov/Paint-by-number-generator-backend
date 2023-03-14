package com.fomov.Paint.by.number.generator.repository;

import com.fomov.Paint.by.number.generator.model.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Integer> {}
