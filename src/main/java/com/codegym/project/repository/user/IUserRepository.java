package com.codegym.project.repository.user;

import com.codegym.project.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IUserRepository extends JpaRepository<User, Long> {
    User findByUsername(String username);
    boolean findUsersByUsername(String username);
}
