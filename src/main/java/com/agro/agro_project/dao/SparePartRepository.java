package com.agro.agro_project.dao;

import com.agro.agro_project.domain.SparePart;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("sparePartRepository")
public interface SparePartRepository extends JpaRepository<SparePart, Short> {
    List<SparePart> findAll();
}
