package com.agro.agro_project.service;

import com.agro.agro_project.dao.SparePartRepository;
import com.agro.agro_project.domain.SparePart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("sparePartService")
public class SparePartService {
    @Autowired
    SparePartRepository sparePartRepository;

    public SparePartService(SparePartRepository sparePartRepository) {
        this.sparePartRepository = sparePartRepository;
    }

    public List<SparePart> findAll() {
        return sparePartRepository.findAll();
    }
}
