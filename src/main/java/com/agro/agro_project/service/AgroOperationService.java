package com.agro.agro_project.service;

import com.agro.agro_project.dao.AgroOperationRepository;
import com.agro.agro_project.domain.AgriWorkPlan;
import com.agro.agro_project.domain.AgroOperation;
import com.agro.agro_project.domain.Field;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("agroOperationService")
public class AgroOperationService {
    @Autowired
    AgroOperationRepository agroOperationRepository;


    public AgroOperationService(AgroOperationRepository agroOperationRepository) {
        this.agroOperationRepository = agroOperationRepository;
    }

    public AgroOperation findById(Integer id) {
        return agroOperationRepository.findById(id).get();
    }

    public List<AgroOperation> findAll() {
        return agroOperationRepository.findAll();
    }

    public List<AgroOperation> findAllBySeason(short season) {
        return agroOperationRepository.findAllBySeason(season);
    }

    public List<AgroOperation> findAllByAgriWorkPlan(AgriWorkPlan agriWorkPlan) {
        return agroOperationRepository.findAllByAgriWorkPlan(agriWorkPlan);
    }

    public List<AgroOperation> findAllByField(Field field) {
        return agroOperationRepository.findAllByField(field);
    }
}
