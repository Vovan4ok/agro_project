package com.agro.agro_project.dao;

import com.agro.agro_project.domain.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository("userRepository")
public interface UserRepository extends JpaRepository<User, Integer> {
    Optional<User> findById(Integer id);
}
