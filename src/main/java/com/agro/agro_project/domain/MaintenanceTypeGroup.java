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
    private String external_id;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    public MaintenanceTypeGroup(Short id, String name, String external_id, String description, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.name = name;
        this.external_id = external_id;
        this.description = description;
        this.created_at = created_at;
        this.updated_at = updated_at;
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

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MaintenanceTypeGroup that = (MaintenanceTypeGroup) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(external_id, that.external_id) && Objects.equals(description, that.description) && Objects.equals(created_at, that.created_at) && Objects.equals(updated_at, that.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, external_id, description, created_at, updated_at);
    }

    @Override
    public String toString() {
        return "MaintenanceTypeGroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", external_id='" + external_id + '\'' +
                ", description='" + description + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
