package com.example.jpa.bookmanager.repository;

import com.example.jpa.bookmanager.domain.Users;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;
    @Test
    void crud(){
        userRepository.save(new Users());
        System.out.println(">>>"+userRepository.findAll());
    }

}