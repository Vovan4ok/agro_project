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
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    @Column(name="external_id", length=50)
    private String external_id;

    public Warehouse(Short id, String name, WarehouseGroup warehouseGroup, User responsibleUser, String description, Timestamp created_at, Timestamp updated_at, String external_id) {
        this.id = id;
        this.name = name;
        this.warehouseGroup = warehouseGroup;
        this.responsibleUser = responsibleUser;
        this.description = description;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.external_id = external_id;
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
        Warehouse warehouse = (Warehouse) o;
        return Objects.equals(id, warehouse.id) && Objects.equals(name, warehouse.name) && Objects.equals(warehouseGroup, warehouse.warehouseGroup) && Objects.equals(responsibleUser, warehouse.responsibleUser) && Objects.equals(description, warehouse.description) && Objects.equals(created_at, warehouse.created_at) && Objects.equals(updated_at, warehouse.updated_at) && Objects.equals(external_id, warehouse.external_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, warehouseGroup, responsibleUser, description, created_at, updated_at, external_id);
    }

    @Override
    public String toString() {
        return "Warehouse{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", warehouseGroup=" + warehouseGroup +
                ", responsibleUser=" + responsibleUser +
                ", description='" + description + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", external_id='" + external_id + '\'' +
                '}';
    }
}
