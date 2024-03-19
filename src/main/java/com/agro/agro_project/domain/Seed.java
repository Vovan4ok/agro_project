package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="seeds")
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
    @Lob
    private String additional_info;

    @Column(name="archived")
    private boolean archived;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="units_of_measurement", length=20)
    private String units_of_measurement;

    @Column(name="variety", length=20)
    private String variety;

    @Column(name="reproduction_number")
    private short reproduction_number;

    @Column(name="reproduction", length=20)
    private String reproduction;

    @ManyToOne
    @JoinColumn(name="wh_item_id")
    private WhItem whItem;

    @ManyToOne
    @JoinColumn(name="wh_item_base_unit_id")
    private Unit whItemBaseUnit;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    @Column(name="external_id", length=50)
    private String external_id;

    @Column(name="ripeness_group")
    private short ripeness_group;

    @Column(name="ripeness_group_name", length=20)
    private String ripeness_group_name;

    public Seed(Short id, String name, Crop crop, String additional_info, boolean archived, String description, String units_of_measurement, String variety, short reproduction_number, String reproduction, WhItem whItem, Unit whItemBaseUnit, Timestamp created_at, Timestamp updated_at, String external_id, short ripeness_group, String ripeness_group_name) {
        this.id = id;
        this.name = name;
        this.crop = crop;
        this.additional_info = additional_info;
        this.archived = archived;
        this.description = description;
        this.units_of_measurement = units_of_measurement;
        this.variety = variety;
        this.reproduction_number = reproduction_number;
        this.reproduction = reproduction;
        this.whItem = whItem;
        this.whItemBaseUnit = whItemBaseUnit;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.external_id = external_id;
        this.ripeness_group = ripeness_group;
        this.ripeness_group_name = ripeness_group_name;
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

    public String getAdditional_info() {
        return additional_info;
    }

    public void setAdditional_info(String additional_info) {
        this.additional_info = additional_info;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getUnits_of_measurement() {
        return units_of_measurement;
    }

    public void setUnits_of_measurement(String units_of_measurement) {
        this.units_of_measurement = units_of_measurement;
    }

    public String getVariety() {
        return variety;
    }

    public void setVariety(String variety) {
        this.variety = variety;
    }

    public short getReproduction_number() {
        return reproduction_number;
    }

    public void setReproduction_number(short reproduction_number) {
        this.reproduction_number = reproduction_number;
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

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }

    public short getRipeness_group() {
        return ripeness_group;
    }

    public void setRipeness_group(short ripeness_group) {
        this.ripeness_group = ripeness_group;
    }

    public String getRipeness_group_name() {
        return ripeness_group_name;
    }

    public void setRipeness_group_name(String ripeness_group_name) {
        this.ripeness_group_name = ripeness_group_name;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Seed seed = (Seed) o;
        return archived == seed.archived && reproduction_number == seed.reproduction_number && ripeness_group == seed.ripeness_group && Objects.equals(id, seed.id) && Objects.equals(name, seed.name) && Objects.equals(crop, seed.crop) && Objects.equals(additional_info, seed.additional_info) && Objects.equals(description, seed.description) && Objects.equals(units_of_measurement, seed.units_of_measurement) && Objects.equals(variety, seed.variety) && Objects.equals(reproduction, seed.reproduction) && Objects.equals(whItem, seed.whItem) && Objects.equals(whItemBaseUnit, seed.whItemBaseUnit) && Objects.equals(created_at, seed.created_at) && Objects.equals(updated_at, seed.updated_at) && Objects.equals(external_id, seed.external_id) && Objects.equals(ripeness_group_name, seed.ripeness_group_name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, crop, additional_info, archived, description, units_of_measurement, variety, reproduction_number, reproduction, whItem, whItemBaseUnit, created_at, updated_at, external_id, ripeness_group, ripeness_group_name);
    }

    @Override
    public String toString() {
        return "Seed{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", crop=" + crop +
                ", additional_info='" + additional_info + '\'' +
                ", archived=" + archived +
                ", description='" + description + '\'' +
                ", units_of_measurement='" + units_of_measurement + '\'' +
                ", variety='" + variety + '\'' +
                ", reproduction_number=" + reproduction_number +
                ", reproduction='" + reproduction + '\'' +
                ", whItem=" + whItem +
                ", whItemBaseUnit=" + whItemBaseUnit +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", external_id='" + external_id + '\'' +
                ", ripeness_group=" + ripeness_group +
                ", ripeness_group_name='" + ripeness_group_name + '\'' +
                '}';
    }
}
