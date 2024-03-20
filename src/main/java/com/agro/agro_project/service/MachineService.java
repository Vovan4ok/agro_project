package com.agro.agro_project.service;

import com.agro.agro_project.dao.MachineRegionMappingItemRepository;
import com.agro.agro_project.dao.MachineRepository;
import com.agro.agro_project.domain.Machine;
import com.agro.agro_project.domain.MachineRegionMappingItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("machineService")
public class MachineService {
    @Autowired
    MachineRepository machineRepository;

    @Autowired
    MachineRegionMappingItemRepository machineRegionMappingItemRepository;

    public MachineService(MachineRepository machineRepository, MachineRegionMappingItemRepository machineRegionMappingItemRepository) {
        this.machineRepository = machineRepository;
        this.machineRegionMappingItemRepository = machineRegionMappingItemRepository;
    }

    public Machine findMachineById(Integer id) {
        return machineRepository.findById(id).get();
    }

    public List<Machine> findAllMachines() {
        return machineRepository.findAll();
    }

    public List<MachineRegionMappingItem> findAllMappingItemsByMachine(Machine machine) {
        return machineRegionMappingItemRepository.findAllByMachine(machine);
    }
}
