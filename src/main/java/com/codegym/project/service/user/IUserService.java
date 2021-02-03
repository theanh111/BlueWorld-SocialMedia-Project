package com.codegym.project.service.user;

import com.codegym.project.model.user.User;
import com.codegym.project.service.IGeneralService;
import org.springframework.security.core.userdetails.UserDetailsService;

public interface IUserService extends IGeneralService<User>, UserDetailsService {
    User findUserByUsername(String username);
    boolean checkUser(String username);
    boolean checkPassword(String username, String password);
}
