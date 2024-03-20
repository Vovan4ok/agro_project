package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="warehouses")
public class Warehouse {
    @Id
    @Column(name="id")
    private Short id;

    @Column(name="name", length=50)
    private String name;

    @ManyToOne
    @JoinColumn(name="warehouse_group_id")
    private WarehouseGroup warehouseGroup;

    @ManyToOne
    @JoinColumn(name="responsible_user_id")
    private User responsibleUser;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    @Column(name="external_id", length=50)
    private String externalId;

    public Warehouse(Short id, String name, WarehouseGroup warehouseGroup, User responsibleUser, String description, Timestamp createdAt, Timestamp updatedAt, String externalId) {
        this.id = id;
        this.name = name;
        this.warehouseGroup = warehouseGroup;
        this.responsibleUser = responsibleUser;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.externalId = externalId;
    }

    public Warehouse() {
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

    public WarehouseGroup getWarehouseGroup() {
        return warehouseGroup;
    }

    public void setWarehouseGroup(WarehouseGroup warehouseGroup) {
        this.warehouseGroup = warehouseGroup;
    }

    public User getResponsibleUser() {
        return responsibleUser;
    }

    public void setResponsibleUser(User responsibleUser) {
        this.responsibleUser = responsibleUser;
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
        Warehouse warehouse = (Warehouse) o;
        return Objects.equals(id, warehouse.id) && Objects.equals(name, warehouse.name) && Objects.equals(warehouseGroup, warehouse.warehouseGroup) && Objects.equals(responsibleUser, warehouse.responsibleUser) && Objects.equals(description, warehouse.description) && Objects.equals(createdAt, warehouse.createdAt) && Objects.equals(updatedAt, warehouse.updatedAt) && Objects.equals(externalId, warehouse.externalId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, warehouseGroup, responsibleUser, description, createdAt, updatedAt, externalId);
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", warehouseGroup=" + warehouseGroup +
                ", responsibleUser=" + responsibleUser +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", externalId='" + externalId + '\'' +
                '}';
    }
}
