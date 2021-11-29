package com.example.twodatasources.user;


import com.example.twodatasources.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {
}
