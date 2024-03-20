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
    private short growthScaleId;

    @Column(name="name", length=50)
    private String name;

    @Column(name="standard_name", length=100)
    private String standardName;

    @Column(name="localized_name", length=100)
    private String localizedName;

    @Column(name="external_id", length=50)
    private String externalId;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    public GrowthStageGroup(Short id, short growthScaleId, String name, String standardName, String localizedName, String externalId, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.growthScaleId = growthScaleId;
        this.name = name;
        this.standardName = standardName;
        this.localizedName = localizedName;
        this.externalId = externalId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public GrowthStageGroup() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public short getGrowthScaleId() {
        return growthScaleId;
    }

    public void setGrowthScaleId(short growthScaleId) {
        this.growthScaleId = growthScaleId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStandardName() {
        return standardName;
    }

    public void setStandardName(String standardName) {
        this.standardName = standardName;
    }

    public String getLocalizedName() {
        return localizedName;
    }

    public void setLocalizedName(String localizedName) {
        this.localizedName = localizedName;
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
        GrowthStageGroup that = (GrowthStageGroup) o;
        return growthScaleId == that.growthScaleId && Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(standardName, that.standardName) && Objects.equals(localizedName, that.localizedName) && Objects.equals(externalId, that.externalId) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, growthScaleId, name, standardName, localizedName, externalId, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "GrowthStageGroup{" +
                "id=" + id +
                ", growthScaleId=" + growthScaleId +
                ", name='" + name + '\'' +
                ", standardName='" + standardName + '\'' +
                ", localizedName='" + localizedName + '\'' +
                ", externalId='" + externalId + '\'' +
                ", createdAt=" + createdAt +
                ", createdAt=" + createdAt +
                '}';
    }
}
