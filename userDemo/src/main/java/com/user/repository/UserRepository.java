package com.user.repository;

import com.user.po.User;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface UserRepository extends  CrudRepository<User, String> {
    @Query(value="select * from users",nativeQuery = true)
    List<User> getAllUsers();
}
