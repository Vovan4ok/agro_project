package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="additional_objects")
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
    private String object_type;

    @Column(name="calculated_area")
    private double calculated_area;

    @Column(name="additional_info")
    @Lob
    private String additional_info;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="geometry_type", length=30)
    private String geometry_type;

    @Column(name="ppoint_lon")
    private double point_lon;

    @Column(name="point_lat")
    private double point_lat;

    @Column(name="administrative_area_name", length=50)
    private String administrative_area_name;

    @Column(name="subadministrative_area_name", length=50)
    private String subadministrative_area_name;

    @Column(name="locality", length=50)
    private String locality;

    @Column(name="external_id", length=50)
    private String external_id;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    public AdditionalObject(Short id, FieldGroup fieldGroup, String name, String object_type, double calculated_area, String additional_info, String description, String geometry_type, double point_lon, double point_lat, String administrative_area_name, String subadministrative_area_name, String locality, String external_id, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.fieldGroup = fieldGroup;
        this.name = name;
        this.object_type = object_type;
        this.calculated_area = calculated_area;
        this.additional_info = additional_info;
        this.description = description;
        this.geometry_type = geometry_type;
        this.point_lon = point_lon;
        this.point_lat = point_lat;
        this.administrative_area_name = administrative_area_name;
        this.subadministrative_area_name = subadministrative_area_name;
        this.locality = locality;
        this.external_id = external_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
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

    public String getObject_type() {
        return object_type;
    }

    public void setObject_type(String object_type) {
        this.object_type = object_type;
    }

    public double getCalculated_area() {
        return calculated_area;
    }

    public void setCalculated_area(double calculated_area) {
        this.calculated_area = calculated_area;
    }

    public String getAdditional_info() {
        return additional_info;
    }

    public void setAdditional_info(String additional_info) {
        this.additional_info = additional_info;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getGeometry_type() {
        return geometry_type;
    }

    public void setGeometry_type(String geometry_type) {
        this.geometry_type = geometry_type;
    }

    public double getPoint_lon() {
        return point_lon;
    }

    public void setPoint_lon(double point_lon) {
        this.point_lon = point_lon;
    }

    public double getPoint_lat() {
        return point_lat;
    }

    public void setPoint_lat(double point_lat) {
        this.point_lat = point_lat;
    }

    public String getAdministrative_area_name() {
        return administrative_area_name;
    }

    public void setAdministrative_area_name(String administrative_area_name) {
        this.administrative_area_name = administrative_area_name;
    }

    public String getSubadministrative_area_name() {
        return subadministrative_area_name;
    }

    public void setSubadministrative_area_name(String subadministrative_area_name) {
        this.subadministrative_area_name = subadministrative_area_name;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdditionalObject that = (AdditionalObject) o;
        return Double.compare(calculated_area, that.calculated_area) == 0 && Double.compare(point_lon, that.point_lon) == 0 && Double.compare(point_lat, that.point_lat) == 0 && Objects.equals(id, that.id) && Objects.equals(fieldGroup, that.fieldGroup) && Objects.equals(name, that.name) && Objects.equals(object_type, that.object_type) && Objects.equals(additional_info, that.additional_info) && Objects.equals(description, that.description) && Objects.equals(geometry_type, that.geometry_type) && Objects.equals(administrative_area_name, that.administrative_area_name) && Objects.equals(subadministrative_area_name, that.subadministrative_area_name) && Objects.equals(locality, that.locality) && Objects.equals(external_id, that.external_id) && Objects.equals(created_at, that.created_at) && Objects.equals(updated_at, that.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fieldGroup, name, object_type, calculated_area, additional_info, description, geometry_type, point_lon, point_lat, administrative_area_name, subadministrative_area_name, locality, external_id, created_at, updated_at);
    }

    @Override
    public String toString() {
        return "AdditionalObject{" +
                "id=" + id +
                ", fieldGroup=" + fieldGroup +
                ", name='" + name + '\'' +
                ", object_type='" + object_type + '\'' +
                ", calculated_area=" + calculated_area +
                ", additional_info='" + additional_info + '\'' +
                ", description='" + description + '\'' +
                ", geometry_type='" + geometry_type + '\'' +
                ", point_lon=" + point_lon +
                ", point_lat=" + point_lat +
                ", administrative_area_name='" + administrative_area_name + '\'' +
                ", subadministrative_area_name='" + subadministrative_area_name + '\'' +
                ", locality='" + locality + '\'' +
                ", external_id='" + external_id + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
