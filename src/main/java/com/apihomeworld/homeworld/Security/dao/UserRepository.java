package com.apihomeworld.homeworld.Security.dao;

import com.apihomeworld.homeworld.Security.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, String> {
    User findByUsername(String username);
}
