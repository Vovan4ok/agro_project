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
    private short growthScaleId;

    @ManyToOne
    @JoinColumn(name="growth_stage_group_id")
    private GrowthStageGroup growthStageGroup;

    @Column(name="code", length=20)
    private String code;

    @Column(name="name", length=40)
    private String name;

    @Column(name="localized_name")
    @Lob
    private String localizedName;

    @Column(name="external_id", length=50)
    private String externalId;

    @Column(name="additional_info")
    @Lob
    private String additionalInfo;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    public GrowthStage(Short id, short growthScaleId, GrowthStageGroup growthStageGroup, String code, String name, String localizedName, String externalId, String additionalInfo, String description, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.growthScaleId = growthScaleId;
        this.growthStageGroup = growthStageGroup;
        this.code = code;
        this.name = name;
        this.localizedName = localizedName;
        this.externalId = externalId;
        this.additionalInfo = additionalInfo;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public GrowthStage() {
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
        GrowthStage that = (GrowthStage) o;
        return growthScaleId == that.growthScaleId && Objects.equals(id, that.id) && Objects.equals(growthStageGroup, that.growthStageGroup) && Objects.equals(code, that.code) && Objects.equals(name, that.name) && Objects.equals(localizedName, that.localizedName) && Objects.equals(externalId, that.externalId) && Objects.equals(additionalInfo, that.additionalInfo) && Objects.equals(description, that.description) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, growthScaleId, growthStageGroup, code, name, localizedName, externalId, additionalInfo, description, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "GrowthStage{" +
                "id=" + id +
                ", growthScaleId=" + growthScaleId +
                ", growthStageGroup=" + growthStageGroup +
                ", code='" + code + '\'' +
                ", name='" + name + '\'' +
                ", localizedName='" + localizedName + '\'' +
                ", externalId='" + externalId + '\'' +
                ", additionalInfo='" + additionalInfo + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
