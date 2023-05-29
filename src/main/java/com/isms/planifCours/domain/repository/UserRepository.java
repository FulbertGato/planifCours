package com.isms.planifCours.domain.repository;

import com.isms.planifCours.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import java.util.Optional;

@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
        Optional<User> findByEmail(String email);
        User findOneByEmail(String email);
        //@Query("select u from User u where u.username = ?1")
       // Optional<User> findByUsername_(String username);
}