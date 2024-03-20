package com.agro.agro_project.dao;

import com.agro.agro_project.domain.AgriWorkPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("agriWorkPlanRepository")
public interface AgriWorkPlanRepository extends JpaRepository<AgriWorkPlan, Short> {
    Optional<AgriWorkPlan> findById(Short id);

    List<AgriWorkPlan> findAll();

    List<AgriWorkPlan> findAllBySeason(short season);
}
