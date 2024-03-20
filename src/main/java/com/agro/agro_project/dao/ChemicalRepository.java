package com.agro.agro_project.dao;

import com.agro.agro_project.domain.Chemical;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("chemicalRepository")
public interface ChemicalRepository extends JpaRepository<Chemical, Short> {
    Optional<Chemical> findById(Short id);

    List<Chemical> findAll();
}
