package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="units")
public class Unit {
    @Id
    @Column(name="id")
    private Short id;

    @Column(name="human_name", length=30)
    private String human_name;

    @Column(name="system_name", length=30)
    private String system_name;

    @Column(name="base_unit", length=10)
    private String base_unit;

    @Column(name="coefficient_to_base_unit", length=15)
    private String coefficient_to_base_unit;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="idempotency_key", length=20)
    private String idempotency_key;

    @Column(name="external_id", length=50)
    private String external_id;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    @Column(name="archived")
    private boolean archived;

    public Unit(Short id, String human_name, String system_name, String base_unit, String coefficient_to_base_unit, String description, String idempotency_key, String external_id, Timestamp created_at, Timestamp updated_at, boolean archived) {
        this.id = id;
        this.human_name = human_name;
        this.system_name = system_name;
        this.base_unit = base_unit;
        this.coefficient_to_base_unit = coefficient_to_base_unit;
        this.description = description;
        this.idempotency_key = idempotency_key;
        this.external_id = external_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.archived = archived;
    }

    public Unit() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getHuman_name() {
        return human_name;
    }

    public void setHuman_name(String human_name) {
        this.human_name = human_name;
    }

    public String getSystem_name() {
        return system_name;
    }

    public void setSystem_name(String system_name) {
        this.system_name = system_name;
    }

    public String getBase_unit() {
        return base_unit;
    }

    public void setBase_unit(String base_unit) {
        this.base_unit = base_unit;
    }

    public String getCoefficient_to_base_unit() {
        return coefficient_to_base_unit;
    }

    public void setCoefficient_to_base_unit(String coefficient_to_base_unit) {
        this.coefficient_to_base_unit = coefficient_to_base_unit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIdempotency_key() {
        return idempotency_key;
    }

    public void setIdempotency_key(String idempotency_key) {
        this.idempotency_key = idempotency_key;
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

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unit unit = (Unit) o;
        return archived == unit.archived && Objects.equals(id, unit.id) && Objects.equals(human_name, unit.human_name) && Objects.equals(system_name, unit.system_name) && Objects.equals(base_unit, unit.base_unit) && Objects.equals(coefficient_to_base_unit, unit.coefficient_to_base_unit) && Objects.equals(description, unit.description) && Objects.equals(idempotency_key, unit.idempotency_key) && Objects.equals(external_id, unit.external_id) && Objects.equals(created_at, unit.created_at) && Objects.equals(updated_at, unit.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, human_name, system_name, base_unit, coefficient_to_base_unit, description, idempotency_key, external_id, created_at, updated_at, archived);
    }

    @Override
    public String toString() {
        return "Unit{" +
                "id=" + id +
                ", human_name='" + human_name + '\'' +
                ", system_name='" + system_name + '\'' +
                ", base_unit='" + base_unit + '\'' +
                ", coefficient_to_base_unit='" + coefficient_to_base_unit + '\'' +
                ", description='" + description + '\'' +
                ", idempotency_key='" + idempotency_key + '\'' +
                ", external_id='" + external_id + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", archived=" + archived +
                '}';
    }
}
