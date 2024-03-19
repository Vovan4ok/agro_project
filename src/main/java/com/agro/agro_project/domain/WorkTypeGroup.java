package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="work_type_groups")
public class WorkTypeGroup {
    @Id
    @Column(name="id")
    private Short id;

    @Column(name="name", length=30)
    private String name;

    @Column(name="standard_name", length=30)
    private String standard_name;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="external_id", length=50)
    private String external_id;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    public WorkTypeGroup(Short id, String name, String standard_name, String description, String external_id, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.name = name;
        this.standard_name = standard_name;
        this.description = description;
        this.external_id = external_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public WorkTypeGroup() {
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

    public String getStandard_name() {
        return standard_name;
    }

    public void setStandard_name(String standard_name) {
        this.standard_name = standard_name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
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
        WorkTypeGroup that = (WorkTypeGroup) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(standard_name, that.standard_name) && Objects.equals(description, that.description) && Objects.equals(external_id, that.external_id) && Objects.equals(created_at, that.created_at) && Objects.equals(updated_at, that.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, standard_name, description, external_id, created_at, updated_at);
    }

    @Override
    public String toString() {
        return "WorkTypeGroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", standard_name='" + standard_name + '\'' +
                ", description='" + description + '\'' +
                ", external_id='" + external_id + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
