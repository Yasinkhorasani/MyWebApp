package com.mynewapp.mywebapp.repository;

import com.mynewapp.mywebapp.user.User;
import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User,Integer> {

}
