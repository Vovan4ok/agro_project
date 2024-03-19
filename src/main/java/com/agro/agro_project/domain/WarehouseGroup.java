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
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    @Column(name="external_id", length=50)
    private String external_id;

    public WarehouseGroup(Short id, WarehouseGroup parent, String name, String description, Timestamp created_at, Timestamp updated_at, String external_id) {
        this.id = id;
        this.parent = parent;
        this.name = name;
        this.description = description;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.external_id = external_id;
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
        WarehouseGroup that = (WarehouseGroup) o;
        return Objects.equals(id, that.id) && Objects.equals(parent, that.parent) && Objects.equals(name, that.name) && Objects.equals(description, that.description) && Objects.equals(created_at, that.created_at) && Objects.equals(updated_at, that.updated_at) && Objects.equals(external_id, that.external_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parent, name, description, created_at, updated_at, external_id);
    }

    @Override
    public String toString() {
        return "WarehouseGroup{" +
                "id=" + id +
                ", parent=" + parent +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", external_id='" + external_id + '\'' +
                '}';
    }
}
