package com.example.finaldiploma.repository;


import com.example.finaldiploma.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
    public interface UserRepository extends JpaRepository<User, Long> {
        boolean existsByEmailAndPassword(String email,String password);
        User findByEmail(String email);
        Optional<User> findByUsername(String username);
    }
