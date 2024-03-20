package com.agro.agro_project.service;

import com.agro.agro_project.dao.AdditionalObjectRepository;
import com.agro.agro_project.domain.AdditionalObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("additionalObjectService")
public class AdditionalObjectService {
    @Autowired
    AdditionalObjectRepository additionalObjectRepository;

    public AdditionalObjectService(AdditionalObjectRepository additionalObjectRepository) {
        this.additionalObjectRepository = additionalObjectRepository;
    }

    public List<AdditionalObject> findAll() {
        return additionalObjectRepository.findAll();
    }
}
