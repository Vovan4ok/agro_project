package com.agro.agro_project.domain;

import com.fasterxml.jackson.databind.ser.Serializers;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="crops")
public class Crop {
    @Id
    @Column(name="id")
    private Short id;

    @Column(name="name", length=30)
    private String name;

    @Column(name="short_name", length=20)
    private String short_name;

    @Column(name="standard_name", length=30)
    private String standard_name;

    @Column(name="color", length=20)
    private String color;

    @Column(name="additional_info")
    @Lob
    private String additional_info;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="season_type", length=10)
    private String season_type;

    @Column(name="parts", length=10)
    private String parts;

    @ManyToOne
    @JoinColumn(name="base_crop_id")
    private BaseCrop baseCrop;

    @Column(name="productivity_estimate_crop_name", length=20)
    private String productivity_estimate_crop_name;

    @Column(name="plant_threat_crop_name", length=20)
    private String plant_threat_crop_name;

    @Column(name="hidden")
    private boolean hidden;

    @Column(name="external_id", length=50)
    private String external_id;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    public Crop(Short id, String name, String short_name, String standard_name, String color, String additional_info, String description, String season_type, String parts, BaseCrop baseCrop, String productivity_estimate_crop_name, String plant_threat_crop_name, boolean hidden, String external_id, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.name = name;
        this.short_name = short_name;
        this.standard_name = standard_name;
        this.color = color;
        this.additional_info = additional_info;
        this.description = description;
        this.season_type = season_type;
        this.parts = parts;
        this.baseCrop = baseCrop;
        this.productivity_estimate_crop_name = productivity_estimate_crop_name;
        this.plant_threat_crop_name = plant_threat_crop_name;
        this.hidden = hidden;
        this.external_id = external_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Crop() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public String getStandard_name() {
        return standard_name;
    }

    public void setStandard_name(String standard_name) {
        this.standard_name = standard_name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public String getSeason_type() {
        return season_type;
    }

    public void setSeason_type(String season_type) {
        this.season_type = season_type;
    }

    public String getParts() {
        return parts;
    }

    public void setParts(String parts) {
        this.parts = parts;
    }

    public BaseCrop getBaseCrop() {
        return baseCrop;
    }

    public void setBaseCrop(BaseCrop baseCrop) {
        this.baseCrop = baseCrop;
    }

    public String getProductivity_estimate_crop_name() {
        return productivity_estimate_crop_name;
    }

    public void setProductivity_estimate_crop_name(String productivity_estimate_crop_name) {
        this.productivity_estimate_crop_name = productivity_estimate_crop_name;
    }

    public String getPlant_threat_crop_name() {
        return plant_threat_crop_name;
    }

    public void setPlant_threat_crop_name(String plant_threat_crop_name) {
        this.plant_threat_crop_name = plant_threat_crop_name;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
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
        Crop crop = (Crop) o;
        return hidden == crop.hidden && Objects.equals(id, crop.id) && Objects.equals(name, crop.name) && Objects.equals(short_name, crop.short_name) && Objects.equals(standard_name, crop.standard_name) && Objects.equals(color, crop.color) && Objects.equals(additional_info, crop.additional_info) && Objects.equals(description, crop.description) && Objects.equals(season_type, crop.season_type) && Objects.equals(parts, crop.parts) && Objects.equals(baseCrop, crop.baseCrop) && Objects.equals(productivity_estimate_crop_name, crop.productivity_estimate_crop_name) && Objects.equals(plant_threat_crop_name, crop.plant_threat_crop_name) && Objects.equals(external_id, crop.external_id) && Objects.equals(created_at, crop.created_at) && Objects.equals(updated_at, crop.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, short_name, standard_name, color, additional_info, description, season_type, parts, baseCrop, productivity_estimate_crop_name, plant_threat_crop_name, hidden, external_id, created_at, updated_at);
    }

    @Override
    public String toString() {
        return "Crop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", short_name='" + short_name + '\'' +
                ", standard_name='" + standard_name + '\'' +
                ", color='" + color + '\'' +
                ", additional_info='" + additional_info + '\'' +
                ", description='" + description + '\'' +
                ", season_type='" + season_type + '\'' +
                ", parts='" + parts + '\'' +
                ", baseCrop=" + baseCrop +
                ", productivity_estimate_crop_name='" + productivity_estimate_crop_name + '\'' +
                ", plant_threat_crop_name='" + plant_threat_crop_name + '\'' +
                ", hidden=" + hidden +
                ", external_id='" + external_id + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
