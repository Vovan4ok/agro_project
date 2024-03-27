package com.agro.agro_project.service;

import com.agro.agro_project.dao.HarvestWeighingRepository;
import com.agro.agro_project.domain.HarvestWeighing;
import com.agro.agro_project.domain.Machine;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("harvestWeighingService")
public class HarvestWeighingService {
    @Autowired
    HarvestWeighingRepository harvestWeighingRepository;

    public HarvestWeighingService(HarvestWeighingRepository harvestWeighingRepository) {
        this.harvestWeighingRepository = harvestWeighingRepository;
    }

    public HarvestWeighing findById(Integer id) {
        return harvestWeighingRepository.findById(id).get();
    }

    public List<HarvestWeighing> findAllByMachine(Machine machine) {
        return harvestWeighingRepository.findAllByMachine(machine);
    }

    public List<HarvestWeighing> findAllByMachineAndSeason(Machine machine, Short season) {
        return harvestWeighingRepository.findAllByMachineAndSeason(machine, season);
    }
}
