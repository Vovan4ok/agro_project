package com.agro.agro_project.service;

import com.agro.agro_project.dao.MachineDowntimeRepository;
import com.agro.agro_project.dao.MachineRegionMappingItemRepository;
import com.agro.agro_project.dao.MachineRepository;
import com.agro.agro_project.domain.Machine;
import com.agro.agro_project.domain.MachineDowntime;
import com.agro.agro_project.domain.MachineRegion;
import com.agro.agro_project.domain.MachineRegionMappingItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service("machineService")
public class MachineService {
    @Autowired
    MachineRepository machineRepository;

    @Autowired
    MachineRegionMappingItemRepository machineRegionMappingItemRepository;

    @Autowired
    MachineDowntimeRepository machineDowntimeRepository;

    public MachineService(MachineRepository machineRepository, MachineRegionMappingItemRepository machineRegionMappingItemRepository, MachineDowntimeRepository machineDowntimeRepository) {
        this.machineRepository = machineRepository;
        this.machineRegionMappingItemRepository = machineRegionMappingItemRepository;
        this.machineDowntimeRepository = machineDowntimeRepository;
    }

    public Machine findMachineById(Short id) {
        return machineRepository.findById(id).get();
    }

    public List<Machine> findAllMachines() {
        return machineRepository.findAll();
    }

    public List<MachineRegionMappingItem> findAllMappingItems(Boolean noDateEnd) {
        return machineRegionMappingItemRepository.findAllByNoDateEnd(noDateEnd);
    }

    public MachineRegionMappingItem findMappingItem(Machine machine, Boolean noDateEnd) {
        return machineRegionMappingItemRepository.findByMachineAndNoDateEnd(machine, noDateEnd).get();
    }

    public List<MachineRegionMappingItem> findAllMachineRegionsByMachine(Machine machine) {
        return machineRegionMappingItemRepository.findAllByMachine(machine);
    }

    public List<MachineDowntime> findAllDowntimes(Short machineId) {
        return machineDowntimeRepository.findAllByMachineId(machineId);
    }
}
