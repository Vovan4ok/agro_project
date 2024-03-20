package com.agro.agro_project.service;

import com.agro.agro_project.dao.SeedRepository;
import com.agro.agro_project.domain.Seed;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("seedService")
public class SeedService {
    @Autowired
    SeedRepository seedRepository;

    public SeedService(SeedRepository seedRepository) {
        this.seedRepository = seedRepository;
    }

    public Seed findById(Short id) {
        return seedRepository.findById(id).get();
    }

    public List<Seed> findAll() {
        return seedRepository.findAll();
    }
}
