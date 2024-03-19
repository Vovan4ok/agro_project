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
    private Timestamp start_time;

    @Column(name="end_time")
    private Timestamp end_time;

    @Column(name="duration_in_seconds")
    private int duration_in_seconds;

    @ManyToOne
    @JoinColumn(name="machine_downtime_type_id")
    private MachineDowntimeType machineDowntimeType;

    @Column(name="machine_id")
    private short machine_id;

    @Column(name="status", length=20)
    private String status;

    @Column(name="additional_info")
    @Lob
    private String additional_info;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    @Column(name="point_lon")
    private double point_lon;

    @Column(name="point_lat")
    private double point_lat;

    public MachineDowntime(Integer id, Timestamp start_time, Timestamp end_time, int duration_in_seconds, MachineDowntimeType machineDowntimeType, short machine_id, String status, String additional_info, Timestamp created_at, Timestamp updated_at, double point_lon, double point_lat) {
        this.id = id;
        this.start_time = start_time;
        this.end_time = end_time;
        this.duration_in_seconds = duration_in_seconds;
        this.machineDowntimeType = machineDowntimeType;
        this.machine_id = machine_id;
        this.status = status;
        this.additional_info = additional_info;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.point_lon = point_lon;
        this.point_lat = point_lat;
    }

    public MachineDowntime() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
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

    public int getDuration_in_seconds() {
        return duration_in_seconds;
    }

    public void setDuration_in_seconds(int duration_in_seconds) {
        this.duration_in_seconds = duration_in_seconds;
    }

    public MachineDowntimeType getMachineDowntimeType() {
        return machineDowntimeType;
    }

    public void setMachineDowntimeType(MachineDowntimeType machineDowntimeType) {
        this.machineDowntimeType = machineDowntimeType;
    }

    public short getMachine_id() {
        return machine_id;
    }

    public void setMachine_id(short machine_id) {
        this.machine_id = machine_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getAdditional_info() {
        return additional_info;
    }

    public void setAdditional_info(String additional_info) {
        this.additional_info = additional_info;
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

    public double getPoint_lon() {
        return point_lon;
    }

    public void setPoint_lon(double point_lon) {
        this.point_lon = point_lon;
    }

    public double getPoint_lat() {
        return point_lat;
    }

    public void setPoint_lat(double point_lat) {
        this.point_lat = point_lat;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MachineDowntime that = (MachineDowntime) o;
        return duration_in_seconds == that.duration_in_seconds && Double.compare(point_lon, that.point_lon) == 0 && Double.compare(point_lat, that.point_lat) == 0 && Objects.equals(id, that.id) && Objects.equals(start_time, that.start_time) && Objects.equals(end_time, that.end_time) && Objects.equals(machineDowntimeType, that.machineDowntimeType) && Objects.equals(machine_id, that.machine_id) && Objects.equals(status, that.status) && Objects.equals(additional_info, that.additional_info) && Objects.equals(created_at, that.created_at) && Objects.equals(updated_at, that.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, start_time, end_time, duration_in_seconds, machineDowntimeType, machine_id, status, additional_info, created_at, updated_at, point_lon, point_lat);
    }

    @Override
    public String toString() {
        return "MachineDowntime{" +
                "id=" + id +
                ", start_time=" + start_time +
                ", end_time=" + end_time +
                ", duration_in_seconds=" + duration_in_seconds +
                ", machineDowntimeType=" + machineDowntimeType +
                ", machine_id=" + machine_id +
                ", status='" + status + '\'' +
                ", additional_info='" + additional_info + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", point_lon=" + point_lon +
                ", point_lat=" + point_lat +
                '}';
    }
}
