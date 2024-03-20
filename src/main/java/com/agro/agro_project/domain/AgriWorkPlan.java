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
    private String workTypeString;

    @Column(name="work_subtype", length=50)
    private String workSubtype;

    @ManyToOne
    @JoinColumn(name="work_type_id")
    private WorkType workType;

    @Column(name="season")
    private short season;

    @Column(name="planned_start_date")
    private Date plannedStartDate;

    @Column(name="planned_end_date")
    private Date plannedEndDate;

    @Column(name="additional_info")
    @Lob
    private String additionalInfo;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="planned_water_rate")
    private double plannedWaterRate;

    @Column(name="planned_row_spacing")
    private double plannedRowSpacing;

    @Column(name="planned_plant_spacing")
    private double plannedPlantSpacing;

    @Column(name="planned_depth")
    private double plannedDepth;

    @Column(name="planned_speed")
    private double plannedSpeed;

    @Column(name="responsible_person_id")
    private int responsiblePersonId;

    @Column(name="external_id", length=50)
    private String externalId;

    @Column(name="groupable_id")
    private short groupableId;

    @Column(name="groupable_type", length=20)
    private String groupableType;

    @Column(name="agro_recommendation_id")
    private short agroRecommendationId;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    @Column(name="notify_responsible_users")
    private boolean notifyResponsibleUsers;

    @ManyToOne
    @JoinColumn(name="current_season_id")
    private Season currentSeason;

    public AgriWorkPlan(Short id, String status, String workTypeString, String workSubtype, WorkType workType, short season, Date plannedStartDate, Date plannedEndDate, String additionalInfo, String description, double plannedWaterRate, double plannedRowSpacing, double plannedPlantSpacing, double plannedDepth, double plannedSpeed, int responsiblePersonId, String externalId, short groupableId, String groupableType, short agroRecommendationId, Timestamp createdAt, Timestamp updatedAt, boolean notifyResponsibleUsers, Season currentSeason) {
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

    public short getSeason() {
        return season;
    }

    public void setSeason(short season) {
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

    public double getPlannedWaterRate() {
        return plannedWaterRate;
    }

    public void setPlannedWaterRate(double plannedWaterRate) {
        this.plannedWaterRate = plannedWaterRate;
    }

    public double getPlannedRowSpacing() {
        return plannedRowSpacing;
    }

    public void setPlannedRowSpacing(double plannedRowSpacing) {
        this.plannedRowSpacing = plannedRowSpacing;
    }

    public double getPlannedPlantSpacing() {
        return plannedPlantSpacing;
    }

    public void setPlannedPlantSpacing(double plannedPlantSpacing) {
        this.plannedPlantSpacing = plannedPlantSpacing;
    }

    public double getPlannedDepth() {
        return plannedDepth;
    }

    public void setPlannedDepth(double plannedDepth) {
        this.plannedDepth = plannedDepth;
    }

    public double getPlannedSpeed() {
        return plannedSpeed;
    }

    public void setPlannedSpeed(double plannedSpeed) {
        this.plannedSpeed = plannedSpeed;
    }

    public int getResponsiblePersonId() {
        return responsiblePersonId;
    }

    public void setResponsiblePersonId(int responsiblePersonId) {
        this.responsiblePersonId = responsiblePersonId;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public short getGroupableId() {
        return groupableId;
    }

    public void setGroupableId(short groupableId) {
        this.groupableId = groupableId;
    }

    public String getGroupableType() {
        return groupableType;
    }

    public void setGroupableType(String groupableType) {
        this.groupableType = groupableType;
    }

    public short getAgroRecommendationId() {
        return agroRecommendationId;
    }

    public void setAgroRecommendationId(short agroRecommendationId) {
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

    public boolean isNotifyResponsibleUsers() {
        return notifyResponsibleUsers;
    }

    public void setNotifyResponsibleUsers(boolean notifyResponsibleUsers) {
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
        return season == that.season && Double.compare(plannedWaterRate, that.plannedWaterRate) == 0 && Double.compare(plannedRowSpacing, that.plannedRowSpacing) == 0 && Double.compare(plannedPlantSpacing, that.plannedPlantSpacing) == 0 && Double.compare(plannedDepth, that.plannedDepth) == 0 && Double.compare(plannedSpeed, that.plannedSpeed) == 0 && responsiblePersonId == that.responsiblePersonId && groupableId == that.groupableId && agroRecommendationId == that.agroRecommendationId && notifyResponsibleUsers == that.notifyResponsibleUsers && Objects.equals(id, that.id) && Objects.equals(status, that.status) && Objects.equals(workTypeString, that.workTypeString) && Objects.equals(workSubtype, that.workSubtype) && Objects.equals(workTypeString, that.workTypeString) && Objects.equals(plannedStartDate, that.plannedStartDate) && Objects.equals(plannedEndDate, that.plannedEndDate) && Objects.equals(additionalInfo, that.additionalInfo) && Objects.equals(description, that.description) && Objects.equals(externalId, that.externalId) && Objects.equals(groupableType, that.groupableType) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt) && Objects.equals(currentSeason, that.currentSeason);
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
