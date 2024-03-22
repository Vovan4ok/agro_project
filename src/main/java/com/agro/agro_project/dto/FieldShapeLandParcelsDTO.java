package com.agro.agro_project.dto;

import com.agro.agro_project.domain.FieldShape;
import com.agro.agro_project.domain.LandParcel;

import java.util.List;

public class FieldShapeLandParcelsDTO {
    private FieldShape fieldShape;

    private List<LandParcel> landParcels;

    public FieldShapeLandParcelsDTO(FieldShape fieldShape, List<LandParcel> landParcels) {
        this.fieldShape = fieldShape;
        this.landParcels = landParcels;
    }

    public FieldShape getFieldShape() {
        return fieldShape;
    }

    public void setFieldShape(FieldShape fieldShape) {
        this.fieldShape = fieldShape;
    }

    public List<LandParcel> getLandParcels() {
        return landParcels;
    }

    public void setLandParcels(List<LandParcel> landParcels) {
        this.landParcels = landParcels;
    }
}
