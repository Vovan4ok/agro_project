package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="land_parcels")
public class LandParcel {
    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="additional_info")
    @Lob
    private String additional_info;

    @Column(name="address", length=50)
    private String address;

    @Column(name="area_type", length=20)
    private String area_type;

    @Column(name="cadastral_area")
    private double cadastral_area;

    @Column(name="cadastral_number", length=30)
    private String cadastral_number;

    @Column(name="cadastral_price")
    private double cadastral_price;

    @Column(name="calculated_area")
    private double calculated_area;

    @Column(name="country_code", length=5)
    private String country_code;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="document_status", length=20)
    private String document_status;

    @Column(name="external_id", length=50)
    private String external_id;

    @ManyToOne
    @JoinColumn(name="field_group_id")
    private FieldGroup fieldGroup;

    @Column(name="geo_json")
    @Lob
    private String geo_json;

    @Column(name="in_archive")
    private boolean in_archive;

    @Column(name="ownership_type", length=20)
    private String ownership_type;

    @Column(name="permitted_use")
    @Lob
    private String permitted_use;

    @Column(name="planned_action")
    private boolean planned_action;

    @Column(name="region", length=50)
    private String region;

    @Column(name="registration_number", length=20)
    private String registration_number;

    @Column(name="subadministrative_area_name", length=50)
    private String subadministrative_area_name;

    @Column(name="updated_at")
    private Timestamp updated_at;

    @Column(name="village_council", length=30)
    private String village_council;

    @Column(name="x_custom_vlasnik_zemelnoyi_dilyanki")
    @Lob
    private String x_custom_vlasnik_zemelnoyi_dilyanki;

    public LandParcel(Integer id, String additional_info, String address, String area_type, double cadastral_area, String cadastral_number, double cadastral_price, double calculated_area, String country_code, Timestamp created_at, String description, String document_status, String external_id, FieldGroup fieldGroup, String geo_json, boolean in_archive, String ownership_type, String permitted_use, boolean planned_action, String region, String registration_number, String subadministrative_area_name, Timestamp updated_at, String village_council, String x_custom_vlasnik_zemelnoyi_dilyanki) {
        this.id = id;
        this.additional_info = additional_info;
        this.address = address;
        this.area_type = area_type;
        this.cadastral_area = cadastral_area;
        this.cadastral_number = cadastral_number;
        this.cadastral_price = cadastral_price;
        this.calculated_area = calculated_area;
        this.country_code = country_code;
        this.created_at = created_at;
        this.description = description;
        this.document_status = document_status;
        this.external_id = external_id;
        this.fieldGroup = fieldGroup;
        this.geo_json = geo_json;
        this.in_archive = in_archive;
        this.ownership_type = ownership_type;
        this.permitted_use = permitted_use;
        this.planned_action = planned_action;
        this.region = region;
        this.registration_number = registration_number;
        this.subadministrative_area_name = subadministrative_area_name;
        this.updated_at = updated_at;
        this.village_council = village_council;
        this.x_custom_vlasnik_zemelnoyi_dilyanki = x_custom_vlasnik_zemelnoyi_dilyanki;
    }

    public LandParcel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdditional_info() {
        return additional_info;
    }

    public void setAdditional_info(String additional_info) {
        this.additional_info = additional_info;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getArea_type() {
        return area_type;
    }

    public void setArea_type(String area_type) {
        this.area_type = area_type;
    }

    public double getCadastral_area() {
        return cadastral_area;
    }

    public void setCadastral_area(double cadastral_area) {
        this.cadastral_area = cadastral_area;
    }

    public String getCadastral_number() {
        return cadastral_number;
    }

    public void setCadastral_number(String cadastral_number) {
        this.cadastral_number = cadastral_number;
    }

    public double getCadastral_price() {
        return cadastral_price;
    }

    public void setCadastral_price(double cadastral_price) {
        this.cadastral_price = cadastral_price;
    }

    public double getCalculated_area() {
        return calculated_area;
    }

    public void setCalculated_area(double calculated_area) {
        this.calculated_area = calculated_area;
    }

    public String getCountry_code() {
        return country_code;
    }

    public void setCountry_code(String country_code) {
        this.country_code = country_code;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDocument_status() {
        return document_status;
    }

    public void setDocument_status(String document_status) {
        this.document_status = document_status;
    }

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }

    public FieldGroup getFieldGroup() {
        return fieldGroup;
    }

    public void setFieldGroup(FieldGroup fieldGroup) {
        this.fieldGroup = fieldGroup;
    }

    public String getGeo_json() {
        return geo_json;
    }

    public void setGeo_json(String geo_json) {
        this.geo_json = geo_json;
    }

    public boolean isIn_archive() {
        return in_archive;
    }

    public void setIn_archive(boolean in_archive) {
        this.in_archive = in_archive;
    }

    public String getOwnership_type() {
        return ownership_type;
    }

    public void setOwnership_type(String ownership_type) {
        this.ownership_type = ownership_type;
    }

    public String getPermitted_use() {
        return permitted_use;
    }

    public void setPermitted_use(String permitted_use) {
        this.permitted_use = permitted_use;
    }

    public boolean isPlanned_action() {
        return planned_action;
    }

    public void setPlanned_action(boolean planned_action) {
        this.planned_action = planned_action;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegistration_number() {
        return registration_number;
    }

    public void setRegistration_number(String registration_number) {
        this.registration_number = registration_number;
    }

    public String getSubadministrative_area_name() {
        return subadministrative_area_name;
    }

    public void setSubadministrative_area_name(String subadministrative_area_name) {
        this.subadministrative_area_name = subadministrative_area_name;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    public String getVillage_council() {
        return village_council;
    }

    public void setVillage_council(String village_council) {
        this.village_council = village_council;
    }

    public String getX_custom_vlasnik_zemelnoyi_dilyanki() {
        return x_custom_vlasnik_zemelnoyi_dilyanki;
    }

    public void setX_custom_vlasnik_zemelnoyi_dilyanki(String x_custom_vlasnik_zemelnoyi_dilyanki) {
        this.x_custom_vlasnik_zemelnoyi_dilyanki = x_custom_vlasnik_zemelnoyi_dilyanki;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LandParcel that = (LandParcel) o;
        return Double.compare(cadastral_area, that.cadastral_area) == 0 && Double.compare(cadastral_price, that.cadastral_price) == 0 && Double.compare(calculated_area, that.calculated_area) == 0 && in_archive == that.in_archive && planned_action == that.planned_action && Objects.equals(id, that.id) && Objects.equals(additional_info, that.additional_info) && Objects.equals(address, that.address) && Objects.equals(area_type, that.area_type) && Objects.equals(cadastral_number, that.cadastral_number) && Objects.equals(country_code, that.country_code) && Objects.equals(created_at, that.created_at) && Objects.equals(description, that.description) && Objects.equals(document_status, that.document_status) && Objects.equals(external_id, that.external_id) && Objects.equals(fieldGroup, that.fieldGroup) && Objects.equals(geo_json, that.geo_json) && Objects.equals(ownership_type, that.ownership_type) && Objects.equals(permitted_use, that.permitted_use) && Objects.equals(region, that.region) && Objects.equals(registration_number, that.registration_number) && Objects.equals(subadministrative_area_name, that.subadministrative_area_name) && Objects.equals(updated_at, that.updated_at) && Objects.equals(village_council, that.village_council) && Objects.equals(x_custom_vlasnik_zemelnoyi_dilyanki, that.x_custom_vlasnik_zemelnoyi_dilyanki);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, additional_info, address, area_type, cadastral_area, cadastral_number, cadastral_price, calculated_area, country_code, created_at, description, document_status, external_id, fieldGroup, geo_json, in_archive, ownership_type, permitted_use, planned_action, region, registration_number, subadministrative_area_name, updated_at, village_council, x_custom_vlasnik_zemelnoyi_dilyanki);
    }

    @Override
    public String toString() {
        return "LandParcel{" +
                "id=" + id +
                ", additional_info='" + additional_info + '\'' +
                ", address='" + address + '\'' +
                ", area_type='" + area_type + '\'' +
                ", cadastral_area=" + cadastral_area +
                ", cadastral_number='" + cadastral_number + '\'' +
                ", cadastral_price=" + cadastral_price +
                ", calculated_area=" + calculated_area +
                ", country_code='" + country_code + '\'' +
                ", created_at=" + created_at +
                ", description='" + description + '\'' +
                ", document_status='" + document_status + '\'' +
                ", external_id='" + external_id + '\'' +
                ", fieldGroup=" + fieldGroup +
                ", geo_json='" + geo_json + '\'' +
                ", in_archive=" + in_archive +
                ", ownership_type='" + ownership_type + '\'' +
                ", permitted_use='" + permitted_use + '\'' +
                ", planned_action=" + planned_action +
                ", region='" + region + '\'' +
                ", registration_number='" + registration_number + '\'' +
                ", subadministrative_area_name='" + subadministrative_area_name + '\'' +
                ", updated_at=" + updated_at +
                ", village_council='" + village_council + '\'' +
                ", x_custom_vlasnik_zemelnoyi_dilyanki='" + x_custom_vlasnik_zemelnoyi_dilyanki + '\'' +
                '}';
    }
}
