package com.agro.agro_project.dao;

import com.agro.agro_project.domain.AgriWorkPlan;
import com.agro.agro_project.domain.AgroOperation;
import com.agro.agro_project.domain.Field;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("agroOperationRepository")
public interface AgroOperationRepository extends JpaRepository<AgroOperation, Integer> {
    Optional<AgroOperation> findById(Integer id);

    List<AgroOperation> findAll();

    List<AgroOperation> findAllBySeason(short season);

    List<AgroOperation> findAllByAgriWorkPlan(AgriWorkPlan agriWorkPlan);

    List<AgroOperation> findAllByField(Field field);

    List<AgroOperation> findAllByFieldAndSeason(Field field, Short season);
}
