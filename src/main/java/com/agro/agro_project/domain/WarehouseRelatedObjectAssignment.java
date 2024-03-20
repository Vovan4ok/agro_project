package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="warehouse_related_object_assignments")
public class WarehouseRelatedObjectAssignment {
    @Id
    @Column(name="id")
    private Short id;

    @ManyToOne
    @JoinColumn(name="warehouse_id")
    private Warehouse warehouse;

    @Column(name="related_object_type", length=20)
    private String relatedObjectType;

    @ManyToOne
    @JoinColumn(name="related_object_id")
    private Field field;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    @Column(name="external_id", length=50)
    private String externalId;

    public WarehouseRelatedObjectAssignment(Short id, Warehouse warehouse, String relatedObjectType, Field field, Timestamp createdAt, Timestamp updatedAt, String externalId) {
        this.id = id;
        this.warehouse = warehouse;
        this.relatedObjectType = relatedObjectType;
        this.field = field;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.externalId = externalId;
    }

    public WarehouseRelatedObjectAssignment() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Warehouse getWarehouse() {
        return warehouse;
    }

    public void setWarehouse(Warehouse warehouse) {
        this.warehouse = warehouse;
    }

    public String getRelatedObjectType() {
        return relatedObjectType;
    }

    public void setRelatedObjectType(String relatedObjectType) {
        this.relatedObjectType = relatedObjectType;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
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
        WarehouseRelatedObjectAssignment that = (WarehouseRelatedObjectAssignment) o;
        return Objects.equals(id, that.id) && Objects.equals(warehouse, that.warehouse) && Objects.equals(relatedObjectType, that.relatedObjectType) && Objects.equals(field, that.field) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt) && Objects.equals(externalId, that.externalId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, warehouse, relatedObjectType, field, createdAt, updatedAt, externalId);
    }

    @Override
    public String toString() {
        return "WarehouseRelatedObjectAssignment{" +
                "id=" + id +
                ", warehouse=" + warehouse +
                ", relatedObjectType='" + relatedObjectType + '\'' +
                ", field=" + field +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", externalId='" + externalId + '\'' +
                '}';
    }
}
