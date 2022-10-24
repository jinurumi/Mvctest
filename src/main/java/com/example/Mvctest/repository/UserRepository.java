package com.example.Mvctest.repository;
import com.example.Mvctest.model.User;
import java.util.Optional;
import java.util.List;

public interface UserRepository {
    User save(User user);
    Optional<User> findById(Long id);
    Optional<User> findByName(String name);
    Optional<User> findByAge(Integer age);
    List<User> findAll();


}
