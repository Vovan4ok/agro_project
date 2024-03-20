package com.agro.agro_project.domain;

import javax.json.JsonObject;
import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="fertilizers")
public class Fertilizer {
    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="name")
    private String name;

    @Column(name="fertilizer_type", length=50)
    private String fertilizerType;

    @Column(name="source_type", length=50)
    private String sourceType;

    @Column(name="nutrient_type", length=50)
    private String nutrientType;

    @Column(name="units_of_measurement", length=10)
    private String unitsOfMeasurement;

    @Column(name="elements")
    @Lob
    private JsonObject elements;

    @Column(name="archived")
    private boolean archived;

    @ManyToOne
    @JoinColumn(name="wh_item_id")
    private WhItem whItem;

    @ManyToOne
    @JoinColumn(name="wh_item_base_unit_id")
    private Unit whItemBaseUnit;

    @Column(name="additional_info")
    @Lob
    private String additionalInfo;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="external_id", length=50)
    private String externalId;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    public Fertilizer(Integer id, String name, String fertilizerType, String sourceType, String nutrientType, String unitsOfMeasurement, JsonObject elements, boolean archived, WhItem whItem, Unit whItemBaseUnit, String additionalInfo, String description, String externalId, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.name = name;
        this.fertilizerType = fertilizerType;
        this.sourceType = sourceType;
        this.nutrientType = nutrientType;
        this.unitsOfMeasurement = unitsOfMeasurement;
        this.elements = elements;
        this.archived = archived;
        this.whItem = whItem;
        this.whItemBaseUnit = whItemBaseUnit;
        this.additionalInfo = additionalInfo;
        this.description = description;
        this.externalId = externalId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Fertilizer() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getFertilizerType() {
        return fertilizerType;
    }

    public void setFertilizerType(String fertilizerType) {
        this.fertilizerType = fertilizerType;
    }

    public String getSourceType() {
        return sourceType;
    }

    public void setSourceType(String sourceType) {
        this.sourceType = sourceType;
    }

    public String getNutrientType() {
        return nutrientType;
    }

    public void setNutrientType(String nutrientType) {
        this.nutrientType = nutrientType;
    }

    public String getUnitsOfMeasurement() {
        return unitsOfMeasurement;
    }

    public void setUnitsOfMeasurement(String unitsOfMeasurement) {
        this.unitsOfMeasurement = unitsOfMeasurement;
    }

    public JsonObject getElements() {
        return elements;
    }

    public void setElements(JsonObject elements) {
        this.elements = elements;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
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
        Fertilizer that = (Fertilizer) o;
        return archived == that.archived && Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(fertilizerType, that.fertilizerType) && Objects.equals(sourceType, that.sourceType) && Objects.equals(nutrientType, that.nutrientType) && Objects.equals(unitsOfMeasurement, that.unitsOfMeasurement) && Objects.equals(elements, that.elements) && Objects.equals(whItem, that.whItem) && Objects.equals(whItemBaseUnit, that.whItemBaseUnit) && Objects.equals(additionalInfo, that.additionalInfo) && Objects.equals(description, that.description) && Objects.equals(externalId, that.externalId) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, fertilizerType, sourceType, nutrientType, unitsOfMeasurement, elements, archived, whItem, whItemBaseUnit, additionalInfo, description, externalId, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "Fertilizer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fertilizerType='" + fertilizerType + '\'' +
                ", sourceType='" + sourceType + '\'' +
                ", nutrientType='" + nutrientType + '\'' +
                ", unitsOfMeasurement='" + unitsOfMeasurement + '\'' +
                ", elements=" + elements +
                ", archived=" + archived +
                ", whItem=" + whItem +
                ", whItemBaseUnit=" + whItemBaseUnit +
                ", additionalInfo='" + additionalInfo + '\'' +
                ", description='" + description + '\'' +
                ", externalId='" + externalId + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
