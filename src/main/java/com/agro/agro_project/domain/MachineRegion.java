package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="machine_regions")
public class MachineRegion {
    @Id
    @Column(name="id")
    private Short id;

    @Column(name="name", length=20)
    private String name;

    @Column(name="ancestry", length=10)
    private String ancestry;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="additional_info")
    @Lob
    private String additional_info;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    @Column(name="external_id", length=50)
    private String external_id;

    public MachineRegion(Short id, String name, String ancestry, String description, String additional_info, Timestamp created_at, Timestamp updated_at, String external_id) {
        this.id = id;
        this.name = name;
        this.ancestry = ancestry;
        this.description = description;
        this.additional_info = additional_info;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.external_id = external_id;
    }

    public MachineRegion() {
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

    public String getAncestry() {
        return ancestry;
    }

    public void setAncestry(String ancestry) {
        this.ancestry = ancestry;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdditional_info() {
        return additional_info;
    }

    public void setAdditional_info(String additional_info) {
        this.additional_info = additional_info;
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
        MachineRegion that = (MachineRegion) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(ancestry, that.ancestry) && Objects.equals(description, that.description) && Objects.equals(additional_info, that.additional_info) && Objects.equals(created_at, that.created_at) && Objects.equals(updated_at, that.updated_at) && Objects.equals(external_id, that.external_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, ancestry, description, additional_info, created_at, updated_at, external_id);
    }

    @Override
    public String toString() {
        return "MachineRegion{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", ancestry='" + ancestry + '\'' +
                ", description='" + description + '\'' +
                ", additional_info='" + additional_info + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", external_id='" + external_id + '\'' +
                '}';
    }
}