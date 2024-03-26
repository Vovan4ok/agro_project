package com.agro.agro_project.controller;

import com.agro.agro_project.domain.Season;
import com.agro.agro_project.domain.SparePart;
import com.agro.agro_project.service.SeasonService;
import com.agro.agro_project.service.SparePartService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

@Controller
public class SparePartController {
    @Autowired
    SparePartService sparePartService;

    @Autowired
    SeasonService seasonService;

    @GetMapping("/spare_parts")
    public String getSpareParts(HttpServletRequest request) {
        List<SparePart> spareParts = sparePartService.findAll();
        List<Season> seasons = seasonService.findAll();
        request.setAttribute("seasons", seasons);
        request.setAttribute("spare_parts", spareParts);
        return "spare_parts";
    }
}
