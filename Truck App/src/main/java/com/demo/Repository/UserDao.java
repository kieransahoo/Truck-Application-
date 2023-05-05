package com.demo.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.demo.Entities.User;

public interface UserDao extends JpaRepository<User,Integer> {
    
}
