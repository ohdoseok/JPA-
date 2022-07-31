package com.example.jpa.bookmanager.repository;

import com.example.jpa.bookmanager.domain.Users;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest//spring context를 로딩을 해서 test에 활용한다,
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test void crud(){
//        userRepository.save(new Users());

//        System.out.println(">>>"+userRepository.findAll());

//        userRepository.findAll().forEach(System.out::println);

//        List<Users> users = userRepository.findAll(Sort.by(Sort.Direction.DESC, "name"));

//        List<Users> users = userRepository.findAllById(Lists.newArrayList(12L,13L,15L));
//        users.forEach(System.out::println);

        Users users1 = new Users("jack","jack@gmail.com");
        Users users2 = new Users("steve","steve@gmail.com");

        userRepository.saveAll(Lists.newArrayList(users1,users2));

//        userRepository.save(users1);

        List<Users> users = userRepository.findAll();

        users.forEach(System.out::println);
    }

}