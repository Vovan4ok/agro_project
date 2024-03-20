package com.agro.agro_project.service;

import com.agro.agro_project.dao.MachineTaskFieldMappingItemRepository;
import com.agro.agro_project.dao.MachineTaskRepository;
import com.agro.agro_project.domain.Machine;
import com.agro.agro_project.domain.MachineTask;
import com.agro.agro_project.domain.MachineTaskFieldMappingItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("machineTaskService")
public class MachineTaskService {
    @Autowired
    MachineTaskRepository machineTaskRepository;

    @Autowired
    MachineTaskFieldMappingItemRepository machineTaskFieldMappingItemRepository;

    public MachineTaskService(MachineTaskRepository machineTaskRepository, MachineTaskFieldMappingItemRepository machineTaskFieldMappingItemRepository) {
        this.machineTaskRepository = machineTaskRepository;
        this.machineTaskFieldMappingItemRepository = machineTaskFieldMappingItemRepository;
    }

    public MachineTask findMachineTaskById(Integer id) {
        return machineTaskRepository.findById(id).get();
    }

    public List<MachineTask> findAllMachineTasksByMachine(Machine machine) {
        return machineTaskRepository.findAllByMachine(machine);
    }

    public List<MachineTask> findAllMachineTasksByImplementId(short id) {
        return machineTaskRepository.findAllByImplementId(id);
    }

    public List<MachineTaskFieldMappingItem> findAllMappingItemsByFieldId(int fieldId) {
        return machineTaskFieldMappingItemRepository.findAllByFieldId(fieldId);
    }

    public MachineTaskFieldMappingItem findMappingItemByMachineTaskId(int machineTaskId) {
        return machineTaskFieldMappingItemRepository.findByMachineTaskId(machineTaskId).get();
    }
}
