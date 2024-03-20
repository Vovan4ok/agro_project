package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="harvest_weighings")
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
    private double weight;

    @Column(name="brutto_weight")
    private double bruttoWeight;

    @Column(name="seed_moisture")
    private double seedMoisture;

    @Column(name="seed_admixture")
    private double seedAdmixture;

    @Column(name="weighing_time")
    private Timestamp weighingTime;

    @Column(name="last_truck")
    private boolean lastTruck;

    @Column(name="track_length")
    private double trackLength;

    @Column(name="manually_set_track_length")
    private boolean manuallySetTrackLength;

    @Column(name="additional_info")
    @Lob
    private String additionalInfo;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="season")
    private short season;

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
    private int historyItemId;

    @Column(name="unloaded_machines")
    @Lob
    private String unloadedMachines;

    public HarvestWeighing(Integer id, Machine machine, Field field, AdditionalObject weighingplace, String typeOfRoute, Timestamp departureFromFieldTime, double weight, double bruttoWeight, double seedMoisture, double seedAdmixture, Timestamp weighingTime, boolean lastTruck, double trackLength, boolean manuallySetTrackLength, String additionalInfo, String description, short season, User createdBy, String externalId, Timestamp createdAt, Timestamp updatedAt, String waybillNumber, Date waybillDate, int historyItemId, String unloadedMachines) {
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

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBruttoWeight() {
        return bruttoWeight;
    }

    public void setBruttoWeight(double bruttoWeight) {
        this.bruttoWeight = bruttoWeight;
    }

    public double getSeedMoisture() {
        return seedMoisture;
    }

    public void setSeedMoisture(double seedMoisture) {
        this.seedMoisture = seedMoisture;
    }

    public double getSeedAdmixture() {
        return seedAdmixture;
    }

    public void setSeedAdmixture(double seedAdmixture) {
        this.seedAdmixture = seedAdmixture;
    }

    public Timestamp getWeighingTime() {
        return weighingTime;
    }

    public void setWeighingTime(Timestamp weighingTime) {
        this.weighingTime = weighingTime;
    }

    public boolean isLastTruck() {
        return lastTruck;
    }

    public void setLastTruck(boolean lastTruck) {
        this.lastTruck = lastTruck;
    }

    public double getTrackLength() {
        return trackLength;
    }

    public void setTrackLength(double trackLength) {
        this.trackLength = trackLength;
    }

    public boolean isManuallySetTrackLength() {
        return manuallySetTrackLength;
    }

    public void setManuallySetTrackLength(boolean manuallySetTrackLength) {
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

    public short getSeason() {
        return season;
    }

    public void setSeason(short season) {
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

    public int getHistoryItemId() {
        return historyItemId;
    }

    public void setHistoryItemId(int historyItemId) {
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
        return Double.compare(weight, that.weight) == 0 && Double.compare(bruttoWeight, that.bruttoWeight) == 0 && Double.compare(seedMoisture, that.seedMoisture) == 0 && Double.compare(seedAdmixture, that.seedAdmixture) == 0 && lastTruck == that.lastTruck && Double.compare(trackLength, that.trackLength) == 0 && manuallySetTrackLength == that.manuallySetTrackLength && season == that.season && historyItemId == that.historyItemId && Objects.equals(id, that.id) && Objects.equals(machine, that.machine) && Objects.equals(field, that.field) && Objects.equals(weighingplace, that.weighingplace) && Objects.equals(typeOfRoute, that.typeOfRoute) && Objects.equals(departureFromFieldTime, that.departureFromFieldTime) && Objects.equals(weighingTime, that.weighingTime) && Objects.equals(additionalInfo, that.additionalInfo) && Objects.equals(description, that.description) && Objects.equals(createdBy, that.createdBy) && Objects.equals(externalId, that.externalId) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt) && Objects.equals(waybillNumber, that.waybillNumber) && Objects.equals(waybillDate, that.waybillDate) && Objects.equals(unloadedMachines, that.unloadedMachines);
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
