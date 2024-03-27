package com.agro.agro_project.controller;

import com.agro.agro_project.domain.*;
import com.agro.agro_project.dto.MachineTaskImplementDTO;
import com.agro.agro_project.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class MachineController {
    @Autowired
    MachineService machineService;

    @Autowired
    NoteService noteService;

    @Autowired
    ImplementService implementService;

    @Autowired
    MachineTaskService machineTaskService;

    @Autowired
    AlertService alertService;

    @Autowired
    MaintenanceService maintenanceService;

    @Autowired
    HarvestWeighingService harvestWeighingService;

    @Autowired
    SeasonService seasonService;

    @GetMapping(value="/machines")
    public String getMachines(HttpServletRequest request) {
        List<MachineRegionMappingItem> mappingItems = machineService.findAllMappingItems(true);
        List<Season> seasons = seasonService.findAll();
        request.setAttribute("seasons", seasons);
        request.setAttribute("mapping_items", mappingItems);
        return "machines";
    }

    @GetMapping(value="/machines/{machine_id}")
    public String getMachine(@PathVariable Short machine_id, HttpServletRequest request) {
        Machine machine = machineService.findMachineById(machine_id);
        List<Season> seasons = seasonService.findAll();
        request.setAttribute("seasons", seasons);
        request.setAttribute("machine", machine);
        return "machine_info";
    }

    @GetMapping(value="/machines/{machine_id}/notes")
    public String getNotes(@PathVariable Short machine_id, HttpServletRequest request) {
        Machine machine = machineService.findMachineById(machine_id);
        List<Note> notes = noteService.getNotes(Integer.valueOf(machine_id), "Machine");
        List<Season> seasons = seasonService.findAll();
        request.setAttribute("seasons", seasons);
        request.setAttribute("machine", machine);
        request.setAttribute("notes", notes);
        return "machine_notes";
    }

    @GetMapping(value="/machines/{machine_id}/tasks")
    public String getMachineTasks(@RequestParam(required = false) Short season, @PathVariable Short machine_id, HttpServletRequest request) {
        Machine machine = machineService.findMachineById(machine_id);
        List<MachineTask> machineTasks;
        if(season == null) {
            machineTasks = machineTaskService.findAllMachineTasksByMachine(machine);
        } else {
            machineTasks = machineTaskService.findAllMachineTasksByMachineAndSeason(machine, season);
        }
        List<Season> seasons = seasonService.findAll();
        request.setAttribute("seasons", seasons);
        request.setAttribute("machine", machine);
        request.setAttribute("machine_tasks_dtos", getMachineTaskImplementDTO(machineTasks));
        return "machine_tasks";
    }

    @GetMapping(value="/machines/{machine_id}/tasks/{task_id}")
    public String getMachineTask(@PathVariable Short machine_id, @PathVariable Integer task_id, HttpServletRequest request) {
        Machine machine = machineService.findMachineById(machine_id);
        MachineTask machineTask = machineTaskService.findMachineTaskById(task_id);
        Implement implement = machineTask.getImplementId() == null ? null : implementService.findImplementById(machineTask.getImplementId());
        MachineTaskImplementDTO machineTaskImplementDTO = new MachineTaskImplementDTO(machineTask, implement);
        List<Season> seasons = seasonService.findAll();
        request.setAttribute("seasons", seasons);
        request.setAttribute("machine", machine);
        request.setAttribute("machine_task_dto", machineTaskImplementDTO);
        return "machine_task_info";
    }

    @GetMapping(value="/machines/{machine_id}/alerts")
    public String getAlerts(@PathVariable Short machine_id, HttpServletRequest request) {
        Machine machine = machineService.findMachineById(machine_id);
        List<Alert> alerts = alertService.findAllByAlertableIdAndAlertableType(Integer.valueOf(machine_id), "Machine");
        List<Season> seasons = seasonService.findAll();
        request.setAttribute("seasons", seasons);
        request.setAttribute("machine", machine);
        request.setAttribute("alerts", alerts);
        return "machine_alerts";
    }

    @GetMapping(value="/machines/{machine_id}/alerts/{alert_id}")
    public String getAlert(@PathVariable Short machine_id, @PathVariable Integer alert_id, HttpServletRequest request) {
        Machine machine = machineService.findMachineById(machine_id);
        Alert alert = alertService.findById(alert_id);
        List<Season> seasons = seasonService.findAll();
        request.setAttribute("seasons", seasons);
        request.setAttribute("machine", machine);
        request.setAttribute("alert", alert);
        return "machine_alert_info";
    }

    @GetMapping(value="/machines/{machine_id}/maintenances")
    public String getMaintenances(@PathVariable Short machine_id, HttpServletRequest request) {
        Machine machine = machineService.findMachineById(machine_id);
        List<MaintenanceRecordRow> maintenanceRecordRowList = maintenanceService.findAllMaintenanceRecordRows().stream().filter(m -> m.getMaintenanceRecord().getMaintainableId().equals(machine_id) && m.getMaintenanceRecord().getMaintainableType().equals("Machine")).collect(Collectors.toList());
        List<Season> seasons = seasonService.findAll();
        request.setAttribute("seasons", seasons);
        request.setAttribute("machine", machine);
        request.setAttribute("maintenance_record_rows", maintenanceRecordRowList);
        return "machine_maintenances";
    }

    @GetMapping(value="/machines/{machine_id}/maintenances/{maintenance_id}")
    public String getMaintenance(@PathVariable Short machine_id, @PathVariable Short maintenance_id, HttpServletRequest request) {
        Machine machine = machineService.findMachineById(machine_id);
        MaintenanceRecordRow maintenanceRecordRow = maintenanceService.findMaintenanceRecordRowByMaintenanceRecord(maintenanceService.findMaintenanceRecordById(maintenance_id));
        List<Season> seasons = seasonService.findAll();
        request.setAttribute("seasons", seasons);
        request.setAttribute("machine", machine);
        request.setAttribute("maintenance_record_row", maintenanceRecordRow);
        return "machine_maintenance_info";
    }

    @GetMapping(value="/machines/{machine_id}/downtimes")
    public String getDowntimes(@PathVariable Short machine_id, HttpServletRequest request) {
        Machine machine = machineService.findMachineById(machine_id);
        List<MachineDowntime> machineDowntimes = machineService.findAllDowntimes(machine_id);
        List<Season> seasons = seasonService.findAll();
        request.setAttribute("seasons", seasons);
        request.setAttribute("machine", machine);
        request.setAttribute("downtimes", machineDowntimes);
        return "machine_downtimes";
    }

    @GetMapping(value="/machines/{machine_id}/weighings")
    public String getWeighings(@RequestParam(required = false) Short season, @PathVariable Short machine_id, HttpServletRequest request) {
        Machine machine = machineService.findMachineById(machine_id);
        List<HarvestWeighing> weighings;
        if(season == null) {
            weighings = harvestWeighingService.findAllByMachine(machine);
        } else {
            weighings = harvestWeighingService.findAllByMachineAndSeason(machine, season);
        }
        List<Season> seasons = seasonService.findAll();
        request.setAttribute("seasons", seasons);
        request.setAttribute("machine", machine);
        request.setAttribute("weighings", weighings);
        return "machine_weighings";
    }

    @GetMapping(value="/machines/{machine_id}/weighings/{weighing_id}")
    public String getWeighing(@PathVariable Short machine_id, @PathVariable Integer weighing_id, HttpServletRequest request) {
        Machine machine = machineService.findMachineById(machine_id);
        HarvestWeighing weighing = harvestWeighingService.findById(weighing_id);
        List<Season> seasons = seasonService.findAll();
        request.setAttribute("seasons", seasons);
        request.setAttribute("machine", machine);
        request.setAttribute("weighing", weighing);
        return "machine_weighing_info";
    }

    @GetMapping(value="/machines/{machine_id}/regions")
    public String getRegions(@PathVariable Short machine_id, HttpServletRequest request) {
        Machine machine = machineService.findMachineById(machine_id);
        List<MachineRegionMappingItem> region_items = machineService.findAllMachineRegionsByMachine(machine);
        List<Season> seasons = seasonService.findAll();
        request.setAttribute("seasons", seasons);
        request.setAttribute("machine", machine);
        request.setAttribute("region_items", region_items);
        return "machine_regions";
    }

    private List<MachineTaskImplementDTO> getMachineTaskImplementDTO(List<MachineTask> machineTasks) {
        List<MachineTaskImplementDTO> machineTaskImplementDTOS = new ArrayList<>();
        for (MachineTask task : machineTasks) {
            MachineTaskImplementDTO machineTaskImplementDTO = new MachineTaskImplementDTO();
            machineTaskImplementDTO.setMachineTask(task);
            if(task.getImplementId() == null) {
                machineTaskImplementDTO.setImplement(null);
            } else {
                machineTaskImplementDTO.setImplement(implementService.findImplementById(task.getImplementId()));
            }
            machineTaskImplementDTOS.add(machineTaskImplementDTO);
        }
        return machineTaskImplementDTOS;
    }
}
