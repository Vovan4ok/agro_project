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
    private String country_code;

    @Column(name="region_type", length=10)
    private String region_type;

    @Column(name="admin_level")
    private short admin_level;

    @Column(name="subdivision_code", length=10)
    private String subdivision_code;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    public AdminRegion(Short id, String name, String country_code, String region_type, short admin_level, String subdivision_code, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.name = name;
        this.country_code = country_code;
        this.region_type = region_type;
        this.admin_level = admin_level;
        this.subdivision_code = subdivision_code;
        this.created_at = created_at;
        this.updated_at = updated_at;
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

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public String getRegion_type() {
        return region_type;
    }

    public void setRegion_type(String region_type) {
        this.region_type = region_type;
    }

    public short getAdmin_level() {
        return admin_level;
    }

    public void setAdmin_level(short admin_level) {
        this.admin_level = admin_level;
    }

    public String getSubdivision_code() {
        return subdivision_code;
    }

    public void setSubdivision_code(String subdivision_code) {
        this.subdivision_code = subdivision_code;
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
        AdminRegion that = (AdminRegion) o;
        return admin_level == that.admin_level && Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(country_code, that.country_code) && Objects.equals(region_type, that.region_type) && Objects.equals(subdivision_code, that.subdivision_code) && Objects.equals(created_at, that.created_at) && Objects.equals(updated_at, that.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, country_code, region_type, admin_level, subdivision_code, created_at, updated_at);
    }

    @Override
    public String toString() {
        return "AdminRegions{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", country_code='" + country_code + '\'' +
                ", region_type='" + region_type + '\'' +
                ", admin_level=" + admin_level +
                ", subdivision_code='" + subdivision_code + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
