package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="machines", schema="cropwise_data")
public class Machine {
    @Id
    @Column(name="id")
    private Short id;

    @Column(name="name", length=100)
    private String name;

    @Column(name="model", length=20)
    private String model;

    @Column(name="manufacturer", length=50)
    private String manufacturer;

    @Column(name="year")
    private Short year;

    @Column(name="registration_number", length=20)
    private String registrationNumber;

    @Column(name="inventory_number", length=20)
    private String inventoryNumber;

    @ManyToOne
    @JoinColumn(name="machine_group_id")
    private MachineGroup machineGroup;

    @Column(name="machine_type", length=20)
    private String machineType;

    @Column(name="machine_subtype", length=20)
    private String machineSubtype;

    @Column(name="avatar_id")
    private Short avatarId;

    @Column(name="chassis_serial_number", length=20)
    private String chassisSerialNumber;

    @Column(name="engine_serial_number", length=20)
    private String engineSerialNumber;

    @Column(name="engine_power")
    private Short enginePower;

    @Column(name="fuel_type", length=10)
    private String fuelTypeString;

    @Column(name="fuel_tank_size")
    private Double fuelTankSize;

    @Column(name="fuel_consumption_norm")
    private Double fuelConsumptionNorm;

    @Column(name="legal_company", length=50)
    private String legalCompany;

    @Column(name="description")
    private String description;

    @ManyToOne
    @JoinColumn(name="default_implement_id")
    private Implement defaultImplement;

    @ManyToOne
    @JoinColumn(name="default_driver_id")
    private User defaultDriver;

    @Column(name="additional_1")
    private String additional1;

    @Column(name="additional_2")
    private String additional2;

    @Column(name="additional_info")
    private String additionalInfo;

    @Column(name="phone_number", length=20)
    private String phoneNumber;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    @Column(name="external_id", length=50)
    private String externalId;

    @ManyToOne
    @JoinColumn(name="fuel_type_id")
    private FuelType fuelType;

    @Column(name="refuel_source", length=20)
    private String refuelSource;

    @Column(name="engine_capacity")
    private Double engineCapacity;

    @Column(name="weight")
    private Double weight;

    @Column(name="height")
    private Double height;

    @Column(name="width")
    private Double width;

    @Column(name="length")
    private Double length;

    @Column(name="unchanged_default_implement")
    private Boolean unchangedDefaultImplement;

    @Column(name="min_downtime_in_seconds")
    private Short minDowntimeInSeconds;

    @Column(name="calculate_downtimes", length=20)
    private String calculateDowntimes;

    public Machine(Short id, String name, String model, String manufacturer, Short year, String registrationNumber, String inventoryNumber, MachineGroup machineGroup, String machineType, String machine_subtype, Short avatarId, String chassisSerialNumber, String engineSerialNumber, Short enginePower, String fuelTypeString, Double fuelTankSize, Double fuelConsumptionNorm, String legalCompany, String description, Implement defaultImplement, User defaultDriver, String additional1, String additional2, String additionalInfo, String phoneNumber, Timestamp createdAt, Timestamp updatedAt, String externalId, FuelType fuelType, String refuelSource, Double engineCapacity, Double weight, Double height, Double width, Double length, Boolean unchangedDefaultImplement, Short minDowntimeInSeconds, String calculateDowntimes) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.registrationNumber = registrationNumber;
        this.inventoryNumber = inventoryNumber;
        this.machineGroup = machineGroup;
        this.machineType = machineType;
        this.machineSubtype = machine_subtype;
        this.avatarId = avatarId;
        this.chassisSerialNumber = chassisSerialNumber;
        this.engineSerialNumber = engineSerialNumber;
        this.enginePower = enginePower;
        this.fuelTypeString = fuelTypeString;
        this.fuelTankSize = fuelTankSize;
        this.fuelConsumptionNorm = fuelConsumptionNorm;
        this.legalCompany = legalCompany;
        this.description = description;
        this.defaultImplement = defaultImplement;
        this.defaultDriver = defaultDriver;
        this.additional1 = additional1;
        this.additional2 = additional2;
        this.additionalInfo = additionalInfo;
        this.phoneNumber = phoneNumber;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.externalId = externalId;
        this.fuelType = fuelType;
        this.refuelSource = refuelSource;
        this.engineCapacity = engineCapacity;
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.length = length;
        this.unchangedDefaultImplement = unchangedDefaultImplement;
        this.minDowntimeInSeconds = minDowntimeInSeconds;
        this.calculateDowntimes = calculateDowntimes;
    }

    public Machine() {
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

    public MachineGroup getMachineGroup() {
        return machineGroup;
    }

    public void setMachineGroup(MachineGroup machineGroup) {
        this.machineGroup = machineGroup;
    }

    public String getMachineType() {
        return machineType;
    }

    public void setMachineType(String machineType) {
        this.machineType = machineType;
    }

    public String getMachineSubtype() {
        return machineSubtype;
    }

    public void setMachineSubtype(String machineSubtype) {
        this.machineSubtype = machineSubtype;
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

    public String getEngineSerialNumber() {
        return engineSerialNumber;
    }

    public void setEngineSerialNumber(String engineSerialNumber) {
        this.engineSerialNumber = engineSerialNumber;
    }

    public Short getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(Short enginePower) {
        this.enginePower = enginePower;
    }

    public String getFuelTypeString() {
        return fuelTypeString;
    }

    public void setFuelTypeString(String fuelTypeString) {
        this.fuelTypeString = fuelTypeString;
    }

    public Double getFuelTankSize() {
        return fuelTankSize;
    }

    public void setFuelTankSize(Double fuelTankSize) {
        this.fuelTankSize = fuelTankSize;
    }

    public Double getFuelConsumptionNorm() {
        return fuelConsumptionNorm;
    }

    public void setFuelConsumptionNorm(Double fuelConsumptionNorm) {
        this.fuelConsumptionNorm = fuelConsumptionNorm;
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

    public Implement getDefaultImplement() {
        return defaultImplement;
    }

    public void setDefaultImplement(Implement defaultImplement) {
        this.defaultImplement = defaultImplement;
    }

    public User getDefaultDriver() {
        return defaultDriver;
    }

    public void setDefaultDriver(User defaultDriver) {
        this.defaultDriver = defaultDriver;
    }

    public String getAdditional1() {
        return additional1;
    }

    public void setAdditional1(String additional1) {
        this.additional1 = additional1;
    }

    public String getAdditional2() {
        return additional2;
    }

    public void setAdditional2(String additional2) {
        this.additional2 = additional2;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
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

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public String getRefuelSource() {
        return refuelSource;
    }

    public void setRefuelSource(String refuelSource) {
        this.refuelSource = refuelSource;
    }

    public Double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(Double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }

    public Double getHeight() {
        return height;
    }

    public void setHeight(Double height) {
        this.height = height;
    }

    public Double getWidth() {
        return width;
    }

    public void setWidth(Double width) {
        this.width = width;
    }

    public Double getLength() {
        return length;
    }

    public void setLength(Double length) {
        this.length = length;
    }

    public Boolean isUnchangedDefaultImplement() {
        return unchangedDefaultImplement;
    }

    public void setUnchangedDefaultImplement(Boolean unchangedDefaultImplement) {
        this.unchangedDefaultImplement = unchangedDefaultImplement;
    }

    public Short getMinDowntimeInSeconds() {
        return minDowntimeInSeconds;
    }

    public void setMinDowntimeInSeconds(Short minDowntimeInSeconds) {
        this.minDowntimeInSeconds = minDowntimeInSeconds;
    }

    public String getCalculateDowntimes() {
        return calculateDowntimes;
    }

    public void setCalculateDowntimes(String calculateDowntimes) {
        this.calculateDowntimes = calculateDowntimes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Machine machine = (Machine) o;
        return Objects.equals(year, machine.year) && Objects.equals(avatarId, machine.avatarId) && Objects.equals(enginePower, machine.enginePower) && Double.compare(fuelTankSize, machine.fuelTankSize) == 0 && Double.compare(fuelConsumptionNorm, machine.fuelConsumptionNorm) == 0 && Double.compare(engineCapacity, machine.engineCapacity) == 0 && Double.compare(weight, machine.weight) == 0 && Double.compare(height, machine.height) == 0 && Double.compare(width, machine.width) == 0 && Double.compare(length, machine.length) == 0 && unchangedDefaultImplement == machine.unchangedDefaultImplement && minDowntimeInSeconds == machine.minDowntimeInSeconds && Objects.equals(id, machine.id) && Objects.equals(name, machine.name) && Objects.equals(model, machine.model) && Objects.equals(manufacturer, machine.manufacturer) && Objects.equals(registrationNumber, machine.registrationNumber) && Objects.equals(inventoryNumber, machine.inventoryNumber) && Objects.equals(machineGroup, machine.machineGroup) && Objects.equals(machineType, machine.machineType) && Objects.equals(machineSubtype, machine.machineSubtype) && Objects.equals(chassisSerialNumber, machine.chassisSerialNumber) && Objects.equals(engineSerialNumber, machine.engineSerialNumber) && Objects.equals(fuelTypeString, machine.fuelTypeString) && Objects.equals(legalCompany, machine.legalCompany) && Objects.equals(description, machine.description) && Objects.equals(defaultImplement, machine.defaultImplement) && Objects.equals(defaultDriver, machine.defaultDriver) && Objects.equals(additional1, machine.additional1) && Objects.equals(additional2, machine.additional2) && Objects.equals(additionalInfo, machine.additionalInfo) && Objects.equals(phoneNumber, machine.phoneNumber) && Objects.equals(createdAt, machine.createdAt) && Objects.equals(updatedAt, machine.updatedAt) && Objects.equals(externalId, machine.externalId) && Objects.equals(fuelType, machine.fuelType) && Objects.equals(refuelSource, machine.refuelSource) && Objects.equals(calculateDowntimes, machine.calculateDowntimes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, model, manufacturer, year, registrationNumber, inventoryNumber, machineGroup, machineType, machineSubtype, avatarId, chassisSerialNumber, engineSerialNumber, enginePower, fuelTypeString, fuelTankSize, fuelConsumptionNorm, legalCompany, description, defaultImplement, defaultDriver, additional1, additional2, additionalInfo, phoneNumber, createdAt, updatedAt, externalId, fuelTypeString, refuelSource, engineCapacity, weight, height, width, length, unchangedDefaultImplement, minDowntimeInSeconds, calculateDowntimes);
    }

    @Override
    public String toString() {
        return "Machine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", inventoryNumber='" + inventoryNumber + '\'' +
                ", machineGroup=" + machineGroup +
                ", machineType='" + machineType + '\'' +
                ", machineSubtype='" + machineSubtype + '\'' +
                ", avatarId=" + avatarId +
                ", chassisSerialNumber='" + chassisSerialNumber + '\'' +
                ", engineSerialNumber='" + engineSerialNumber + '\'' +
                ", enginePower=" + enginePower +
                ", fuelTypeString='" + fuelTypeString + '\'' +
                ", fuelTankSize=" + fuelTankSize +
                ", fuelConsumptionNorm=" + fuelConsumptionNorm +
                ", legalCompany='" + legalCompany + '\'' +
                ", description='" + description + '\'' +
                ", defaultImplement=" + defaultImplement +
                ", defaultDriver=" + defaultDriver +
                ", additional1='" + additional1 + '\'' +
                ", additional2='" + additional2 + '\'' +
                ", additionalInfo='" + additionalInfo + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", externalId='" + externalId + '\'' +
                ", fuelType=" + fuelType +
                ", refuelSource='" + refuelSource + '\'' +
                ", engineCapacity=" + engineCapacity +
                ", weight=" + weight +
                ", height=" + height +
                ", width=" + width +
                ", length=" + length +
                ", unchangedDefaultImplement=" + unchangedDefaultImplement +
                ", minDowntimeInSeconds=" + minDowntimeInSeconds +
                ", calculateDowntimes='" + calculateDowntimes + '\'' +
                '}';
    }
}
