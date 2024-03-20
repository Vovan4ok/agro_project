package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="admin_regions")
public class AdminRegion {
    @Id
    @Column(name="id")
    private Short id;

    @Column(name="name", length=50)
    private String name;

    @Column(name="country_code", length=10)
    private String countryCode;

    @Column(name="region_type", length=10)
    private String regionType;

    @Column(name="admin_level")
    private short adminLevel;

    @Column(name="subdivision_code", length=10)
    private String subdivisionCode;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    public AdminRegion(Short id, String name, String countryCode, String regionType, short adminLevel, String subdivisionCode, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.name = name;
        this.countryCode = countryCode;
        this.regionType = regionType;
        this.adminLevel = adminLevel;
        this.subdivisionCode = subdivisionCode;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public AdminRegion() {
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

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public String getRegionType() {
        return regionType;
    }

    public void setRegionType(String regionType) {
        this.regionType = regionType;
    }

    public short getAdminLevel() {
        return adminLevel;
    }

    public void setAdminLevel(short adminLevel) {
        this.adminLevel = adminLevel;
    }

    public String getSubdivisionCode() {
        return subdivisionCode;
    }

    public void setSubdivisionCode(String subdivisionCode) {
        this.subdivisionCode = subdivisionCode;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AdminRegion that = (AdminRegion) o;
        return adminLevel == that.adminLevel && Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(countryCode, that.countryCode) && Objects.equals(regionType, that.regionType) && Objects.equals(subdivisionCode, that.subdivisionCode) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, countryCode, regionType, adminLevel, subdivisionCode, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "AdminRegions{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", countryCode='" + countryCode + '\'' +
                ", regionType='" + regionType + '\'' +
                ", adminLevel=" + adminLevel +
                ", subdivisionCode='" + subdivisionCode + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
