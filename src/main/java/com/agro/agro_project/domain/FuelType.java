package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="fuel_types", schema="cropwise_data")
public class FuelType {
    @Id
    @Column(name="id")
    private Short id;

    @Column(name="name", length=20)
    private String name;

    @Column(name="short_name", length=10)
    private String shortName;

    @Column(name="standard_name", length=20)
    private String standardName;

    @Column(name="category", length=20)
    private String category;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    @Column(name="external_id", length=50)
    private String externalId;

    public FuelType(Short id, String name, String shortName, String standardName, String category, Timestamp createdAt, Timestamp updatedAt, String externalId) {
        this.id = id;
        this.name = name;
        this.shortName = shortName;
        this.standardName = standardName;
        this.category = category;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.externalId = externalId;
    }

    public FuelType() {
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

    public String getShortName() {
        return shortName;
    }

    public void setShortName(String shortName) {
        this.shortName = shortName;
    }

    public String getStandardName() {
        return standardName;
    }

    public void setStandardName(String standardName) {
        this.standardName = standardName;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
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
        FuelType fuelType = (FuelType) o;
        return Objects.equals(id, fuelType.id) && Objects.equals(name, fuelType.name) && Objects.equals(shortName, fuelType.shortName) && Objects.equals(standardName, fuelType.standardName) && Objects.equals(category, fuelType.category) && Objects.equals(createdAt, fuelType.createdAt) && Objects.equals(updatedAt, fuelType.updatedAt) && Objects.equals(externalId, fuelType.externalId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, shortName, standardName, category, createdAt, updatedAt, externalId);
    }

    @Override
    public String toString() {
        return "FuelType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", shortName='" + shortName + '\'' +
                ", standardName='" + standardName + '\'' +
                ", category='" + category + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", externalId='" + externalId + '\'' +
                '}';
    }
}
