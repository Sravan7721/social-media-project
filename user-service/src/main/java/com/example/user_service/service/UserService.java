package com.example.user_service.service;

import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.user_service.model.User;
import com.example.user_service.repository.UserRepository;

@Service
public class UserService {

    private final UserRepository repo;

    public UserService(UserRepository repo) {
        this.repo = repo;
    }

    public User register(User user) {
        return repo.save(user);
    }

    public User login(String username, String password) {

        Optional<User> user = repo.findByUsername(username);

        if (user.isPresent()) {

            if (user.get().getPassword().equals(password)) {
                return user.get();
            }
        }

        return null;
    }
}