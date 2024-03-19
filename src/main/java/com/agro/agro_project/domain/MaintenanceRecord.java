package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="maintenance_records")
public class MaintenanceRecord {
    @Id
    @Column(name="id")
    private Short id;

    @Column(name="maintainable_id")
    private int maintainable_id;

    @Column(name="maintainable_type", length=20)
    private String maintainable_type;

    @Column(name="maintenance_plan_id")
    private short maintenance_plan_id;

    @Column(name="status", length=15)
    private String status;

    @Column(name="season")
    private short season;

    @Column(name="motohours")
    private int motohours;

    @Column(name="mileage")
    private int mileage;

    @Column(name="start_time")
    private Timestamp start_time;

    @Column(name="end_time")
    private Timestamp end_time;

    @Column(name="planned_start_time")
    private Timestamp planned_start_time;

    @Column(name="planned_end_time")
    private Timestamp planned_end_time;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    public MaintenanceRecord(Short id, int maintainable_id, String maintainable_type, short maintenance_plan_id, String status, short season, int motohours, int mileage, Timestamp start_time, Timestamp end_time, Timestamp planned_start_time, Timestamp planned_end_time, String description, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.maintainable_id = maintainable_id;
        this.maintainable_type = maintainable_type;
        this.maintenance_plan_id = maintenance_plan_id;
        this.status = status;
        this.season = season;
        this.motohours = motohours;
        this.mileage = mileage;
        this.start_time = start_time;
        this.end_time = end_time;
        this.planned_start_time = planned_start_time;
        this.planned_end_time = planned_end_time;
        this.description = description;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public MaintenanceRecord() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public int getMaintainable_id() {
        return maintainable_id;
    }

    public void setMaintainable_id(int maintainable_id) {
        this.maintainable_id = maintainable_id;
    }

    public String getMaintainable_type() {
        return maintainable_type;
    }

    public void setMaintainable_type(String maintainable_type) {
        this.maintainable_type = maintainable_type;
    }

    public short getMaintenance_plan_id() {
        return maintenance_plan_id;
    }

    public void setMaintenance_plan_id(short maintenance_plan_id) {
        this.maintenance_plan_id = maintenance_plan_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public short getSeason() {
        return season;
    }

    public void setSeason(short season) {
        this.season = season;
    }

    public int getMotohours() {
        return motohours;
    }

    public void setMotohours(int motohours) {
        this.motohours = motohours;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public Timestamp getStart_time() {
        return start_time;
    }

    public void setStart_time(Timestamp start_time) {
        this.start_time = start_time;
    }

    public Timestamp getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Timestamp end_time) {
        this.end_time = end_time;
    }

    public Timestamp getPlanned_start_time() {
        return planned_start_time;
    }

    public void setPlanned_start_time(Timestamp planned_start_time) {
        this.planned_start_time = planned_start_time;
    }

    public Timestamp getPlanned_end_time() {
        return planned_end_time;
    }

    public void setPlanned_end_time(Timestamp planned_end_time) {
        this.planned_end_time = planned_end_time;
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
        MaintenanceRecord that = (MaintenanceRecord) o;
        return maintainable_id == that.maintainable_id && maintenance_plan_id == that.maintenance_plan_id && season == that.season && motohours == that.motohours && mileage == that.mileage && Objects.equals(id, that.id) && Objects.equals(maintainable_type, that.maintainable_type) && Objects.equals(status, that.status) && Objects.equals(start_time, that.start_time) && Objects.equals(end_time, that.end_time) && Objects.equals(planned_start_time, that.planned_start_time) && Objects.equals(planned_end_time, that.planned_end_time) && Objects.equals(description, that.description) && Objects.equals(created_at, that.created_at) && Objects.equals(updated_at, that.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, maintainable_id, maintainable_type, maintenance_plan_id, status, season, motohours, mileage, start_time, end_time, planned_start_time, planned_end_time, description, created_at, updated_at);
    }

    @Override
    public String toString() {
        return "MaintenanceRecord{" +
                "id=" + id +
                ", maintainable_id=" + maintainable_id +
                ", maintainable_type='" + maintainable_type + '\'' +
                ", maintenance_plan_id=" + maintenance_plan_id +
                ", status='" + status + '\'' +
                ", season=" + season +
                ", motohours=" + motohours +
                ", mileage=" + mileage +
                ", start_time=" + start_time +
                ", end_time=" + end_time +
                ", planned_start_time=" + planned_start_time +
                ", planned_end_time=" + planned_end_time +
                ", description='" + description + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
