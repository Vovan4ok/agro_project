package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="growth_stages")
public class GrowthStage {
    @Id
    @Column(name="id")
    private Short id;

    @Column(name="growth_scale_id")
    private short growth_scale_id;

    @ManyToOne
    @JoinColumn(name="growth_stage_group_id")
    private GrowthStageGroup growthStageGroup;

    @Column(name="code", length=20)
    private String code;

    @Column(name="name", length=40)
    private String name;

    @Column(name="localized_name")
    @Lob
    private String localized_name;

    @Column(name="external_id", length=50)
    private String external_id;

    @Column(name="additional_info")
    @Lob
    private String additional_info;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    public GrowthStage(Short id, short growth_scale_id, GrowthStageGroup growthStageGroup, String code, String name, String localized_name, String external_id, String additional_info, String description, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.growth_scale_id = growth_scale_id;
        this.growthStageGroup = growthStageGroup;
        this.code = code;
        this.name = name;
        this.localized_name = localized_name;
        this.external_id = external_id;
        this.additional_info = additional_info;
        this.description = description;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public GrowthStage() {
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

    public GrowthStageGroup getGrowthStageGroup() {
        return growthStageGroup;
    }

    public void setGrowthStageGroup(GrowthStageGroup growthStageGroup) {
        this.growthStageGroup = growthStageGroup;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        GrowthStage that = (GrowthStage) o;
        return growth_scale_id == that.growth_scale_id && Objects.equals(id, that.id) && Objects.equals(growthStageGroup, that.growthStageGroup) && Objects.equals(code, that.code) && Objects.equals(name, that.name) && Objects.equals(localized_name, that.localized_name) && Objects.equals(external_id, that.external_id) && Objects.equals(additional_info, that.additional_info) && Objects.equals(description, that.description) && Objects.equals(created_at, that.created_at) && Objects.equals(updated_at, that.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, growth_scale_id, growthStageGroup, code, name, localized_name, external_id, additional_info, description, created_at, updated_at);
    }

    @Override
    public String toString() {
        return "GrowthStage{" +
                "id=" + id +
                ", growth_scale_id=" + growth_scale_id +
                ", growthStageGroup=" + growthStageGroup +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", localized_name='" + localized_name + '\'' +
                ", external_id='" + external_id + '\'' +
                ", additional_info='" + additional_info + '\'' +
                ", description='" + description + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
