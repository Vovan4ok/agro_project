package com.agro.agro_project.service;

import com.agro.agro_project.dao.UnitRepository;
import com.agro.agro_project.domain.Unit;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("unitService")
public class UnitService {
    @Autowired
    UnitRepository unitRepository;

    public UnitService(UnitRepository unitRepository) {
        this.unitRepository = unitRepository;
    }

    public List<Unit> findAll() {
        return unitRepository.findAll();
    }
}
