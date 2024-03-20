package com.agro.agro_project.dao;

import com.agro.agro_project.domain.Implement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("implementRepository")
public interface ImplementRepository extends JpaRepository<Implement, Short> {
    Optional<Implement> findById(Short id);

    List<Implement> findAll();
}
