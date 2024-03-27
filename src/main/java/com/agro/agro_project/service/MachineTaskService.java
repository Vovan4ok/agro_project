package com.agro.agro_project.service;

import com.agro.agro_project.dao.MachineTaskAgroOperationMappingItemRepository;
import com.agro.agro_project.dao.MachineTaskFieldMappingItemRepository;
import com.agro.agro_project.dao.MachineTaskRepository;
import com.agro.agro_project.domain.Machine;
import com.agro.agro_project.domain.MachineTask;
import com.agro.agro_project.domain.MachineTaskAgroOperationsMappingItem;
import com.agro.agro_project.domain.MachineTaskFieldMappingItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Service("machineTaskService")
public class MachineTaskService {
    @Autowired
    MachineTaskRepository machineTaskRepository;

    @Autowired
    MachineTaskFieldMappingItemRepository machineTaskFieldMappingItemRepository;

    @Autowired
    MachineTaskAgroOperationMappingItemRepository machineTaskAgroOperationMappingItemRepository;

    public MachineTaskService(MachineTaskRepository machineTaskRepository, MachineTaskFieldMappingItemRepository machineTaskFieldMappingItemRepository, MachineTaskAgroOperationMappingItemRepository machineTaskAgroOperationMappingItemRepository) {
        this.machineTaskRepository = machineTaskRepository;
        this.machineTaskFieldMappingItemRepository = machineTaskFieldMappingItemRepository;
        this.machineTaskAgroOperationMappingItemRepository = machineTaskAgroOperationMappingItemRepository;
    }

    public MachineTask findMachineTaskById(Integer id) {
        if(machineTaskRepository.findById(id).isPresent()) {
            return machineTaskRepository.findById(id).get();
        }
        return null;
    }

    public List<MachineTask> findAllMachineTasksByMachine(Machine machine) {
        return machineTaskRepository.findAllByMachine(machine);
    }

    public List<MachineTask> findAllMachineTasksByMachineAndSeason(Machine machine, Short season) {
        return machineTaskRepository.findAllByMachineAndSeason(machine, season);
    }

    public List<MachineTask> findAllMachineTasksByImplementId(Short id) {
        return machineTaskRepository.findAllByImplementId(id);
    }

    public List<MachineTask> findAllByImplementIdAndSeason(Short implement_id, Short season) {
        return machineTaskRepository.findAllByImplementIdAndSeason(implement_id, season);
    }

    public List<MachineTask> findAllMachineTasksByFieldId(Integer fieldId) {
        List<MachineTaskFieldMappingItem> mappingItems = machineTaskFieldMappingItemRepository.findAllByFieldId(fieldId);
        List<MachineTask> machineTasks = new ArrayList<>();
        for(MachineTaskFieldMappingItem item : mappingItems) {
            MachineTask machineTask = findMachineTaskById(item.getMachineTaskId());
            if(machineTask != null) {
                machineTasks.add(machineTask);
            }
        }
        return machineTasks;
    }

    public List<MachineTask> findAllMachineTasksByFieldIdAndSeason(Integer fieldId, Short season) {
        List<MachineTaskFieldMappingItem> mappingItems = machineTaskFieldMappingItemRepository.findAllByFieldId(fieldId);
        List<MachineTask> machineTasks = new ArrayList<>();
        for(MachineTaskFieldMappingItem item : mappingItems) {
            MachineTask machineTask = findMachineTaskById(item.getMachineTaskId());
            if(machineTask != null && Objects.equals(machineTask.getSeason(), season)) {
                machineTasks.add(machineTask);
            }
        }
        return machineTasks;
    }

    public List<MachineTask> findAllMachineTasksByAgroOperationId(Integer agroOperationId) {
        List<MachineTaskAgroOperationsMappingItem> mappingItems = machineTaskAgroOperationMappingItemRepository.findAllByAgroOperationId(agroOperationId);
        List<MachineTask> machineTasks = new ArrayList<>();
        for(MachineTaskAgroOperationsMappingItem item : mappingItems) {
            MachineTask machineTask = findMachineTaskById(item.getMachineTaskId());
            if(machineTask != null) {
                machineTasks.add(machineTask);
            }
        }
        return machineTasks;
    }
}
