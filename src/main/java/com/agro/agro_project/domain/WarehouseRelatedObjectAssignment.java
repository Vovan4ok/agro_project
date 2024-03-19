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
    private String related_object_type;

    @ManyToOne
    @JoinColumn(name="related_object_id")
    private Field field;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    @Column(name="external_id", length=50)
    private String external_id;

    public WarehouseRelatedObjectAssignment(Short id, Warehouse warehouse, String related_object_type, Field field, Timestamp created_at, Timestamp updated_at, String external_id) {
        this.id = id;
        this.warehouse = warehouse;
        this.related_object_type = related_object_type;
        this.field = field;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.external_id = external_id;
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

    public String getRelated_object_type() {
        return related_object_type;
    }

    public void setRelated_object_type(String related_object_type) {
        this.related_object_type = related_object_type;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WarehouseRelatedObjectAssignment that = (WarehouseRelatedObjectAssignment) o;
        return Objects.equals(id, that.id) && Objects.equals(warehouse, that.warehouse) && Objects.equals(related_object_type, that.related_object_type) && Objects.equals(field, that.field) && Objects.equals(created_at, that.created_at) && Objects.equals(updated_at, that.updated_at) && Objects.equals(external_id, that.external_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, warehouse, related_object_type, field, created_at, updated_at, external_id);
    }

    @Override
    public String toString() {
        return "WarehouseRelatedObjectAssignment{" +
                "id=" + id +
                ", warehouse=" + warehouse +
                ", related_object_type='" + related_object_type + '\'' +
                ", field=" + field +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", external_id='" + external_id + '\'' +
                '}';
    }
}
