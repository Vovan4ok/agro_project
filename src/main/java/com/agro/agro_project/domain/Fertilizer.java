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
    private String fertilizer_type;

    @Column(name="source_type", length=50)
    private String source_type;

    @Column(name="nutrient_type", length=50)
    private String nutrient_type;

    @Column(name="units_of_measurement", length=10)
    private String units_of_measurement;

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
    private String additional_info;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="external_id", length=50)
    private String external_id;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    public Fertilizer(Integer id, String name, String fertilizer_type, String source_type, String nutrient_type, String units_of_measurement, JsonObject elements, boolean archived, WhItem whItem, Unit whItemBaseUnit, String additional_info, String description, String external_id, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.name = name;
        this.fertilizer_type = fertilizer_type;
        this.source_type = source_type;
        this.nutrient_type = nutrient_type;
        this.units_of_measurement = units_of_measurement;
        this.elements = elements;
        this.archived = archived;
        this.whItem = whItem;
        this.whItemBaseUnit = whItemBaseUnit;
        this.additional_info = additional_info;
        this.description = description;
        this.external_id = external_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
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

    public String getFertilizer_type() {
        return fertilizer_type;
    }

    public void setFertilizer_type(String fertilizer_type) {
        this.fertilizer_type = fertilizer_type;
    }

    public String getSource_type() {
        return source_type;
    }

    public void setSource_type(String source_type) {
        this.source_type = source_type;
    }

    public String getNutrient_type() {
        return nutrient_type;
    }

    public void setNutrient_type(String nutrient_type) {
        this.nutrient_type = nutrient_type;
    }

    public String getUnits_of_measurement() {
        return units_of_measurement;
    }

    public void setUnits_of_measurement(String units_of_measurement) {
        this.units_of_measurement = units_of_measurement;
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
        Fertilizer that = (Fertilizer) o;
        return archived == that.archived && Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(fertilizer_type, that.fertilizer_type) && Objects.equals(source_type, that.source_type) && Objects.equals(nutrient_type, that.nutrient_type) && Objects.equals(units_of_measurement, that.units_of_measurement) && Objects.equals(elements, that.elements) && Objects.equals(whItem, that.whItem) && Objects.equals(whItemBaseUnit, that.whItemBaseUnit) && Objects.equals(additional_info, that.additional_info) && Objects.equals(description, that.description) && Objects.equals(external_id, that.external_id) && Objects.equals(created_at, that.created_at) && Objects.equals(updated_at, that.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, fertilizer_type, source_type, nutrient_type, units_of_measurement, elements, archived, whItem, whItemBaseUnit, additional_info, description, external_id, created_at, updated_at);
    }

    @Override
    public String toString() {
        return "Fertilizer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", fertilizer_type='" + fertilizer_type + '\'' +
                ", source_type='" + source_type + '\'' +
                ", nutrient_type='" + nutrient_type + '\'' +
                ", units_of_measurement='" + units_of_measurement + '\'' +
                ", elements=" + elements +
                ", archived=" + archived +
                ", whItem=" + whItem +
                ", whItemBaseUnit=" + whItemBaseUnit +
                ", additional_info='" + additional_info + '\'' +
                ", description='" + description + '\'' +
                ", external_id='" + external_id + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
