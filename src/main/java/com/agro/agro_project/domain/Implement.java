package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="implements")
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
    private short year;

    @Column(name="registration_number", length=20)
    private String registrationNumber;

    @Column(name="inventory_number", length=20)
    private String inventoryNumber;

    @Column(name="implement_type", length=20)
    private String implementType;

    @Column(name="width")
    private double width;

    @Column(name="official_width")
    private double officialWidth;

    @Column(name="avatar_id")
    private short avatarId;

    @Column(name="chassis_serial_number", length=50)
    private String chassisSerialNumber;

    @Column(name="legal_company")
    @Lob
    private String legalCompany;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="additional")
    @Lob
    private String additional;

    @Column(name="additional_info")
    @Lob
    private String additionalInfo;

    @Column(name="variable_width")
    private boolean variableWidth;

    @Column(name="min_width")
    private double minWidth;

    @Column(name="max_width")
    private double maxWidth;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    @Column(name="external_id", length=50)
    private String externalId;

    @Column(name="virtual")
    private boolean virtual;

    public Implement(Short id, String name, String model, String manufacturer, short year, String registrationNumber, String inventoryNumber, String implementType, double width, double officialWidth, short avatarId, String chassisSerialNumber, String legalCompany, String description, String additional, String additionalInfo, boolean variableWidth, double minWidth, double maxWidth, Timestamp createdAt, Timestamp updatedAt, String externalId, boolean virtual) {
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

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
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

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getOfficialWidth() {
        return officialWidth;
    }

    public void setOfficialWidth(double officialWidth) {
        this.officialWidth = officialWidth;
    }

    public short getAvatarId() {
        return avatarId;
    }

    public void setAvatarId(short avatarId) {
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

    public boolean isVariableWidth() {
        return variableWidth;
    }

    public void setVariableWidth(boolean variableWidth) {
        this.variableWidth = variableWidth;
    }

    public double getMinWidth() {
        return minWidth;
    }

    public void setMinWidth(double minWidth) {
        this.minWidth = minWidth;
    }

    public double getMaxWidth() {
        return maxWidth;
    }

    public void setMaxWidth(double maxWidth) {
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

    public boolean isVirtual() {
        return virtual;
    }

    public void setVirtual(boolean virtual) {
        this.virtual = virtual;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Implement implement = (Implement) o;
        return year == implement.year && Double.compare(width, implement.width) == 0 && Double.compare(officialWidth, implement.officialWidth) == 0 && avatarId == implement.avatarId && variableWidth == implement.variableWidth && Double.compare(minWidth, implement.minWidth) == 0 && Double.compare(maxWidth, implement.maxWidth) == 0 && virtual == implement.virtual && Objects.equals(id, implement.id) && Objects.equals(name, implement.name) && Objects.equals(model, implement.model) && Objects.equals(manufacturer, implement.manufacturer) && Objects.equals(registrationNumber, implement.registrationNumber) && Objects.equals(inventoryNumber, implement.inventoryNumber) && Objects.equals(implementType, implement.implementType) && Objects.equals(chassisSerialNumber, implement.chassisSerialNumber) && Objects.equals(legalCompany, implement.legalCompany) && Objects.equals(description, implement.description) && Objects.equals(additional, implement.additional) && Objects.equals(additionalInfo, implement.additionalInfo) && Objects.equals(createdAt, implement.createdAt) && Objects.equals(updatedAt, implement.updatedAt) && Objects.equals(externalId, implement.externalId);
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
