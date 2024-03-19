package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="machine_tasks")
public class MachineTask {
    @Id
    @Column(name="id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name="machine_id")
    private Machine machine;

    @Column(name="start_time")
    private Timestamp start_time;

    @Column(name="end_time")
    private Timestamp end_time;

    @Column(name="action_type", length=20)
    private String action_type;

    @Column(name="action_subtype", length=50)
    private String action_subtype;

    @ManyToOne
    @JoinColumn(name="work_type_id")
    private WorkType workType;

    @ManyToOne
    @JoinColumn(name="driver_id")
    private User driver;

    @Column(name="implement_id")
    private short implement_id;

    @Column(name="work_for_contractors")
    private boolean work_for_contractors;

    @Column(name="work_for_land_owners")
    private boolean work_for_land_owners;

    @Column(name="real_implement_width")
    private double real_implement_width;

    @Column(name="total_distance")
    private double total_distance;

    @Column(name="work_distance")
    private double work_distance;

    @Column(name="work_area")
    private double work_area;

    @Column(name="covered_area")
    private double covered_area;

    @Column(name="manual_covered_area")
    private double manual_covered_area;

    @Column(name="work_duration")
    private int work_duration;

    @Column(name="additional_info")
    @Lob
    private String additional_info;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="season")
    private short season;

    @Column(name="external_id", length=50)
    private String external_id;

    @Column(name="status", length=15)
    private String status;

    @Column(name="stops_on_road_duration")
    private int stops_on_road_duration;

    @Column(name="movements_on_road_duration")
    private int movements_on_road_duration;

    @Column(name="time_without_gps_data")
    private int time_without_gps_data;

    @Column(name="fuel_consumption")
    private double fuel_consumption;

    @Column(name="fuel_consumption_per_ha")
    private double fuel_consumption_per_ha;

    @Column(name="fuel_consumption_on_road")
    private double fuel_consumption_on_road;

    @Column(name="fuel_consumption_on_road_average")
    private double fuel_consumption_on_road_average;

    @Column(name="track_integrity_coef")
    private double track_integrity_coef;

    @Column(name="engine_work_duration_on_fields")
    private double engine_work_duration_on_fields;

    @Column(name="engine_work_duration_on_road")
    private double engine_work_duration_on_road;

    @Column(name="locked_to_edit")
    private double locked_to_edit;

    @Column(name="locked_at")
    private double locked_at;

    @Column(name="plan_speed_min")
    private short plan_speed_min;

    @Column(name="plan_speed_max")
    private short plan_speed_max;

    @Column(name="start_fuel_level")
    private double start_fuel_level;

    @Column(name="end_fuel_level")
    private double end_fuel_level;

    @Column(name="refuel")
    private double refuel;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    @Column(name="notify_responsible_users")
    private boolean notify_responsible_users;

    public MachineTask(Integer id, Machine machine, Timestamp start_time, Timestamp end_time, String action_type, String action_subtype, WorkType workType, User driver, short implement_id, boolean work_for_contractors, boolean work_for_land_owners, double real_implement_width, double total_distance, double work_distance, double work_area, double covered_area, double manual_covered_area, int work_duration, String additional_info, String description, short season, String external_id, String status, int stops_on_road_duration, int movements_on_road_duration, int time_without_gps_data, double fuel_consumption, double fuel_consumption_per_ha, double fuel_consumption_on_road, double fuel_consumption_on_road_average, double track_integrity_coef, double engine_work_duration_on_fields, double engine_work_duration_on_road, double locked_to_edit, double locked_at, short plan_speed_min, short plan_speed_max, double start_fuel_level, double end_fuel_level, double refuel, Timestamp created_at, Timestamp updated_at, boolean notify_responsible_users) {
        this.id = id;
        this.machine = machine;
        this.start_time = start_time;
        this.end_time = end_time;
        this.action_type = action_type;
        this.action_subtype = action_subtype;
        this.workType = workType;
        this.driver = driver;
        this.implement_id = implement_id;
        this.work_for_contractors = work_for_contractors;
        this.work_for_land_owners = work_for_land_owners;
        this.real_implement_width = real_implement_width;
        this.total_distance = total_distance;
        this.work_distance = work_distance;
        this.work_area = work_area;
        this.covered_area = covered_area;
        this.manual_covered_area = manual_covered_area;
        this.work_duration = work_duration;
        this.additional_info = additional_info;
        this.description = description;
        this.season = season;
        this.external_id = external_id;
        this.status = status;
        this.stops_on_road_duration = stops_on_road_duration;
        this.movements_on_road_duration = movements_on_road_duration;
        this.time_without_gps_data = time_without_gps_data;
        this.fuel_consumption = fuel_consumption;
        this.fuel_consumption_per_ha = fuel_consumption_per_ha;
        this.fuel_consumption_on_road = fuel_consumption_on_road;
        this.fuel_consumption_on_road_average = fuel_consumption_on_road_average;
        this.track_integrity_coef = track_integrity_coef;
        this.engine_work_duration_on_fields = engine_work_duration_on_fields;
        this.engine_work_duration_on_road = engine_work_duration_on_road;
        this.locked_to_edit = locked_to_edit;
        this.locked_at = locked_at;
        this.plan_speed_min = plan_speed_min;
        this.plan_speed_max = plan_speed_max;
        this.start_fuel_level = start_fuel_level;
        this.end_fuel_level = end_fuel_level;
        this.refuel = refuel;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.notify_responsible_users = notify_responsible_users;
    }

    public MachineTask() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
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

    public String getAction_type() {
        return action_type;
    }

    public void setAction_type(String action_type) {
        this.action_type = action_type;
    }

    public String getAction_subtype() {
        return action_subtype;
    }

    public void setAction_subtype(String action_subtype) {
        this.action_subtype = action_subtype;
    }

    public WorkType getWorkType() {
        return workType;
    }

    public void setWorkType(WorkType workType) {
        this.workType = workType;
    }

    public User getDriver() {
        return driver;
    }

    public void setDriver(User driver) {
        this.driver = driver;
    }

    public short getImplement_id() {
        return implement_id;
    }

    public void setImplement_id(short implement_id) {
        this.implement_id = implement_id;
    }

    public boolean isWork_for_contractors() {
        return work_for_contractors;
    }

    public void setWork_for_contractors(boolean work_for_contractors) {
        this.work_for_contractors = work_for_contractors;
    }

    public boolean isWork_for_land_owners() {
        return work_for_land_owners;
    }

    public void setWork_for_land_owners(boolean work_for_land_owners) {
        this.work_for_land_owners = work_for_land_owners;
    }

    public double getReal_implement_width() {
        return real_implement_width;
    }

    public void setReal_implement_width(double real_implement_width) {
        this.real_implement_width = real_implement_width;
    }

    public double getTotal_distance() {
        return total_distance;
    }

    public void setTotal_distance(double total_distance) {
        this.total_distance = total_distance;
    }

    public double getWork_distance() {
        return work_distance;
    }

    public void setWork_distance(double work_distance) {
        this.work_distance = work_distance;
    }

    public double getWork_area() {
        return work_area;
    }

    public void setWork_area(double work_area) {
        this.work_area = work_area;
    }

    public double getCovered_area() {
        return covered_area;
    }

    public void setCovered_area(double covered_area) {
        this.covered_area = covered_area;
    }

    public double getManual_covered_area() {
        return manual_covered_area;
    }

    public void setManual_covered_area(double manual_covered_area) {
        this.manual_covered_area = manual_covered_area;
    }

    public int getWork_duration() {
        return work_duration;
    }

    public void setWork_duration(int work_duration) {
        this.work_duration = work_duration;
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

    public short getSeason() {
        return season;
    }

    public void setSeason(short season) {
        this.season = season;
    }

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public int getStops_on_road_duration() {
        return stops_on_road_duration;
    }

    public void setStops_on_road_duration(int stops_on_road_duration) {
        this.stops_on_road_duration = stops_on_road_duration;
    }

    public int getMovements_on_road_duration() {
        return movements_on_road_duration;
    }

    public void setMovements_on_road_duration(int movements_on_road_duration) {
        this.movements_on_road_duration = movements_on_road_duration;
    }

    public int getTime_without_gps_data() {
        return time_without_gps_data;
    }

    public void setTime_without_gps_data(int time_without_gps_data) {
        this.time_without_gps_data = time_without_gps_data;
    }

    public double getFuel_consumption() {
        return fuel_consumption;
    }

    public void setFuel_consumption(double fuel_consumption) {
        this.fuel_consumption = fuel_consumption;
    }

    public double getFuel_consumption_per_ha() {
        return fuel_consumption_per_ha;
    }

    public void setFuel_consumption_per_ha(double fuel_consumption_per_ha) {
        this.fuel_consumption_per_ha = fuel_consumption_per_ha;
    }

    public double getFuel_consumption_on_road() {
        return fuel_consumption_on_road;
    }

    public void setFuel_consumption_on_road(double fuel_consumption_on_road) {
        this.fuel_consumption_on_road = fuel_consumption_on_road;
    }

    public double getFuel_consumption_on_road_average() {
        return fuel_consumption_on_road_average;
    }

    public void setFuel_consumption_on_road_average(double fuel_consumption_on_road_average) {
        this.fuel_consumption_on_road_average = fuel_consumption_on_road_average;
    }

    public double getTrack_integrity_coef() {
        return track_integrity_coef;
    }

    public void setTrack_integrity_coef(double track_integrity_coef) {
        this.track_integrity_coef = track_integrity_coef;
    }

    public double getEngine_work_duration_on_fields() {
        return engine_work_duration_on_fields;
    }

    public void setEngine_work_duration_on_fields(double engine_work_duration_on_fields) {
        this.engine_work_duration_on_fields = engine_work_duration_on_fields;
    }

    public double getEngine_work_duration_on_road() {
        return engine_work_duration_on_road;
    }

    public void setEngine_work_duration_on_road(double engine_work_duration_on_road) {
        this.engine_work_duration_on_road = engine_work_duration_on_road;
    }

    public double getLocked_to_edit() {
        return locked_to_edit;
    }

    public void setLocked_to_edit(double locked_to_edit) {
        this.locked_to_edit = locked_to_edit;
    }

    public double getLocked_at() {
        return locked_at;
    }

    public void setLocked_at(double locked_at) {
        this.locked_at = locked_at;
    }

    public short getPlan_speed_min() {
        return plan_speed_min;
    }

    public void setPlan_speed_min(short plan_speed_min) {
        this.plan_speed_min = plan_speed_min;
    }

    public short getPlan_speed_max() {
        return plan_speed_max;
    }

    public void setPlan_speed_max(short plan_speed_max) {
        this.plan_speed_max = plan_speed_max;
    }

    public double getStart_fuel_level() {
        return start_fuel_level;
    }

    public void setStart_fuel_level(double start_fuel_level) {
        this.start_fuel_level = start_fuel_level;
    }

    public double getEnd_fuel_level() {
        return end_fuel_level;
    }

    public void setEnd_fuel_level(double end_fuel_level) {
        this.end_fuel_level = end_fuel_level;
    }

    public double getRefuel() {
        return refuel;
    }

    public void setRefuel(double refuel) {
        this.refuel = refuel;
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

    public boolean isNotify_responsible_users() {
        return notify_responsible_users;
    }

    public void setNotify_responsible_users(boolean notify_responsible_users) {
        this.notify_responsible_users = notify_responsible_users;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MachineTask that = (MachineTask) o;
        return work_for_contractors == that.work_for_contractors && work_for_land_owners == that.work_for_land_owners && Double.compare(real_implement_width, that.real_implement_width) == 0 && Double.compare(total_distance, that.total_distance) == 0 && Double.compare(work_distance, that.work_distance) == 0 && Double.compare(work_area, that.work_area) == 0 && Double.compare(covered_area, that.covered_area) == 0 && Double.compare(manual_covered_area, that.manual_covered_area) == 0 && work_duration == that.work_duration && season == that.season && stops_on_road_duration == that.stops_on_road_duration && movements_on_road_duration == that.movements_on_road_duration && time_without_gps_data == that.time_without_gps_data && Double.compare(fuel_consumption, that.fuel_consumption) == 0 && Double.compare(fuel_consumption_per_ha, that.fuel_consumption_per_ha) == 0 && Double.compare(fuel_consumption_on_road, that.fuel_consumption_on_road) == 0 && Double.compare(fuel_consumption_on_road_average, that.fuel_consumption_on_road_average) == 0 && Double.compare(track_integrity_coef, that.track_integrity_coef) == 0 && Double.compare(engine_work_duration_on_fields, that.engine_work_duration_on_fields) == 0 && Double.compare(engine_work_duration_on_road, that.engine_work_duration_on_road) == 0 && Double.compare(locked_to_edit, that.locked_to_edit) == 0 && Double.compare(locked_at, that.locked_at) == 0 && plan_speed_min == that.plan_speed_min && plan_speed_max == that.plan_speed_max && Double.compare(start_fuel_level, that.start_fuel_level) == 0 && Double.compare(end_fuel_level, that.end_fuel_level) == 0 && Double.compare(refuel, that.refuel) == 0 && notify_responsible_users == that.notify_responsible_users && Objects.equals(id, that.id) && Objects.equals(machine, that.machine) && Objects.equals(start_time, that.start_time) && Objects.equals(end_time, that.end_time) && Objects.equals(action_type, that.action_type) && Objects.equals(action_subtype, that.action_subtype) && Objects.equals(workType, that.workType) && Objects.equals(driver, that.driver) && implement_id == that.implement_id && Objects.equals(additional_info, that.additional_info) && Objects.equals(description, that.description) && Objects.equals(external_id, that.external_id) && Objects.equals(status, that.status) && Objects.equals(created_at, that.created_at) && Objects.equals(updated_at, that.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, machine, start_time, end_time, action_type, action_subtype, workType, driver, implement_id, work_for_contractors, work_for_land_owners, real_implement_width, total_distance, work_distance, work_area, covered_area, manual_covered_area, work_duration, additional_info, description, season, external_id, status, stops_on_road_duration, movements_on_road_duration, time_without_gps_data, fuel_consumption, fuel_consumption_per_ha, fuel_consumption_on_road, fuel_consumption_on_road_average, track_integrity_coef, engine_work_duration_on_fields, engine_work_duration_on_road, locked_to_edit, locked_at, plan_speed_min, plan_speed_max, start_fuel_level, end_fuel_level, refuel, created_at, updated_at, notify_responsible_users);
    }

    @Override
    public String toString() {
        return "MachineTask{" +
                "id=" + id +
                ", machine=" + machine +
                ", start_time=" + start_time +
                ", end_time=" + end_time +
                ", action_type='" + action_type + '\'' +
                ", action_subtype='" + action_subtype + '\'' +
                ", workType=" + workType +
                ", driver=" + driver +
                ", implement_id=" + implement_id +
                ", work_for_contractors=" + work_for_contractors +
                ", work_for_land_owners=" + work_for_land_owners +
                ", real_implement_width=" + real_implement_width +
                ", total_distance=" + total_distance +
                ", work_distance=" + work_distance +
                ", work_area=" + work_area +
                ", covered_area=" + covered_area +
                ", manual_covered_area=" + manual_covered_area +
                ", work_duration=" + work_duration +
                ", additional_info='" + additional_info + '\'' +
                ", description='" + description + '\'' +
                ", season=" + season +
                ", external_id='" + external_id + '\'' +
                ", status='" + status + '\'' +
                ", stops_on_road_duration=" + stops_on_road_duration +
                ", movements_on_road_duration=" + movements_on_road_duration +
                ", time_without_gps_data=" + time_without_gps_data +
                ", fuel_consumption=" + fuel_consumption +
                ", fuel_consumption_per_ha=" + fuel_consumption_per_ha +
                ", fuel_consumption_on_road=" + fuel_consumption_on_road +
                ", fuel_consumption_on_road_average=" + fuel_consumption_on_road_average +
                ", track_integrity_coef=" + track_integrity_coef +
                ", engine_work_duration_on_fields=" + engine_work_duration_on_fields +
                ", engine_work_duration_on_road=" + engine_work_duration_on_road +
                ", locked_to_edit=" + locked_to_edit +
                ", locked_at=" + locked_at +
                ", plan_speed_min=" + plan_speed_min +
                ", plan_speed_max=" + plan_speed_max +
                ", start_fuel_level=" + start_fuel_level +
                ", end_fuel_level=" + end_fuel_level +
                ", refuel=" + refuel +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", notify_responsible_users=" + notify_responsible_users +
                '}';
    }
}
