package com.example.jpa.bookmanager.repository;

import com.example.jpa.bookmanager.domain.Users;
import org.assertj.core.util.Lists;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.*;
import org.springframework.transaction.annotation.Transactional;

import javax.naming.Name;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.contains;
import static org.springframework.data.domain.ExampleMatcher.GenericPropertyMatchers.endsWith;

@SpringBootTest//spring context를 로딩을 해서 test에 활용한다,
class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    @Transactional
    void crud(){
//        userRepository.save(new Users());

//        System.out.println(">>>"+userRepository.findAll());

//        userRepository.findAll().forEach(System.out::println);

//        List<Users> users = userRepository.findAll(Sort.by(Sort.Direction.DESC, "name"));
//        users.forEach(System.out::println);
//        List<Users> users = userRepository.findAllById(Lists.newArrayList(1L,3L,5L));
//        users.forEach(System.out::println);

//        Users users1 = new Users("jack","jack@gmail.com");
//        Users users2 = new Users("steve","steve@gmail.com");
//
//        userRepository.saveAll(Lists.newArrayList(users1,users2));

//        userRepository.save(users1);

//        List<Users> users = userRepository.findAll();
//
//        users.forEach(System.out::println);

//        Optional<Users> users = userRepository.findById(1L);
//        Users users = userRepository.findById(1L).orElse(null); // 1이 id 로 없으면 null
//        Users users = userRepository.findById(1L).orElseThrow(RuntimeException::new);



//        Users users = userRepository.getOne(1L);

//        System.out.println(users);
//        userRepository.save(new Users("new martin","new martin@gamil.com"));
//
//        userRepository.flush();//db반영시점 조절
//        userRepository.findAll().forEach(System.out::println);

//        long count = userRepository.count();
//        boolean exists = userRepository.existsById(1L);
//        System.out.println(exists);
//        userRepository.delete(userRepository.findById(1L).orElseThrow(()-> new RuntimeException()));
//        userRepository.deleteById(4L);
//        userRepository.deleteAll(userRepository.findAllById(Lists.newArrayList(1L,3L)));
//        userRepository.deleteAllInBatch(userRepository.findAllById(Lists.newArrayList(1L,3L)));
//        userRepository.findAll().forEach(System.out::println);

//        Page<Users> users = userRepository.findAll(PageRequest.of(0,3));//현재 element는 5개 0번째페이지에 3개 1번째 페이지에 2개 들어감
//
//        System.out.println("Page : "+users);
//        System.out.println("totalElements : "+users.getTotalElements());
//        System.out.println("totalPages : "+users.getTotalPages());
//        System.out.println("numberOfElements : "+users.getNumberOfElements()); //현재 페이지의 element수
//        System.out.println("sort : "+users.getSort());
//        System.out.println("size : "+users.getSize());
//
//        users.getContent().forEach(System.out::println);
//        ExampleMatcher matcher = ExampleMatcher.matching()
////                .withIgnorePaths("name")
//                .withMatcher("email", endsWith());
//        Example<Users> example = Example.of(new Users("martin","gmail.com"),matcher);

//        userRepository.findAll(example).forEach(System.out::println);

//        Users users = new Users();
//        users.setEmail("222");
////
//        ExampleMatcher matcher = ExampleMatcher.matching().withMatcher("email",contains());
//        Example<Users> example = Example.of(users,matcher);
//
//        userRepository.findAll(example).forEach(System.out::println);
//        userRepository.save(new Users("david","david@gmail.com"));
//
//        Users users = userRepository.findById(1L).orElseThrow(RuntimeException::new);
//        users.setEmail("martin-update@gmail.com");
//
//        userRepository.save(users);
    }

    @Test
    @Transactional
    void select(){
//        userRepository.findByName("martin").forEach(System.out::println);
//        System.out.println(userRepository.findByEmail("martin@gmail.com"));
//        System.out.println(userRepository.findFirst1ByName("martin"));
//        System.out.println(userRepository.findTop2ByName("martin"));
//        System.out.println(userRepository.findLast1ByName("martin"));
//        System.out.println(userRepository.findByEmailAndName("martin@gmail.com","martin"));
//        System.out.println(userRepository.findByEmailOrName("martin@gmail.com","denis"));
//        System.out.println(userRepository.findByCreatedAtAfter(LocalDateTime.now().minusDays(1L)));
//        System.out.println(userRepository.findByIdGreaterThan(1L));
//        System.out.println(userRepository.findByIdGreaterThanEqual(1L));
//        System.out.println(userRepository.findByIdBetween(2L,5L));
//        System.out.println(userRepository.findByIdIsNotNull());
//        System.out.println(userRepository.findByAddressIsNotEmpty());
//        System.out.println(userRepository.findByNameIn(Lists.newArrayList("martin","denis")));
//        System.out.println(userRepository.findByNameStartingWith("mar"));
//        System.out.println(userRepository.findByNameEndingWith("tin"));
//        System.out.println(userRepository.findByNameContains("ar"));
//        System.out.println(userRepository.findByNameLike("%art%"));

    }
    @Test
    void pagingAndSortingTest(){
        System.out.println(userRepository.findTop1ByNameOrderByIdDesc("martin"));
        System.out.println(userRepository.findFirstByNameOrderByIdDescEmailAsc("martin"));
        System.out.println(userRepository.findFirstByName("martin",Sort.by(Sort.Order.desc("id"), Sort.Order.asc("email"))));
    }

}