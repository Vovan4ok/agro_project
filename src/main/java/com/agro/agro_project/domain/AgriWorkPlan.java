package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="agri_work_plans")
public class AgriWorkPlan {
    @Id
    @Column(name="id")
    private Short id;

    @Column(name="status", length=20)
    private String status;

    @Column(name="work_type", length=20)
    private String work_type;

    @Column(name="work_subtype", length=50)
    private String work_subtype;

    @ManyToOne
    @JoinColumn(name="work_type_id")
    private WorkType workType;

    @Column(name="season")
    private short season;

    @Column(name="planned_start_date")
    private Date planned_start_date;

    @Column(name="planned_end_date")
    private Date planned_end_date;

    @Column(name="additional_info")
    @Lob
    private String additional_info;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="planned_water_rate")
    private double planned_water_rate;

    @Column(name="planned_row_spacing")
    private double planned_row_spacing;

    @Column(name="planned_plant_spacing")
    private double planned_plant_spacing;

    @Column(name="planned_depth")
    private double planned_depth;

    @Column(name="planned_speed")
    private double planned_speed;

    @Column(name="responsible_person_id")
    private int responsible_person_id;

    @Column(name="external_id", length=50)
    private String external_id;

    @Column(name="groupable_id")
    private short groupable_id;

    @Column(name="groupable_type", length=20)
    private String groupable_type;

    @Column(name="agro_recommendation_id")
    private short agro_recommendation_id;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    @Column(name="notify_responsible_users")
    private boolean notify_responsible_users;

    @ManyToOne
    @JoinColumn(name="current_season_id")
    private Season currentSeason;

    public AgriWorkPlan(Short id, String status, String work_type, String work_subtype, WorkType workType, short season, Date planned_start_date, Date planned_end_date, String additional_info, String description, double planned_water_rate, double planned_row_spacing, double planned_plant_spacing, double planned_depth, double planned_speed, int responsible_person_id, String external_id, short groupable_id, String groupable_type, short agro_recommendation_id, Timestamp created_at, Timestamp updated_at, boolean notify_responsible_users, Season currentSeason) {
        this.id = id;
        this.status = status;
        this.work_type = work_type;
        this.work_subtype = work_subtype;
        this.workType = workType;
        this.season = season;
        this.planned_start_date = planned_start_date;
        this.planned_end_date = planned_end_date;
        this.additional_info = additional_info;
        this.description = description;
        this.planned_water_rate = planned_water_rate;
        this.planned_row_spacing = planned_row_spacing;
        this.planned_plant_spacing = planned_plant_spacing;
        this.planned_depth = planned_depth;
        this.planned_speed = planned_speed;
        this.responsible_person_id = responsible_person_id;
        this.external_id = external_id;
        this.groupable_id = groupable_id;
        this.groupable_type = groupable_type;
        this.agro_recommendation_id = agro_recommendation_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.notify_responsible_users = notify_responsible_users;
        this.currentSeason = currentSeason;
    }

    public AgriWorkPlan() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getWork_type() {
        return work_type;
    }

    public void setWork_type(String work_type) {
        this.work_type = work_type;
    }

    public String getWork_subtype() {
        return work_subtype;
    }

    public void setWork_subtype(String work_subtype) {
        this.work_subtype = work_subtype;
    }

    public WorkType getWorkType() {
        return workType;
    }

    public void setWorkType(WorkType workType) {
        this.workType = workType;
    }

    public short getSeason() {
        return season;
    }

    public void setSeason(short season) {
        this.season = season;
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

    public double getPlanned_water_rate() {
        return planned_water_rate;
    }

    public void setPlanned_water_rate(double planned_water_rate) {
        this.planned_water_rate = planned_water_rate;
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

    public int getResponsible_person_id() {
        return responsible_person_id;
    }

    public void setResponsible_person_id(int responsible_person_id) {
        this.responsible_person_id = responsible_person_id;
    }

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }

    public short getGroupable_id() {
        return groupable_id;
    }

    public void setGroupable_id(short groupable_id) {
        this.groupable_id = groupable_id;
    }

    public String getGroupable_type() {
        return groupable_type;
    }

    public void setGroupable_type(String groupable_type) {
        this.groupable_type = groupable_type;
    }

    public short getAgro_recommendation_id() {
        return agro_recommendation_id;
    }

    public void setAgro_recommendation_id(short agro_recommendation_id) {
        this.agro_recommendation_id = agro_recommendation_id;
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

    public Season getCurrentSeason() {
        return currentSeason;
    }

    public void setCurrentSeason(Season currentSeason) {
        this.currentSeason = currentSeason;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AgriWorkPlan that = (AgriWorkPlan) o;
        return season == that.season && Double.compare(planned_water_rate, that.planned_water_rate) == 0 && Double.compare(planned_row_spacing, that.planned_row_spacing) == 0 && Double.compare(planned_plant_spacing, that.planned_plant_spacing) == 0 && Double.compare(planned_depth, that.planned_depth) == 0 && Double.compare(planned_speed, that.planned_speed) == 0 && responsible_person_id == that.responsible_person_id && groupable_id == that.groupable_id && agro_recommendation_id == that.agro_recommendation_id && notify_responsible_users == that.notify_responsible_users && Objects.equals(id, that.id) && Objects.equals(status, that.status) && Objects.equals(work_type, that.work_type) && Objects.equals(work_subtype, that.work_subtype) && Objects.equals(workType, that.workType) && Objects.equals(planned_start_date, that.planned_start_date) && Objects.equals(planned_end_date, that.planned_end_date) && Objects.equals(additional_info, that.additional_info) && Objects.equals(description, that.description) && Objects.equals(external_id, that.external_id) && Objects.equals(groupable_type, that.groupable_type) && Objects.equals(created_at, that.created_at) && Objects.equals(updated_at, that.updated_at) && Objects.equals(currentSeason, that.currentSeason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, work_type, work_subtype, workType, season, planned_start_date, planned_end_date, additional_info, description, planned_water_rate, planned_row_spacing, planned_plant_spacing, planned_depth, planned_speed, responsible_person_id, external_id, groupable_id, groupable_type, agro_recommendation_id, created_at, updated_at, notify_responsible_users, currentSeason);
    }

    @Override
    public String toString() {
        return "AgriWorkPlan{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", work_type='" + work_type + '\'' +
                ", work_subtype='" + work_subtype + '\'' +
                ", workType=" + workType +
                ", season=" + season +
                ", planned_start_date=" + planned_start_date +
                ", planned_end_date=" + planned_end_date +
                ", additional_info='" + additional_info + '\'' +
                ", description='" + description + '\'' +
                ", planned_water_rate=" + planned_water_rate +
                ", planned_row_spacing=" + planned_row_spacing +
                ", planned_plant_spacing=" + planned_plant_spacing +
                ", planned_depth=" + planned_depth +
                ", planned_speed=" + planned_speed +
                ", responsible_person_id=" + responsible_person_id +
                ", external_id='" + external_id + '\'' +
                ", groupable_id=" + groupable_id +
                ", groupable_type='" + groupable_type + '\'' +
                ", agro_recommendation_id=" + agro_recommendation_id +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", notify_responsible_users=" + notify_responsible_users +
                ", currentSeason=" + currentSeason +
                '}';
    }
}
