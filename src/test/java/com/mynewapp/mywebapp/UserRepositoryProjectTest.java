package com.mynewapp.mywebapp;

import com.mynewapp.mywebapp.repository.UserRepository;
import com.mynewapp.mywebapp.user.User;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;

import java.util.Optional;

@DataJpaTest
@AutoConfigureTestDatabase(replace = AutoConfigureTestDatabase.Replace.NONE)
@Rollback(value = false)
public class UserRepositoryProjectTest {
    @Autowired
    private UserRepository repo;

    @Test
    public void tesAddNew(){
        User user= new User();
        user.setEmail("zohakhorasani@yahoo.com");
        user.setPassword("zoha1368");
        user.setFirstname("zoha");
        user.setLastname("khorasani");

        repo.save(user);
    }
    @Test
    public void testListAll(){
        Iterable<User> users = repo.findAll();
        for (User user :users){
            System.out.println(user);
        }
    }
    @Test
    public void testUpdate(){
        Integer userId = 1;
        Optional<User> optionalUser = repo.findById(userId);
        User user = optionalUser.get();
        user.setPassword("Hello-1234");
        repo.save(user);
    }

    @Test
    public void testGet(){
        Integer userId = 2;
        Optional<User> optionalUser = repo.findById(userId);
        User user = optionalUser.get();
        System.out.println(optionalUser.get());
    }

    @Test
    public void testDelete(){
        Integer userId = 2;
       repo.deleteById(userId);
    }

}
