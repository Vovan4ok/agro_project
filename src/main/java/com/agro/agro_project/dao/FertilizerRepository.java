package com.agro.agro_project.dao;

import com.agro.agro_project.domain.Fertilizer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("fertilizerRepository")
public interface FertilizerRepository extends JpaRepository<Fertilizer, Short> {
    Optional<Fertilizer> findById(Short id);

    List<Fertilizer> findAll();
}
