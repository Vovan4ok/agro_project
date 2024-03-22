package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="land_parcels", schema="cropwise_data")
public class LandParcel {
    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="additional_info")
    private String additionalInfo;

    @Column(name="address", length=50)
    private String address;

    @Column(name="area_type", length=20)
    private String areaType;

    @Column(name="cadastral_area")
    private Double cadastralArea;

    @Column(name="cadastral_number", length=30)
    private String cadastralNumber;

    @Column(name="cadastral_price")
    private Double cadastralPrice;

    @Column(name="calculated_area")
    private Double calculatedArea;

    @Column(name="country_code", length=5)
    private String countryCode;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="description")
    private String description;

    @Column(name="document_status", length=20)
    private String documentStatus;

    @Column(name="external_id", length=50)
    private String externalId;

    @ManyToOne
    @JoinColumn(name="field_group_id")
    private FieldGroup fieldGroup;

    @Column(name="geo_json")
    private String geoJson;

    @Column(name="in_archive")
    private Boolean inArchive;

    @Column(name="ownership_type", length=20)
    private String ownershipType;

    @Column(name="permitted_use")
    private String permittedUse;

    @Column(name="planned_action")
    private Boolean plannedAction;

    @Column(name="region", length=50)
    private String region;

    @Column(name="registration_number", length=20)
    private String registrationNumber;

    @Column(name="subadministrative_area_name", length=50)
    private String subadministrativeAreaName;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    @Column(name="village_council", length=30)
    private String villageCouncil;

    @Column(name="x_custom_vlasnik_zemelnoyi_dilyanki")
    private String xCustomVlasnikZemelnoyiDilyanki;

    public LandParcel(Integer id, String additionalInfo, String address, String areaType, Double cadastralArea, String cadastralNumber, Double cadastralPrice, Double calculatedArea, String countryCode, Timestamp createdAt, String description, String documentStatus, String externalId, FieldGroup fieldGroup, String geoJson, Boolean inArchive, String ownershipType, String permittedUse, Boolean plannedAction, String region, String registrationNumber, String subadministrativeAreaName, Timestamp updatedAt, String villageCouncil, String xCustomVlasnikZemelnoyiDilyanki) {
        this.id = id;
        this.additionalInfo = additionalInfo;
        this.address = address;
        this.areaType = areaType;
        this.cadastralArea = cadastralArea;
        this.cadastralNumber = cadastralNumber;
        this.cadastralPrice = cadastralPrice;
        this.calculatedArea = calculatedArea;
        this.countryCode = countryCode;
        this.createdAt = createdAt;
        this.description = description;
        this.documentStatus = documentStatus;
        this.externalId = externalId;
        this.fieldGroup = fieldGroup;
        this.geoJson = geoJson;
        this.inArchive = inArchive;
        this.ownershipType = ownershipType;
        this.permittedUse = permittedUse;
        this.plannedAction = plannedAction;
        this.region = region;
        this.registrationNumber = registrationNumber;
        this.subadministrativeAreaName = subadministrativeAreaName;
        this.updatedAt = updatedAt;
        this.villageCouncil = villageCouncil;
        this.xCustomVlasnikZemelnoyiDilyanki = xCustomVlasnikZemelnoyiDilyanki;
    }

    public LandParcel() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getAreaType() {
        return areaType;
    }

    public void setAreaType(String areaType) {
        this.areaType = areaType;
    }

    public Double getCadastralArea() {
        return cadastralArea;
    }

    public void setCadastralArea(Double cadastralArea) {
        this.cadastralArea = cadastralArea;
    }

    public String getCadastralNumber() {
        return cadastralNumber;
    }

    public void setCadastralNumber(String cadastralNumber) {
        this.cadastralNumber = cadastralNumber;
    }

    public Double getCadastralPrice() {
        return cadastralPrice;
    }

    public void setCadastralPrice(Double cadastralPrice) {
        this.cadastralPrice = cadastralPrice;
    }

    public Double getCalculatedArea() {
        return calculatedArea;
    }

    public void setCalculatedArea(Double calculatedArea) {
        this.calculatedArea = calculatedArea;
    }

    public String getCountryCode() {
        return countryCode;
    }

    public void setCountryCode(String countryCode) {
        this.countryCode = countryCode;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDocumentStatus() {
        return documentStatus;
    }

    public void setDocumentStatus(String documentStatus) {
        this.documentStatus = documentStatus;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public FieldGroup getFieldGroup() {
        return fieldGroup;
    }

    public void setFieldGroup(FieldGroup fieldGroup) {
        this.fieldGroup = fieldGroup;
    }

    public String getGeoJson() {
        return geoJson;
    }

    public void setGeoJson(String geoJson) {
        this.geoJson = geoJson;
    }

    public Boolean isInArchive() {
        return inArchive;
    }

    public void setInArchive(Boolean inArchive) {
        this.inArchive = inArchive;
    }

    public String getOwnershipType() {
        return ownershipType;
    }

    public void setOwnershipType(String ownershipType) {
        this.ownershipType = ownershipType;
    }

    public String getPermittedUse() {
        return permittedUse;
    }

    public void setPermittedUse(String permittedUse) {
        this.permittedUse = permittedUse;
    }

    public Boolean isPlannedAction() {
        return plannedAction;
    }

    public void setPlannedAction(Boolean plannedAction) {
        this.plannedAction = plannedAction;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getSubadministrativeAreaName() {
        return subadministrativeAreaName;
    }

    public void setSubadministrativeAreaName(String subadministrativeAreaName) {
        this.subadministrativeAreaName = subadministrativeAreaName;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    public String getVillageCouncil() {
        return villageCouncil;
    }

    public void setVillageCouncil(String villageCouncil) {
        this.villageCouncil = villageCouncil;
    }

    public String getXCustomVlasnikZemelnoyiDilyanki() {
        return xCustomVlasnikZemelnoyiDilyanki;
    }

    public void setXCustomVlasnikZemelnoyiDilyanki(String xCustomVlasnikZemelnoyiDilyanki) {
        this.xCustomVlasnikZemelnoyiDilyanki = xCustomVlasnikZemelnoyiDilyanki;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        LandParcel that = (LandParcel) o;
        return Double.compare(cadastralArea, that.cadastralArea) == 0 && Double.compare(cadastralPrice, that.cadastralPrice) == 0 && Double.compare(calculatedArea, that.calculatedArea) == 0 && inArchive == that.inArchive && plannedAction == that.plannedAction && Objects.equals(id, that.id) && Objects.equals(additionalInfo, that.additionalInfo) && Objects.equals(address, that.address) && Objects.equals(areaType, that.areaType) && Objects.equals(cadastralNumber, that.cadastralNumber) && Objects.equals(countryCode, that.countryCode) && Objects.equals(createdAt, that.createdAt) && Objects.equals(description, that.description) && Objects.equals(documentStatus, that.documentStatus) && Objects.equals(externalId, that.externalId) && Objects.equals(fieldGroup, that.fieldGroup) && Objects.equals(geoJson, that.geoJson) && Objects.equals(ownershipType, that.ownershipType) && Objects.equals(permittedUse, that.permittedUse) && Objects.equals(region, that.region) && Objects.equals(registrationNumber, that.registrationNumber) && Objects.equals(subadministrativeAreaName, that.subadministrativeAreaName) && Objects.equals(updatedAt, that.updatedAt) && Objects.equals(villageCouncil, that.villageCouncil) && Objects.equals(xCustomVlasnikZemelnoyiDilyanki, that.xCustomVlasnikZemelnoyiDilyanki);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, additionalInfo, address, areaType, cadastralArea, cadastralNumber, cadastralPrice, calculatedArea, countryCode, createdAt, description, documentStatus, externalId, fieldGroup, geoJson, inArchive, ownershipType, permittedUse, plannedAction, region, registrationNumber, subadministrativeAreaName, updatedAt, villageCouncil, xCustomVlasnikZemelnoyiDilyanki);
    }

    @Override
    public String toString() {
        return "LandParcel{" +
                "id=" + id +
                ", additionalInfo='" + additionalInfo + '\'' +
                ", address='" + address + '\'' +
                ", areaType='" + areaType + '\'' +
                ", cadastralArea=" + cadastralArea +
                ", cadastralNumber='" + cadastralNumber + '\'' +
                ", cadastralPrice=" + cadastralPrice +
                ", calculatedArea=" + calculatedArea +
                ", countryCode='" + countryCode + '\'' +
                ", createdAt=" + createdAt +
                ", description='" + description + '\'' +
                ", documentStatus='" + documentStatus + '\'' +
                ", externalId='" + externalId + '\'' +
                ", fieldGroup=" + fieldGroup +
                ", geoJson='" + geoJson + '\'' +
                ", inArchive=" + inArchive +
                ", ownershipType='" + ownershipType + '\'' +
                ", permittedUse='" + permittedUse + '\'' +
                ", plannedAction=" + plannedAction +
                ", region='" + region + '\'' +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", subadministrativeAreaName='" + subadministrativeAreaName + '\'' +
                ", updatedAt=" + updatedAt +
                ", villageCouncil='" + villageCouncil + '\'' +
                ", xCustomVlasnikZemelnoyiDilyanki='" + xCustomVlasnikZemelnoyiDilyanki + '\'' +
                '}';
    }
}
