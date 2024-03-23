package com.agro.agro_project.controller;

import com.agro.agro_project.domain.*;
import com.agro.agro_project.dto.FieldShapeLandParcelsDTO;
import com.agro.agro_project.dto.MachineTaskImplementDTO;
import com.agro.agro_project.service.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import javax.ws.rs.Path;
import java.util.ArrayList;
import java.util.List;

@Controller
public class FieldController {
    @Autowired
    FieldService fieldService;

    @Autowired
    AgroOperationService agroOperationService;

    @Autowired
    MachineTaskService machineTaskService;

    @Autowired
    ImplementService implementService;

    @Autowired
    ScoutingTaskService scoutingTaskService;

    @Autowired
    LandParcelService landParcelService;

    @Autowired
    NoteService noteService;

    @Autowired
    AlertService alertService;

    @GetMapping(value= {"/", "/fields"})
    public String fields(HttpServletRequest request) {
        request.setAttribute("fields", fieldService.findAllFields());
        return "fields";
    }

    @GetMapping(value="/fields/{field_id}")
    public String getFieldInfo(@PathVariable Integer field_id, HttpServletRequest request) {
        Field field = fieldService.findFieldById(field_id);
        FieldShape fieldShape = fieldService.findFieldShapeByFieldAndEndTime(field, null);
        request.setAttribute("field", field);
        request.setAttribute("fieldShape", fieldShape);
        return "field_info";
    }

    @GetMapping(value="/fields/{field_id}/agro_operations")
    public String getAgroOperations(@PathVariable Integer field_id, HttpServletRequest request) {
        Field field = fieldService.findFieldById(field_id);
        List<AgroOperation> agroOperations = agroOperationService.findAllByField(field);
        request.setAttribute("field", field);
        request.setAttribute("agro_operations", agroOperations);
        return "field_agro_operations";
    }

    @GetMapping(value="/fields/{field_id}/agro_operations/{agro_operation_id}")
    public String getAgroOperation(@PathVariable Integer field_id, @PathVariable Integer agro_operation_id, HttpServletRequest request) {
        Field field = fieldService.findFieldById(field_id);
        AgroOperation agroOperation = agroOperationService.findById(agro_operation_id);
        List<MachineTask> machineTasks = machineTaskService.findAllMachineTasksByAgroOperationId(agro_operation_id);
        request.setAttribute("field", field);
        request.setAttribute("agro_operation", agroOperation);
        request.setAttribute("machine_tasks_dtos", getMachineTaskImplementDTO(machineTasks));
        return "field_agro_operation_info";
    }

    @GetMapping(value="/fields/{field_id}/machine_tasks")
    public String getMachineTasks(@PathVariable Integer field_id, HttpServletRequest request) {
        Field field = fieldService.findFieldById(field_id);
        List<MachineTask> machineTasks = machineTaskService.findAllMachineTasksByFieldId(field_id);
        request.setAttribute("field", field);
        request.setAttribute("machine_tasks_dtos", getMachineTaskImplementDTO(machineTasks));
        return "field_machine_tasks";
    }

    @GetMapping(value="/fields/{field_id}/scouting_tasks")
    public String getScoutingTasks(@PathVariable Integer field_id, HttpServletRequest request) {
        Field field = fieldService.findFieldById(field_id);
        List<ScoutingTask> scoutingTasks = scoutingTaskService.findAllScoutingTasks();
        request.setAttribute("field", field);
        request.setAttribute("scouting_tasks", scoutingTasks);
        return "field_scouting_tasks";
    }

    @GetMapping(value="/fields/{field_id}/scouting_tasks/{scouting_task_id}")
    public String getScoutingTask(@PathVariable Integer field_id, @PathVariable Short scouting_task_id, HttpServletRequest request) {
        Field field = fieldService.findFieldById(field_id);
        ScoutingTask scoutingTask = scoutingTaskService.findScoutingTaskById(scouting_task_id);
        List<ScoutingTaskPoint> scoutingTaskPoints = scoutingTaskService.findAllScoutingPointsByScoutingTask(scoutingTask);
        request.setAttribute("field", field);
        request.setAttribute("scouting_task", scoutingTask);
        request.setAttribute("scouting_task_points", scoutingTaskPoints);
        return "field_scouting_task_info";
    }

    @GetMapping(value="/fields/{field_id}/scout_reports")
    public String getScoutingReports(@PathVariable Integer field_id, HttpServletRequest request) {
        Field field = fieldService.findFieldById(field_id);
        List<FieldScoutReport> scoutReports = fieldService.findFieldScoutReportsByField(field);
        request.setAttribute("field", field);
        request.setAttribute("scout_reports", scoutReports);
        return "field_scout_reports";
    }

    @GetMapping(value="/fields/{field_id}/shape_land_parcels")
    public String getShapes(@PathVariable Integer field_id, HttpServletRequest request) {
        Field field = fieldService.findFieldById(field_id);
        List<FieldShape> fieldShapes = fieldService.findAllFieldShapesByField(field);
        request.setAttribute("field", field);
        request.setAttribute("field_shape_dtos", getFieldShapeLandParcelsDTO(fieldShapes));
        return "field_shape_land_parcels";
    }

    @GetMapping(value="/fields/{field_id}/notes")
    public String getNotes(@PathVariable Integer field_id, HttpServletRequest request) {
        Field field = fieldService.findFieldById(field_id);
        List<Note> notes = noteService.getNotes(field_id, "Field");
        request.setAttribute("field", field);
        request.setAttribute("notes", notes);
        return "field_notes";
    }

    @GetMapping(value="/fields/{field_id}/alerts")
    public String getAlerts(@PathVariable Integer field_id, HttpServletRequest request) {
        Field field = fieldService.findFieldById(field_id);
        List<Alert> alerts = alertService.findAllByAlertableIdAndAlertableType(field_id, "Field");
        request.setAttribute("field", field);
        request.setAttribute("alerts", alerts);
        return "field_alerts";
    }

    @GetMapping(value="/fields/{field_id}/alerts/{alert_id}")
    public String getAlert(@PathVariable Integer field_id, @PathVariable Integer alert_id, HttpServletRequest request) {
        Field field = fieldService.findFieldById(field_id);
        Alert alert = alertService.findById(alert_id);
        request.setAttribute("field", field);
        request.setAttribute("alert", alert);
        return "field_alert_info";
    }

    private List<FieldShapeLandParcelsDTO> getFieldShapeLandParcelsDTO(List<FieldShape> fieldShapes){
        List<FieldShapeLandParcelsDTO> fieldShapeLandParcelsDTOS = new ArrayList<>();
        for(FieldShape fieldShape : fieldShapes) {
            List<FieldShapeLandParcelMappingItem> items = fieldService.findAllMappingItemsByFieldShape(fieldShape);
            List<LandParcel> landParcels = new ArrayList<>();
            for(FieldShapeLandParcelMappingItem mappingItem : items) {
                landParcels.add(mappingItem.getLandParcel());
            }
            fieldShapeLandParcelsDTOS.add(new FieldShapeLandParcelsDTO(fieldShape, landParcels));
        }
        return fieldShapeLandParcelsDTOS;
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
