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
    private double plannedArea;

    @Column(name="completed_area")
    private double completedArea;

    @Column(name="harvested_weight")
    private double harvestedWeight;

    @Column(name="planned_start_date")
    private Date plannedStartDate;

    @Column(name="planned_end_date")
    private Date plannedEndDate;

    @Column(name="completed_date")
    private Date completedDate;

    @Column(name="completed_datetime")
    private Timestamp completedDatetime;

    @Column(name="season")
    private short season;

    @Column(name="planned_row_spacing")
    private double plannedRowSpacing;

    @Column(name="planned_plant_spacing")
    private double plannedPlantSpacing;

    @Column(name="planned_depth")
    private double plannedDepth;

    @Column(name="planned_speed")
    private double plannedSpeed;

    @Column(name="planned_water_rate")
    private double plannedWaterRate;

    @Column(name="fact_water_rate")
    private double factWaterRate;

    @Column(name="covered_area")
    private double coveredArea;

    @Column(name="covered_area_by_track")
    private double coveredAreaByTrack;

    @Column(name="machine_work_area")
    private double machineWorkArea;

    @Column(name="additional_info")
    @Lob
    private String additionalInfo;

    @Column(name="description")
    @Lob
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
    private short agroRecommendationId;

    @Column(name="locked_to_edit")
    private boolean lockedToEdit;

    @Column(name="idempotency_key", length=100)
    private String idempotencyKey;

    @Column(name="locked_at", length=20)
    private String lockedAt;

    @Column(name="control_threshing")
    private double controlThreshing;

    @Column(name="humidity")
    private double humidity;

    @Column(name="protein_content")
    private double proteinContent;

    @Column(name="oil_content")
    private double oilContent;

    @Column(name="history_item_id")
    private int historyItemId;

    @Column(name="notify_responsible_users")
    private boolean notifyResponsibleUsers;

    @Column(name="x_custom_fields_data")
    @Lob
    private String xCustomFieldsData;

    public AgroOperation(Integer id, Field field, FieldShape fieldShape, AgriWorkPlan agriWorkPlan, String applicationsType, String operationNumber, String customName, WorkType workType, String status, String calcBy, double plannedArea, double completedArea, double harvestedWeight, Date plannedStartDate, Date plannedEndDate, Date completedDate, Timestamp completedDatetime, short season, double plannedRowSpacing, double plannedPlantSpacing, double plannedDepth, double plannedSpeed, double plannedWaterRate, double factWaterRate, double coveredArea, double coveredAreaByTrack, double machineWorkArea, String additionalInfo, String description, Timestamp createdAt, Timestamp updatedAt, String externalId, Timestamp actualStartDatetime, short agroRecommendationId, boolean lockedToEdit, String idempotencyKey, String lockedAt, double controlThreshing, double humidity, double proteinContent, double oilContent, int historyItemId, boolean notifyResponsibleUsers, String xCustomFieldsData) {
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

    public double getPlannedArea() {
        return plannedArea;
    }

    public void setPlannedArea(double plannedArea) {
        this.plannedArea = plannedArea;
    }

    public double getCompletedArea() {
        return completedArea;
    }

    public void setCompletedArea(double completedArea) {
        this.completedArea = completedArea;
    }

    public double getHarvestedWeight() {
        return harvestedWeight;
    }

    public void setHarvestedWeight(double harvestedWeight) {
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

    public short getSeason() {
        return season;
    }

    public void setSeason(short season) {
        this.season = season;
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

    public double getPlannedWaterRate() {
        return plannedWaterRate;
    }

    public void setPlannedWaterRate(double plannedWaterRate) {
        this.plannedWaterRate = plannedWaterRate;
    }

    public double getFactWaterRate() {
        return factWaterRate;
    }

    public void setFactWaterRate(double factWaterRate) {
        this.factWaterRate = factWaterRate;
    }

    public double getCoveredArea() {
        return coveredArea;
    }

    public void setCoveredArea(double coveredArea) {
        this.coveredArea = coveredArea;
    }

    public double getCoveredAreaByTrack() {
        return coveredAreaByTrack;
    }

    public void setCoveredAreaByTrack(double coveredAreaByTrack) {
        this.coveredAreaByTrack = coveredAreaByTrack;
    }

    public double getMachineWorkArea() {
        return machineWorkArea;
    }

    public void setMachineWorkArea(double machineWorkArea) {
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

    public short getAgroRecommendationId() {
        return agroRecommendationId;
    }

    public void setAgroRecommendationId(short agroRecommendationId) {
        this.agroRecommendationId = agroRecommendationId;
    }

    public boolean isLockedToEdit() {
        return lockedToEdit;
    }

    public void setLockedToEdit(boolean lockedToEdit) {
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

    public double getControlThreshing() {
        return controlThreshing;
    }

    public void setControlThreshing(double controlThreshing) {
        this.controlThreshing = controlThreshing;
    }

    public double getHumidity() {
        return humidity;
    }

    public void setHumidity(double humidity) {
        this.humidity = humidity;
    }

    public double getProteinContent() {
        return proteinContent;
    }

    public void setProteinContent(double proteinContent) {
        this.proteinContent = proteinContent;
    }

    public double getOilContent() {
        return oilContent;
    }

    public void setOilContent(double oilContent) {
        this.oilContent = oilContent;
    }

    public int getHistoryItemId() {
        return historyItemId;
    }

    public void setHistoryItemId(int historyItemId) {
        this.historyItemId = historyItemId;
    }

    public boolean isNotifyResponsibleUsers() {
        return notifyResponsibleUsers;
    }

    public void setNotifyResponsibleUsers(boolean notifyResponsibleUsers) {
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
        return Double.compare(plannedArea, that.plannedArea) == 0 && Double.compare(completedArea, that.completedArea) == 0 && Double.compare(harvestedWeight, that.harvestedWeight) == 0 && season == that.season && Double.compare(plannedRowSpacing, that.plannedRowSpacing) == 0 && Double.compare(plannedPlantSpacing, that.plannedPlantSpacing) == 0 && Double.compare(plannedDepth, that.plannedDepth) == 0 && Double.compare(plannedSpeed, that.plannedSpeed) == 0 && Double.compare(plannedWaterRate, that.plannedWaterRate) == 0 && Double.compare(factWaterRate, that.factWaterRate) == 0 && Double.compare(coveredArea, that.coveredArea) == 0 && Double.compare(coveredAreaByTrack, that.coveredAreaByTrack) == 0 && Double.compare(machineWorkArea, that.machineWorkArea) == 0 && agroRecommendationId == that.agroRecommendationId && lockedToEdit == that.lockedToEdit && Double.compare(controlThreshing, that.controlThreshing) == 0 && Double.compare(humidity, that.humidity) == 0 && Double.compare(proteinContent, that.proteinContent) == 0 && Double.compare(oilContent, that.oilContent) == 0 && historyItemId == that.historyItemId && notifyResponsibleUsers == that.notifyResponsibleUsers && Objects.equals(id, that.id) && Objects.equals(field, that.field) && Objects.equals(fieldShape, that.fieldShape) && Objects.equals(agriWorkPlan, that.agriWorkPlan) && Objects.equals(applicationsType, that.applicationsType) && Objects.equals(operationNumber, that.operationNumber) && Objects.equals(customName, that.customName) && Objects.equals(workType, that.workType) && Objects.equals(status, that.status) && Objects.equals(calcBy, that.calcBy) && Objects.equals(plannedStartDate, that.plannedStartDate) && Objects.equals(plannedEndDate, that.plannedEndDate) && Objects.equals(completedDate, that.completedDate) && Objects.equals(completedDatetime, that.completedDatetime) && Objects.equals(additionalInfo, that.additionalInfo) && Objects.equals(description, that.description) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt) && Objects.equals(externalId, that.externalId) && Objects.equals(actualStartDatetime, that.actualStartDatetime) && Objects.equals(idempotencyKey, that.idempotencyKey) && Objects.equals(lockedAt, that.lockedAt) && Objects.equals(xCustomFieldsData, that.xCustomFieldsData);
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
