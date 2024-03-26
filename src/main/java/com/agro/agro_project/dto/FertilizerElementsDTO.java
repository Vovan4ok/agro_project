package com.agro.agro_project.dto;

import com.agro.agro_project.domain.Fertilizer;
import org.json.JSONObject;

import javax.json.JsonObject;

public class FertilizerElementsDTO {
    private Fertilizer fertilizer;

    private JSONObject elements;

    public FertilizerElementsDTO(Fertilizer fertilizer, JSONObject elements) {
        this.fertilizer = fertilizer;
        this.elements = elements;
    }

    public FertilizerElementsDTO() { }

    public Fertilizer getFertilizer() {
        return fertilizer;
    }

    public void setFertilizer(Fertilizer fertilizer) {
        this.fertilizer = fertilizer;
    }

    public JSONObject getElements() {
        return elements;
    }

    public void setElements(JSONObject elements) {
        this.elements = elements;
    }
}
