package com.alterra.queueloging.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.alterra.queueloging.entities.User;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{
    public User findByEmail(String email);
    public User findByUsername(String username);
}
