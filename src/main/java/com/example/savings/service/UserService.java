package com.example.savings.service;

import com.example.savings.entity.User;
import com.example.savings.repository.UserRepo;
import lombok.Data;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@Data
@RequiredArgsConstructor
public class UserService {
    private final UserRepo userRepo;

    public User save(User user) {
        return userRepo.save(user);
    }

    public Optional<User> findByEmail(String email) {
        return userRepo.findByEmail(email);
    }

    public boolean existsByEmail(String email) {
        return userRepo.existsByEmail(email);
    }
}
