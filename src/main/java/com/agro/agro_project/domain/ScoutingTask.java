package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="scouting_tasks", schema="cropwise_data")
public class ScoutingTask {
    @Id
    @Column(name="id")
    private Short id;

    @ManyToOne
    @JoinColumn(name="field_id")
    private Field field;

    @ManyToOne
    @JoinColumn(name="responsible_id")
    private User responsibleUser;

    @ManyToOne
    @JoinColumn(name="author_id")
    private User author;

    @Column(name="external_id", length=50)
    private String externalId;

    @Column(name="idempotency_key", length=50)
    private String idempotencyKey;

    @Column(name="start_time")
    private Timestamp startTime;

    @Column(name="end_time")
    private Timestamp endTime;

    @Column(name="description")
    private String description;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    @Column(name="status", length=20)
    private String status;

    @Column(name="image_type", length=20)
    private String imageType;

    @Column(name="image_date")
    private Date imageDate;

    @Column(name="image_source_sign", length=10)
    private String imageSourceSign;

    @Column(name="scout_report_template_id")
    private Short scoutReportTemplateId;

    @Column(name="season")
    private Short season;

    @ManyToOne
    @JoinColumn(name="agro_operation_id")
    private AgroOperation agroOperation;

    @Column(name="automatic_scouting_task_id")
    private Integer automaticScoutingTaskId;

    @Column(name="history_item_id")
    private Integer historyItemId;

    public ScoutingTask(Short id, Field field, User responsibleUser, User author, String externalId, String idempotencyKey, Timestamp startTime, Timestamp endTime, String description, Timestamp createdAt, Timestamp updatedAt, String status, String imageType, Date imageDate, String imageSourceSign, Short scoutReportTemplateId, Short season, AgroOperation agroOperation, Integer automaticScoutingTaskId, Integer historyItemId) {
        this.id = id;
        this.field = field;
        this.responsibleUser = responsibleUser;
        this.author = author;
        this.externalId = externalId;
        this.idempotencyKey = idempotencyKey;
        this.startTime = startTime;
        this.endTime = endTime;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.status = status;
        this.imageType = imageType;
        this.imageDate = imageDate;
        this.imageSourceSign = imageSourceSign;
        this.scoutReportTemplateId = scoutReportTemplateId;
        this.season = season;
        this.agroOperation = agroOperation;
        this.automaticScoutingTaskId = automaticScoutingTaskId;
        this.historyItemId = historyItemId;
    }

    public ScoutingTask() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public User getResponsibleUser() {
        return responsibleUser;
    }

    public void setResponsibleUser(User responsibleUser) {
        this.responsibleUser = responsibleUser;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getIdempotencyKey() {
        return idempotencyKey;
    }

    public void setIdempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
    }

    public Timestamp getStartTime() {
        return startTime;
    }

    public void setStartTime(Timestamp startTime) {
        this.startTime = startTime;
    }

    public Timestamp getEndTime() {
        return endTime;
    }

    public void setEndTime(Timestamp endTime) {
        this.endTime = endTime;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImageType() {
        return imageType;
    }

    public void setImageType(String imageType) {
        this.imageType = imageType;
    }

    public Date getImageDate() {
        return imageDate;
    }

    public void setImageDate(Date imageDate) {
        this.imageDate = imageDate;
    }

    public String getImageSourceSign() {
        return imageSourceSign;
    }

    public void setImageSourceSign(String imageSourceSign) {
        this.imageSourceSign = imageSourceSign;
    }

    public Short getScoutReportTemplateId() {
        return scoutReportTemplateId;
    }

    public void setScoutReportTemplateId(Short scoutReportTemplateId) {
        this.scoutReportTemplateId = scoutReportTemplateId;
    }

    public Short getSeason() {
        return season;
    }

    public void setSeason(Short season) {
        this.season = season;
    }

    public AgroOperation getAgroOperation() {
        return agroOperation;
    }

    public void setAgroOperation(AgroOperation agroOperation) {
        this.agroOperation = agroOperation;
    }

    public Integer getAutomaticScoutingTaskId() {
        return automaticScoutingTaskId;
    }

    public void setAutomaticScoutingTaskId(Integer automaticScoutingTaskId) {
        this.automaticScoutingTaskId = automaticScoutingTaskId;
    }

    public Integer getHistoryItemId() {
        return historyItemId;
    }

    public void setHistoryItemId(Integer historyItemId) {
        this.historyItemId = historyItemId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScoutingTask that = (ScoutingTask) o;
        return Objects.equals(scoutReportTemplateId, that.scoutReportTemplateId) && Objects.equals(season, that.season) && Objects.equals(automaticScoutingTaskId, that.automaticScoutingTaskId) && Objects.equals(historyItemId, that.historyItemId) && Objects.equals(id, that.id) && Objects.equals(field, that.field) && Objects.equals(responsibleUser, that.responsibleUser) && Objects.equals(author, that.author) && Objects.equals(externalId, that.externalId) && Objects.equals(idempotencyKey, that.idempotencyKey) && Objects.equals(startTime, that.startTime) && Objects.equals(endTime, that.endTime) && Objects.equals(description, that.description) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt) && Objects.equals(status, that.status) && Objects.equals(imageType, that.imageType) && Objects.equals(imageDate, that.imageDate) && Objects.equals(imageSourceSign, that.imageSourceSign) && Objects.equals(agroOperation, that.agroOperation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, field, responsibleUser, author, externalId, idempotencyKey, startTime, endTime, description, createdAt, updatedAt, status, imageType, imageDate, imageSourceSign, scoutReportTemplateId, season, agroOperation, automaticScoutingTaskId, historyItemId);
    }

    @Override
    public String toString() {
        return "ScoutingTask{" +
                "id=" + id +
                ", field=" + field +
                ", responsibleUser=" + responsibleUser +
                ", author=" + author +
                ", externalId='" + externalId + '\'' +
                ", idempotencyKey='" + idempotencyKey + '\'' +
                ", startTime=" + startTime +
                ", endTime=" + endTime +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", status='" + status + '\'' +
                ", imageType='" + imageType + '\'' +
                ", imageDate=" + imageDate +
                ", imageSourceSign='" + imageSourceSign + '\'' +
                ", scoutReportTemplateId=" + scoutReportTemplateId +
                ", season=" + season +
                ", agroOperation=" + agroOperation +
                ", automaticScoutingTaskId=" + automaticScoutingTaskId +
                ", historyItemId=" + historyItemId +
                '}';
    }
}
