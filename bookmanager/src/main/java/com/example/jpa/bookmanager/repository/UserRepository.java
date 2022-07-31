package com.example.jpa.bookmanager.repository;

import com.example.jpa.bookmanager.domain.Users;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<Users, Long> {//처음값은 entity타입, 두번째 값은 PK즉, id값
}
