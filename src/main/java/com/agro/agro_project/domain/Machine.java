package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="machines")
public class Machine {
    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="name", length=100)
    private String name;

    @Column(name="model", length=20)
    private String model;

    @Column(name="manufacturer", length=50)
    private String manufacturer;

    @Column(name="year")
    private short year;

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
    private short avatarId;

    @Column(name="chassis_serial_number", length=20)
    private String chassisSerialNumber;

    @Column(name="engine_serial_number", length=20)
    private String engineSerialNumber;

    @Column(name="engine_power")
    private short enginePower;

    @Column(name="fuel_type", length=10)
    private String fuelTypeString;

    @Column(name="fuel_tank_size")
    private double fuelTankSize;

    @Column(name="fuel_consumption_norm")
    private double fuelConsumptionNorm;

    @Column(name="legal_company", length=50)
    private String legalCompany;

    @Column(name="description")
    @Lob
    private String description;

    @ManyToOne
    @JoinColumn(name="default_implement_id")
    private Implement defaultImplement;

    @ManyToOne
    @JoinColumn(name="default_driver_id")
    private User defaultDriver;

    @Column(name="additional_1")
    @Lob
    private String additional1;

    @Column(name="additional_2")
    @Lob
    private String additional2;

    @Column(name="additional_info")
    @Lob
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
    private double engineCapacity;

    @Column(name="weight")
    private double weight;

    @Column(name="height")
    private double height;

    @Column(name="width")
    private double width;

    @Column(name="length")
    private double length;

    @Column(name="unchanged_default_implement")
    private boolean unchangedDefaultImplement;

    @Column(name="min_downtime_in_seconds")
    private short minDowntimeInSeconds;

    @Column(name="calculate_downtimes", length=20)
    private String calculateDowntimes;

    public Machine(Integer id, String name, String model, String manufacturer, short year, String registrationNumber, String inventoryNumber, MachineGroup machineGroup, String machineType, String machine_subtype, short avatarId, String chassisSerialNumber, String engineSerialNumber, short enginePower, String fuelTypeString, double fuelTankSize, double fuelConsumptionNorm, String legalCompany, String description, Implement defaultImplement, User defaultDriver, String additional1, String additional2, String additionalInfo, String phoneNumber, Timestamp createdAt, Timestamp updatedAt, String externalId, FuelType fuelType, String refuelSource, double engineCapacity, double weight, double height, double width, double length, boolean unchangedDefaultImplement, short minDowntimeInSeconds, String calculateDowntimes) {
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

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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

    public String getEngineSerialNumber() {
        return engineSerialNumber;
    }

    public void setEngineSerialNumber(String engineSerialNumber) {
        this.engineSerialNumber = engineSerialNumber;
    }

    public short getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(short enginePower) {
        this.enginePower = enginePower;
    }

    public String getFuelTypeString() {
        return fuelTypeString;
    }

    public void setFuelTypeString(String fuelTypeString) {
        this.fuelTypeString = fuelTypeString;
    }

    public double getFuelTankSize() {
        return fuelTankSize;
    }

    public void setFuelTankSize(double fuelTankSize) {
        this.fuelTankSize = fuelTankSize;
    }

    public double getFuelConsumptionNorm() {
        return fuelConsumptionNorm;
    }

    public void setFuelConsumptionNorm(double fuelConsumptionNorm) {
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

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public boolean isUnchangedDefaultImplement() {
        return unchangedDefaultImplement;
    }

    public void setUnchangedDefaultImplement(boolean unchangedDefaultImplement) {
        this.unchangedDefaultImplement = unchangedDefaultImplement;
    }

    public short getMinDowntimeInSeconds() {
        return minDowntimeInSeconds;
    }

    public void setMinDowntimeInSeconds(short minDowntimeInSeconds) {
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
        return year == machine.year && avatarId == machine.avatarId && enginePower == machine.enginePower && Double.compare(fuelTankSize, machine.fuelTankSize) == 0 && Double.compare(fuelConsumptionNorm, machine.fuelConsumptionNorm) == 0 && Double.compare(engineCapacity, machine.engineCapacity) == 0 && Double.compare(weight, machine.weight) == 0 && Double.compare(height, machine.height) == 0 && Double.compare(width, machine.width) == 0 && Double.compare(length, machine.length) == 0 && unchangedDefaultImplement == machine.unchangedDefaultImplement && minDowntimeInSeconds == machine.minDowntimeInSeconds && Objects.equals(id, machine.id) && Objects.equals(name, machine.name) && Objects.equals(model, machine.model) && Objects.equals(manufacturer, machine.manufacturer) && Objects.equals(registrationNumber, machine.registrationNumber) && Objects.equals(inventoryNumber, machine.inventoryNumber) && Objects.equals(machineGroup, machine.machineGroup) && Objects.equals(machineType, machine.machineType) && Objects.equals(machineSubtype, machine.machineSubtype) && Objects.equals(chassisSerialNumber, machine.chassisSerialNumber) && Objects.equals(engineSerialNumber, machine.engineSerialNumber) && Objects.equals(fuelTypeString, machine.fuelTypeString) && Objects.equals(legalCompany, machine.legalCompany) && Objects.equals(description, machine.description) && Objects.equals(defaultImplement, machine.defaultImplement) && Objects.equals(defaultDriver, machine.defaultDriver) && Objects.equals(additional1, machine.additional1) && Objects.equals(additional2, machine.additional2) && Objects.equals(additionalInfo, machine.additionalInfo) && Objects.equals(phoneNumber, machine.phoneNumber) && Objects.equals(createdAt, machine.createdAt) && Objects.equals(updatedAt, machine.updatedAt) && Objects.equals(externalId, machine.externalId) && Objects.equals(fuelTypeString, machine.fuelTypeString) && Objects.equals(refuelSource, machine.refuelSource) && Objects.equals(calculateDowntimes, machine.calculateDowntimes);
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
