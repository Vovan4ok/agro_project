package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="growth_stage_groups")
public class GrowthStageGroup {
    @Id
    @Column(name="id")
    private Short id;

    @Column(name="growth_scale_id")
    private short growth_scale_id;

    @Column(name="name", length=50)
    private String name;

    @Column(name="standard_name", length=100)
    private String standard_name;

    @Column(name="localized_name", length=100)
    private String localized_name;

    @Column(name="external_id", length=50)
    private String external_id;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    public GrowthStageGroup(Short id, short growth_scale_id, String name, String standard_name, String localized_name, String external_id, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.growth_scale_id = growth_scale_id;
        this.name = name;
        this.standard_name = standard_name;
        this.localized_name = localized_name;
        this.external_id = external_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public GrowthStageGroup() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public short getGrowth_scale_id() {
        return growth_scale_id;
    }

    public void setGrowth_scale_id(short growth_scale_id) {
        this.growth_scale_id = growth_scale_id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStandard_name() {
        return standard_name;
    }

    public void setStandard_name(String standard_name) {
        this.standard_name = standard_name;
    }

    public String getLocalized_name() {
        return localized_name;
    }

    public void setLocalized_name(String localized_name) {
        this.localized_name = localized_name;
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
        GrowthStageGroup that = (GrowthStageGroup) o;
        return growth_scale_id == that.growth_scale_id && Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(standard_name, that.standard_name) && Objects.equals(localized_name, that.localized_name) && Objects.equals(external_id, that.external_id) && Objects.equals(created_at, that.created_at) && Objects.equals(updated_at, that.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, growth_scale_id, name, standard_name, localized_name, external_id, created_at, updated_at);
    }

    @Override
    public String toString() {
        return "GrowthStageGroup{" +
                "id=" + id +
                ", growth_scale_id=" + growth_scale_id +
                ", name='" + name + '\'' +
                ", standard_name='" + standard_name + '\'' +
                ", localized_name='" + localized_name + '\'' +
                ", external_id='" + external_id + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
