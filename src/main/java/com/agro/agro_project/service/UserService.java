package com.agro.agro_project.service;

import com.agro.agro_project.dao.UserRepository;
import com.agro.agro_project.domain.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service("userService")
public class UserService {
    @Autowired
    UserRepository userRepository;

    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public User findById(Integer id) {
        return userRepository.findById(id).get();
    }
}
