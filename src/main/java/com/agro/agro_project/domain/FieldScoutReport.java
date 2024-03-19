package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="field_scout_reports")
public class FieldScoutReport {
    @Id
    @Column(name="id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name="field_id")
    private Field field;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @Column(name="report_time")
    private Timestamp report_time;

    @Column(name="season")
    private short season;

    @Column(name="additional_info")
    @Lob
    private String additional_info;

    @ManyToOne
    @JoinColumn(name="growth_stage_id")
    private GrowthStage growthStage;

    @ManyToOne
    @JoinColumn(name="field_shape_id")
    private FieldShape fieldShape;

    @Column(name="ears_cover")
    private double ears_cover;

    @Column(name="plants_cover")
    private double plants_cover;

    @Column(name="ground_cover")
    private double ground_cover;

    @Column(name="created_by_user_at")
    private Timestamp created_by_user_at;

    @Column(name="updated_by_user_at")
    private Timestamp updated_by_user_at;

    @ManyToOne
    @JoinColumn(name="scouting_task_id")
    private ScoutingTask scoutingTask;

    @Column(name="scout_report_template_id")
    private int scout_report_template_id;

    @Column(name="external_id", length=50)
    private String external_id;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    @Column(name="idempotency_key", length=100)
    private String idempotency_key;

    @Column(name="history_item_id")
    private int history_item_id;

    @Column(name="x_custom_fields_data")
    private String x_custom_fields_data;

    public FieldScoutReport(Integer id, Field field, User user, Timestamp report_time, short season, String additional_info, GrowthStage growthStage, FieldShape fieldShape, double ears_cover, double plants_cover, double ground_cover, Timestamp created_by_user_at, Timestamp updated_by_user_at, ScoutingTask scoutingTask, int scout_report_template_id, String external_id, Timestamp created_at, Timestamp updated_at, String idempotency_key, int history_item_id, String x_custom_fields_data) {
        this.id = id;
        this.field = field;
        this.user = user;
        this.report_time = report_time;
        this.season = season;
        this.additional_info = additional_info;
        this.growthStage = growthStage;
        this.fieldShape = fieldShape;
        this.ears_cover = ears_cover;
        this.plants_cover = plants_cover;
        this.ground_cover = ground_cover;
        this.created_by_user_at = created_by_user_at;
        this.updated_by_user_at = updated_by_user_at;
        this.scoutingTask = scoutingTask;
        this.scout_report_template_id = scout_report_template_id;
        this.external_id = external_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.idempotency_key = idempotency_key;
        this.history_item_id = history_item_id;
        this.x_custom_fields_data = x_custom_fields_data;
    }

    public FieldScoutReport() {
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

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Timestamp getReport_time() {
        return report_time;
    }

    public void setReport_time(Timestamp report_time) {
        this.report_time = report_time;
    }

    public short getSeason() {
        return season;
    }

    public void setSeason(short season) {
        this.season = season;
    }

    public String getAdditional_info() {
        return additional_info;
    }

    public void setAdditional_info(String additional_info) {
        this.additional_info = additional_info;
    }

    public GrowthStage getGrowthStage() {
        return growthStage;
    }

    public void setGrowthStage(GrowthStage growthStage) {
        this.growthStage = growthStage;
    }

    public FieldShape getFieldShape() {
        return fieldShape;
    }

    public void setFieldShape(FieldShape fieldShape) {
        this.fieldShape = fieldShape;
    }

    public double getEars_cover() {
        return ears_cover;
    }

    public void setEars_cover(double ears_cover) {
        this.ears_cover = ears_cover;
    }

    public double getPlants_cover() {
        return plants_cover;
    }

    public void setPlants_cover(double plants_cover) {
        this.plants_cover = plants_cover;
    }

    public double getGround_cover() {
        return ground_cover;
    }

    public void setGround_cover(double ground_cover) {
        this.ground_cover = ground_cover;
    }

    public Timestamp getCreated_by_user_at() {
        return created_by_user_at;
    }

    public void setCreated_by_user_at(Timestamp created_by_user_at) {
        this.created_by_user_at = created_by_user_at;
    }

    public Timestamp getUpdated_by_user_at() {
        return updated_by_user_at;
    }

    public void setUpdated_by_user_at(Timestamp updated_by_user_at) {
        this.updated_by_user_at = updated_by_user_at;
    }

    public ScoutingTask getScoutingTask() {
        return scoutingTask;
    }

    public void setScoutingTask(ScoutingTask scoutingTask) {
        this.scoutingTask = scoutingTask;
    }

    public int getScout_report_template_id() {
        return scout_report_template_id;
    }

    public void setScout_report_template_id(int scout_report_template_id) {
        this.scout_report_template_id = scout_report_template_id;
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

    public String getIdempotency_key() {
        return idempotency_key;
    }

    public void setIdempotency_key(String idempotency_key) {
        this.idempotency_key = idempotency_key;
    }

    public int getHistory_item_id() {
        return history_item_id;
    }

    public void setHistory_item_id(int history_item_id) {
        this.history_item_id = history_item_id;
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
        FieldScoutReport that = (FieldScoutReport) o;
        return season == that.season && Double.compare(ears_cover, that.ears_cover) == 0 && Double.compare(plants_cover, that.plants_cover) == 0 && Double.compare(ground_cover, that.ground_cover) == 0 && scout_report_template_id == that.scout_report_template_id && history_item_id == that.history_item_id && Objects.equals(id, that.id) && Objects.equals(field, that.field) && Objects.equals(user, that.user) && Objects.equals(report_time, that.report_time) && Objects.equals(additional_info, that.additional_info) && Objects.equals(growthStage, that.growthStage) && Objects.equals(fieldShape, that.fieldShape) && Objects.equals(created_by_user_at, that.created_by_user_at) && Objects.equals(updated_by_user_at, that.updated_by_user_at) && Objects.equals(scoutingTask, that.scoutingTask) && Objects.equals(external_id, that.external_id) && Objects.equals(created_at, that.created_at) && Objects.equals(updated_at, that.updated_at) && Objects.equals(idempotency_key, that.idempotency_key) && Objects.equals(x_custom_fields_data, that.x_custom_fields_data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, field, user, report_time, season, additional_info, growthStage, fieldShape, ears_cover, plants_cover, ground_cover, created_by_user_at, updated_by_user_at, scoutingTask, scout_report_template_id, external_id, created_at, updated_at, idempotency_key, history_item_id, x_custom_fields_data);
    }

    @Override
    public String toString() {
        return "FieldScoutReport{" +
                "id=" + id +
                ", field=" + field +
                ", user=" + user +
                ", report_time=" + report_time +
                ", season=" + season +
                ", additional_info='" + additional_info + '\'' +
                ", growthStage=" + growthStage +
                ", fieldShape=" + fieldShape +
                ", ears_cover=" + ears_cover +
                ", plants_cover=" + plants_cover +
                ", ground_cover=" + ground_cover +
                ", created_by_user_at=" + created_by_user_at +
                ", updated_by_user_at=" + updated_by_user_at +
                ", scoutingTask=" + scoutingTask +
                ", scout_report_template_id=" + scout_report_template_id +
                ", external_id='" + external_id + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", idempotency_key='" + idempotency_key + '\'' +
                ", history_item_id=" + history_item_id +
                ", x_custom_fields_data='" + x_custom_fields_data + '\'' +
                '}';
    }
}
