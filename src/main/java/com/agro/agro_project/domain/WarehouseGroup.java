package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="warehouse_groups")
public class WarehouseGroup {
    @Id
    @Column(name="id")
    private Short id;

    @ManyToOne
    @JoinColumn(name="parent_id")
    private WarehouseGroup parent;

    @Column(name="name", length=20)
    private String name;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    @Column(name="external_id", length=50)
    private String externalId;

    public WarehouseGroup(Short id, WarehouseGroup parent, String name, String description, Timestamp createdAt, Timestamp updatedAt, String externalId) {
        this.id = id;
        this.parent = parent;
        this.name = name;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.externalId = externalId;
    }

    public WarehouseGroup() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public WarehouseGroup getParent() {
        return parent;
    }

    public void setParent(WarehouseGroup parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WarehouseGroup that = (WarehouseGroup) o;
        return Objects.equals(id, that.id) && Objects.equals(parent, that.parent) && Objects.equals(name, that.name) && Objects.equals(description, that.description) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt) && Objects.equals(externalId, that.externalId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parent, name, description, createdAt, updatedAt, externalId);
    }

    @Override
    public String toString() {
        return "WarehouseGroup{" +
                "id=" + id +
                ", parent=" + parent +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", externalId='" + externalId + '\'' +
                '}';
    }
}
