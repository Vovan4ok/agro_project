package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="agro_operations", schema="cropwise_data")
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
    private String applicationsType;

    @Column(name="operation_number", length=10)
    private String operationNumber;

    @Column(name="custom_name", length=50)
    private String customName;

    @ManyToOne
    @JoinColumn(name="work_type_id")
    private WorkType workType;

    @Column(name="status", length=20)
    private String status;

    @Column(name="calc_by", length=10)
    private String calcBy;

    @Column(name="planned_area")
    private Double plannedArea;

    @Column(name="completed_area")
    private Double completedArea;

    @Column(name="harvested_weight")
    private Double harvestedWeight;

    @Column(name="planned_start_date")
    private Date plannedStartDate;

    @Column(name="planned_end_date")
    private Date plannedEndDate;

    @Column(name="completed_date")
    private Date completedDate;

    @Column(name="completed_datetime")
    private Timestamp completedDatetime;

    @Column(name="season")
    private Short season;

    @Column(name="planned_row_spacing")
    private Double plannedRowSpacing;

    @Column(name="planned_plant_spacing")
    private Double plannedPlantSpacing;

    @Column(name="planned_depth")
    private Double plannedDepth;

    @Column(name="planned_speed")
    private Double plannedSpeed;

    @Column(name="planned_water_rate")
    private Double plannedWaterRate;

    @Column(name="fact_water_rate")
    private Double factWaterRate;

    @Column(name="covered_area")
    private Double coveredArea;

    @Column(name="covered_area_by_track")
    private Double coveredAreaByTrack;

    @Column(name="machine_work_area")
    private Double machineWorkArea;

    @Column(name="additional_info")
    private String additionalInfo;

    @Column(name="description")
    private String description;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    @Column(name="external_id", length=50)
    private String externalId;

    @Column(name="actual_start_datetime")
    private Timestamp actualStartDatetime;

    @Column(name="agro_recommendation_id")
    private Short agroRecommendationId;

    @Column(name="locked_to_edit")
    private Boolean lockedToEdit;

    @Column(name="idempotency_key", length=100)
    private String idempotencyKey;

    @Column(name="locked_at", length=20)
    private String lockedAt;

    @Column(name="control_threshing")
    private Double controlThreshing;

    @Column(name="humidity")
    private Double humidity;

    @Column(name="protein_content")
    private Double proteinContent;

    @Column(name="oil_content")
    private Double oilContent;

    @Column(name="history_item_id")
    private Integer historyItemId;

    @Column(name="notify_responsible_users")
    private Boolean notifyResponsibleUsers;

    @Column(name="x_custom_fields_data")
    private String xCustomFieldsData;

    public AgroOperation(Integer id, Field field, FieldShape fieldShape, AgriWorkPlan agriWorkPlan, String applicationsType, String operationNumber, String customName, WorkType workType, String status, String calcBy, Double plannedArea, Double completedArea, Double harvestedWeight, Date plannedStartDate, Date plannedEndDate, Date completedDate, Timestamp completedDatetime, Short season, Double plannedRowSpacing, Double plannedPlantSpacing, Double plannedDepth, Double plannedSpeed, Double plannedWaterRate, Double factWaterRate, Double coveredArea, Double coveredAreaByTrack, Double machineWorkArea, String additionalInfo, String description, Timestamp createdAt, Timestamp updatedAt, String externalId, Timestamp actualStartDatetime, Short agroRecommendationId, Boolean lockedToEdit, String idempotencyKey, String lockedAt, Double controlThreshing, Double humidity, Double proteinContent, Double oilContent, Integer historyItemId, Boolean notifyResponsibleUsers, String xCustomFieldsData) {
        this.id = id;
        this.field = field;
        this.fieldShape = fieldShape;
        this.agriWorkPlan = agriWorkPlan;
        this.applicationsType = applicationsType;
        this.operationNumber = operationNumber;
        this.customName = customName;
        this.workType = workType;
        this.status = status;
        this.calcBy = calcBy;
        this.plannedArea = plannedArea;
        this.completedArea = completedArea;
        this.harvestedWeight = harvestedWeight;
        this.plannedStartDate = plannedStartDate;
        this.plannedEndDate = plannedEndDate;
        this.completedDate = completedDate;
        this.completedDatetime = completedDatetime;
        this.season = season;
        this.plannedRowSpacing = plannedRowSpacing;
        this.plannedPlantSpacing = plannedPlantSpacing;
        this.plannedDepth = plannedDepth;
        this.plannedSpeed = plannedSpeed;
        this.plannedWaterRate = plannedWaterRate;
        this.factWaterRate = factWaterRate;
        this.coveredArea = coveredArea;
        this.coveredAreaByTrack = coveredAreaByTrack;
        this.machineWorkArea = machineWorkArea;
        this.additionalInfo = additionalInfo;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.externalId = externalId;
        this.actualStartDatetime = actualStartDatetime;
        this.agroRecommendationId = agroRecommendationId;
        this.lockedToEdit = lockedToEdit;
        this.idempotencyKey = idempotencyKey;
        this.lockedAt = lockedAt;
        this.controlThreshing = controlThreshing;
        this.humidity = humidity;
        this.proteinContent = proteinContent;
        this.oilContent = oilContent;
        this.historyItemId = historyItemId;
        this.notifyResponsibleUsers = notifyResponsibleUsers;
        this.xCustomFieldsData = xCustomFieldsData;
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

    public String getApplicationsType() {
        return applicationsType;
    }

    public void setApplicationsType(String applicationsType) {
        this.applicationsType = applicationsType;
    }

    public String getOperationNumber() {
        return operationNumber;
    }

    public void setOperationNumber(String operationNumber) {
        this.operationNumber = operationNumber;
    }

    public String getCustomName() {
        return customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName;
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

    public String getCalcBy() {
        return calcBy;
    }

    public void setCalcBy(String calcBy) {
        this.calcBy = calcBy;
    }

    public Double getPlannedArea() {
        return plannedArea;
    }

    public void setPlannedArea(Double plannedArea) {
        this.plannedArea = plannedArea;
    }

    public Double getCompletedArea() {
        return completedArea;
    }

    public void setCompletedArea(Double completedArea) {
        this.completedArea = completedArea;
    }

    public Double getHarvestedWeight() {
        return harvestedWeight;
    }

    public void setHarvestedWeight(Double harvestedWeight) {
        this.harvestedWeight = harvestedWeight;
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

    public Date getCompletedDate() {
        return completedDate;
    }

    public void setCompletedDate(Date completedDate) {
        this.completedDate = completedDate;
    }

    public Timestamp getCompletedDatetime() {
        return completedDatetime;
    }

    public void setCompletedDatetime(Timestamp completedDatetime) {
        this.completedDatetime = completedDatetime;
    }

    public Short getSeason() {
        return season;
    }

    public void setSeason(Short season) {
        this.season = season;
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

    public Double getPlannedWaterRate() {
        return plannedWaterRate;
    }

    public void setPlannedWaterRate(Double plannedWaterRate) {
        this.plannedWaterRate = plannedWaterRate;
    }

    public Double getFactWaterRate() {
        return factWaterRate;
    }

    public void setFactWaterRate(Double factWaterRate) {
        this.factWaterRate = factWaterRate;
    }

    public Double getCoveredArea() {
        return coveredArea;
    }

    public void setCoveredArea(Double coveredArea) {
        this.coveredArea = coveredArea;
    }

    public Double getCoveredAreaByTrack() {
        return coveredAreaByTrack;
    }

    public void setCoveredAreaByTrack(Double coveredAreaByTrack) {
        this.coveredAreaByTrack = coveredAreaByTrack;
    }

    public Double getMachineWorkArea() {
        return machineWorkArea;
    }

    public void setMachineWorkArea(Double machineWorkArea) {
        this.machineWorkArea = machineWorkArea;
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

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public Timestamp getActualStartDatetime() {
        return actualStartDatetime;
    }

    public void setActualStartDatetime(Timestamp actualStartDatetime) {
        this.actualStartDatetime = actualStartDatetime;
    }

    public Short getAgroRecommendationId() {
        return agroRecommendationId;
    }

    public void setAgroRecommendationId(Short agroRecommendationId) {
        this.agroRecommendationId = agroRecommendationId;
    }

    public Boolean isLockedToEdit() {
        return lockedToEdit;
    }

    public void setLockedToEdit(Boolean lockedToEdit) {
        this.lockedToEdit = lockedToEdit;
    }

    public String getIdempotencyKey() {
        return idempotencyKey;
    }

    public void setIdempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
    }

    public String getLockedAt() {
        return lockedAt;
    }

    public void setLockedAt(String lockedAt) {
        this.lockedAt = lockedAt;
    }

    public Double getControlThreshing() {
        return controlThreshing;
    }

    public void setControlThreshing(Double controlThreshing) {
        this.controlThreshing = controlThreshing;
    }

    public Double getHumidity() {
        return humidity;
    }

    public void setHumidity(Double humidity) {
        this.humidity = humidity;
    }

    public Double getProteinContent() {
        return proteinContent;
    }

    public void setProteinContent(Double proteinContent) {
        this.proteinContent = proteinContent;
    }

    public Double getOilContent() {
        return oilContent;
    }

    public void setOilContent(Double oilContent) {
        this.oilContent = oilContent;
    }

    public Integer getHistoryItemId() {
        return historyItemId;
    }

    public void setHistoryItemId(Integer historyItemId) {
        this.historyItemId = historyItemId;
    }

    public Boolean isNotifyResponsibleUsers() {
        return notifyResponsibleUsers;
    }

    public void setNotifyResponsibleUsers(Boolean notifyResponsibleUsers) {
        this.notifyResponsibleUsers = notifyResponsibleUsers;
    }

    public String getXCustomFieldsData() {
        return xCustomFieldsData;
    }

    public void setXCustomFieldsData(String xCustomFieldsData) {
        this.xCustomFieldsData = xCustomFieldsData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AgroOperation that = (AgroOperation) o;
        return Double.compare(plannedArea, that.plannedArea) == 0 && Double.compare(completedArea, that.completedArea) == 0 && Double.compare(harvestedWeight, that.harvestedWeight) == 0 && Objects.equals(season, that.season) && Double.compare(plannedRowSpacing, that.plannedRowSpacing) == 0 && Double.compare(plannedPlantSpacing, that.plannedPlantSpacing) == 0 && Double.compare(plannedDepth, that.plannedDepth) == 0 && Double.compare(plannedSpeed, that.plannedSpeed) == 0 && Double.compare(plannedWaterRate, that.plannedWaterRate) == 0 && Double.compare(factWaterRate, that.factWaterRate) == 0 && Double.compare(coveredArea, that.coveredArea) == 0 && Double.compare(coveredAreaByTrack, that.coveredAreaByTrack) == 0 && Double.compare(machineWorkArea, that.machineWorkArea) == 0 && Objects.equals(agroRecommendationId, that.agroRecommendationId) && lockedToEdit == that.lockedToEdit && Double.compare(controlThreshing, that.controlThreshing) == 0 && Double.compare(humidity, that.humidity) == 0 && Double.compare(proteinContent, that.proteinContent) == 0 && Double.compare(oilContent, that.oilContent) == 0 && Objects.equals(historyItemId, that.historyItemId) && notifyResponsibleUsers == that.notifyResponsibleUsers && Objects.equals(id, that.id) && Objects.equals(field, that.field) && Objects.equals(fieldShape, that.fieldShape) && Objects.equals(agriWorkPlan, that.agriWorkPlan) && Objects.equals(applicationsType, that.applicationsType) && Objects.equals(operationNumber, that.operationNumber) && Objects.equals(customName, that.customName) && Objects.equals(workType, that.workType) && Objects.equals(status, that.status) && Objects.equals(calcBy, that.calcBy) && Objects.equals(plannedStartDate, that.plannedStartDate) && Objects.equals(plannedEndDate, that.plannedEndDate) && Objects.equals(completedDate, that.completedDate) && Objects.equals(completedDatetime, that.completedDatetime) && Objects.equals(additionalInfo, that.additionalInfo) && Objects.equals(description, that.description) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt) && Objects.equals(externalId, that.externalId) && Objects.equals(actualStartDatetime, that.actualStartDatetime) && Objects.equals(idempotencyKey, that.idempotencyKey) && Objects.equals(lockedAt, that.lockedAt) && Objects.equals(xCustomFieldsData, that.xCustomFieldsData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, field, fieldShape, agriWorkPlan, applicationsType, operationNumber, customName, workType, status, calcBy, plannedArea, completedArea, harvestedWeight, plannedStartDate, plannedEndDate, completedDate, completedDatetime, season, plannedRowSpacing, plannedPlantSpacing, plannedDepth, plannedSpeed, plannedWaterRate, factWaterRate, coveredArea, coveredAreaByTrack, machineWorkArea, additionalInfo, description, createdAt, updatedAt, externalId, actualStartDatetime, agroRecommendationId, lockedToEdit, idempotencyKey, lockedAt, controlThreshing, humidity, proteinContent, oilContent, historyItemId, notifyResponsibleUsers, xCustomFieldsData);
    }

    @Override
    public String toString() {
        return "AgroOperation{" +
                "id=" + id +
                ", field=" + field +
                ", fieldShape=" + fieldShape +
                ", agriWorkPlan=" + agriWorkPlan +
                ", applicationsType='" + applicationsType + '\'' +
                ", operationNumber='" + operationNumber + '\'' +
                ", customName='" + customName + '\'' +
                ", workType=" + workType +
                ", status='" + status + '\'' +
                ", calcBy='" + calcBy + '\'' +
                ", plannedArea=" + plannedArea +
                ", completedArea=" + completedArea +
                ", harvestedWeight=" + harvestedWeight +
                ", plannedStartDate=" + plannedStartDate +
                ", plannedEndDate=" + plannedEndDate +
                ", completedDate=" + completedDate +
                ", completedDatetime=" + completedDatetime +
                ", season=" + season +
                ", plannedRowSpacing=" + plannedRowSpacing +
                ", plannedPlantSpacing=" + plannedPlantSpacing +
                ", plannedDepth=" + plannedDepth +
                ", plannedSpeed=" + plannedSpeed +
                ", plannedWaterRate=" + plannedWaterRate +
                ", factWaterRate=" + factWaterRate +
                ", coveredArea=" + coveredArea +
                ", coveredAreaByTrack=" + coveredAreaByTrack +
                ", machineWorkArea=" + machineWorkArea +
                ", additionalInfo='" + additionalInfo + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", externalId='" + externalId + '\'' +
                ", actualStartDatetime=" + actualStartDatetime +
                ", agroRecommendationId=" + agroRecommendationId +
                ", lockedToEdit=" + lockedToEdit +
                ", idempotencyKey='" + idempotencyKey + '\'' +
                ", lockedAt='" + lockedAt + '\'' +
                ", controlThreshing=" + controlThreshing +
                ", humidity=" + humidity +
                ", proteinContent=" + proteinContent +
                ", oilContent=" + oilContent +
                ", historyItemId=" + historyItemId +
                ", notifyResponsibleUsers=" + notifyResponsibleUsers +
                ", xCustomFieldsData='" + xCustomFieldsData + '\'' +
                '}';
    }
}
