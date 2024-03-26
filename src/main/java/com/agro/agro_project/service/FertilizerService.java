package com.agro.agro_project.service;

import com.agro.agro_project.dao.FertilizerRepository;
import com.agro.agro_project.domain.Fertilizer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("fertilizerService")
public class FertilizerService {
    @Autowired
    FertilizerRepository fertilizerRepository;

    public FertilizerService(FertilizerRepository fertilizerRepository) {
        this.fertilizerRepository = fertilizerRepository;
    }

    public Fertilizer findById(Short id) {
        return fertilizerRepository.findById(id).get();
    }

    public List<Fertilizer> findAll() {
        return fertilizerRepository.findAll();
    }
}
