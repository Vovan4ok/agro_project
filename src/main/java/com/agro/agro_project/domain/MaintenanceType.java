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
    private String external_id;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="hidden")
    private boolean hidden;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    public MaintenanceType(Short id, MaintenanceTypeGroup maintenanceTypeGroup, String name, String external_id, String description, boolean hidden, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.maintenanceTypeGroup = maintenanceTypeGroup;
        this.name = name;
        this.external_id = external_id;
        this.description = description;
        this.hidden = hidden;
        this.created_at = created_at;
        this.updated_at = updated_at;
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

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
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
        MaintenanceType that = (MaintenanceType) o;
        return hidden == that.hidden && Objects.equals(id, that.id) && Objects.equals(maintenanceTypeGroup, that.maintenanceTypeGroup) && Objects.equals(name, that.name) && Objects.equals(external_id, that.external_id) && Objects.equals(description, that.description) && Objects.equals(created_at, that.created_at) && Objects.equals(updated_at, that.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, maintenanceTypeGroup, name, external_id, description, hidden, created_at, updated_at);
    }

    @Override
    public String toString() {
        return "MaintenanceType{" +
                "id=" + id +
                ", maintenanceTypeGroup=" + maintenanceTypeGroup +
                ", name='" + name + '\'' +
                ", external_id='" + external_id + '\'' +
                ", description='" + description + '\'' +
                ", hidden=" + hidden +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
