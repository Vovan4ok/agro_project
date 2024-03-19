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
    private AdditionalObject weighingPlace;

    @Column(name="type_of_route", length=30)
    private String type_of_route;

    @Column(name="departure_from_field_time")
    private Timestamp departure_from_field_time;

    @Column(name="weight")
    private double weight;

    @Column(name="brutto_weight")
    private double brutto_weight;

    @Column(name="seed_moisture")
    private double seed_moisture;

    @Column(name="seed_admixture")
    private double seed_admixture;

    @Column(name="weighing_time")
    private Timestamp weighing_time;

    @Column(name="last_truck")
    private boolean last_truck;

    @Column(name="track_length")
    private double track_length;

    @Column(name="manually_set_track_length")
    private boolean manually_set_track_length;

    @Column(name="additional_info")
    @Lob
    private String additional_info;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="season")
    private short season;

    @ManyToOne
    @JoinColumn(name="created_by_user_id")
    private User createdBy;

    @Column(name="external_id", length=50)
    private String external_id;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    @Column(name="waybill_number", length=20)
    private String waybill_number;

    @Column(name="waybill_date")
    private Date waybill_date;

    @Column(name="history_item_id")
    private int history_item_id;

    @Column(name="unloaded_machines")
    @Lob
    private String unloaded_machines;

    public HarvestWeighing(Integer id, Machine machine, Field field, AdditionalObject weighingPlace, String type_of_route, Timestamp departure_from_field_time, double weight, double brutto_weight, double seed_moisture, double seed_admixture, Timestamp weighing_time, boolean last_truck, double truck_length, boolean manually_set_track_length, String additional_info, String description, short season, User createdBy, String external_id, Timestamp created_at, Timestamp updated_at, String waybill_number, Date waybill_date, int history_item_id, String unloaded_machines) {
        this.id = id;
        this.machine = machine;
        this.field = field;
        this.weighingPlace = weighingPlace;
        this.type_of_route = type_of_route;
        this.departure_from_field_time = departure_from_field_time;
        this.weight = weight;
        this.brutto_weight = brutto_weight;
        this.seed_moisture = seed_moisture;
        this.seed_admixture = seed_admixture;
        this.weighing_time = weighing_time;
        this.last_truck = last_truck;
        this.track_length = truck_length;
        this.manually_set_track_length = manually_set_track_length;
        this.additional_info = additional_info;
        this.description = description;
        this.season = season;
        this.createdBy = createdBy;
        this.external_id = external_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.waybill_number = waybill_number;
        this.waybill_date = waybill_date;
        this.history_item_id = history_item_id;
        this.unloaded_machines = unloaded_machines;
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

    public AdditionalObject getWeighingPlace() {
        return weighingPlace;
    }

    public void setWeighingPlace(AdditionalObject weighingPlace) {
        this.weighingPlace = weighingPlace;
    }

    public String getType_of_route() {
        return type_of_route;
    }

    public void setType_of_route(String type_of_route) {
        this.type_of_route = type_of_route;
    }

    public Timestamp getDeparture_from_field_time() {
        return departure_from_field_time;
    }

    public void setDeparture_from_field_time(Timestamp departure_from_field_time) {
        this.departure_from_field_time = departure_from_field_time;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getBrutto_weight() {
        return brutto_weight;
    }

    public void setBrutto_weight(double brutto_weight) {
        this.brutto_weight = brutto_weight;
    }

    public double getSeed_moisture() {
        return seed_moisture;
    }

    public void setSeed_moisture(double seed_moisture) {
        this.seed_moisture = seed_moisture;
    }

    public double getSeed_admixture() {
        return seed_admixture;
    }

    public void setSeed_admixture(double seed_admixture) {
        this.seed_admixture = seed_admixture;
    }

    public Timestamp getWeighing_time() {
        return weighing_time;
    }

    public void setWeighing_time(Timestamp weighing_time) {
        this.weighing_time = weighing_time;
    }

    public boolean isLast_truck() {
        return last_truck;
    }

    public void setLast_truck(boolean last_truck) {
        this.last_truck = last_truck;
    }

    public double getTrack_length() {
        return track_length;
    }

    public void setTrack_length(double truck_length) {
        this.track_length = truck_length;
    }

    public boolean isManually_set_track_length() {
        return manually_set_track_length;
    }

    public void setManually_set_track_length(boolean manually_set_track_length) {
        this.manually_set_track_length = manually_set_track_length;
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

    public User getCreatedBy() {
        return createdBy;
    }

    public void setCreatedBy(User createdBy) {
        this.createdBy = createdBy;
    }

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
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

    public String getWaybill_number() {
        return waybill_number;
    }

    public void setWaybill_number(String waybill_number) {
        this.waybill_number = waybill_number;
    }

    public Date getWaybill_date() {
        return waybill_date;
    }

    public void setWaybill_date(Date waybill_date) {
        this.waybill_date = waybill_date;
    }

    public int getHistory_item_id() {
        return history_item_id;
    }

    public void setHistory_item_id(int history_item_id) {
        this.history_item_id = history_item_id;
    }

    public String getUnloaded_machines() {
        return unloaded_machines;
    }

    public void setUnloaded_machines(String unloaded_machines) {
        this.unloaded_machines = unloaded_machines;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HarvestWeighing that = (HarvestWeighing) o;
        return Double.compare(weight, that.weight) == 0 && Double.compare(brutto_weight, that.brutto_weight) == 0 && Double.compare(seed_moisture, that.seed_moisture) == 0 && Double.compare(seed_admixture, that.seed_admixture) == 0 && last_truck == that.last_truck && Double.compare(track_length, that.track_length) == 0 && manually_set_track_length == that.manually_set_track_length && season == that.season && history_item_id == that.history_item_id && Objects.equals(id, that.id) && Objects.equals(machine, that.machine) && Objects.equals(field, that.field) && Objects.equals(weighingPlace, that.weighingPlace) && Objects.equals(type_of_route, that.type_of_route) && Objects.equals(departure_from_field_time, that.departure_from_field_time) && Objects.equals(weighing_time, that.weighing_time) && Objects.equals(additional_info, that.additional_info) && Objects.equals(description, that.description) && Objects.equals(createdBy, that.createdBy) && Objects.equals(external_id, that.external_id) && Objects.equals(created_at, that.created_at) && Objects.equals(updated_at, that.updated_at) && Objects.equals(waybill_number, that.waybill_number) && Objects.equals(waybill_date, that.waybill_date) && Objects.equals(unloaded_machines, that.unloaded_machines);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, machine, field, weighingPlace, type_of_route, departure_from_field_time, weight, brutto_weight, seed_moisture, seed_admixture, weighing_time, last_truck, track_length, manually_set_track_length, additional_info, description, season, createdBy, external_id, created_at, updated_at, waybill_number, waybill_date, history_item_id, unloaded_machines);
    }

    @Override
    public String toString() {
        return "HarvestWeighing{" +
                "id=" + id +
                ", machine=" + machine +
                ", field=" + field +
                ", weighingPlace=" + weighingPlace +
                ", type_of_route='" + type_of_route + '\'' +
                ", departure_from_field_time=" + departure_from_field_time +
                ", weight=" + weight +
                ", brutto_weight=" + brutto_weight +
                ", seed_moisture=" + seed_moisture +
                ", seed_admixture=" + seed_admixture +
                ", weighing_time=" + weighing_time +
                ", last_truck=" + last_truck +
                ", track_length=" + track_length +
                ", manually_set_track_length=" + manually_set_track_length +
                ", additional_info='" + additional_info + '\'' +
                ", description='" + description + '\'' +
                ", season=" + season +
                ", createdBy=" + createdBy +
                ", external_id='" + external_id + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", waybill_number='" + waybill_number + '\'' +
                ", waybill_date=" + waybill_date +
                ", history_item_id=" + history_item_id +
                ", unloaded_machines='" + unloaded_machines + '\'' +
                '}';
    }
}
