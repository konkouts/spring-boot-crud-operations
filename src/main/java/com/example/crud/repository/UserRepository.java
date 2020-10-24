package com.example.crud.repository;

import com.example.crud.model.User;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface UserRepository extends MongoRepository<User, String> {
    User findUserById(String id);

    Optional<User> findById(String id);
}
