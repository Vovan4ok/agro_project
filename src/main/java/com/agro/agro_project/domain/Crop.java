package com.agro.agro_project.domain;

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
    private String shortName;

    @Column(name="standard_name", length=30)
    private String standardName;

    @Column(name="color", length=20)
    private String color;

    @Column(name="additional_info")
    @Lob
    private String additionalInfo;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="season_type", length=10)
    private String seasonType;

    @Column(name="parts", length=10)
    private String parts;

    @ManyToOne
    @JoinColumn(name="base_crop_id")
    private BaseCrop baseCrop;

    @Column(name="productivity_estimate_crop_name", length=20)
    private String productivityEstimateCropName;

    @Column(name="plant_threat_crop_name", length=20)
    private String plantThreatCropName;

    @Column(name="hidden")
    private boolean hidden;

    @Column(name="external_id", length=50)
    private String externalId;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    public Crop(Short id, String name, String shortName, String standardName, String color, String additionalInfo, String description, String seasonType, String parts, BaseCrop baseCrop, String productivityEstimateCropName, String plantThreatCropName, boolean hidden, String externalId, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.name = name;
        this.shortName = shortName;
        this.standardName = standardName;
        this.color = color;
        this.additionalInfo = additionalInfo;
        this.description = description;
        this.seasonType = seasonType;
        this.parts = parts;
        this.baseCrop = baseCrop;
        this.productivityEstimateCropName = productivityEstimateCropName;
        this.plantThreatCropName = plantThreatCropName;
        this.hidden = hidden;
        this.externalId = externalId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getStandardName() {
        return standardName;
    }

    public void setStandardName(String standardName) {
        this.standardName = standardName;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
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

    public String getSeasonType() {
        return seasonType;
    }

    public void setSeasonType(String seasonType) {
        this.seasonType = seasonType;
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

    public String getProductivityEstimateCropName() {
        return productivityEstimateCropName;
    }

    public void setProductivityEstimateCropName(String productivityEstimateCropName) {
        this.productivityEstimateCropName = productivityEstimateCropName;
    }

    public String getPlantThreatCropName() {
        return plantThreatCropName;
    }

    public void setPlantThreatCropName(String plantThreatCropName) {
        this.plantThreatCropName = plantThreatCropName;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
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
        Crop crop = (Crop) o;
        return hidden == crop.hidden && Objects.equals(id, crop.id) && Objects.equals(name, crop.name) && Objects.equals(shortName, crop.shortName) && Objects.equals(standardName, crop.standardName) && Objects.equals(color, crop.color) && Objects.equals(additionalInfo, crop.additionalInfo) && Objects.equals(description, crop.description) && Objects.equals(seasonType, crop.seasonType) && Objects.equals(parts, crop.parts) && Objects.equals(baseCrop, crop.baseCrop) && Objects.equals(productivityEstimateCropName, crop.productivityEstimateCropName) && Objects.equals(plantThreatCropName, crop.plantThreatCropName) && Objects.equals(externalId, crop.externalId) && Objects.equals(createdAt, crop.createdAt) && Objects.equals(updatedAt, crop.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, shortName, standardName, color, additionalInfo, description, seasonType, parts, baseCrop, productivityEstimateCropName, plantThreatCropName, hidden, externalId, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "Crop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", shortName='" + shortName + '\'' +
                ", standardName='" + standardName + '\'' +
                ", color='" + color + '\'' +
                ", additionalInfo='" + additionalInfo + '\'' +
                ", description='" + description + '\'' +
                ", seasonType='" + seasonType + '\'' +
                ", parts='" + parts + '\'' +
                ", baseCrop=" + baseCrop +
                ", productivityEstimateCropName='" + productivityEstimateCropName + '\'' +
                ", plantThreatCropName='" + plantThreatCropName + '\'' +
                ", hidden=" + hidden +
                ", externalId='" + externalId + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
