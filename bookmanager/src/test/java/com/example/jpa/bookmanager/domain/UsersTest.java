package com.example.jpa.bookmanager.domain;

import org.junit.jupiter.api.Test;

import java.time.LocalDateTime;

import static org.junit.jupiter.api.Assertions.*;

class UsersTest {

    @Test
    void test(){
        Users users = new Users();

        Users users1 = new Users("ddd","ddd");

        Users users2 = new Users(1L,"ddd","fff", LocalDateTime.now(), LocalDateTime.now());

        Users users3 = Users.builder().name("이름").email("dkdkdk@gmail.com").build();
    }
}