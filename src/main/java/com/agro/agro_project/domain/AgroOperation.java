package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="agro_operations")
public class AgroOperation {
    @Id
    @Column
    private Integer id;

    @ManyToOne
    @JoinColumn(name="field_id")
    private Field field;

    @ManyToOne
    @JoinColumn(name="field_shape_id")
    private FieldShape fieldShape;

    @ManyToOne
    @JoinColumn(name="agri_work_plan_id")
    private AgriWorkPlan agriWorkPlan;

    @Column(name="applications_type", length=20)
    private String applications_type;

    @Column(name="operation_number", length=10)
    private String operation_number;

    @Column(name="custom_name", length=50)
    private String custom_name;

    @ManyToOne
    @JoinColumn(name="work_type_id")
    private WorkType workType;

    @Column(name="status", length=20)
    private String status;

    @Column(name="calc_by", length=10)
    private String calc_by;

    @Column(name="planned_area")
    private double planned_area;

    @Column(name="completed_area")
    private double completed_area;

    @Column(name="harvested_weight")
    private double harvested_weight;

    @Column(name="planned_start_date")
    private Date planned_start_date;

    @Column(name="planned_end_date")
    private Date planned_end_date;

    @Column(name="completed_date")
    private Date completed_date;

    @Column(name="completed_datetime")
    private Timestamp completed_datetime;

    @Column(name="season")
    private short season;

    @Column(name="planned_row_spacing")
    private double planned_row_spacing;

    @Column(name="planned_plant_spacing")
    private double planned_plant_spacing;

    @Column(name="planned_depth")
    private double planned_depth;

    @Column(name="planned_speed")
    private double planned_speed;

    @Column(name="planned_water_rate")
    private double planned_water_rate;

    @Column(name="fact_water_rate")
    private double fact_water_rate;

    @Column(name="covered_area")
    private double covered_area;

    @Column(name="covered_area_by_track")
    private double covered_area_by_track;

    @Column(name="machine_work_area")
    private double machine_work_area;

    @Column(name="additional_info")
    @Lob
    private String additional_info;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    @Column(name="external_id", length=50)
    private String external_id;

    @Column(name="actual_start_datetime")
    private Timestamp actual_start_datetime;

    @Column(name="agro_recommendation_id")
    private short agro_recommendation_id;

    @Column(name="locked_to_edit")
    private boolean locked_to_edit;

    @Column(name="idempotency_key", length=100)
    private String idempotency_key;

    @Column(name="locked_at", length=20)
    private String locked_at;

    @Column(name="control_threshing")
    private double control_threshing;

    @Column(name="humidity")
    private double humidity;

    @Column(name="protein_content")
    private double protein_content;

    @Column(name="oil_content")
    private double oil_content;

    @Column(name="history_item_id")
    private int history_item_id;

    @Column(name="notify_responsible_users")
    private boolean notify_responsible_users;

    @Column(name="x_custom_fields_data")
    @Lob
    private String x_custom_fields_data;

    public AgroOperation(Integer id, Field field, FieldShape fieldShape, AgriWorkPlan agriWorkPlan, String applications_type, String operation_number, String custom_name, WorkType workType, String status, String calc_by, double planned_area, double completed_area, double harvested_weight, Date planned_start_date, Date planned_end_date, Date completed_date, Timestamp completed_datetime, short season, double planned_row_spacing, double planned_plant_spacing, double planned_depth, double planned_speed, double planned_water_rate, double fact_water_rate, double covered_area, double covered_area_by_track, double machine_work_area, String additional_info, String description, Timestamp created_at, Timestamp updated_at, String external_id, Timestamp actual_start_datetime, short agro_recommendation_id, boolean locked_to_edit, String idempotency_key, String locked_at, double control_threshing, double humidity, double protein_content, double oil_content, int history_item_id, boolean notify_responsible_users, String x_custom_fields_data) {
        this.id = id;
        this.field = field;
        this.fieldShape = fieldShape;
        this.agriWorkPlan = agriWorkPlan;
        this.applications_type = applications_type;
        this.operation_number = operation_number;
        this.custom_name = custom_name;
        this.workType = workType;
        this.status = status;
        this.calc_by = calc_by;
        this.planned_area = planned_area;
        this.completed_area = completed_area;
        this.harvested_weight = harvested_weight;
        this.planned_start_date = planned_start_date;
        this.planned_end_date = planned_end_date;
        this.completed_date = completed_date;
        this.completed_datetime = completed_datetime;
        this.season = season;
        this.planned_row_spacing = planned_row_spacing;
        this.planned_plant_spacing = planned_plant_spacing;
        this.planned_depth = planned_depth;
        this.planned_speed = planned_speed;
        this.planned_water_rate = planned_water_rate;
        this.fact_water_rate = fact_water_rate;
        this.covered_area = covered_area;
        this.covered_area_by_track = covered_area_by_track;
        this.machine_work_area = machine_work_area;
        this.additional_info = additional_info;
        this.description = description;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.external_id = external_id;
        this.actual_start_datetime = actual_start_datetime;
        this.agro_recommendation_id = agro_recommendation_id;
        this.locked_to_edit = locked_to_edit;
        this.idempotency_key = idempotency_key;
        this.locked_at = locked_at;
        this.control_threshing = control_threshing;
        this.humidity = humidity;
        this.protein_content = protein_content;
        this.oil_content = oil_content;
        this.history_item_id = history_item_id;
        this.notify_responsible_users = notify_responsible_users;
        this.x_custom_fields_data = x_custom_fields_data;
    }

    public AgroOperation() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public FieldShape getFieldShape() {
        return fieldShape;
    }

    public void setFieldShape(FieldShape fieldShape) {
        this.fieldShape = fieldShape;
    }

    public AgriWorkPlan getAgriWorkPlan() {
        return agriWorkPlan;
    }

    public void setAgriWorkPlan(AgriWorkPlan agriWorkPlan) {
        this.agriWorkPlan = agriWorkPlan;
    }

    public String getApplications_type() {
        return applications_type;
    }

    public void setApplications_type(String applications_type) {
        this.applications_type = applications_type;
    }

    public String getOperation_number() {
        return operation_number;
    }

    public void setOperation_number(String operation_number) {
        this.operation_number = operation_number;
    }

    public String getCustom_name() {
        return custom_name;
    }

    public void setCustom_name(String custom_name) {
        this.custom_name = custom_name;
    }

    public WorkType getWorkType() {
        return workType;
    }

    public void setWorkType(WorkType workType) {
        this.workType = workType;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCalc_by() {
        return calc_by;
    }

    public void setCalc_by(String calc_by) {
        this.calc_by = calc_by;
    }

    public double getPlanned_area() {
        return planned_area;
    }

    public void setPlanned_area(double planned_area) {
        this.planned_area = planned_area;
    }

    public double getCompleted_area() {
        return completed_area;
    }

    public void setCompleted_area(double completed_area) {
        this.completed_area = completed_area;
    }

    public double getHarvested_weight() {
        return harvested_weight;
    }

    public void setHarvested_weight(double harvested_weight) {
        this.harvested_weight = harvested_weight;
    }

    public Date getPlanned_start_date() {
        return planned_start_date;
    }

    public void setPlanned_start_date(Date planned_start_date) {
        this.planned_start_date = planned_start_date;
    }

    public Date getPlanned_end_date() {
        return planned_end_date;
    }

    public void setPlanned_end_date(Date planned_end_date) {
        this.planned_end_date = planned_end_date;
    }

    public Date getCompleted_date() {
        return completed_date;
    }

    public void setCompleted_date(Date completed_date) {
        this.completed_date = completed_date;
    }

    public Timestamp getCompleted_datetime() {
        return completed_datetime;
    }

    public void setCompleted_datetime(Timestamp completed_datetime) {
        this.completed_datetime = completed_datetime;
    }

    public short getSeason() {
        return season;
    }

    public void setSeason(short season) {
        this.season = season;
    }

    public double getPlanned_row_spacing() {
        return planned_row_spacing;
    }

    public void setPlanned_row_spacing(double planned_row_spacing) {
        this.planned_row_spacing = planned_row_spacing;
    }

    public double getPlanned_plant_spacing() {
        return planned_plant_spacing;
    }

    public void setPlanned_plant_spacing(double planned_plant_spacing) {
        this.planned_plant_spacing = planned_plant_spacing;
    }

    public double getPlanned_depth() {
        return planned_depth;
    }

    public void setPlanned_depth(double planned_depth) {
        this.planned_depth = planned_depth;
    }

    public double getPlanned_speed() {
        return planned_speed;
    }

    public void setPlanned_speed(double planned_speed) {
        this.planned_speed = planned_speed;
    }

    public double getPlanned_water_rate() {
        return planned_water_rate;
    }

    public void setPlanned_water_rate(double planned_water_rate) {
        this.planned_water_rate = planned_water_rate;
    }

    public double getFact_water_rate() {
        return fact_water_rate;
    }

    public void setFact_water_rate(double fact_water_rate) {
        this.fact_water_rate = fact_water_rate;
    }

    public double getCovered_area() {
        return covered_area;
    }

    public void setCovered_area(double covered_area) {
        this.covered_area = covered_area;
    }

    public double getCovered_area_by_track() {
        return covered_area_by_track;
    }

    public void setCovered_area_by_track(double covered_area_by_track) {
        this.covered_area_by_track = covered_area_by_track;
    }

    public double getMachine_work_area() {
        return machine_work_area;
    }

    public void setMachine_work_area(double machine_work_area) {
        this.machine_work_area = machine_work_area;
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

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }

    public Timestamp getActual_start_datetime() {
        return actual_start_datetime;
    }

    public void setActual_start_datetime(Timestamp actual_start_datetime) {
        this.actual_start_datetime = actual_start_datetime;
    }

    public short getAgro_recommendation_id() {
        return agro_recommendation_id;
    }

    public void setAgro_recommendation_id(short agro_recommendation_id) {
        this.agro_recommendation_id = agro_recommendation_id;
    }

    public boolean isLocked_to_edit() {
        return locked_to_edit;
    }

    public void setLocked_to_edit(boolean locked_to_edit) {
        this.locked_to_edit = locked_to_edit;
    }

    public String getIdempotency_key() {
        return idempotency_key;
    }

    public void setIdempotency_key(String idempotency_key) {
        this.idempotency_key = idempotency_key;
    }

    public String getLocked_at() {
        return locked_at;
    }

    public void setLocked_at(String locked_at) {
        this.locked_at = locked_at;
    }

    public double getControl_threshing() {
        return control_threshing;
    }

    public void setControl_threshing(double control_threshing) {
        this.control_threshing = control_threshing;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getProtein_content() {
        return protein_content;
    }

    public void setProtein_content(double protein_content) {
        this.protein_content = protein_content;
    }

    public double getOil_content() {
        return oil_content;
    }

    public void setOil_content(double oil_content) {
        this.oil_content = oil_content;
    }

    public int getHistory_item_id() {
        return history_item_id;
    }

    public void setHistory_item_id(int history_item_id) {
        this.history_item_id = history_item_id;
    }

    public boolean isNotify_responsible_users() {
        return notify_responsible_users;
    }

    public void setNotify_responsible_users(boolean notify_responsible_users) {
        this.notify_responsible_users = notify_responsible_users;
    }

    public String getX_custom_fields_data() {
        return x_custom_fields_data;
    }

    public void setX_custom_fields_data(String x_custom_fields_data) {
        this.x_custom_fields_data = x_custom_fields_data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AgroOperation that = (AgroOperation) o;
        return Double.compare(planned_area, that.planned_area) == 0 && Double.compare(completed_area, that.completed_area) == 0 && Double.compare(harvested_weight, that.harvested_weight) == 0 && season == that.season && Double.compare(planned_row_spacing, that.planned_row_spacing) == 0 && Double.compare(planned_plant_spacing, that.planned_plant_spacing) == 0 && Double.compare(planned_depth, that.planned_depth) == 0 && Double.compare(planned_speed, that.planned_speed) == 0 && Double.compare(planned_water_rate, that.planned_water_rate) == 0 && Double.compare(fact_water_rate, that.fact_water_rate) == 0 && Double.compare(covered_area, that.covered_area) == 0 && Double.compare(covered_area_by_track, that.covered_area_by_track) == 0 && Double.compare(machine_work_area, that.machine_work_area) == 0 && agro_recommendation_id == that.agro_recommendation_id && locked_to_edit == that.locked_to_edit && Double.compare(control_threshing, that.control_threshing) == 0 && Double.compare(humidity, that.humidity) == 0 && Double.compare(protein_content, that.protein_content) == 0 && Double.compare(oil_content, that.oil_content) == 0 && history_item_id == that.history_item_id && notify_responsible_users == that.notify_responsible_users && Objects.equals(id, that.id) && Objects.equals(field, that.field) && Objects.equals(fieldShape, that.fieldShape) && Objects.equals(agriWorkPlan, that.agriWorkPlan) && Objects.equals(applications_type, that.applications_type) && Objects.equals(operation_number, that.operation_number) && Objects.equals(custom_name, that.custom_name) && Objects.equals(workType, that.workType) && Objects.equals(status, that.status) && Objects.equals(calc_by, that.calc_by) && Objects.equals(planned_start_date, that.planned_start_date) && Objects.equals(planned_end_date, that.planned_end_date) && Objects.equals(completed_date, that.completed_date) && Objects.equals(completed_datetime, that.completed_datetime) && Objects.equals(additional_info, that.additional_info) && Objects.equals(description, that.description) && Objects.equals(created_at, that.created_at) && Objects.equals(updated_at, that.updated_at) && Objects.equals(external_id, that.external_id) && Objects.equals(actual_start_datetime, that.actual_start_datetime) && Objects.equals(idempotency_key, that.idempotency_key) && Objects.equals(locked_at, that.locked_at) && Objects.equals(x_custom_fields_data, that.x_custom_fields_data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, field, fieldShape, agriWorkPlan, applications_type, operation_number, custom_name, workType, status, calc_by, planned_area, completed_area, harvested_weight, planned_start_date, planned_end_date, completed_date, completed_datetime, season, planned_row_spacing, planned_plant_spacing, planned_depth, planned_speed, planned_water_rate, fact_water_rate, covered_area, covered_area_by_track, machine_work_area, additional_info, description, created_at, updated_at, external_id, actual_start_datetime, agro_recommendation_id, locked_to_edit, idempotency_key, locked_at, control_threshing, humidity, protein_content, oil_content, history_item_id, notify_responsible_users, x_custom_fields_data);
    }

    @Override
    public String toString() {
        return "AgroOperation{" +
                "id=" + id +
                ", field=" + field +
                ", fieldShape=" + fieldShape +
                ", agriWorkPlan=" + agriWorkPlan +
                ", applications_type='" + applications_type + '\'' +
                ", operation_number='" + operation_number + '\'' +
                ", custom_name='" + custom_name + '\'' +
                ", workType=" + workType +
                ", status='" + status + '\'' +
                ", calc_by='" + calc_by + '\'' +
                ", planned_area=" + planned_area +
                ", completed_area=" + completed_area +
                ", harvested_weight=" + harvested_weight +
                ", planned_start_date=" + planned_start_date +
                ", planned_end_date=" + planned_end_date +
                ", completed_date=" + completed_date +
                ", completed_datetime=" + completed_datetime +
                ", season=" + season +
                ", planned_row_spacing=" + planned_row_spacing +
                ", planned_plant_spacing=" + planned_plant_spacing +
                ", planned_depth=" + planned_depth +
                ", planned_speed=" + planned_speed +
                ", planned_water_rate=" + planned_water_rate +
                ", fact_water_rate=" + fact_water_rate +
                ", covered_area=" + covered_area +
                ", covered_area_by_track=" + covered_area_by_track +
                ", machine_work_area=" + machine_work_area +
                ", additional_info='" + additional_info + '\'' +
                ", description='" + description + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", external_id='" + external_id + '\'' +
                ", actual_start_datetime=" + actual_start_datetime +
                ", agro_recommendation_id=" + agro_recommendation_id +
                ", locked_to_edit=" + locked_to_edit +
                ", idempotency_key='" + idempotency_key + '\'' +
                ", locked_at='" + locked_at + '\'' +
                ", control_threshing=" + control_threshing +
                ", humidity=" + humidity +
                ", protein_content=" + protein_content +
                ", oil_content=" + oil_content +
                ", history_item_id=" + history_item_id +
                ", notify_responsible_users=" + notify_responsible_users +
                ", x_custom_fields_data='" + x_custom_fields_data + '\'' +
                '}';
    }
}
