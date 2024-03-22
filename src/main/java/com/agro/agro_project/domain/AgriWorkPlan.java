package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="agri_work_plans", schema="cropwise_data")
public class AgriWorkPlan {
    @Id
    @Column(name="id")
    private Short id;

    @Column(name="status", length=20)
    private String status;

    @Column(name="work_type", length=20)
    private String workTypeString;

    @Column(name="work_subtype", length=50)
    private String workSubtype;

    @ManyToOne
    @JoinColumn(name="work_type_id")
    private WorkType workType;

    @Column(name="season")
    private Short season;

    @Column(name="planned_start_date")
    private Date plannedStartDate;

    @Column(name="planned_end_date")
    private Date plannedEndDate;

    @Column(name="additional_info")
    private String additionalInfo;

    @Column(name="description")
    private String description;

    @Column(name="planned_water_rate")
    private Double plannedWaterRate;

    @Column(name="planned_row_spacing")
    private Double plannedRowSpacing;

    @Column(name="planned_plant_spacing")
    private Double plannedPlantSpacing;

    @Column(name="planned_depth")
    private Double plannedDepth;

    @Column(name="planned_speed")
    private Double plannedSpeed;

    @Column(name="responsible_person_id")
    private Integer responsiblePersonId;

    @Column(name="external_id", length=50)
    private String externalId;

    @Column(name="groupable_id")
    private Short groupableId;

    @Column(name="groupable_type", length=20)
    private String groupableType;

    @Column(name="agro_recommendation_id")
    private Short agroRecommendationId;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    @Column(name="notify_responsible_users")
    private Boolean notifyResponsibleUsers;

    @ManyToOne
    @JoinColumn(name="current_season_id")
    private Season currentSeason;

    public AgriWorkPlan(Short id, String status, String workTypeString, String workSubtype, WorkType workType, Short season, Date plannedStartDate, Date plannedEndDate, String additionalInfo, String description, Double plannedWaterRate, Double plannedRowSpacing, Double plannedPlantSpacing, Double plannedDepth, Double plannedSpeed, Integer responsiblePersonId, String externalId, Short groupableId, String groupableType, Short agroRecommendationId, Timestamp createdAt, Timestamp updatedAt, Boolean notifyResponsibleUsers, Season currentSeason) {
        this.id = id;
        this.status = status;
        this.workTypeString = workTypeString;
        this.workSubtype = workSubtype;
        this.workType = workType;
        this.season = season;
        this.plannedStartDate = plannedStartDate;
        this.plannedEndDate = plannedEndDate;
        this.additionalInfo = additionalInfo;
        this.description = description;
        this.plannedWaterRate = plannedWaterRate;
        this.plannedRowSpacing = plannedRowSpacing;
        this.plannedPlantSpacing = plannedPlantSpacing;
        this.plannedDepth = plannedDepth;
        this.plannedSpeed = plannedSpeed;
        this.responsiblePersonId = responsiblePersonId;
        this.externalId = externalId;
        this.groupableId = groupableId;
        this.groupableType = groupableType;
        this.agroRecommendationId = agroRecommendationId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.notifyResponsibleUsers = notifyResponsibleUsers;
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

    public String getWorkTypeString() {
        return workTypeString;
    }

    public void setWorkTypeString(String workTypeString) {
        this.workTypeString = workTypeString;
    }

    public String getWorkSubtype() {
        return workSubtype;
    }

    public void setWorkSubtype(String workSubtype) {
        this.workSubtype = workSubtype;
    }

    public WorkType getWorkType() {
        return workType;
    }

    public void setWorkType(WorkType workType) {
        this.workType = workType;
    }

    public Short getSeason() {
        return season;
    }

    public void setSeason(Short season) {
        this.season = season;
    }

    public Date getPlannedStartDate() {
        return plannedStartDate;
    }

    public void setPlannedStartDate(Date plannedStartDate) {
        this.plannedStartDate = plannedStartDate;
    }

    public Date getPlannedEndDate() {
        return plannedEndDate;
    }

    public void setPlannedEndDate(Date plannedEndDate) {
        this.plannedEndDate = plannedEndDate;
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

    public Double getPlannedWaterRate() {
        return plannedWaterRate;
    }

    public void setPlannedWaterRate(Double plannedWaterRate) {
        this.plannedWaterRate = plannedWaterRate;
    }

    public Double getPlannedRowSpacing() {
        return plannedRowSpacing;
    }

    public void setPlannedRowSpacing(Double plannedRowSpacing) {
        this.plannedRowSpacing = plannedRowSpacing;
    }

    public Double getPlannedPlantSpacing() {
        return plannedPlantSpacing;
    }

    public void setPlannedPlantSpacing(Double plannedPlantSpacing) {
        this.plannedPlantSpacing = plannedPlantSpacing;
    }

    public Double getPlannedDepth() {
        return plannedDepth;
    }

    public void setPlannedDepth(Double plannedDepth) {
        this.plannedDepth = plannedDepth;
    }

    public Double getPlannedSpeed() {
        return plannedSpeed;
    }

    public void setPlannedSpeed(Double plannedSpeed) {
        this.plannedSpeed = plannedSpeed;
    }

    public Integer getResponsiblePersonId() {
        return responsiblePersonId;
    }

    public void setResponsiblePersonId(Integer responsiblePersonId) {
        this.responsiblePersonId = responsiblePersonId;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public Short getGroupableId() {
        return groupableId;
    }

    public void setGroupableId(Short groupableId) {
        this.groupableId = groupableId;
    }

    public String getGroupableType() {
        return groupableType;
    }

    public void setGroupableType(String groupableType) {
        this.groupableType = groupableType;
    }

    public Short getAgroRecommendationId() {
        return agroRecommendationId;
    }

    public void setAgroRecommendationId(Short agroRecommendationId) {
        this.agroRecommendationId = agroRecommendationId;
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
        return Objects.equals(season, that.season) && Double.compare(plannedWaterRate, that.plannedWaterRate) == 0 && Double.compare(plannedRowSpacing, that.plannedRowSpacing) == 0 && Double.compare(plannedPlantSpacing, that.plannedPlantSpacing) == 0 && Double.compare(plannedDepth, that.plannedDepth) == 0 && Double.compare(plannedSpeed, that.plannedSpeed) == 0 && Objects.equals(responsiblePersonId, that.responsiblePersonId) && Objects.equals(groupableId, that.groupableId) && Objects.equals(agroRecommendationId, that.agroRecommendationId) && notifyResponsibleUsers == that.notifyResponsibleUsers && Objects.equals(id, that.id) && Objects.equals(status, that.status) && Objects.equals(workTypeString, that.workTypeString) && Objects.equals(workSubtype, that.workSubtype) && Objects.equals(workType, that.workType) && Objects.equals(plannedStartDate, that.plannedStartDate) && Objects.equals(plannedEndDate, that.plannedEndDate) && Objects.equals(additionalInfo, that.additionalInfo) && Objects.equals(description, that.description) && Objects.equals(externalId, that.externalId) && Objects.equals(groupableType, that.groupableType) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt) && Objects.equals(currentSeason, that.currentSeason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, status, workTypeString, workSubtype, workTypeString, season, plannedStartDate, plannedEndDate, additionalInfo, description, plannedWaterRate, plannedRowSpacing, plannedPlantSpacing, plannedDepth, plannedSpeed, responsiblePersonId, externalId, groupableId, groupableType, agroRecommendationId, createdAt, updatedAt, notifyResponsibleUsers, currentSeason);
    }

    @Override
    public String toString() {
        return "AgriWorkPlan{" +
                "id=" + id +
                ", status='" + status + '\'' +
                ", workTypeString='" + workTypeString + '\'' +
                ", workSubtype='" + workSubtype + '\'' +
                ", workType=" + workType +
                ", season=" + season +
                ", plannedStartDate=" + plannedStartDate +
                ", plannedEndDate=" + plannedEndDate +
                ", additionalInfo='" + additionalInfo + '\'' +
                ", description='" + description + '\'' +
                ", plannedWaterRate=" + plannedWaterRate +
                ", plannedRowSpacing=" + plannedRowSpacing +
                ", plannedPlantSpacing=" + plannedPlantSpacing +
                ", plannedDepth=" + plannedDepth +
                ", plannedSpeed=" + plannedSpeed +
                ", responsiblePersonId=" + responsiblePersonId +
                ", externalId='" + externalId + '\'' +
                ", groupableId=" + groupableId +
                ", groupableType='" + groupableType + '\'' +
                ", agroRecommendationId=" + agroRecommendationId +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", notifyResponsibleUsers=" + notifyResponsibleUsers +
                ", currentSeason=" + currentSeason +
                '}';
    }
}
