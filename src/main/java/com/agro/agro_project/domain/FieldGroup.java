package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="field_groups", schema="cropwise_data")
public class FieldGroup {
    @Id
    @Column(name="id")
    private Short id;

    @ManyToOne
    @JoinColumn(name="group_folder_id")
    private GroupFolder groupFolder;

    @Column(name="name", length=100)
    private String name;

    @Column(name="description")
    private String description;

    @Column(name="administrative_area_name", length=30)
    private String administrativeAreaName;

    @Column(name="subadministrative_area_name", length=30)
    private String subadministrativeAreaName;

    @Column(name="locality", length=10)
    private String locality;

    @Column(name="hidden")
    private Boolean hidden;

    @Column(name="external_id", length=20)
    private String externalId;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    @Column(name="idempotency_key")
    private String idempotencyKey;

    @Column(name="legal_entity", length=30)
    private String legalEntity;

    @Column(name="machine_task_default_duration")
    private Short machineTaskDefaultDuration;

    @Column(name="accounting_period_closing_date")
    private Date accountingPeriodClosingDate;

    @Column(name="machine_task_default_start_time")
    private Time machineTaskDefaultStartTime;

    public FieldGroup(Short id, GroupFolder groupFolder, String name, String description, String administrativeAreaName, String subadministrativeAreaName, String locality, boolean hidden, String externalId, Timestamp createdAt, Timestamp updatedAt, String idempotencyKey, String legalEntity, Short machineTaskDefaultDuration, Date accountingPeriodClosingDate, Time machineTaskDefaultStartTime) {
        this.id = id;
        this.groupFolder = groupFolder;
        this.name = name;
        this.description = description;
        this.administrativeAreaName = administrativeAreaName;
        this.subadministrativeAreaName = subadministrativeAreaName;
        this.locality = locality;
        this.hidden = hidden;
        this.externalId = externalId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.idempotencyKey = idempotencyKey;
        this.legalEntity = legalEntity;
        this.machineTaskDefaultDuration = machineTaskDefaultDuration;
        this.accountingPeriodClosingDate = accountingPeriodClosingDate;
        this.machineTaskDefaultStartTime = machineTaskDefaultStartTime;
    }

    public FieldGroup() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public GroupFolder getGroupFolder() {
        return groupFolder;
    }

    public void setGroupFolder(GroupFolder groupFolder) {
        this.groupFolder = groupFolder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdministrativeAreaName() {
        return administrativeAreaName;
    }

    public void setAdministrativeAreaName(String administrativeAreaName) {
        this.administrativeAreaName = administrativeAreaName;
    }

    public String getSubadministrativeAreaName() {
        return subadministrativeAreaName;
    }

    public void setSubadministrativeAreaName(String subadministrativeAreaName) {
        this.subadministrativeAreaName = subadministrativeAreaName;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public Boolean isHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
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

    public String getIdempotencyKey() {
        return idempotencyKey;
    }

    public void setIdempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
    }

    public String getLegalEntity() {
        return legalEntity;
    }

    public void setLegalEntity(String legalEntity) {
        this.legalEntity = legalEntity;
    }

    public Short getMachineTaskDefaultDuration() {
        return machineTaskDefaultDuration;
    }

    public void setMachineTaskDefaultDuration(Short machineTaskDefaultDuration) {
        this.machineTaskDefaultDuration = machineTaskDefaultDuration;
    }

    public Date getAccountingPeriodClosingDate() {
        return accountingPeriodClosingDate;
    }

    public void setAccountingPeriodClosingDate(Date accountingPeriodClosingDate) {
        this.accountingPeriodClosingDate = accountingPeriodClosingDate;
    }

    public Time getMachineTaskDefaultStartTime() {
        return machineTaskDefaultStartTime;
    }

    public void setMachineTaskDefaultStartTime(Time machineTaskDefaultStartTime) {
        this.machineTaskDefaultStartTime = machineTaskDefaultStartTime;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FieldGroup that = (FieldGroup) o;
        return hidden == that.hidden && Objects.equals(id, that.id) && Objects.equals(groupFolder, that.groupFolder) && Objects.equals(name, that.name) && Objects.equals(description, that.description) && Objects.equals(administrativeAreaName, that.administrativeAreaName) && Objects.equals(subadministrativeAreaName, that.subadministrativeAreaName) && Objects.equals(locality, that.locality) && Objects.equals(externalId, that.externalId) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt) && Objects.equals(idempotencyKey, that.idempotencyKey) && Objects.equals(legalEntity, that.legalEntity) && Objects.equals(machineTaskDefaultDuration, that.machineTaskDefaultDuration) && Objects.equals(accountingPeriodClosingDate, that.accountingPeriodClosingDate) && Objects.equals(machineTaskDefaultStartTime, that.machineTaskDefaultStartTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, groupFolder, name, description, administrativeAreaName, subadministrativeAreaName, locality, hidden, externalId, createdAt, updatedAt, idempotencyKey, legalEntity, machineTaskDefaultDuration, accountingPeriodClosingDate, machineTaskDefaultStartTime);
    }

    @Override
    public String toString() {
        return "FieldGroup{" +
                "id=" + id +
                ", groupFolder=" + groupFolder +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", administrativeAreaName='" + administrativeAreaName + '\'' +
                ", subadministrativeAreaName='" + subadministrativeAreaName + '\'' +
                ", locality='" + locality + '\'' +
                ", hidden=" + hidden +
                ", externalId='" + externalId + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", idempotencyKey='" + idempotencyKey + '\'' +
                ", legal_entity='" + legalEntity + '\'' +
                ", machineTaskDefaultDuration=" + machineTaskDefaultDuration +
                ", accountingPeriodClosingDate=" + accountingPeriodClosingDate +
                ", machineTaskDefaultStartTime=" + machineTaskDefaultStartTime +
                '}';
    }
}
