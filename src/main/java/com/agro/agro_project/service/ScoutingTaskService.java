package com.agro.agro_project.service;

import com.agro.agro_project.dao.ScoutingTaskPointRepository;
import com.agro.agro_project.dao.ScoutingTaskRepository;
import com.agro.agro_project.domain.Field;
import com.agro.agro_project.domain.ScoutingTask;
import com.agro.agro_project.domain.ScoutingTaskPoint;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("scoutingTaskService")
public class ScoutingTaskService {
    @Autowired
    ScoutingTaskRepository scoutingTaskRepository;

    @Autowired
    ScoutingTaskPointRepository scoutingTaskPointRepository;

    public ScoutingTaskService(ScoutingTaskRepository scoutingTaskRepository, ScoutingTaskPointRepository scoutingTaskPointRepository) {
        this.scoutingTaskRepository = scoutingTaskRepository;
        this.scoutingTaskPointRepository = scoutingTaskPointRepository;
    }

    public ScoutingTask findScoutingTaskById(Short id) {
        return scoutingTaskRepository.findById(id).get();
    }

    public List<ScoutingTask> findAllScoutingTasks() {
        return scoutingTaskRepository.findAll();
    }

    public List<ScoutingTask> findAllScoutingTasksByField(Field field) {
        return scoutingTaskRepository.findAllByField(field);
    }

    public List<ScoutingTask> findAllScoutingTasksByFieldAndSeason(Field field, Short season) {
        return scoutingTaskRepository.findAllByFieldAndSeason(field, season);
    }

    public List<ScoutingTask> findAllScoutingTasksBySeason(short season) {
        return scoutingTaskRepository.findAllBySeason(season);
    }

    public List<ScoutingTaskPoint> findAllScoutingPointsByScoutingTask(ScoutingTask scoutingTask) {
        return scoutingTaskPointRepository.findAllByScoutingTask(scoutingTask);
    }
}
