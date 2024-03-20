package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="machine_downtimes")
public class MachineDowntime {
    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="start_time")
    private Timestamp startTime;

    @Column(name="end_time")
    private Timestamp endTime;

    @Column(name="duration_in_seconds")
    private int durationInSeconds;

    @ManyToOne
    @JoinColumn(name="machine_downtime_type_id")
    private MachineDowntimeType machineDowntimeType;

    @Column(name="machine_id")
    private short machineId;

    @Column(name="status", length=20)
    private String status;

    @Column(name="additional_info")
    @Lob
    private String additionalInfo;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    @Column(name="point_lon")
    private double pointLon;

    @Column(name="point_lat")
    private double pointLat;

    public MachineDowntime(Integer id, Timestamp startTime, Timestamp endTime, int durationInSeconds, MachineDowntimeType machineDowntimeType, short machineId, String status, String additionalInfo, Timestamp createdAt, Timestamp updatedAt, double pointLon, double pointLat) {
        this.id = id;
        this.startTime = startTime;
        this.endTime = endTime;
        this.durationInSeconds = durationInSeconds;
        this.machineDowntimeType = machineDowntimeType;
        this.machineId = machineId;
        this.status = status;
        this.additionalInfo = additionalInfo;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.pointLon = pointLon;
        this.pointLat = pointLat;
    }

    public MachineDowntime() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public int getDurationInSeconds() {
        return durationInSeconds;
    }

    public void setDurationInSeconds(int durationInSeconds) {
        this.durationInSeconds = durationInSeconds;
    }

    public MachineDowntimeType getMachineDowntimeType() {
        return machineDowntimeType;
    }

    public void setMachineDowntimeType(MachineDowntimeType machineDowntimeType) {
        this.machineDowntimeType = machineDowntimeType;
    }

    public short getMachineId() {
        return machineId;
    }

    public void setMachineId(short machineId) {
        this.machineId = machineId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
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

    public double getPointLon() {
        return pointLon;
    }

    public void setPointLon(double pointLon) {
        this.pointLon = pointLon;
    }

    public double getPointLat() {
        return pointLat;
    }

    public void setPointLat(double pointLat) {
        this.pointLat = pointLat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MachineDowntime that = (MachineDowntime) o;
        return durationInSeconds == that.durationInSeconds && Double.compare(pointLon, that.pointLon) == 0 && Double.compare(pointLat, that.pointLat) == 0 && Objects.equals(id, that.id) && Objects.equals(startTime, that.startTime) && Objects.equals(endTime, that.endTime) && Objects.equals(machineDowntimeType, that.machineDowntimeType) && Objects.equals(machineId, that.machineId) && Objects.equals(status, that.status) && Objects.equals(additionalInfo, that.additionalInfo) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, startTime, endTime, durationInSeconds, machineDowntimeType, machineId, status, additionalInfo, createdAt, updatedAt, pointLon, pointLat);
    }

    @Override
    public String toString() {
        return "MachineDowntime{" +
                "id=" + id +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", durationInSeconds=" + durationInSeconds +
                ", machineDowntimeType=" + machineDowntimeType +
                ", machineId=" + machineId +
                ", status='" + status + '\'' +
                ", additionalInfo='" + additionalInfo + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", pointLon=" + pointLon +
                ", pointLat=" + pointLat +
                '}';
    }
}
