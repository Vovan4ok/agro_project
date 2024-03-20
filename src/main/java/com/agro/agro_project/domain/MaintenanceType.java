package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="maintenance_types")
public class MaintenanceType {
    @Id
    @Column(name="id")
    private Short id;

    @ManyToOne
    @JoinColumn(name="maintenance_type_group_id")
    private MaintenanceTypeGroup maintenanceTypeGroup;

    @Column(name="name", length=50)
    private String name;

    @Column(name="external_id", length=50)
    private String externalId;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="hidden")
    private boolean hidden;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    public MaintenanceType(Short id, MaintenanceTypeGroup maintenanceTypeGroup, String name, String externalId, String description, boolean hidden, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.maintenanceTypeGroup = maintenanceTypeGroup;
        this.name = name;
        this.externalId = externalId;
        this.description = description;
        this.hidden = hidden;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public MaintenanceType() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public MaintenanceTypeGroup getMaintenanceTypeGroup() {
        return maintenanceTypeGroup;
    }

    public void setMaintenanceTypeGroup(MaintenanceTypeGroup maintenanceTypeGroup) {
        this.maintenanceTypeGroup = maintenanceTypeGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
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
        MaintenanceType that = (MaintenanceType) o;
        return hidden == that.hidden && Objects.equals(id, that.id) && Objects.equals(maintenanceTypeGroup, that.maintenanceTypeGroup) && Objects.equals(name, that.name) && Objects.equals(externalId, that.externalId) && Objects.equals(description, that.description) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, maintenanceTypeGroup, name, externalId, description, hidden, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "MaintenanceType{" +
                "id=" + id +
                ", maintenanceTypeGroup=" + maintenanceTypeGroup +
                ", name='" + name + '\'' +
                ", externalId='" + externalId + '\'' +
                ", description='" + description + '\'' +
                ", hidden=" + hidden +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
