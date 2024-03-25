package com.agro.agro_project.service;

import com.agro.agro_project.dao.ImplementRegionMappingItemRepository;
import com.agro.agro_project.dao.ImplementRepository;
import com.agro.agro_project.domain.Implement;
import com.agro.agro_project.domain.ImplementRegionMappingItem;
import com.fasterxml.jackson.databind.cfg.ContextAttributes;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("implementService")
public class ImplementService {
    @Autowired
    ImplementRepository implementRepository;

    @Autowired
    ImplementRegionMappingItemRepository implementRegionMappingItemRepository;

    public ImplementService(ImplementRepository implementRepository, ImplementRegionMappingItemRepository implementRegionMappingItemRepository) {
        this.implementRepository = implementRepository;
        this.implementRegionMappingItemRepository = implementRegionMappingItemRepository;
    }

    public Implement findImplementById(Short id) {
        if(implementRepository.findById(id).isPresent()) {
            return implementRepository.findById(id).get();
        }
        return null;
    }

    public List<Implement> findAllImplements() {
        return implementRepository.findAll();
    }

    public List<ImplementRegionMappingItem> findAllMappingItemsByImplement(Implement implement) {
        return implementRegionMappingItemRepository.findAllByImplement(implement);
    }

    public List<ImplementRegionMappingItem> findAllMappingItemsByNoDateEnd(Boolean noDateEnd) {
        return implementRegionMappingItemRepository.findAllByNoDateEnd(noDateEnd);
    }

    public ImplementRegionMappingItem findMappingItemByImplementAndNoDateEnd(Implement implement, Boolean noDateEnd) {
        return implementRegionMappingItemRepository.findByImplementAndNoDateEnd(implement, noDateEnd).get();
    }
}
