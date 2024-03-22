package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="field_shapes", schema="cropwise_data")
public class FieldShape {
    @Id
    @Column(name="id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name="field_id")
    private Field field;

    @Column(name="start_time")
    private Timestamp startTime;

    @Column(name="end_time")
    private Timestamp endTime;

    @Column(name="calculated_area")
    private Double calculatedArea;

    @Column(name="legal_area")
    private Double legalArea;

    @Column(name="tillable_area")
    private Double tillableArea;

    @Column(name="simplified_shape")
    private String simplifiedShape;

    @Column(name="shape_simplified_geojson")
    private String shapeSimplifiedGeojson;

    @Column(name="point_lon")
    private Double pointLon;

    @Column(name="point_lat")
    private Double pointLat;

    @Column(name="external_id", length=50)
    private String externalId;

    @Column(name="legal_perimeter")
    private Double legalPerimeter;

    @Column(name="description")
    private String description;

    @Column(name="land_quality_assessment")
    private String landQualityAssessment;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    public FieldShape(Integer id, Field field, Timestamp startTime, Timestamp endTime, Double calculatedArea, Double legalArea, Double tillableArea, String simplifiedShape, String shapeSimplifiedGeojson, Double pointLon, Double pointLat, String externalId, Double legalPerimeter, String description, String landQualityAssessment, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.field = field;
        this.startTime = startTime;
        this.endTime = endTime;
        this.calculatedArea = calculatedArea;
        this.legalArea = legalArea;
        this.tillableArea = tillableArea;
        this.simplifiedShape = simplifiedShape;
        this.shapeSimplifiedGeojson = shapeSimplifiedGeojson;
        this.pointLon = pointLon;
        this.pointLat = pointLat;
        this.externalId = externalId;
        this.legalPerimeter = legalPerimeter;
        this.description = description;
        this.landQualityAssessment = landQualityAssessment;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public FieldShape() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public Double getCalculatedArea() {
        return calculatedArea;
    }

    public void setCalculatedArea(Double calculatedArea) {
        this.calculatedArea = calculatedArea;
    }

    public Double getLegalArea() {
        return legalArea;
    }

    public void setLegalArea(Double legalArea) {
        this.legalArea = legalArea;
    }

    public Double getTillableArea() {
        return tillableArea;
    }

    public void setTillableArea(Double tillableArea) {
        this.tillableArea = tillableArea;
    }

    public String getSimplifiedShape() {
        return simplifiedShape;
    }

    public void setSimplifiedShape(String simplifiedShape) {
        this.simplifiedShape = simplifiedShape;
    }

    public String getShapeSimplifiedGeojson() {
        return shapeSimplifiedGeojson;
    }

    public void setShapeSimplifiedGeojson(String shapeSimplifiedGeojson) {
        this.shapeSimplifiedGeojson = shapeSimplifiedGeojson;
    }

    public Double getPointLon() {
        return pointLon;
    }

    public void setPointLon(double pointLon) {
        this.pointLon = pointLon;
    }

    public Double getPointLat() {
        return pointLat;
    }

    public void setPointLat(double pointLat) {
        this.pointLat = pointLat;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public Double getLegalPerimeter() {
        return legalPerimeter;
    }

    public void setLegalPerimeter(Double legalPerimeter) {
        this.legalPerimeter = legalPerimeter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLandQualityAssessment() {
        return landQualityAssessment;
    }

    public void setLandQualityAssessment(String landQualityAssessment) {
        this.landQualityAssessment = landQualityAssessment;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FieldShape that = (FieldShape) o;
        return Double.compare(calculatedArea, that.calculatedArea) == 0 && Double.compare(legalArea, that.legalArea) == 0 && Double.compare(tillableArea, that.tillableArea) == 0 && Double.compare(pointLon, that.pointLon) == 0 && Double.compare(pointLat, that.pointLat) == 0 && Double.compare(legalPerimeter, that.legalPerimeter) == 0 && Objects.equals(id, that.id) && Objects.equals(field, that.field) && Objects.equals(startTime, that.startTime) && Objects.equals(endTime, that.endTime) && Objects.equals(simplifiedShape, that.simplifiedShape) && Objects.equals(shapeSimplifiedGeojson, that.shapeSimplifiedGeojson) && Objects.equals(externalId, that.externalId) && Objects.equals(description, that.description) && Objects.equals(landQualityAssessment, that.landQualityAssessment) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, field, startTime, endTime, calculatedArea, legalArea, tillableArea, simplifiedShape, shapeSimplifiedGeojson, pointLon, pointLat, externalId, legalPerimeter, description, landQualityAssessment, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "FieldShape{" +
                "id=" + id +
                ", field=" + field +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", calculatedArea=" + calculatedArea +
                ", legalArea=" + legalArea +
                ", tillableArea=" + tillableArea +
                ", simplifiedShape='" + simplifiedShape + '\'' +
                ", shapeSimplifiedGeojson='" + shapeSimplifiedGeojson + '\'' +
                ", pointLon=" + pointLon +
                ", pointLat=" + pointLat +
                ", externalId='" + externalId + '\'' +
                ", legalPerimeter=" + legalPerimeter +
                ", description='" + description + '\'' +
                ", landQualityAssessment='" + landQualityAssessment + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
