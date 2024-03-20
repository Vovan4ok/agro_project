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
    private short implementId;

    @Column(name="work_for_contractors")
    private boolean workForContractors;

    @Column(name="work_for_land_owners")
    private boolean workForLandOwners;

    @Column(name="real_implement_width")
    private double realImplementWidth;

    @Column(name="total_distance")
    private double totalDistance;

    @Column(name="work_distance")
    private double workDistance;

    @Column(name="work_area")
    private double workArea;

    @Column(name="covered_area")
    private double coveredArea;

    @Column(name="manual_covered_area")
    private double manualCoveredArea;

    @Column(name="work_duration")
    private int workDuration;

    @Column(name="additional_info")
    @Lob
    private String additionalInfo;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="season")
    private short season;

    @Column(name="external_id", length=50)
    private String externalId;

    @Column(name="status", length=15)
    private String status;

    @Column(name="stops_on_road_duration")
    private int stopsOnRoadDuration;

    @Column(name="movements_on_road_duration")
    private int movementsOnRoadDuration;

    @Column(name="time_without_gps_data")
    private int timeWithoutGpsData;

    @Column(name="fuel_consumption")
    private double fuelConsumption;

    @Column(name="fuel_consumption_per_ha")
    private double fuelConsumptionPerHa;

    @Column(name="fuel_consumption_on_road")
    private double fuelConsumptionOnRoad;

    @Column(name="fuel_consumption_on_road_average")
    private double fuelConsumptionOnRoadAverage;

    @Column(name="track_integrity_coef")
    private double trackIntegrityCoef;

    @Column(name="engine_work_duration_on_fields")
    private double engineWorkDurationOnFields;

    @Column(name="engine_work_duration_on_road")
    private double engineWorkDurationOnRoad;

    @Column(name="locked_to_edit")
    private double lockedToEdit;

    @Column(name="locked_at")
    private double lockedAt;

    @Column(name="plan_speed_min")
    private short planSpeedMin;

    @Column(name="plan_speed_max")
    private short planSpeedMax;

    @Column(name="start_fuel_level")
    private double startFuelLevel;

    @Column(name="end_fuel_level")
    private double endFuelLevel;

    @Column(name="refuel")
    private double refuel;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    @Column(name="notify_responsible_users")
    private boolean notifyResponsibleUsers;

    public MachineTask(Integer id, Machine machine, Timestamp startTime, Timestamp endTime, String actionType, String actionSubtype, WorkType workType, User driver, short implementId, boolean workForContractors, boolean workForLandOwners, double realImplementWidth, double totalDistance, double workDistance, double workArea, double coveredArea, double manualCoveredArea, int workDuration, String additionalInfo, String description, short season, String externalId, String status, int stopsOnRoadDuration, int movementsOnRoadDuration, int timeWithoutGpsData, double fuelConsumption, double fuelConsumptionPerHa, double fuelConsumptionOnRoad, double fuelConsumptionOnRoadAverage, double trackIntegrityCoef, double engineWorkDurationOnFields, double engineWorkDurationOnRoad, double lockedToEdit, double lockedAt, short planSpeedMin, short planSpeedMax, double startFuelLevel, double endFuelLevel, double refuel, Timestamp createdAt, Timestamp updatedAt, boolean notifyResponsibleUsers) {
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

    public short getImplementId() {
        return implementId;
    }

    public void setImplementId(short implementId) {
        this.implementId = implementId;
    }

    public boolean isWorkForContractors() {
        return workForContractors;
    }

    public void setWorkForContractors(boolean workForContractors) {
        this.workForContractors = workForContractors;
    }

    public boolean isWorkForLandOwners() {
        return workForLandOwners;
    }

    public void setWorkForLandOwners(boolean workForLandOwners) {
        this.workForLandOwners = workForLandOwners;
    }

    public double getRealImplementWidth() {
        return realImplementWidth;
    }

    public void setRealImplementWidth(double realImplementWidth) {
        this.realImplementWidth = realImplementWidth;
    }

    public double getTotalDistance() {
        return totalDistance;
    }

    public void setTotalDistance(double totalDistance) {
        this.totalDistance = totalDistance;
    }

    public double getWorkDistance() {
        return workDistance;
    }

    public void setWorkDistance(double workDistance) {
        this.workDistance = workDistance;
    }

    public double getWorkArea() {
        return workArea;
    }

    public void setWorkArea(double workArea) {
        this.workArea = workArea;
    }

    public double getCoveredArea() {
        return coveredArea;
    }

    public void setCoveredArea(double coveredArea) {
        this.coveredArea = coveredArea;
    }

    public double getManualCoveredArea() {
        return manualCoveredArea;
    }

    public void setManualCoveredArea(double manualCoveredArea) {
        this.manualCoveredArea = manualCoveredArea;
    }

    public int getWorkDuration() {
        return workDuration;
    }

    public void setWorkDuration(int workDuration) {
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

    public short getSeason() {
        return season;
    }

    public void setSeason(short season) {
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

    public int getStopsOnRoadDuration() {
        return stopsOnRoadDuration;
    }

    public void setStopsOnRoadDuration(int stopsOnRoadDuration) {
        this.stopsOnRoadDuration = stopsOnRoadDuration;
    }

    public int getMovementsOnRoadDuration() {
        return movementsOnRoadDuration;
    }

    public void setMovementsOnRoadDuration(int movementsOnRoadDuration) {
        this.movementsOnRoadDuration = movementsOnRoadDuration;
    }

    public int getTimeWithoutGpsData() {
        return timeWithoutGpsData;
    }

    public void setTimeWithoutGpsData(int timeWithoutGpsData) {
        this.timeWithoutGpsData = timeWithoutGpsData;
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public void setFuelConsumption(double fuelConsumption) {
        this.fuelConsumption = fuelConsumption;
    }

    public double getFuelConsumptionPerHa() {
        return fuelConsumptionPerHa;
    }

    public void setFuelConsumptionPerHa(double fuelConsumptionPerHa) {
        this.fuelConsumptionPerHa = fuelConsumptionPerHa;
    }

    public double getFuelConsumptionOnRoad() {
        return fuelConsumptionOnRoad;
    }

    public void setFuelConsumptionOnRoad(double fuelConsumptionOnRoad) {
        this.fuelConsumptionOnRoad = fuelConsumptionOnRoad;
    }

    public double getFuelConsumptionOnRoadAverage() {
        return fuelConsumptionOnRoadAverage;
    }

    public void setFuelConsumptionOnRoadAverage(double fuelConsumptionOnRoadAverage) {
        this.fuelConsumptionOnRoadAverage = fuelConsumptionOnRoadAverage;
    }

    public double getTrackIntegrityCoef() {
        return trackIntegrityCoef;
    }

    public void setTrackIntegrityCoef(double trackIntegrityCoef) {
        this.trackIntegrityCoef = trackIntegrityCoef;
    }

    public double getEngineWorkDurationOnFields() {
        return engineWorkDurationOnFields;
    }

    public void setEngineWorkDurationOnFields(double engineWorkDurationOnFields) {
        this.engineWorkDurationOnFields = engineWorkDurationOnFields;
    }

    public double getEngineWorkDurationOnRoad() {
        return engineWorkDurationOnRoad;
    }

    public void setEngineWorkDurationOnRoad(double engineWorkDurationOnRoad) {
        this.engineWorkDurationOnRoad = engineWorkDurationOnRoad;
    }

    public double getLockedToEdit() {
        return lockedToEdit;
    }

    public void setLockedToEdit(double lockedToEdit) {
        this.lockedToEdit = lockedToEdit;
    }

    public double getLockedAt() {
        return lockedAt;
    }

    public void setLockedAt(double lockedAt) {
        this.lockedAt = lockedAt;
    }

    public short getPlanSpeedMin() {
        return planSpeedMin;
    }

    public void setPlanSpeedMin(short planSpeedMin) {
        this.planSpeedMin = planSpeedMin;
    }

    public short getPlanSpeedMax() {
        return planSpeedMax;
    }

    public void setPlanSpeedMax(short planSpeedMax) {
        this.planSpeedMax = planSpeedMax;
    }

    public double getStartFuelLevel() {
        return startFuelLevel;
    }

    public void setStartFuelLevel(double startFuelLevel) {
        this.startFuelLevel = startFuelLevel;
    }

    public double getEndFuelLevel() {
        return endFuelLevel;
    }

    public void setEndFuelLevel(double endFuelLevel) {
        this.endFuelLevel = endFuelLevel;
    }

    public double getRefuel() {
        return refuel;
    }

    public void setRefuel(double refuel) {
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

    public boolean isNotifyResponsibleUsers() {
        return notifyResponsibleUsers;
    }

    public void setNotifyResponsibleUsers(boolean notifyResponsibleUsers) {
        this.notifyResponsibleUsers = notifyResponsibleUsers;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MachineTask that = (MachineTask) o;
        return workForContractors == that.workForContractors && workForLandOwners == that.workForLandOwners && Double.compare(realImplementWidth, that.realImplementWidth) == 0 && Double.compare(totalDistance, that.totalDistance) == 0 && Double.compare(workDistance, that.workDistance) == 0 && Double.compare(workArea, that.workArea) == 0 && Double.compare(coveredArea, that.coveredArea) == 0 && Double.compare(manualCoveredArea, that.manualCoveredArea) == 0 && workDuration == that.workDuration && season == that.season && stopsOnRoadDuration == that.stopsOnRoadDuration && movementsOnRoadDuration == that.movementsOnRoadDuration && timeWithoutGpsData == that.timeWithoutGpsData && Double.compare(fuelConsumption, that.fuelConsumption) == 0 && Double.compare(fuelConsumptionPerHa, that.fuelConsumptionPerHa) == 0 && Double.compare(fuelConsumptionOnRoad, that.fuelConsumptionOnRoad) == 0 && Double.compare(fuelConsumptionOnRoadAverage, that.fuelConsumptionOnRoadAverage) == 0 && Double.compare(trackIntegrityCoef, that.trackIntegrityCoef) == 0 && Double.compare(engineWorkDurationOnFields, that.engineWorkDurationOnFields) == 0 && Double.compare(engineWorkDurationOnRoad, that.engineWorkDurationOnRoad) == 0 && Double.compare(lockedToEdit, that.lockedToEdit) == 0 && Double.compare(lockedAt, that.lockedAt) == 0 && planSpeedMin == that.planSpeedMin && planSpeedMax == that.planSpeedMax && Double.compare(startFuelLevel, that.startFuelLevel) == 0 && Double.compare(endFuelLevel, that.endFuelLevel) == 0 && Double.compare(refuel, that.refuel) == 0 && notifyResponsibleUsers == that.notifyResponsibleUsers && Objects.equals(id, that.id) && Objects.equals(machine, that.machine) && Objects.equals(startTime, that.startTime) && Objects.equals(endTime, that.endTime) && Objects.equals(actionType, that.actionType) && Objects.equals(actionSubtype, that.actionSubtype) && Objects.equals(workType, that.workType) && Objects.equals(driver, that.driver) && implementId == that.implementId && Objects.equals(additionalInfo, that.additionalInfo) && Objects.equals(description, that.description) && Objects.equals(externalId, that.externalId) && Objects.equals(status, that.status) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt);
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
