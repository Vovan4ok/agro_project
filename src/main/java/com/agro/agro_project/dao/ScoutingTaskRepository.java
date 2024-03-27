package com.agro.agro_project.dao;

import com.agro.agro_project.domain.Field;
import com.agro.agro_project.domain.ScoutingTask;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Optional;

@Repository("scoutingTaskRepository")
public interface ScoutingTaskRepository extends JpaRepository<ScoutingTask, Short> {
    Optional<ScoutingTask> findById(Short id);

    List<ScoutingTask> findAll();

    List<ScoutingTask> findAllByField(Field field);

    List<ScoutingTask> findAllByFieldAndSeason(Field field, Short season);

    List<ScoutingTask> findAllBySeason(short season);
}
