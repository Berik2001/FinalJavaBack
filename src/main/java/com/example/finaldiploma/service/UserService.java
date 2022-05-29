package com.example.finaldiploma.service;

import com.example.finaldiploma.model.User;
import com.example.finaldiploma.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    boolean existsByEmailAndPassword(String email, String password) {
        return userRepository.existsByEmailAndPassword(email, password);
    }

    User findByEmail(String email){
        return userRepository.findByEmail(email);
    }

}