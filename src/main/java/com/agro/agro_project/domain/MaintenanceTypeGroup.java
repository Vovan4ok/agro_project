package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="maintenance_type_groups")
public class MaintenanceTypeGroup {
    @Id
    @Column(name="id")
    private Short id;

    @Column(name="name", length=30)
    private String name;

    @Column(name="external_id", length=50)
    private String externalId;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    public MaintenanceTypeGroup(Short id, String name, String externalId, String description, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.name = name;
        this.externalId = externalId;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public MaintenanceTypeGroup() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
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
        MaintenanceTypeGroup that = (MaintenanceTypeGroup) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(externalId, that.externalId) && Objects.equals(description, that.description) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, externalId, description, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "MaintenanceTypeGroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", externalId='" + externalId + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
