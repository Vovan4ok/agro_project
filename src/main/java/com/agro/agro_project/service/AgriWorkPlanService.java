package com.agro.agro_project.service;

import com.agro.agro_project.dao.AgriWorkPlanRepository;
import com.agro.agro_project.domain.AgriWorkPlan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("agriWorkPlanService")
public class AgriWorkPlanService {
    @Autowired
    AgriWorkPlanRepository agriWorkPlanRepository;

    public AgriWorkPlanService(AgriWorkPlanRepository agriWorkPlanRepository) {
        this.agriWorkPlanRepository = agriWorkPlanRepository;
    }

    public AgriWorkPlan findById(Short id) {
        return agriWorkPlanRepository.findById(id).get();
    }

    public List<AgriWorkPlan> findAll() {
        return agriWorkPlanRepository.findAll();
    }

    public List<AgriWorkPlan> findAllBySeason(short season) {
        return this.agriWorkPlanRepository.findAllBySeason(season);
    }
}
