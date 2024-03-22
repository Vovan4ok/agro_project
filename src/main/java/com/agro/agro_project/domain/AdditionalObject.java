package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="additional_objects", schema="cropwise_data")
public class AdditionalObject {
    @Id
    @Column(name="id")
    private Short id;

    @ManyToOne
    @JoinColumn(name="field_group_id")
    private FieldGroup fieldGroup;

    @Column(name="name", length=50)
    private String name;

    @Column(name="object_type", length=50)
    private String objectType;

    @Column(name="calculated_area")
    private Double calculatedArea;

    @Column(name="additional_info")
    private String additionalInfo;

    @Column(name="description")
    private String description;

    @Column(name="geometry_type", length=30)
    private String geometryType;

    @Column(name="ppoint_lon")
    private Double pointLon;

    @Column(name="point_lat")
    private Double pointLat;

    @Column(name="administrative_area_name", length=50)
    private String administrativeAreaName;

    @Column(name="subadministrative_area_name", length=50)
    private String subadministrativeAreaName;

    @Column(name="locality", length=50)
    private String locality;

    @Column(name="external_id", length=50)
    private String externalId;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    public AdditionalObject(Short id, FieldGroup fieldGroup, String name, String objectType, Double calculatedArea, String additionalInfo, String description, String geometryType, Double pointLon, Double pointLat, String administrativeAreaName, String subadministrativeAreaName, String locality, String externalId, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.fieldGroup = fieldGroup;
        this.name = name;
        this.objectType = objectType;
        this.calculatedArea = calculatedArea;
        this.additionalInfo = additionalInfo;
        this.description = description;
        this.geometryType = geometryType;
        this.pointLon = pointLon;
        this.pointLat = pointLat;
        this.administrativeAreaName = administrativeAreaName;
        this.subadministrativeAreaName = subadministrativeAreaName;
        this.locality = locality;
        this.externalId = externalId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public AdditionalObject() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public FieldGroup getFieldGroup() {
        return fieldGroup;
    }

    public void setFieldGroup(FieldGroup fieldGroup) {
        this.fieldGroup = fieldGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getObjectType() {
        return objectType;
    }

    public void setObjectType(String objectType) {
        this.objectType = objectType;
    }

    public Double getCalculatedArea() {
        return calculatedArea;
    }

    public void setCalculatedArea(Double calculatedArea) {
        this.calculatedArea = calculatedArea;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGeometryType() {
        return geometryType;
    }

    public void setGeometryType(String geometryType) {
        this.geometryType = geometryType;
    }

    public Double getPointLon() {
        return pointLon;
    }

    public void setPointLon(Double pointLon) {
        this.pointLon = pointLon;
    }

    public Double getPointLat() {
        return pointLat;
    }

    public void setPointLat(Double pointLat) {
        this.pointLat = pointLat;
    }

    public String getAdministrativeAreaName() {
        return administrativeAreaName;
    }

    public void setAdministrativeAreaName(String administrativeAreaName) {
        this.administrativeAreaName = administrativeAreaName;
    }

    public String getSubadministrativeAreaName() {
        return subadministrativeAreaName;
    }

    public void setSubadministrativeAreaName(String subadministrativeAreaName) {
        this.subadministrativeAreaName = subadministrativeAreaName;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
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
        AdditionalObject that = (AdditionalObject) o;
        return Double.compare(calculatedArea, that.calculatedArea) == 0 && Double.compare(pointLon, that.pointLon) == 0 && Double.compare(pointLat, that.pointLat) == 0 && Objects.equals(id, that.id) && Objects.equals(fieldGroup, that.fieldGroup) && Objects.equals(name, that.name) && Objects.equals(objectType, that.objectType) && Objects.equals(additionalInfo, that.additionalInfo) && Objects.equals(description, that.description) && Objects.equals(geometryType, that.geometryType) && Objects.equals(administrativeAreaName, that.administrativeAreaName) && Objects.equals(subadministrativeAreaName, that.subadministrativeAreaName) && Objects.equals(locality, that.locality) && Objects.equals(externalId, that.externalId) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fieldGroup, name, objectType, calculatedArea, additionalInfo, description, geometryType, pointLon, pointLat, administrativeAreaName, subadministrativeAreaName, locality, externalId, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "AdditionalObject{" +
                "id=" + id +
                ", fieldGroup=" + fieldGroup +
                ", name='" + name + '\'' +
                ", objectType='" + objectType + '\'' +
                ", calculatedArea=" + calculatedArea +
                ", additionalInfo='" + additionalInfo + '\'' +
                ", description='" + description + '\'' +
                ", geometryType='" + geometryType + '\'' +
                ", pointLon=" + pointLon +
                ", pointLat=" + pointLat +
                ", administrativeAreaName='" + administrativeAreaName + '\'' +
                ", subadministrativeAreaName='" + subadministrativeAreaName + '\'' +
                ", locality='" + locality + '\'' +
                ", externalId='" + externalId + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
