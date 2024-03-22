package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="seeds", schema="cropwise_data")
public class Seed {
    @Id
    @Column(name="id")
    private Short id;

    @Column(name="name", length=50)
    private String name;

    @ManyToOne
    @JoinColumn(name="crop_id")
    private Crop crop;

    @Column(name="additional_info")
    private String additionalInfo;

    @Column(name="archived")
    private Boolean archived;

    @Column(name="description")
    private String description;

    @Column(name="units_of_measurement", length=20)
    private String unitsOfMeasurement;

    @Column(name="variety", length=20)
    private String variety;

    @Column(name="reproduction_number")
    private Short reproductionNumber;

    @Column(name="reproduction", length=20)
    private String reproduction;

    @ManyToOne
    @JoinColumn(name="wh_item_id")
    private WhItem whItem;

    @ManyToOne
    @JoinColumn(name="wh_item_base_unit_id")
    private Unit whItemBaseUnit;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    @Column(name="external_id", length=50)
    private String externalId;

    @Column(name="ripeness_group")
    private Short ripenessGroup;

    @Column(name="ripeness_group_name", length=20)
    private String ripenessGroupName;

    public Seed(Short id, String name, Crop crop, String additionalInfo, Boolean archived, String description, String unitsOfMeasurement, String variety, Short reproductionNumber, String reproduction, WhItem whItem, Unit whItemBaseUnit, Timestamp createdAt, Timestamp updatedAt, String externalId, Short ripenessGroup, String ripenessGroupName) {
        this.id = id;
        this.name = name;
        this.crop = crop;
        this.additionalInfo = additionalInfo;
        this.archived = archived;
        this.description = description;
        this.unitsOfMeasurement = unitsOfMeasurement;
        this.variety = variety;
        this.reproductionNumber = reproductionNumber;
        this.reproduction = reproduction;
        this.whItem = whItem;
        this.whItemBaseUnit = whItemBaseUnit;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.externalId = externalId;
        this.ripenessGroup = ripenessGroup;
        this.ripenessGroupName = ripenessGroupName;
    }

    public Seed() {
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

    public Crop getCrop() {
        return crop;
    }

    public void setCrop(Crop crop) {
        this.crop = crop;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public Boolean isArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnitsOfMeasurement() {
        return unitsOfMeasurement;
    }

    public void setUnitsOfMeasurement(String unitsOfMeasurement) {
        this.unitsOfMeasurement = unitsOfMeasurement;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public Short getReproductionNumber() {
        return reproductionNumber;
    }

    public void setReproductionNumber(Short reproductionNumber) {
        this.reproductionNumber = reproductionNumber;
    }

    public String getReproduction() {
        return reproduction;
    }

    public void setReproduction(String reproduction) {
        this.reproduction = reproduction;
    }

    public WhItem getWhItem() {
        return whItem;
    }

    public void setWhItem(WhItem whItem) {
        this.whItem = whItem;
    }

    public Unit getWhItemBaseUnit() {
        return whItemBaseUnit;
    }

    public void setWhItemBaseUnit(Unit whItemBaseUnit) {
        this.whItemBaseUnit = whItemBaseUnit;
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

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public Short getRipenessGroup() {
        return ripenessGroup;
    }

    public void setRipenessGroup(Short ripenessGroup) {
        this.ripenessGroup = ripenessGroup;
    }

    public String getRipenessGroupName() {
        return ripenessGroupName;
    }

    public void setRipenessGroupName(String ripenessGroupName) {
        this.ripenessGroupName = ripenessGroupName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seed seed = (Seed) o;
        return archived == seed.archived && Objects.equals(reproductionNumber, seed.reproductionNumber) && Objects.equals(ripenessGroup, seed.ripenessGroup) && Objects.equals(id, seed.id) && Objects.equals(name, seed.name) && Objects.equals(crop, seed.crop) && Objects.equals(additionalInfo, seed.additionalInfo) && Objects.equals(description, seed.description) && Objects.equals(unitsOfMeasurement, seed.unitsOfMeasurement) && Objects.equals(variety, seed.variety) && Objects.equals(reproduction, seed.reproduction) && Objects.equals(whItem, seed.whItem) && Objects.equals(whItemBaseUnit, seed.whItemBaseUnit) && Objects.equals(createdAt, seed.createdAt) && Objects.equals(updatedAt, seed.updatedAt) && Objects.equals(externalId, seed.externalId) && Objects.equals(ripenessGroupName, seed.ripenessGroupName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, crop, additionalInfo, archived, description, unitsOfMeasurement, variety, reproductionNumber, reproduction, whItem, whItemBaseUnit, createdAt, updatedAt, externalId, ripenessGroup, ripenessGroupName);
    }

    @Override
    public String toString() {
        return "Seed{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", crop=" + crop +
                ", additionalInfo='" + additionalInfo + '\'' +
                ", archived=" + archived +
                ", description='" + description + '\'' +
                ", unitsOfMeasurement='" + unitsOfMeasurement + '\'' +
                ", variety='" + variety + '\'' +
                ", reproductionNumber=" + reproductionNumber +
                ", reproduction='" + reproduction + '\'' +
                ", whItem=" + whItem +
                ", whItemBaseUnit=" + whItemBaseUnit +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", externalId='" + externalId + '\'' +
                ", ripenessGroup=" + ripenessGroup +
                ", ripenessGroupName='" + ripenessGroupName + '\'' +
                '}';
    }
}
