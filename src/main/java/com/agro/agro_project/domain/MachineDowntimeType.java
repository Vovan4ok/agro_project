package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="machine_downtime_types", schema="cropwise_data")
public class MachineDowntimeType {
    @Id
    @Column(name="id")
    private Short id;

    @Column(name="name", length=50)
    private String name;

    @Column(name="short_name", length=50)
    private String shortName;

    @Column(name="standard_name", length=50)
    private String standardName;

    @ManyToOne
    @JoinColumn(name="machine_downtime_type_group_id")
    private MachineDowntimeTypeGroup machineDowntimeTypeGroup;

    @Column(name="additional_info")
    private String additionalInfo;

    @Column(name="hidden")
    private Boolean hidden;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    @Column(name="external_id", length=50)
    private String externalId;

    public MachineDowntimeType(Short id, String name, String shortName, String standardName, MachineDowntimeTypeGroup machineDowntimeTypeGroup, String additionalInfo, Boolean hidden, Timestamp createdAt, Timestamp updatedAt, String externalId) {
        this.id = id;
        this.name = name;
        this.shortName = shortName;
        this.standardName = standardName;
        this.machineDowntimeTypeGroup = machineDowntimeTypeGroup;
        this.additionalInfo = additionalInfo;
        this.hidden = hidden;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.externalId = externalId;
    }

    public MachineDowntimeType() {
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

    public MachineDowntimeTypeGroup getMachineDowntimeTypeGroup() {
        return machineDowntimeTypeGroup;
    }

    public void setMachineDowntimeTypeGroup(MachineDowntimeTypeGroup machineDowntimeTypeGroup) {
        this.machineDowntimeTypeGroup = machineDowntimeTypeGroup;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public Boolean isHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MachineDowntimeType that = (MachineDowntimeType) o;
        return hidden == that.hidden && Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(shortName, that.shortName) && Objects.equals(standardName, that.standardName) && Objects.equals(machineDowntimeTypeGroup, that.machineDowntimeTypeGroup) && Objects.equals(additionalInfo, that.additionalInfo) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt) && Objects.equals(externalId, that.externalId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, shortName, standardName, machineDowntimeTypeGroup, additionalInfo, hidden, createdAt, updatedAt, externalId);
    }

    @Override
    public String toString() {
        return "MachineDowntimeType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", shortName='" + shortName + '\'' +
                ", standardName='" + standardName + '\'' +
                ", machineDowntimeTypeGroup=" + machineDowntimeTypeGroup +
                ", additionalInfo='" + additionalInfo + '\'' +
                ", hidden=" + hidden +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", externalId='" + externalId + '\'' +
                '}';
    }
}
