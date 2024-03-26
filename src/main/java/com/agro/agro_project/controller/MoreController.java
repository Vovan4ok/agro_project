package com.agro.agro_project.controller;

import com.agro.agro_project.domain.*;
import com.agro.agro_project.dto.FertilizerElementsDTO;
import com.agro.agro_project.service.*;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import javax.json.Json;
import javax.servlet.http.HttpServletRequest;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.List;

@Controller
public class MoreController {
    @Autowired
    FertilizerService fertilizerService;

    @Autowired
    SeedService seedService;

    @Autowired
    ChemicalService chemicalService;

    @Autowired
    LandParcelService landParcelService;

    @Autowired
    UserService userService;

    @Autowired
    AdditionalObjectService additionalObjectService;

    @GetMapping(value="/land_parcels")
    public String getLandParcels(HttpServletRequest request) {
        List<LandParcel> landParcels = landParcelService.findAll();
        request.setAttribute("land_parcels", landParcels);
        return "land_parcels";
    }

    @GetMapping(value="/land_parcels/{land_parcel_id}")
    public String getLandParcel(@PathVariable Integer land_parcel_id, HttpServletRequest request) {
        LandParcel landParcel = landParcelService.findById(land_parcel_id);
        request.setAttribute("land_parcel", landParcel);
        return "land_parcel_info";
    }

    @GetMapping(value="/seeds")
    public String getSeeds(HttpServletRequest request) {
        List<Seed> seeds = seedService.findAll();
        request.setAttribute("seeds", seeds);
        return "seeds";
    }

    @GetMapping(value="/seeds/{seed_id}")
    public String getSeed(@PathVariable Short seed_id, HttpServletRequest request) {
        Seed seed = seedService.findById(seed_id);
        request.setAttribute("seed", seed);
        return "seed_info";
    }

    @GetMapping(value="/fertilizers")
    public String getFertilizers(HttpServletRequest request) {
        List<Fertilizer> fertilizers = fertilizerService.findAll();
        List<FertilizerElementsDTO> fertilizerElementsDTOS = new ArrayList<>();
        for(Fertilizer fertilizer : fertilizers) {
            fertilizerElementsDTOS.add(new FertilizerElementsDTO(fertilizer, new JSONObject(fertilizer.getElements())));
        }
        request.setAttribute("fertilizer_elements_dtos", fertilizerElementsDTOS);
        return "fertilizers";
    }

    @GetMapping(value="/fertilizers/{fertilizer_id}")
    public String gerFertilizer(@PathVariable Short fertilizer_id, HttpServletRequest request) {
        Fertilizer fertilizer = fertilizerService.findById(fertilizer_id);
        request.setAttribute("fertilizer", fertilizer);
        return "fertilizer_info";
    }

    @GetMapping(value="/chemicals")
    public String getChemicals(HttpServletRequest request) {
        List<Chemical> chemicals = chemicalService.findAll();
        request.setAttribute("chemicals", chemicals);
        return "chemicals";
    }

    @GetMapping(value="/chemicals/{chemical_id}")
    public String getChemical(@PathVariable Short chemical_id, HttpServletRequest request) {
        Chemical chemical = chemicalService.findById(chemical_id);
        request.setAttribute("chemical", chemical);
        return "chemical_info";
    }

    @GetMapping(value="/additional_objects")
    public String getAdditionalObjects(HttpServletRequest request) {
        List<AdditionalObject> additionalObjects = additionalObjectService.findAll();
        request.setAttribute("additional_objects", additionalObjects);
        return "additional_objects";
    }

    @GetMapping(value="/users/{user_id}")
    public String getUser(@PathVariable Integer user_id, HttpServletRequest request) {
        User user = userService.findById(user_id);
        request.setAttribute("user", user);
        return "user_info";
    }
}
