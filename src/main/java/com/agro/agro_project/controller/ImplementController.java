package com.agro.agro_project.controller;

import com.agro.agro_project.domain.*;
import com.agro.agro_project.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ImplementController {
    @Autowired
    ImplementService implementService;

    @Autowired
    NoteService noteService;

    @Autowired
    MachineTaskService machineTaskService;

    @Autowired
    AlertService alertService;

    @Autowired
    MaintenanceService maintenanceService;

    @Autowired
    SeasonService seasonService;

    @GetMapping(value="/implements")
    public String getImplements(HttpServletRequest request) {
        List<ImplementRegionMappingItem> mappingItems = implementService.findAllMappingItemsByNoDateEnd(true);
        List<Season> seasons = seasonService.findAll();
        request.setAttribute("seasons", seasons);
        request.setAttribute("mapping_items", mappingItems);
        return "implements";
    }

    @GetMapping(value="/implements/{implement_id}")
    public String getImplement(@PathVariable Short implement_id, HttpServletRequest request) {
        Implement implement = implementService.findImplementById(implement_id);
        List<Season> seasons = seasonService.findAll();
        request.setAttribute("seasons", seasons);
        request.setAttribute("implement", implement);
        return "implement_info";
    }

    @GetMapping(value="/implements/{implement_id}/notes")
    public String getNotes(@PathVariable Short implement_id, HttpServletRequest request) {
        Implement implement = implementService.findImplementById(implement_id);
        List<Note> notes = noteService.getNotes(Integer.valueOf(implement_id), "Implement");
        List<Season> seasons = seasonService.findAll();
        request.setAttribute("seasons", seasons);
        request.setAttribute("implement", implement);
        request.setAttribute("notes", notes);
        return "implement_notes";
    }

    @GetMapping(value="/implements/{implement_id}/tasks")
    public String getTasks(@PathVariable Short implement_id, HttpServletRequest request) {
        Implement implement = implementService.findImplementById(implement_id);
        List<MachineTask> machineTasks = machineTaskService.findAllMachineTasksByImplementId(implement_id);
        List<Season> seasons = seasonService.findAll();
        request.setAttribute("seasons", seasons);
        request.setAttribute("implement", implement);
        request.setAttribute("machine_tasks", machineTasks);
        return "implement_tasks";
    }

    @GetMapping(value="/implements/{implement_id}/alerts")
    public String getAlerts(@PathVariable Short implement_id, HttpServletRequest request) {
        Implement implement = implementService.findImplementById(implement_id);
        List<Alert> alerts = alertService.findAllByAlertableIdAndAlertableType(Integer.valueOf(implement_id), "Implement");
        List<Season> seasons = seasonService.findAll();
        request.setAttribute("seasons", seasons);
        request.setAttribute("implement", implement);
        request.setAttribute("alerts", alerts);
        return "implement_alerts";
    }

    @GetMapping(value="/implements/{implement_id}/alerts/{alert_id}")
    public String getAlert(@PathVariable Short implement_id, @PathVariable Integer alert_id, HttpServletRequest request) {
        Implement implement = implementService.findImplementById(implement_id);
        Alert alert = alertService.findById(alert_id);
        List<Season> seasons = seasonService.findAll();
        request.setAttribute("seasons", seasons);
        request.setAttribute("implement", implement);
        request.setAttribute("alert", alert);
        return "implement_alert_info";
    }

    @GetMapping(value="/implements/{implement_id}/maintenances")
    public String getMaintenances(@PathVariable Short implement_id, HttpServletRequest request) {
        Implement implement = implementService.findImplementById(implement_id);
        List<MaintenanceRecordRow> maintenanceRecordRowList = maintenanceService.findAllMaintenanceRecordRows().stream().filter(m -> m.getMaintenanceRecord().getMaintainableId().equals(Integer.valueOf(implement_id)) && m.getMaintenanceRecord().getMaintainableType().equals("Implement")).collect(Collectors.toList());
        List<Season> seasons = seasonService.findAll();
        request.setAttribute("seasons", seasons);
        request.setAttribute("implement", implement);
        request.setAttribute("maintenance_record_rows", maintenanceRecordRowList);
        return "implement_maintenances";
    }

    @GetMapping(value="/implements/{implement_id}/maintenances/{maintenance_id}")
    public String getMaintenance(@PathVariable Short implement_id, @PathVariable Short maintenance_id, HttpServletRequest request) {
        Implement implement = implementService.findImplementById(implement_id);
        MaintenanceRecordRow maintenanceRecordRow = maintenanceService.findMaintenanceRecordRowByMaintenanceRecord(maintenanceService.findMaintenanceRecordById(maintenance_id));
        List<Season> seasons = seasonService.findAll();
        request.setAttribute("seasons", seasons);
        request.setAttribute("implement", implement);
        request.setAttribute("maintenance_record_row", maintenanceRecordRow);
        return "implement_maintenance_info";
    }

    @GetMapping(value="/implements/{implement_id}/regions")
    public String getRegions(@PathVariable Short implement_id, HttpServletRequest request) {
        Implement implement = implementService.findImplementById(implement_id);
        List<ImplementRegionMappingItem> region_items = implementService.findAllMappingItemsByImplement(implement);
        List<Season> seasons = seasonService.findAll();
        request.setAttribute("seasons", seasons);
        request.setAttribute("implement", implement);
        request.setAttribute("region_items", region_items);
        return "implement_regions";
    }
}
