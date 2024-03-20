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
    private Timestamp reportTime;

    @Column(name="season")
    private short season;

    @Column(name="additional_info")
    @Lob
    private String additionalInfo;

    @ManyToOne
    @JoinColumn(name="growth_stage_id")
    private GrowthStage growthStage;

    @ManyToOne
    @JoinColumn(name="field_shape_id")
    private FieldShape fieldShape;

    @Column(name="ears_cover")
    private double earsCover;

    @Column(name="plants_cover")
    private double plantsCover;

    @Column(name="ground_cover")
    private double groundCover;

    @Column(name="created_by_user_at")
    private Timestamp createdByUserAt;

    @Column(name="updated_by_user_at")
    private Timestamp updatedByUserAt;

    @ManyToOne
    @JoinColumn(name="scouting_task_id")
    private ScoutingTask scoutingTask;

    @Column(name="scout_report_template_id")
    private int scoutReportTemplateId;

    @Column(name="external_id", length=50)
    private String externalId;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    @Column(name="idempotency_key", length=100)
    private String idempotencyKey;

    @Column(name="history_item_id")
    private int historyItemId;

    @Column(name="x_custom_fields_data")
    private String xCustomFieldsData;

    public FieldScoutReport(Integer id, Field field, User user, Timestamp reportTime, short season, String additionalInfo, GrowthStage growthStage, FieldShape fieldShape, double earsCover, double plantsCover, double groundCover, Timestamp createdByUserAt, Timestamp updatedByUserAt, ScoutingTask scoutingTask, int scoutReportTemplateId, String externalId, Timestamp createdAt, Timestamp updatedAt, String idempotencyKey, int historyItemId, String xCustomFieldsData) {
        this.id = id;
        this.field = field;
        this.user = user;
        this.reportTime = reportTime;
        this.season = season;
        this.additionalInfo = additionalInfo;
        this.growthStage = growthStage;
        this.fieldShape = fieldShape;
        this.earsCover = earsCover;
        this.plantsCover = plantsCover;
        this.groundCover = groundCover;
        this.createdByUserAt = createdByUserAt;
        this.updatedByUserAt = updatedByUserAt;
        this.scoutingTask = scoutingTask;
        this.scoutReportTemplateId = scoutReportTemplateId;
        this.externalId = externalId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.idempotencyKey = idempotencyKey;
        this.historyItemId = historyItemId;
        this.xCustomFieldsData = xCustomFieldsData;
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

    public Timestamp getReportTime() {
        return reportTime;
    }

    public void setReportTime(Timestamp reportTime) {
        this.reportTime = reportTime;
    }

    public short getSeason() {
        return season;
    }

    public void setSeason(short season) {
        this.season = season;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
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

    public double getEarsCover() {
        return earsCover;
    }

    public void setEarsCover(double earsCover) {
        this.earsCover = earsCover;
    }

    public double getPlantsCover() {
        return plantsCover;
    }

    public void setPlantsCover(double plantsCover) {
        this.plantsCover = plantsCover;
    }

    public double getGroundCover() {
        return groundCover;
    }

    public void setGroundCover(double groundCover) {
        this.groundCover = groundCover;
    }

    public Timestamp getCreatedByUserAt() {
        return createdByUserAt;
    }

    public void setCreatedByUserAt(Timestamp createdByUserAt) {
        this.createdByUserAt = createdByUserAt;
    }

    public Timestamp getUpdatedByUserAt() {
        return updatedByUserAt;
    }

    public void setUpdatedByUserAt(Timestamp updatedByUserAt) {
        this.updatedByUserAt = updatedByUserAt;
    }

    public ScoutingTask getScoutingTask() {
        return scoutingTask;
    }

    public void setScoutingTask(ScoutingTask scoutingTask) {
        this.scoutingTask = scoutingTask;
    }

    public int getScoutReportTemplateId() {
        return scoutReportTemplateId;
    }

    public void setScoutReportTemplateId(int scoutReportTemplateId) {
        this.scoutReportTemplateId = scoutReportTemplateId;
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

    public String getIdempotencyKey() {
        return idempotencyKey;
    }

    public void setIdempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
    }

    public int getHistoryItemId() {
        return historyItemId;
    }

    public void setHistoryItemId(int historyItemId) {
        this.historyItemId = historyItemId;
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
        FieldScoutReport that = (FieldScoutReport) o;
        return season == that.season && Double.compare(earsCover, that.earsCover) == 0 && Double.compare(plantsCover, that.plantsCover) == 0 && Double.compare(groundCover, that.groundCover) == 0 && scoutReportTemplateId == that.scoutReportTemplateId && historyItemId == that.historyItemId && Objects.equals(id, that.id) && Objects.equals(field, that.field) && Objects.equals(user, that.user) && Objects.equals(reportTime, that.reportTime) && Objects.equals(additionalInfo, that.additionalInfo) && Objects.equals(growthStage, that.growthStage) && Objects.equals(fieldShape, that.fieldShape) && Objects.equals(createdByUserAt, that.createdByUserAt) && Objects.equals(updatedByUserAt, that.updatedByUserAt) && Objects.equals(scoutingTask, that.scoutingTask) && Objects.equals(externalId, that.externalId) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt) && Objects.equals(idempotencyKey, that.idempotencyKey) && Objects.equals(xCustomFieldsData, that.xCustomFieldsData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, field, user, reportTime, season, additionalInfo, growthStage, fieldShape, earsCover, plantsCover, groundCover, createdByUserAt, updatedByUserAt, scoutingTask, scoutReportTemplateId, externalId, createdAt, updatedAt, idempotencyKey, historyItemId, xCustomFieldsData);
    }

    @Override
    public String toString() {
        return "FieldScoutReport{" +
                "id=" + id +
                ", field=" + field +
                ", user=" + user +
                ", reportTime=" + reportTime +
                ", season=" + season +
                ", additionalInfo='" + additionalInfo + '\'' +
                ", growthStage=" + growthStage +
                ", fieldShape=" + fieldShape +
                ", earsCover=" + earsCover +
                ", plantsCover=" + plantsCover +
                ", groundCover=" + groundCover +
                ", createdByUserAt=" + createdByUserAt +
                ", updatedByUserAt=" + updatedByUserAt +
                ", scoutingTask=" + scoutingTask +
                ", scoutReportTemplateId=" + scoutReportTemplateId +
                ", externalId='" + externalId + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", idempotencyKey='" + idempotencyKey + '\'' +
                ", historyItemId=" + historyItemId +
                ", xCustomFieldsData='" + xCustomFieldsData + '\'' +
                '}';
    }
}
