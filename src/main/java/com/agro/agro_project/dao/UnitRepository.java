package com.agro.agro_project.dao;

import com.agro.agro_project.domain.Unit;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("unitRepository")
public interface UnitRepository extends JpaRepository<Unit, Short> {
    List<Unit> findAll();
}
