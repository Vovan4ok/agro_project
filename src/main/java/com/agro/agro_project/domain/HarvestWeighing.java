package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="harvest_weighings", schema="cropwise_data")
public class HarvestWeighing {
    @Id
    @Column(name="id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name="machine_id")
    private Machine machine;

    @ManyToOne
    @JoinColumn(name="field_id")
    private Field field;

    @ManyToOne
    @JoinColumn(name="weighing_place_id")
    private AdditionalObject weighingplace;

    @Column(name="type_of_route", length=30)
    private String typeOfRoute;

    @Column(name="departure_from_field_time")
    private Timestamp departureFromFieldTime;

    @Column(name="weight")
    private Double weight;

    @Column(name="brutto_weight")
    private Double bruttoWeight;

    @Column(name="seed_moisture")
    private Double seedMoisture;

    @Column(name="seed_admixture")
    private Double seedAdmixture;

    @Column(name="weighing_time")
    private Timestamp weighingTime;

    @Column(name="last_truck")
    private Boolean lastTruck;

    @Column(name="track_length")
    private Double trackLength;

    @Column(name="manually_set_track_length")
    private Boolean manuallySetTrackLength;

    @Column(name="additional_info")
    private String additionalInfo;

    @Column(name="description")
    private String description;

    @Column(name="season")
    private Short season;

    @ManyToOne
    @JoinColumn(name="created_by_user_id")
    private User createdBy;

    @Column(name="external_id", length=50)
    private String externalId;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    @Column(name="waybill_number", length=20)
    private String waybillNumber;

    @Column(name="waybill_date")
    private Date waybillDate;

    @Column(name="history_item_id")
    private Integer historyItemId;

    @Column(name="unloaded_machines")
    private String unloadedMachines;

    public HarvestWeighing(Integer id, Machine machine, Field field, AdditionalObject weighingplace, String typeOfRoute, Timestamp departureFromFieldTime, Double weight, Double bruttoWeight, Double seedMoisture, Double seedAdmixture, Timestamp weighingTime, Boolean lastTruck, Double trackLength, Boolean manuallySetTrackLength, String additionalInfo, String description, Short season, User createdBy, String externalId, Timestamp createdAt, Timestamp updatedAt, String waybillNumber, Date waybillDate, Integer historyItemId, String unloadedMachines) {
        this.id = id;
        this.machine = machine;
        this.field = field;
        this.weighingplace = weighingplace;
        this.typeOfRoute = typeOfRoute;
        this.departureFromFieldTime = departureFromFieldTime;
        this.weight = weight;
        this.bruttoWeight = bruttoWeight;
        this.seedMoisture = seedMoisture;
        this.seedAdmixture = seedAdmixture;
        this.weighingTime = weighingTime;
        this.lastTruck = lastTruck;
        this.trackLength = trackLength;
        this.manuallySetTrackLength = manuallySetTrackLength;
        this.additionalInfo = additionalInfo;
        this.description = description;
        this.season = season;
        this.createdBy = createdBy;
        this.externalId = externalId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.waybillNumber = waybillNumber;
        this.waybillDate = waybillDate;
        this.historyItemId = historyItemId;
        this.unloadedMachines = unloadedMachines;
    }

    public HarvestWeighing() {
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

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public AdditionalObject getWeighingplace() {
        return weighingplace;
    }

    public void setWeighingplace(AdditionalObject weighingPlace) {
        this.weighingplace = weighingPlace;
    }

    public String getTypeOfRoute() {
        return typeOfRoute;
    }

    public void setTypeOfRoute(String typeOfRoute) {
        this.typeOfRoute = typeOfRoute;
    }

    public Timestamp getDepartureFromFieldTime() {
        return departureFromFieldTime;
    }

    public void setDepartureFromFieldTime(Timestamp departureFromFieldTime) {
        this.departureFromFieldTime = departureFromFieldTime;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getBruttoWeight() {
        return bruttoWeight;
    }

    public void setBruttoWeight(Double bruttoWeight) {
        this.bruttoWeight = bruttoWeight;
    }

    public Double getSeedMoisture() {
        return seedMoisture;
    }

    public void setSeedMoisture(Double seedMoisture) {
        this.seedMoisture = seedMoisture;
    }

    public Double getSeedAdmixture() {
        return seedAdmixture;
    }

    public void setSeedAdmixture(Double seedAdmixture) {
        this.seedAdmixture = seedAdmixture;
    }

    public Timestamp getWeighingTime() {
        return weighingTime;
    }

    public void setWeighingTime(Timestamp weighingTime) {
        this.weighingTime = weighingTime;
    }

    public Boolean isLastTruck() {
        return lastTruck;
    }

    public void setLastTruck(Boolean lastTruck) {
        this.lastTruck = lastTruck;
    }

    public Double getTrackLength() {
        return trackLength;
    }

    public void setTrackLength(Double trackLength) {
        this.trackLength = trackLength;
    }

    public Boolean isManuallySetTrackLength() {
        return manuallySetTrackLength;
    }

    public void setManuallySetTrackLength(Boolean manuallySetTrackLength) {
        this.manuallySetTrackLength = manuallySetTrackLength;
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

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
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

    public String getWaybillNumber() {
        return waybillNumber;
    }

    public void setWaybillNumber(String waybillNumber) {
        this.waybillNumber = waybillNumber;
    }

    public Date getWaybillDate() {
        return waybillDate;
    }

    public void setWaybillDate(Date waybillDate) {
        this.waybillDate = waybillDate;
    }

    public Integer getHistoryItemId() {
        return historyItemId;
    }

    public void setHistoryItemId(Integer historyItemId) {
        this.historyItemId = historyItemId;
    }

    public String getUnloadedMachines() {
        return unloadedMachines;
    }

    public void setUnloadedMachines(String unloadedMachines) {
        this.unloadedMachines = unloadedMachines;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HarvestWeighing that = (HarvestWeighing) o;
        return Double.compare(weight, that.weight) == 0 && Double.compare(bruttoWeight, that.bruttoWeight) == 0 && Double.compare(seedMoisture, that.seedMoisture) == 0 && Double.compare(seedAdmixture, that.seedAdmixture) == 0 && lastTruck == that.lastTruck && Double.compare(trackLength, that.trackLength) == 0 && manuallySetTrackLength == that.manuallySetTrackLength && Objects.equals(season, that.season) && Objects.equals(historyItemId, that.historyItemId) && Objects.equals(id, that.id) && Objects.equals(machine, that.machine) && Objects.equals(field, that.field) && Objects.equals(weighingplace, that.weighingplace) && Objects.equals(typeOfRoute, that.typeOfRoute) && Objects.equals(departureFromFieldTime, that.departureFromFieldTime) && Objects.equals(weighingTime, that.weighingTime) && Objects.equals(additionalInfo, that.additionalInfo) && Objects.equals(description, that.description) && Objects.equals(createdBy, that.createdBy) && Objects.equals(externalId, that.externalId) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt) && Objects.equals(waybillNumber, that.waybillNumber) && Objects.equals(waybillDate, that.waybillDate) && Objects.equals(unloadedMachines, that.unloadedMachines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, machine, field, weighingplace, typeOfRoute, departureFromFieldTime, weight, bruttoWeight, seedMoisture, seedAdmixture, weighingTime, lastTruck, trackLength, manuallySetTrackLength, additionalInfo, description, season, createdBy, externalId, createdAt, updatedAt, waybillNumber, waybillDate, historyItemId, unloadedMachines);
    }

    @Override
    public String toString() {
        return "HarvestWeighing{" +
                "id=" + id +
                ", machine=" + machine +
                ", field=" + field +
                ", weighingPlace=" + weighingplace +
                ", typeOfRoute='" + typeOfRoute + '\'' +
                ", departureFromFieldTime=" + departureFromFieldTime +
                ", weight=" + weight +
                ", bruttoWeight=" + bruttoWeight +
                ", seedMoisture=" + seedMoisture +
                ", seedAdmixture=" + seedAdmixture +
                ", weighingTime=" + weighingTime +
                ", lastTruck=" + lastTruck +
                ", trackLength=" + trackLength +
                ", manuallySetTrackLength=" + manuallySetTrackLength +
                ", additionalInfo='" + additionalInfo + '\'' +
                ", description='" + description + '\'' +
                ", season=" + season +
                ", createdBy=" + createdBy +
                ", externalId='" + externalId + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", waybillNumber='" + waybillNumber + '\'' +
                ", waybillDate=" + waybillDate +
                ", historyItemId=" + historyItemId +
                ", unloadedMachines='" + unloadedMachines + '\'' +
                '}';
    }
}
