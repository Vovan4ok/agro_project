package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="alerts", schema="cropwise_data")
public class Alert {
    @Id
    @Column(name="id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name="alert_type_id")
    private AlertType alertType;

    @Column(name="alertable_id")
    private Integer alertableId;

    @Column(name="event_start_time")
    private Timestamp eventStartTime;

    @Column(name="status", length=15)
    private String status;

    @Column(name="description")
    private String description;

    @ManyToOne
    @JoinColumn(name="responsible_person_id")
    private User responsiblePerson;

    @ManyToOne
    @JoinColumn(name="created_by_user_id")
    private User createdByUser;

    @Column(name="event_stop_time")
    private Timestamp eventStopTime;

    @Column(name="alert_closed_at")
    private Timestamp alertClosedAt;

    @Column(name="alertable_type", length=15)
    private String alertableType;

    @Column(name="automatic_alert_id")
    private Short automaticAlertId;

    @Column(name="system_info")
    private String systemInfo;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    @Column(name="description_data")
    private String descriptionData;

    public Alert(Integer id, AlertType alertType, Integer alertableId, Timestamp eventStartTime, String status, String description, User responsiblePerson, User createdByUser, Timestamp eventStopTime, Timestamp alertClosedAt, String alertableType, Short automaticAlertId, String systemInfo, Timestamp createdAt, Timestamp updatedAt, String descriptionData) {
        this.id = id;
        this.alertType = alertType;
        this.alertableId = alertableId;
        this.eventStartTime = eventStartTime;
        this.status = status;
        this.description = description;
        this.responsiblePerson = responsiblePerson;
        this.createdByUser = createdByUser;
        this.eventStopTime = eventStopTime;
        this.alertClosedAt = alertClosedAt;
        this.alertableType = alertableType;
        this.automaticAlertId = automaticAlertId;
        this.systemInfo = systemInfo;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.descriptionData = descriptionData;
    }

    public Alert() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AlertType getAlertType() {
        return alertType;
    }

    public void setAlertType(AlertType alertType) {
        this.alertType = alertType;
    }

    public Integer getAlertableId() {
        return alertableId;
    }

    public void setAlertableId(Integer alertableId) {
        this.alertableId = alertableId;
    }

    public Timestamp getEventStartTime() {
        return eventStartTime;
    }

    public void setEventStartTime(Timestamp eventStartTime) {
        this.eventStartTime = eventStartTime;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getResponsiblePerson() {
        return responsiblePerson;
    }

    public void setResponsiblePerson(User responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    public User getCreatedByUser() {
        return createdByUser;
    }

    public void setCreatedByUser(User createdByUser) {
        this.createdByUser = createdByUser;
    }

    public Timestamp getEventStopTime() {
        return eventStopTime;
    }

    public void setEventStopTime(Timestamp eventStopTime) {
        this.eventStopTime = eventStopTime;
    }

    public Timestamp getAlertClosedAt() {
        return alertClosedAt;
    }

    public void setAlertClosedAt(Timestamp alertClosedAt) {
        this.alertClosedAt = alertClosedAt;
    }

    public String getAlertableType() {
        return alertableType;
    }

    public void setAlertableType(String alertableType) {
        this.alertableType = alertableType;
    }

    public Short getAutomaticAlertId() {
        return automaticAlertId;
    }

    public void setAutomaticAlertId(Short automaticAlertId) {
        this.automaticAlertId = automaticAlertId;
    }

    public String getSystemInfo() {
        return systemInfo;
    }

    public void setSystemInfo(String systemInfo) {
        this.systemInfo = systemInfo;
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

    public String getDescriptionData() {
        return descriptionData;
    }

    public void setDescriptionData(String descriptionData) {
        this.descriptionData = descriptionData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alert alert = (Alert) o;
        return Objects.equals(alertableId, alert.alertableId) && Objects.equals(automaticAlertId, alert.automaticAlertId) && Objects.equals(id, alert.id) && Objects.equals(alertType, alert.alertType) && Objects.equals(eventStartTime, alert.eventStartTime) && Objects.equals(status, alert.status) && Objects.equals(description, alert.description) && Objects.equals(responsiblePerson, alert.responsiblePerson) && Objects.equals(createdByUser, alert.createdByUser) && Objects.equals(eventStopTime, alert.eventStopTime) && Objects.equals(alertClosedAt, alert.alertClosedAt) && Objects.equals(alertableType, alert.alertableType) && Objects.equals(systemInfo, alert.systemInfo) && Objects.equals(createdAt, alert.createdAt) && Objects.equals(updatedAt, alert.updatedAt) && Objects.equals(descriptionData, alert.descriptionData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, alertType, alertableId, eventStartTime, status, description, responsiblePerson, createdByUser, eventStopTime, alertClosedAt, alertableType, automaticAlertId, systemInfo, createdAt, updatedAt, descriptionData);
    }

    @Override
    public String toString() {
        return "Alert{" +
                "id=" + id +
                ", alertType=" + alertType +
                ", alertableId=" + alertableId +
                ", eventStartTime=" + eventStartTime +
                ", status='" + status + '\'' +
                ", description='" + description + '\'' +
                ", responsiblePerson=" + responsiblePerson +
                ", createdByUser=" + createdByUser +
                ", eventStopTime=" + eventStopTime +
                ", alertClosedAt=" + alertClosedAt +
                ", alertableType='" + alertableType + '\'' +
                ", automaticAlertId=" + automaticAlertId +
                ", systemInfo='" + systemInfo + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", descriptionData='" + descriptionData + '\'' +
                '}';
    }
}
