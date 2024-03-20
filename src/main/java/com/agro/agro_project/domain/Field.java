package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="fields")
public class Field {
    @Id
    @Column(name="id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name="field_group_id")
    private FieldGroup fieldGroup;

    @Column(name="name", length=50)
    private String name;

    @Column(name="additional_name", length=50)
    private String additionalName;

    @Column(name="additional_info")
    @Lob
    private String additionalInfo;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="administrative_area_name", length=50)
    private String administrativeAreaName;

    @Column(name="subadministrative_area_name", length=50)
    private String subadministrativeAreaName;

    @Column(name="locality", length=20)
    private String locality;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    @Column(name="external_id", length=20)
    private String externalId;

    @Column(name="idempotency_key", length=20)
    private String idempotencyKey;

    @ManyToOne
    @JoinColumn(name="region_id")
    private AdminRegion region;

    @ManyToOne
    @JoinColumn(name="country_id")
    private AdminRegion country;

    @ManyToOne
    @JoinColumn(name="district_id")
    private AdminRegion district;

    @Column(name="x_custom_fields_data")
    @Lob
    private String xCustomFieldsData;

    public Field(Integer id, FieldGroup fieldGroup, String name, String additionalName, String additionalInfo, String description, String administrativeAreaName, String subadministrativeAreaName, String locality, Timestamp createdAt, Timestamp updatedAt, String externalId, String idempotencyKey, AdminRegion region, AdminRegion country, AdminRegion district, String xCustomFieldsData) {
        this.id = id;
        this.fieldGroup = fieldGroup;
        this.name = name;
        this.additionalName = additionalName;
        this.additionalInfo = additionalInfo;
        this.description = description;
        this.administrativeAreaName = administrativeAreaName;
        this.subadministrativeAreaName = subadministrativeAreaName;
        this.locality = locality;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.externalId = externalId;
        this.idempotencyKey = idempotencyKey;
        this.region = region;
        this.country = country;
        this.district = district;
        this.xCustomFieldsData = xCustomFieldsData;
    }

    public Field() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public FieldGroup getFieldGroup() {
        return fieldGroup;
    }

    public void setFieldGroup(FieldGroup fieldGroup) {
        this.fieldGroup = fieldGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdditionalName() {
        return additionalName;
    }

    public void setAdditionalName(String additionalName) {
        this.additionalName = additionalName;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdministrativeAreaName() {
        return administrativeAreaName;
    }

    public void setAdministrativeAreaName(String administrativeAreaName) {
        this.administrativeAreaName = administrativeAreaName;
    }

    public String getSubadministrativeAreaName() {
        return subadministrativeAreaName;
    }

    public void setSubadministrativeAreaName(String subadministrativeAreaName) {
        this.subadministrativeAreaName = subadministrativeAreaName;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
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

    public String getIdempotencyKey() {
        return idempotencyKey;
    }

    public void setIdempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
    }

    public AdminRegion getRegion() {
        return region;
    }

    public void setRegion(AdminRegion region) {
        this.region = region;
    }

    public AdminRegion getCountry() {
        return country;
    }

    public void setCountry(AdminRegion country) {
        this.country = country;
    }

    public AdminRegion getDistrict() {
        return district;
    }

    public void setDistrict(AdminRegion district) {
        this.district = district;
    }

    public String getxCustomFieldsData() {
        return xCustomFieldsData;
    }

    public void setxCustomFieldsData(String xCustomFieldsData) {
        this.xCustomFieldsData = xCustomFieldsData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Field field = (Field) o;
        return Objects.equals(id, field.id) && Objects.equals(fieldGroup, field.fieldGroup) && Objects.equals(name, field.name) && Objects.equals(additionalName, field.additionalName) && Objects.equals(additionalInfo, field.additionalInfo) && Objects.equals(description, field.description) && Objects.equals(administrativeAreaName, field.administrativeAreaName) && Objects.equals(subadministrativeAreaName, field.subadministrativeAreaName) && Objects.equals(locality, field.locality) && Objects.equals(createdAt, field.createdAt) && Objects.equals(updatedAt, field.updatedAt) && Objects.equals(externalId, field.externalId) && Objects.equals(idempotencyKey, field.idempotencyKey) && Objects.equals(region, field.region) && Objects.equals(country, field.country) && Objects.equals(district, field.district) && Objects.equals(xCustomFieldsData, field.xCustomFieldsData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fieldGroup, name, additionalName, additionalInfo, description, administrativeAreaName, subadministrativeAreaName, locality, createdAt, updatedAt, externalId, idempotencyKey, region, country, district, xCustomFieldsData);
    }

    @Override
    public String toString() {
        return "Field{" +
                "id=" + id +
                ", fieldGroup=" + fieldGroup +
                ", name='" + name + '\'' +
                ", additionalName='" + additionalName + '\'' +
                ", additionalInfo='" + additionalInfo + '\'' +
                ", description='" + description + '\'' +
                ", administrativeAreaName='" + administrativeAreaName + '\'' +
                ", subadministrativeAreaName='" + subadministrativeAreaName + '\'' +
                ", locality='" + locality + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", externalId='" + externalId + '\'' +
                ", idempotencyKey='" + idempotencyKey + '\'' +
                ", region=" + region +
                ", country=" + country +
                ", district=" + district +
                ", xCustomFieldsData='" + xCustomFieldsData + '\'' +
                '}';
    }
}
