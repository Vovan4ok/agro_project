package com.agro.agro_project.dao;

import com.agro.agro_project.domain.Seed;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("seedRepository")
public interface SeedRepository extends JpaRepository<Seed, Short> {
    Optional<Seed> findById(Short id);

    List<Seed> findAll();
}
