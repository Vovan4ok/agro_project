package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="machine_tasks", schema="cropwise_data")
public class MachineTask {
    @Id
    @Column(name="id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name="machine_id")
    private Machine machine;

    @Column(name="start_time")
    private Timestamp startTime;

    @Column(name="end_time")
    private Timestamp endTime;

    @Column(name="action_type", length=20)
    private String actionType;

    @Column(name="action_subtype", length=50)
    private String actionSubtype;

    @ManyToOne
    @JoinColumn(name="work_type_id")
    private WorkType workType;

    @ManyToOne
    @JoinColumn(name="driver_id")
    private User driver;

    @Column(name="implement_id")
    private Short implementId;

    @Column(name="work_for_contractors")
    private Boolean workForContractors;

    @Column(name="work_for_land_owners")
    private Boolean workForLandOwners;

    @Column(name="real_implement_width")
    private Double realImplementWidth;

    @Column(name="total_distance")
    private Double totalDistance;

    @Column(name="work_distance")
    private Double workDistance;

    @Column(name="work_area")
    private Double workArea;

    @Column(name="covered_area")
    private Double coveredArea;

    @Column(name="manual_covered_area")
    private Double manualCoveredArea;

    @Column(name="work_duration")
    private Integer workDuration;

    @Column(name="additional_info")
    private String additionalInfo;

    @Column(name="description")
    private String description;

    @Column(name="season")
    private Short season;

    @Column(name="external_id", length=50)
    private String externalId;

    @Column(name="status", length=15)
    private String status;

    @Column(name="stops_on_road_duration")
    private Integer stopsOnRoadDuration;

    @Column(name="movements_on_road_duration")
    private Integer movementsOnRoadDuration;

    @Column(name="time_without_gps_data")
    private Integer timeWithoutGpsData;

    @Column(name="fuel_consumption")
    private Double fuelConsumption;

    @Column(name="fuel_consumption_per_ha")
    private Double fuelConsumptionPerHa;

    @Column(name="fuel_consumption_on_road")
    private Double fuelConsumptionOnRoad;

    @Column(name="fuel_consumption_on_road_average")
    private Double fuelConsumptionOnRoadAverage;

    @Column(name="track_integrity_coef")
    private Double trackIntegrityCoef;

    @Column(name="engine_work_duration_on_fields")
    private Double engineWorkDurationOnFields;

    @Column(name="engine_work_duration_on_road")
    private Double engineWorkDurationOnRoad;

    @Column(name="locked_to_edit")
    private Double lockedToEdit;

    @Column(name="locked_at")
    private Double lockedAt;

    @Column(name="plan_speed_min")
    private Short planSpeedMin;

    @Column(name="plan_speed_max")
    private Short planSpeedMax;

    @Column(name="start_fuel_level")
    private Double startFuelLevel;

    @Column(name="end_fuel_level")
    private Double endFuelLevel;

    @Column(name="refuel")
    private Double refuel;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    @Column(name="notify_responsible_users")
    private Boolean notifyResponsibleUsers;

    public MachineTask(Integer id, Machine machine, Timestamp startTime, Timestamp endTime, String actionType, String actionSubtype, WorkType workType, User driver, Short implementId, Boolean workForContractors, Boolean workForLandOwners, Double realImplementWidth, Double totalDistance, Double workDistance, Double workArea, Double coveredArea, Double manualCoveredArea, Integer workDuration, String additionalInfo, String description, Short season, String externalId, String status, Integer stopsOnRoadDuration, Integer movementsOnRoadDuration, Integer timeWithoutGpsData, Double fuelConsumption, Double fuelConsumptionPerHa, Double fuelConsumptionOnRoad, Double fuelConsumptionOnRoadAverage, Double trackIntegrityCoef, Double engineWorkDurationOnFields, Double engineWorkDurationOnRoad, Double lockedToEdit, Double lockedAt, Short planSpeedMin, Short planSpeedMax, Double startFuelLevel, Double endFuelLevel, Double refuel, Timestamp createdAt, Timestamp updatedAt, Boolean notifyResponsibleUsers) {
        this.id = id;
        this.machine = machine;
        this.startTime = startTime;
        this.endTime = endTime;
        this.actionType = actionType;
        this.actionSubtype = actionSubtype;
        this.workType = workType;
        this.driver = driver;
        this.implementId = implementId;
        this.workForContractors = workForContractors;
        this.workForLandOwners = workForLandOwners;
        this.realImplementWidth = realImplementWidth;
        this.totalDistance = totalDistance;
        this.workDistance = workDistance;
        this.workArea = workArea;
        this.coveredArea = coveredArea;
        this.manualCoveredArea = manualCoveredArea;
        this.workDuration = workDuration;
        this.additionalInfo = additionalInfo;
        this.description = description;
        this.season = season;
        this.externalId = externalId;
        this.status = status;
        this.stopsOnRoadDuration = stopsOnRoadDuration;
        this.movementsOnRoadDuration = movementsOnRoadDuration;
        this.timeWithoutGpsData = timeWithoutGpsData;
        this.fuelConsumption = fuelConsumption;
        this.fuelConsumptionPerHa = fuelConsumptionPerHa;
        this.fuelConsumptionOnRoad = fuelConsumptionOnRoad;
        this.fuelConsumptionOnRoadAverage = fuelConsumptionOnRoadAverage;
        this.trackIntegrityCoef = trackIntegrityCoef;
        this.engineWorkDurationOnFields = engineWorkDurationOnFields;
        this.engineWorkDurationOnRoad = engineWorkDurationOnRoad;
        this.lockedToEdit = lockedToEdit;
        this.lockedAt = lockedAt;
        this.planSpeedMin = planSpeedMin;
        this.planSpeedMax = planSpeedMax;
        this.startFuelLevel = startFuelLevel;
        this.endFuelLevel = endFuelLevel;
        this.refuel = refuel;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.notifyResponsibleUsers = notifyResponsibleUsers;
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

    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public String getActionSubtype() {
        return actionSubtype;
    }

    public void setActionSubtype(String actionSubtype) {
        this.actionSubtype = actionSubtype;
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

    public Short getImplementId() {
        return implementId;
    }

    public void setImplementId(Short implementId) {
        this.implementId = implementId;
    }

    public Boolean isWorkForContractors() {
        return workForContractors;
    }

    public void setWorkForContractors(Boolean workForContractors) {
        this.workForContractors = workForContractors;
    }

    public Boolean isWorkForLandOwners() {
        return workForLandOwners;
    }

    public void setWorkForLandOwners(Boolean workForLandOwners) {
        this.workForLandOwners = workForLandOwners;
    }

    public Double getRealImplementWidth() {
        return realImplementWidth;
    }

    public void setRealImplementWidth(Double realImplementWidth) {
        this.realImplementWidth = realImplementWidth;
    }

    public Double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(Double totalDistance) {
        this.totalDistance = totalDistance;
    }

    public Double getWorkDistance() {
        return workDistance;
    }

    public void setWorkDistance(Double workDistance) {
        this.workDistance = workDistance;
    }

    public Double getWorkArea() {
        return workArea;
    }

    public void setWorkArea(Double workArea) {
        this.workArea = workArea;
    }

    public Double getCoveredArea() {
        return coveredArea;
    }

    public void setCoveredArea(Double coveredArea) {
        this.coveredArea = coveredArea;
    }

    public Double getManualCoveredArea() {
        return manualCoveredArea;
    }

    public void setManualCoveredArea(Double manualCoveredArea) {
        this.manualCoveredArea = manualCoveredArea;
    }

    public Integer getWorkDuration() {
        return workDuration;
    }

    public void setWorkDuration(Integer workDuration) {
        this.workDuration = workDuration;
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

    public Short getSeason() {
        return season;
    }

    public void setSeason(Short season) {
        this.season = season;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Integer getStopsOnRoadDuration() {
        return stopsOnRoadDuration;
    }

    public void setStopsOnRoadDuration(Integer stopsOnRoadDuration) {
        this.stopsOnRoadDuration = stopsOnRoadDuration;
    }

    public Integer getMovementsOnRoadDuration() {
        return movementsOnRoadDuration;
    }

    public void setMovementsOnRoadDuration(Integer movementsOnRoadDuration) {
        this.movementsOnRoadDuration = movementsOnRoadDuration;
    }

    public Integer getTimeWithoutGpsData() {
        return timeWithoutGpsData;
    }

    public void setTimeWithoutGpsData(Integer timeWithoutGpsData) {
        this.timeWithoutGpsData = timeWithoutGpsData;
    }

    public Double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(Double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public Double getFuelConsumptionPerHa() {
        return fuelConsumptionPerHa;
    }

    public void setFuelConsumptionPerHa(Double fuelConsumptionPerHa) {
        this.fuelConsumptionPerHa = fuelConsumptionPerHa;
    }

    public Double getFuelConsumptionOnRoad() {
        return fuelConsumptionOnRoad;
    }

    public void setFuelConsumptionOnRoad(Double fuelConsumptionOnRoad) {
        this.fuelConsumptionOnRoad = fuelConsumptionOnRoad;
    }

    public Double getFuelConsumptionOnRoadAverage() {
        return fuelConsumptionOnRoadAverage;
    }

    public void setFuelConsumptionOnRoadAverage(Double fuelConsumptionOnRoadAverage) {
        this.fuelConsumptionOnRoadAverage = fuelConsumptionOnRoadAverage;
    }

    public Double getTrackIntegrityCoef() {
        return trackIntegrityCoef;
    }

    public void setTrackIntegrityCoef(Double trackIntegrityCoef) {
        this.trackIntegrityCoef = trackIntegrityCoef;
    }

    public Double getEngineWorkDurationOnFields() {
        return engineWorkDurationOnFields;
    }

    public void setEngineWorkDurationOnFields(Double engineWorkDurationOnFields) {
        this.engineWorkDurationOnFields = engineWorkDurationOnFields;
    }

    public Double getEngineWorkDurationOnRoad() {
        return engineWorkDurationOnRoad;
    }

    public void setEngineWorkDurationOnRoad(Double engineWorkDurationOnRoad) {
        this.engineWorkDurationOnRoad = engineWorkDurationOnRoad;
    }

    public Double getLockedToEdit() {
        return lockedToEdit;
    }

    public void setLockedToEdit(Double lockedToEdit) {
        this.lockedToEdit = lockedToEdit;
    }

    public Double getLockedAt() {
        return lockedAt;
    }

    public void setLockedAt(Double lockedAt) {
        this.lockedAt = lockedAt;
    }

    public Short getPlanSpeedMin() {
        return planSpeedMin;
    }

    public void setPlanSpeedMin(Short planSpeedMin) {
        this.planSpeedMin = planSpeedMin;
    }

    public Short getPlanSpeedMax() {
        return planSpeedMax;
    }

    public void setPlanSpeedMax(Short planSpeedMax) {
        this.planSpeedMax = planSpeedMax;
    }

    public Double getStartFuelLevel() {
        return startFuelLevel;
    }

    public void setStartFuelLevel(Double startFuelLevel) {
        this.startFuelLevel = startFuelLevel;
    }

    public Double getEndFuelLevel() {
        return endFuelLevel;
    }

    public void setEndFuelLevel(Double endFuelLevel) {
        this.endFuelLevel = endFuelLevel;
    }

    public Double getRefuel() {
        return refuel;
    }

    public void setRefuel(Double refuel) {
        this.refuel = refuel;
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

    public Boolean isNotifyResponsibleUsers() {
        return notifyResponsibleUsers;
    }

    public void setNotifyResponsibleUsers(Boolean notifyResponsibleUsers) {
        this.notifyResponsibleUsers = notifyResponsibleUsers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MachineTask that = (MachineTask) o;
        return workForContractors == that.workForContractors && workForLandOwners == that.workForLandOwners && Double.compare(realImplementWidth, that.realImplementWidth) == 0 && Double.compare(totalDistance, that.totalDistance) == 0 && Double.compare(workDistance, that.workDistance) == 0 && Double.compare(workArea, that.workArea) == 0 && Double.compare(coveredArea, that.coveredArea) == 0 && Double.compare(manualCoveredArea, that.manualCoveredArea) == 0 && Objects.equals(workDuration, that.workDuration) && Objects.equals(season, that.season) && Objects.equals(stopsOnRoadDuration, that.stopsOnRoadDuration) && Objects.equals(movementsOnRoadDuration, that.movementsOnRoadDuration) && Objects.equals(timeWithoutGpsData, that.timeWithoutGpsData) && Double.compare(fuelConsumption, that.fuelConsumption) == 0 && Double.compare(fuelConsumptionPerHa, that.fuelConsumptionPerHa) == 0 && Double.compare(fuelConsumptionOnRoad, that.fuelConsumptionOnRoad) == 0 && Double.compare(fuelConsumptionOnRoadAverage, that.fuelConsumptionOnRoadAverage) == 0 && Double.compare(trackIntegrityCoef, that.trackIntegrityCoef) == 0 && Double.compare(engineWorkDurationOnFields, that.engineWorkDurationOnFields) == 0 && Double.compare(engineWorkDurationOnRoad, that.engineWorkDurationOnRoad) == 0 && Double.compare(lockedToEdit, that.lockedToEdit) == 0 && Double.compare(lockedAt, that.lockedAt) == 0 && Objects.equals(planSpeedMin, that.planSpeedMin) && Objects.equals(planSpeedMax, that.planSpeedMax) && Double.compare(startFuelLevel, that.startFuelLevel) == 0 && Double.compare(endFuelLevel, that.endFuelLevel) == 0 && Double.compare(refuel, that.refuel) == 0 && notifyResponsibleUsers == that.notifyResponsibleUsers && Objects.equals(id, that.id) && Objects.equals(machine, that.machine) && Objects.equals(startTime, that.startTime) && Objects.equals(endTime, that.endTime) && Objects.equals(actionType, that.actionType) && Objects.equals(actionSubtype, that.actionSubtype) && Objects.equals(workType, that.workType) && Objects.equals(driver, that.driver) && Objects.equals(implementId, that.implementId) && Objects.equals(additionalInfo, that.additionalInfo) && Objects.equals(description, that.description) && Objects.equals(externalId, that.externalId) && Objects.equals(status, that.status) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, machine, startTime, endTime, actionType, actionSubtype, workType, driver, implementId, workForContractors, workForLandOwners, realImplementWidth, totalDistance, workDistance, workArea, coveredArea, manualCoveredArea, workDuration, additionalInfo, description, season, externalId, status, stopsOnRoadDuration, movementsOnRoadDuration, timeWithoutGpsData, fuelConsumption, fuelConsumptionPerHa, fuelConsumptionOnRoad, fuelConsumptionOnRoadAverage, trackIntegrityCoef, engineWorkDurationOnFields, engineWorkDurationOnRoad, lockedToEdit, lockedAt, planSpeedMin, planSpeedMax, startFuelLevel, endFuelLevel, refuel, createdAt, updatedAt, notifyResponsibleUsers);
    }

    @Override
    public String toString() {
        return "MachineTask{" +
                "id=" + id +
                ", machine=" + machine +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", actionType='" + actionType + '\'' +
                ", actionSubtype='" + actionSubtype + '\'' +
                ", workType=" + workType +
                ", driver=" + driver +
                ", implementId=" + implementId +
                ", workForContractors=" + workForContractors +
                ", workForLandOwners=" + workForLandOwners +
                ", realImplementWidth=" + realImplementWidth +
                ", totalDistance=" + totalDistance +
                ", workDistance=" + workDistance +
                ", workArea=" + workArea +
                ", coveredArea=" + coveredArea +
                ", manualCoveredArea=" + manualCoveredArea +
                ", workDuration=" + workDuration +
                ", additionalInfo='" + additionalInfo + '\'' +
                ", description='" + description + '\'' +
                ", season=" + season +
                ", externalId='" + externalId + '\'' +
                ", status='" + status + '\'' +
                ", stopsOnRoadDuration=" + stopsOnRoadDuration +
                ", movementsOnRoadDuration=" + movementsOnRoadDuration +
                ", timeWithoutGpsData=" + timeWithoutGpsData +
                ", fuelConsumption=" + fuelConsumption +
                ", fuelConsumptionPerHa=" + fuelConsumptionPerHa +
                ", fuelConsumptionOnRoad=" + fuelConsumptionOnRoad +
                ", fuelConsumptionOnRoadAverage=" + fuelConsumptionOnRoadAverage +
                ", trackIntegrityCoef=" + trackIntegrityCoef +
                ", engineWorkDurationOnFields=" + engineWorkDurationOnFields +
                ", engineWorkDurationOnRoad=" + engineWorkDurationOnRoad +
                ", lockedToEdit=" + lockedToEdit +
                ", lockedAt=" + lockedAt +
                ", planSpeedMin=" + planSpeedMin +
                ", planSpeedMax=" + planSpeedMax +
                ", startFuelLevel=" + startFuelLevel +
                ", endFuelLevel=" + endFuelLevel +
                ", refuel=" + refuel +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", notifyResponsibleUsers=" + notifyResponsibleUsers +
                '}';
    }
}
