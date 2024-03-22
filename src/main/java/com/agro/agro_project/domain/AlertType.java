package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="alert_types", schema="cropwise_data")
public class AlertType {
    @Id
    @Column(name="id")
    private Short id;

    @Column(name="alert_type", length=50)
    private String alertType;

    @Column(name="name", length=50)
    private String name;

    @Column(name="priority", length=10)
    private String priority;

    @Column(name="description")
    private String description;

    @Column(name="additional_info")
    private String additionalInfo;

    @Column(name="archived")
    private Boolean archived;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    public AlertType(Short id, String alertType, String name, String priority, String description, String additionalInfo, Boolean archived, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.alertType = alertType;
        this.name = name;
        this.priority = priority;
        this.description = description;
        this.additionalInfo = additionalInfo;
        this.archived = archived;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public AlertType() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getAlertType() {
        return alertType;
    }

    public void setAlertType(String alertType) {
        this.alertType = alertType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public Boolean isArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AlertType alertType1 = (AlertType) o;
        return archived == alertType1.archived && Objects.equals(id, alertType1.id) && Objects.equals(alertType, alertType1.alertType) && Objects.equals(name, alertType1.name) && Objects.equals(priority, alertType1.priority) && Objects.equals(description, alertType1.description) && Objects.equals(additionalInfo, alertType1.additionalInfo) && Objects.equals(createdAt, alertType1.createdAt) && Objects.equals(updatedAt, alertType1.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, alertType, name, priority, description, additionalInfo, archived, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "AlertType{" +
                "id=" + id +
                ", alertType='" + alertType + '\'' +
                ", name='" + name + '\'' +
                ", priority='" + priority + '\'' +
                ", description='" + description + '\'' +
                ", additionalInfo='" + additionalInfo + '\'' +
                ", archived=" + archived +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
