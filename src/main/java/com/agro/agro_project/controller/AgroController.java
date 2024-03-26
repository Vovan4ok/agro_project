package com.agro.agro_project.controller;

import com.agro.agro_project.domain.AgriWorkPlan;
import com.agro.agro_project.domain.AgroOperation;
import com.agro.agro_project.domain.ScoutingTask;
import com.agro.agro_project.service.AgriWorkPlanService;
import com.agro.agro_project.service.AgroOperationService;
import com.agro.agro_project.service.ScoutingTaskService;
import com.agro.agro_project.service.SeasonService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class AgroController {
    @Autowired
    AgroOperationService agroOperationService;

    @Autowired
    AgriWorkPlanService agriWorkPlanService;

    @Autowired
    ScoutingTaskService scoutingTaskService;

    @Autowired
    SeasonService seasonService;

    @GetMapping(value="/agro_operations")
    public String getAgroOperations(HttpServletRequest request) {
        List<AgroOperation> agroOperations = agroOperationService.findAll();
        request.setAttribute("agro_operations", agroOperations);
        return "agro_operations";
    }

    @GetMapping(value="/agri_work_plans")
    public String getAgriWorkPlans(HttpServletRequest request) {
        List<AgriWorkPlan> agriWorkPlans = agriWorkPlanService.findAll();
        request.setAttribute("agri_work_plans", agriWorkPlans);
        return "agri_work_plans";
    }

    @GetMapping(value="/agri_work_plans/{agri_work_plan_id}")
    public String getAgriWorkPlan(@PathVariable Short agri_work_plan_id, HttpServletRequest request) {
        AgriWorkPlan agriWorkPlan = agriWorkPlanService.findById(agri_work_plan_id);
        List<AgroOperation> agroOperations = agroOperationService.findAllByAgriWorkPlan(agriWorkPlan);
        double plannedArea = 0, coveredArea = 0, completedArea = 0;
        for(AgroOperation agroOperation : agroOperations) {
            if(agroOperation.getPlannedArea() != null) {
                plannedArea += agroOperation.getPlannedArea();
            }
            if(agroOperation.getCoveredArea() != null) {
                coveredArea += agroOperation.getCoveredArea();
            }
            if(agroOperation.getCompletedArea() != null) {
                completedArea += agroOperation.getCompletedArea();
            }
        }
        request.setAttribute("agri_work_plan", agriWorkPlan);
        request.setAttribute("planned_area", plannedArea);
        request.setAttribute("covered_area", coveredArea);
        request.setAttribute("completed_area", completedArea);
        request.setAttribute("agro_operations", agroOperations);
        return "agri_work_plan_info";
    }

    @GetMapping(value="/scouting_tasks")
    public String getScoutingTasks(HttpServletRequest request) {
        List<ScoutingTask> scoutingTasks = scoutingTaskService.findAllScoutingTasks();
        request.setAttribute("scouting_tasks", scoutingTasks);
        return "scouting_tasks";
    }
}
