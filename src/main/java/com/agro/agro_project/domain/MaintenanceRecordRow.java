package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="maintenance_record_rows", schema="cropwise_data")
public class MaintenanceRecordRow {
    @Id
    @Column(name="id")
    private Short id;

    @ManyToOne
    @JoinColumn(name="maintenance_record_id")
    private MaintenanceRecord maintenanceRecord;

    @ManyToOne
    @JoinColumn(name="maintenance_type_id")
    private MaintenanceType maintenanceType;

    @Column(name="description")
    private String description;

    @Column(name="repair_stage", length=20)
    private String repairStage;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    public MaintenanceRecordRow(Short id, MaintenanceRecord maintenanceRecord, MaintenanceType maintenanceType, String description, String repairStage, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.maintenanceRecord = maintenanceRecord;
        this.maintenanceType = maintenanceType;
        this.description = description;
        this.repairStage = repairStage;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public MaintenanceRecordRow() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public MaintenanceRecord getMaintenanceRecord() {
        return maintenanceRecord;
    }

    public void setMaintenanceRecord(MaintenanceRecord maintenanceRecord) {
        this.maintenanceRecord = maintenanceRecord;
    }

    public MaintenanceType getMaintenanceType() {
        return maintenanceType;
    }

    public void setMaintenanceType(MaintenanceType maintenanceType) {
        this.maintenanceType = maintenanceType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRepairStage() {
        return repairStage;
    }

    public void setRepairStage(String repairStage) {
        this.repairStage = repairStage;
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
        MaintenanceRecordRow that = (MaintenanceRecordRow) o;
        return Objects.equals(id, that.id) && Objects.equals(maintenanceRecord, that.maintenanceRecord) && Objects.equals(maintenanceType, that.maintenanceType) && Objects.equals(description, that.description) && Objects.equals(repairStage, that.repairStage) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, maintenanceRecord, maintenanceType, description, repairStage, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "MaintenanceRecordRow{" +
                "id=" + id +
                ", maintenanceRecord=" + maintenanceRecord +
                ", maintenanceType=" + maintenanceType +
                ", description='" + description + '\'' +
                ", repairStage='" + repairStage + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
