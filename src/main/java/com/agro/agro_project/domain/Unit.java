package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="units", schema="cropwise_data")
public class Unit {
    @Id
    @Column(name="id")
    private Short id;

    @Column(name="human_name", length=30)
    private String humanName;

    @Column(name="system_name", length=30)
    private String systemName;

    @Column(name="base_unit", length=10)
    private String baseUnit;

    @Column(name="coefficient_to_base_unit", length=15)
    private String coefficientToBaseUnit;

    @Column(name="description")
    private String description;

    @Column(name="idempotency_key", length=20)
    private String idempotencyKey;

    @Column(name="external_id", length=50)
    private String externalId;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    @Column(name="archived")
    private Boolean archived;

    public Unit(Short id, String humanName, String systemName, String baseUnit, String coefficientToBaseUnit, String description, String idempotencyKey, String externalId, Timestamp createdAt, Timestamp updatedAt, Boolean archived) {
        this.id = id;
        this.humanName = humanName;
        this.systemName = systemName;
        this.baseUnit = baseUnit;
        this.coefficientToBaseUnit = coefficientToBaseUnit;
        this.description = description;
        this.idempotencyKey = idempotencyKey;
        this.externalId = externalId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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

    public String getHumanName() {
        return humanName;
    }

    public void setHumanName(String humanName) {
        this.humanName = humanName;
    }

    public String getSystemName() {
        return systemName;
    }

    public void setSystemName(String systemName) {
        this.systemName = systemName;
    }

    public String getBaseUnit() {
        return baseUnit;
    }

    public void setBaseUnit(String baseUnit) {
        this.baseUnit = baseUnit;
    }

    public String getCoefficientToBaseUnit() {
        return coefficientToBaseUnit;
    }

    public void setCoefficientToBaseUnit(String coefficientToBaseUnit) {
        this.coefficientToBaseUnit = coefficientToBaseUnit;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getIdempotencyKey() {
        return idempotencyKey;
    }

    public void setIdempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
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

    public Boolean isArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Unit unit = (Unit) o;
        return archived == unit.archived && Objects.equals(id, unit.id) && Objects.equals(humanName, unit.humanName) && Objects.equals(systemName, unit.systemName) && Objects.equals(baseUnit, unit.baseUnit) && Objects.equals(coefficientToBaseUnit, unit.coefficientToBaseUnit) && Objects.equals(description, unit.description) && Objects.equals(idempotencyKey, unit.idempotencyKey) && Objects.equals(externalId, unit.externalId) && Objects.equals(createdAt, unit.createdAt) && Objects.equals(updatedAt, unit.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, humanName, systemName, baseUnit, coefficientToBaseUnit, description, idempotencyKey, externalId, createdAt, updatedAt, archived);
    }

    @Override
    public String toString() {
        return "Unit{" +
                "id=" + id +
                ", humanName='" + humanName + '\'' +
                ", systemName='" + systemName + '\'' +
                ", baseUnit='" + baseUnit + '\'' +
                ", coefficientToBaseUnit='" + coefficientToBaseUnit + '\'' +
                ", description='" + description + '\'' +
                ", idempotencyKey='" + idempotencyKey + '\'' +
                ", externalId='" + externalId + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", archived=" + archived +
                '}';
    }
}
