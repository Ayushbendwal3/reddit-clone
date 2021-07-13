package com.ayush.redditclone.repository;

import com.ayush.redditclone.model.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface  UserRepository extends JpaRepository<User, Long> {
    Optional<User> findByUsername(String username);
}
