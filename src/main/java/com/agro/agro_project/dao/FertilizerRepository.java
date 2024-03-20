package com.agro.agro_project.dao;

import com.agro.agro_project.domain.Fertilizer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("fertilizerRepository")
public interface FertilizerRepository extends JpaRepository<Fertilizer, Integer> {
    Optional<Fertilizer> findById(Integer id);

    List<Fertilizer> findAll();
}
