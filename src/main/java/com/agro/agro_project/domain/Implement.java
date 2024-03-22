package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="implements", schema="cropwise_data")
public class Implement {
    @Id
    @Column(name="id")
    private Short id;

    @Column(name="name", length=100)
    private String name;

    @Column(name="model", length=30)
    private String model;

    @Column(name="manufacturer", length=30)
    private String manufacturer;

    @Column(name="year")
    private Short year;

    @Column(name="registration_number", length=20)
    private String registrationNumber;

    @Column(name="inventory_number", length=20)
    private String inventoryNumber;

    @Column(name="implement_type", length=20)
    private String implementType;

    @Column(name="width")
    private Double width;

    @Column(name="official_width")
    private Double officialWidth;

    @Column(name="avatar_id")
    private Short avatarId;

    @Column(name="chassis_serial_number", length=50)
    private String chassisSerialNumber;

    @Column(name="legal_company")
    private String legalCompany;

    @Column(name="description")
    private String description;

    @Column(name="additional")
    private String additional;

    @Column(name="additional_info")
    private String additionalInfo;

    @Column(name="variable_width")
    private Boolean variableWidth;

    @Column(name="min_width")
    private Double minWidth;

    @Column(name="max_width")
    private Double maxWidth;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    @Column(name="external_id", length=50)
    private String externalId;

    @Column(name="virtual")
    private Boolean virtual;

    public Implement(Short id, String name, String model, String manufacturer, Short year, String registrationNumber, String inventoryNumber, String implementType, Double width, Double officialWidth, Short avatarId, String chassisSerialNumber, String legalCompany, String description, String additional, String additionalInfo, Boolean variableWidth, Double minWidth, Double maxWidth, Timestamp createdAt, Timestamp updatedAt, String externalId, Boolean virtual) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.registrationNumber = registrationNumber;
        this.inventoryNumber = inventoryNumber;
        this.implementType = implementType;
        this.width = width;
        this.officialWidth = officialWidth;
        this.avatarId = avatarId;
        this.chassisSerialNumber = chassisSerialNumber;
        this.legalCompany = legalCompany;
        this.description = description;
        this.additional = additional;
        this.additionalInfo = additionalInfo;
        this.variableWidth = variableWidth;
        this.minWidth = minWidth;
        this.maxWidth = maxWidth;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.externalId = externalId;
        this.virtual = virtual;
    }

    public Implement() {
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

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public Short getYear() {
        return year;
    }

    public void setYear(Short year) {
        this.year = year;
    }

    public String getRegistrationNumber() {
        return registrationNumber;
    }

    public void setRegistrationNumber(String registrationNumber) {
        this.registrationNumber = registrationNumber;
    }

    public String getInventoryNumber() {
        return inventoryNumber;
    }

    public void setInventoryNumber(String inventoryNumber) {
        this.inventoryNumber = inventoryNumber;
    }

    public String getImplementType() {
        return implementType;
    }

    public void setImplementType(String implementType) {
        this.implementType = implementType;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getOfficialWidth() {
        return officialWidth;
    }

    public void setOfficialWidth(Double officialWidth) {
        this.officialWidth = officialWidth;
    }

    public Short getAvatarId() {
        return avatarId;
    }

    public void setAvatarId(Short avatarId) {
        this.avatarId = avatarId;
    }

    public String getChassisSerialNumber() {
        return chassisSerialNumber;
    }

    public void setChassisSerialNumber(String chassisSerialNumber) {
        this.chassisSerialNumber = chassisSerialNumber;
    }

    public String getLegalCompany() {
        return legalCompany;
    }

    public void setLegalCompany(String legalCompany) {
        this.legalCompany = legalCompany;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdditional() {
        return additional;
    }

    public void setAdditional(String additional) {
        this.additional = additional;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public Boolean isVariableWidth() {
        return variableWidth;
    }

    public void setVariableWidth(Boolean variableWidth) {
        this.variableWidth = variableWidth;
    }

    public Double getMinWidth() {
        return minWidth;
    }

    public void setMinWidth(Double minWidth) {
        this.minWidth = minWidth;
    }

    public Double getMaxWidth() {
        return maxWidth;
    }

    public void setMaxWidth(Double maxWidth) {
        this.maxWidth = maxWidth;
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

    public Boolean isVirtual() {
        return virtual;
    }

    public void setVirtual(Boolean virtual) {
        this.virtual = virtual;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Implement implement = (Implement) o;
        return Objects.equals(year, implement.year) && Double.compare(width, implement.width) == 0 && Double.compare(officialWidth, implement.officialWidth) == 0 && Objects.equals(avatarId, implement.avatarId) && variableWidth == implement.variableWidth && Double.compare(minWidth, implement.minWidth) == 0 && Double.compare(maxWidth, implement.maxWidth) == 0 && virtual == implement.virtual && Objects.equals(id, implement.id) && Objects.equals(name, implement.name) && Objects.equals(model, implement.model) && Objects.equals(manufacturer, implement.manufacturer) && Objects.equals(registrationNumber, implement.registrationNumber) && Objects.equals(inventoryNumber, implement.inventoryNumber) && Objects.equals(implementType, implement.implementType) && Objects.equals(chassisSerialNumber, implement.chassisSerialNumber) && Objects.equals(legalCompany, implement.legalCompany) && Objects.equals(description, implement.description) && Objects.equals(additional, implement.additional) && Objects.equals(additionalInfo, implement.additionalInfo) && Objects.equals(createdAt, implement.createdAt) && Objects.equals(updatedAt, implement.updatedAt) && Objects.equals(externalId, implement.externalId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, model, manufacturer, year, registrationNumber, inventoryNumber, implementType, width, officialWidth, avatarId, chassisSerialNumber, legalCompany, description, additional, additionalInfo, variableWidth, minWidth, maxWidth, createdAt, updatedAt, externalId, virtual);
    }

    @Override
    public String toString() {
        return "Implement{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", inventoryNumber='" + inventoryNumber + '\'' +
                ", implementType='" + implementType + '\'' +
                ", width=" + width +
                ", officialWidth=" + officialWidth +
                ", avatarId=" + avatarId +
                ", chassisSerialNumber='" + chassisSerialNumber + '\'' +
                ", legalCompany='" + legalCompany + '\'' +
                ", description='" + description + '\'' +
                ", additional='" + additional + '\'' +
                ", additionalInfo='" + additionalInfo + '\'' +
                ", variableWidth=" + variableWidth +
                ", minWidth=" + minWidth +
                ", maxWidth=" + maxWidth +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", externalId='" + externalId + '\'' +
                ", virtual=" + virtual +
                '}';
    }
}
