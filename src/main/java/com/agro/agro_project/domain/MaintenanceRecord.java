package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="maintenance_records", schema="cropwise_data")
public class MaintenanceRecord {
    @Id
    @Column(name="id")
    private Short id;

    @Column(name="maintainable_id")
    private Integer maintainableId;

    @Column(name="maintainable_type", length=20)
    private String maintainableType;

    @Column(name="maintenance_plan_id")
    private Short maintenancePlanId;

    @Column(name="status", length=15)
    private String status;

    @Column(name="season")
    private Short season;

    @Column(name="motohours")
    private Integer motohours;

    @Column(name="mileage")
    private Integer mileage;

    @Column(name="start_time")
    private Timestamp startTime;

    @Column(name="end_time")
    private Timestamp endTime;

    @Column(name="planned_start_time")
    private Timestamp plannedStartTime;

    @Column(name="planned_end_time")
    private Timestamp plannedEndTime;

    @Column(name="description")
    private String description;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    public MaintenanceRecord(Short id, Integer maintainableId, String maintainableType, Short maintenancePlanId, String status, Short season, Integer motohours, Integer mileage, Timestamp startTime, Timestamp endTime, Timestamp plannedStartTime, Timestamp plannedEndTime, String description, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.maintainableId = maintainableId;
        this.maintainableType = maintainableType;
        this.maintenancePlanId = maintenancePlanId;
        this.status = status;
        this.season = season;
        this.motohours = motohours;
        this.mileage = mileage;
        this.startTime = startTime;
        this.endTime = endTime;
        this.plannedStartTime = plannedStartTime;
        this.plannedEndTime = plannedEndTime;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public MaintenanceRecord() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Integer getMaintainableId() {
        return maintainableId;
    }

    public void setMaintainableId(Integer maintainableId) {
        this.maintainableId = maintainableId;
    }

    public String getMaintainableType() {
        return maintainableType;
    }

    public void setMaintainableType(String maintainableType) {
        this.maintainableType = maintainableType;
    }

    public Short getMaintenancePlanId() {
        return maintenancePlanId;
    }

    public void setMaintenancePlanId(Short maintenancePlanId) {
        this.maintenancePlanId = maintenancePlanId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Short getSeason() {
        return season;
    }

    public void setSeason(Short season) {
        this.season = season;
    }

    public Integer getMotohours() {
        return motohours;
    }

    public void setMotohours(Integer motohours) {
        this.motohours = motohours;
    }

    public Integer getMileage() {
        return mileage;
    }

    public void setMileage(Integer mileage) {
        this.mileage = mileage;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
    }

    public Timestamp getPlannedStartTime() {
        return plannedStartTime;
    }

    public void setPlannedStartTime(Timestamp plannedStartTime) {
        this.plannedStartTime = plannedStartTime;
    }

    public Timestamp getPlannedEndTime() {
        return plannedEndTime;
    }

    public void setPlannedEndTime(Timestamp plannedEndTime) {
        this.plannedEndTime = plannedEndTime;
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
        MaintenanceRecord that = (MaintenanceRecord) o;
        return Objects.equals(maintainableId, that.maintainableId) && Objects.equals(maintenancePlanId, that.maintenancePlanId) && Objects.equals(season, that.season) && Objects.equals(motohours, that.motohours) && Objects.equals(mileage, that.mileage) && Objects.equals(id, that.id) && Objects.equals(maintainableType, that.maintainableType) && Objects.equals(status, that.status) && Objects.equals(startTime, that.startTime) && Objects.equals(endTime, that.endTime) && Objects.equals(plannedStartTime, that.plannedStartTime) && Objects.equals(plannedEndTime, that.plannedEndTime) && Objects.equals(description, that.description) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, maintainableId, maintainableType, maintenancePlanId, status, season, motohours, mileage, startTime, endTime, plannedStartTime, plannedEndTime, description, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "MaintenanceRecord{" +
                "id=" + id +
                ", maintainableId=" + maintainableId +
                ", maintainableType='" + maintainableType + '\'' +
                ", maintenancePlanId=" + maintenancePlanId +
                ", status='" + status + '\'' +
                ", season=" + season +
                ", motohours=" + motohours +
                ", mileage=" + mileage +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", plannedStartTime=" + plannedStartTime +
                ", plannedEndTime=" + plannedEndTime +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
