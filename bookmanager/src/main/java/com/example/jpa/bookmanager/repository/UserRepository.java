package com.example.jpa.bookmanager.repository;

import com.example.jpa.bookmanager.domain.Users;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.JpaRepository;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Set;

public interface UserRepository extends JpaRepository<Users, Long> {//처음값은 entity타입, 두번째 값은 PK즉, id값
    List<Users> findByName(String name);

    List<Users> findByEmail(String email);

    List<Users> findFirst1ByName(String name);
    List<Users> findTop2ByName(String name);

    List<Users> findLast1ByName(String name);

    List<Users> findByEmailAndName(String email, String name);

    List<Users> findByEmailOrName(String email, String name);

    List<Users> findByCreatedAtAfter(LocalDateTime yesterday);

    List<Users> findByIdGreaterThan(Long id);
    List<Users> findByIdLessThan(Long id);
    List<Users> findByIdGreaterThanEqual(Long id);
    List<Users> findByIdBetween(Long id1, Long id2);

    List<Users> findByIdIsNotNull();
    List<Users> findByAddressIsNotEmpty();

    List<Users> findByNameIn(List<String> names);

    List<Users> findByNameStartingWith(String name);
    List<Users> findByNameEndingWith(String name);
    List<Users> findByNameContains(String name);
    List<Users> findByNameLike(String name);
    List<Users> findUserByNameIs(String name);
    List<Users> findUserByName(String name);
    List<Users> findUserByNameEquals(String name);

    List<Users> findTop1ByNameOrderByIdDesc(String name);
    List<Users> findTop1ByNameOrderByIdAsc(String name);
    List<Users> findFirstByNameOrderByIdDescEmailAsc(String name);

    List<Users> findFirstByName(String name, Sort sort);

    Page<Users> findByName(String name, Pageable pageable);

}
