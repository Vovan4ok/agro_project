package com.agro.agro_project.dao;

import com.agro.agro_project.domain.ScoutingTask;
import com.agro.agro_project.domain.ScoutingTaskPoint;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("scoutingTaskPointRepository")
public interface ScoutingTaskPointRepository extends JpaRepository<ScoutingTaskPoint, Short> {
    List<ScoutingTaskPoint> findAllByScoutingTask(ScoutingTask scoutingTask);
}
