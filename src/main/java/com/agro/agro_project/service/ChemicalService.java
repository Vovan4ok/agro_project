package com.agro.agro_project.service;

import com.agro.agro_project.dao.ChemicalRepository;
import com.agro.agro_project.domain.Chemical;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("chemicalService")
public class ChemicalService {
    @Autowired
    ChemicalRepository chemicalRepository;

    public ChemicalService(ChemicalRepository chemicalRepository) {
        this.chemicalRepository = chemicalRepository;
    }

    public Chemical findById(Short id) {
        return chemicalRepository.findById(id).get();
    }

    public List<Chemical> findAll() {
        return chemicalRepository.findAll();
    }
}
