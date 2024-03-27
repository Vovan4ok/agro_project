package com.agro.agro_project.controller;

import com.agro.agro_project.domain.Implement;
import com.agro.agro_project.domain.Machine;
import com.agro.agro_project.domain.MaintenanceRecordRow;
import com.agro.agro_project.domain.Season;
import com.agro.agro_project.service.ImplementService;
import com.agro.agro_project.service.MachineService;
import com.agro.agro_project.service.MaintenanceService;
import com.agro.agro_project.service.SeasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class MaintenanceController {
    @Autowired
    MaintenanceService maintenanceService;

    @Autowired
    MachineService machineService;

    @Autowired
    ImplementService implementService;

    @Autowired
    SeasonService seasonService;

    @GetMapping(value="/maintenances")
    public String getMaintenances(@RequestParam(required = false) Short season, HttpServletRequest request) {
        List<MaintenanceRecordRow> maintenanceRecordRows;
        if(season == null) {
            maintenanceRecordRows = maintenanceService.findAllMaintenanceRecordRows();
        } else {
            maintenanceRecordRows = maintenanceService.findAllMaintenanceRecordRowsBySeason(season);
        }
        List<Season> seasons = seasonService.findAll();
        request.setAttribute("seasons", seasons);
        request.setAttribute("maintenance_record_rows", maintenanceRecordRows);
        return "maintenances";
    }

    @GetMapping(value="/maintenances/{maintenance_id}")
    public String getMaintenance(@PathVariable Short maintenance_id, HttpServletRequest request) {
        MaintenanceRecordRow maintenanceRecordRow = maintenanceService.findMaintenanceRecordRowByMaintenanceRecord(maintenanceService.findMaintenanceRecordById(maintenance_id));
        if(maintenanceRecordRow.getMaintenanceRecord().getMaintainableType().equals("Machine")) {
            Machine machine = machineService.findMachineById(maintenanceRecordRow.getMaintenanceRecord().getMaintainableId());
            request.setAttribute("machine", machine);
        } else {
            Implement implement = implementService.findImplementById(maintenanceRecordRow.getMaintenanceRecord().getMaintainableId());
            request.setAttribute("machine", implement);
        }
        List<Season> seasons = seasonService.findAll();
        request.setAttribute("seasons", seasons);
        request.setAttribute("maintenance_record_row", maintenanceRecordRow);
        return "maintenance_info";
    }
}
