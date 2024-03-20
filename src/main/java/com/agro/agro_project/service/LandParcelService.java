package com.agro.agro_project.service;

import com.agro.agro_project.dao.LandParcelRepository;
import com.agro.agro_project.domain.LandParcel;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("landParcelService")
public class LandParcelService {
    @Autowired
    LandParcelRepository landParcelRepository;

    public LandParcelService(LandParcelRepository landParcelRepository) {
        this.landParcelRepository = landParcelRepository;
    }

    public LandParcel findById(Integer id) {
        return landParcelRepository.findById(id).get();
    }

    public List<LandParcel> findAll() {
        return landParcelRepository.findAll();
    }
}
