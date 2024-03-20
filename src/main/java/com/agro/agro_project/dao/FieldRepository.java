package com.agro.agro_project.dao;

import com.agro.agro_project.domain.Field;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("fieldRepository")
public interface FieldRepository extends JpaRepository<Field, Integer> {
    Optional<Field> findById(Integer integer);

    List<Field> findAll();
}
