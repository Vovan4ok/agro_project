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
    private String registration_number;

    @Column(name="inventory_number", length=20)
    private String inventory_number;

    @ManyToOne
    @JoinColumn(name="machine_group_id")
    private MachineGroup machineGroup;

    @Column(name="machine_type", length=20)
    private String machine_type;

    @Column(name="machine_subtype", length=20)
    private String machine_subtype;

    @Column(name="avatar_id")
    private short avatar_id;

    @Column(name="chassis_serial_number", length=20)
    private String chassis_serial_number;

    @Column(name="engine_serial_number", length=20)
    private String engine_serial_number;

    @Column(name="engine_power")
    private short engine_power;

    @Column(name="fuel_type", length=10)
    private String fuel_type;

    @Column(name="fuel_tank_size")
    private double fuel_tank_size;

    @Column(name="fuel_consumption_norm")
    private double fuel_consumption_norm;

    @Column(name="legal_company", length=50)
    private String legal_company;

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
    private String additional_1;

    @Column(name="additional_2")
    @Lob
    private String additional_2;

    @Column(name="additional_info")
    @Lob
    private String additional_info;

    @Column(name="phone_number", length=20)
    private String phone_number;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    @Column(name="external_id", length=50)
    private String external_id;

    @ManyToOne
    @JoinColumn(name="fuel_type_id")
    private FuelType fuelType;

    @Column(name="refuel_source", length=20)
    private String refuel_source;

    @Column(name="engine_capacity")
    private double engine_capacity;

    @Column(name="weight")
    private double weight;

    @Column(name="height")
    private double height;

    @Column(name="width")
    private double width;

    @Column(name="length")
    private double length;

    @Column(name="unchanged_default_implement")
    private boolean unchanged_default_implement;

    @Column(name="min_downtime_in_seconds")
    private short min_downtime_in_seconds;

    @Column(name="calculate_downtimes", length=20)
    private String calculate_downtimes;

    public Machine(Integer id, String name, String model, String manufacturer, short year, String registration_number, String inventory_number, MachineGroup machineGroup, String machine_type, String machine_subtype, short avatar_id, String chassis_serial_number, String engine_serial_number, short engine_power, String fuel_type, double fuel_tank_size, double fuel_consumption_norm, String legal_company, String description, Implement defaultImplement, User defaultDriver, String additional_1, String additional_2, String additional_info, String phone_number, Timestamp created_at, Timestamp updated_at, String external_id, FuelType fuelType, String refuel_source, double engine_capacity, double weight, double height, double width, double length, boolean unchanged_default_implement, short min_downtime_in_seconds, String calculate_downtimes) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.registration_number = registration_number;
        this.inventory_number = inventory_number;
        this.machineGroup = machineGroup;
        this.machine_type = machine_type;
        this.machine_subtype = machine_subtype;
        this.avatar_id = avatar_id;
        this.chassis_serial_number = chassis_serial_number;
        this.engine_serial_number = engine_serial_number;
        this.engine_power = engine_power;
        this.fuel_type = fuel_type;
        this.fuel_tank_size = fuel_tank_size;
        this.fuel_consumption_norm = fuel_consumption_norm;
        this.legal_company = legal_company;
        this.description = description;
        this.defaultImplement = defaultImplement;
        this.defaultDriver = defaultDriver;
        this.additional_1 = additional_1;
        this.additional_2 = additional_2;
        this.additional_info = additional_info;
        this.phone_number = phone_number;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.external_id = external_id;
        this.fuelType = fuelType;
        this.refuel_source = refuel_source;
        this.engine_capacity = engine_capacity;
        this.weight = weight;
        this.height = height;
        this.width = width;
        this.length = length;
        this.unchanged_default_implement = unchanged_default_implement;
        this.min_downtime_in_seconds = min_downtime_in_seconds;
        this.calculate_downtimes = calculate_downtimes;
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

    public String getRegistration_number() {
        return registration_number;
    }

    public void setRegistration_number(String registration_number) {
        this.registration_number = registration_number;
    }

    public String getInventory_number() {
        return inventory_number;
    }

    public void setInventory_number(String inventory_number) {
        this.inventory_number = inventory_number;
    }

    public MachineGroup getMachineGroup() {
        return machineGroup;
    }

    public void setMachineGroup(MachineGroup machineGroup) {
        this.machineGroup = machineGroup;
    }

    public String getMachine_type() {
        return machine_type;
    }

    public void setMachine_type(String machine_type) {
        this.machine_type = machine_type;
    }

    public String getMachine_subtype() {
        return machine_subtype;
    }

    public void setMachine_subtype(String machine_subtype) {
        this.machine_subtype = machine_subtype;
    }

    public short getAvatar_id() {
        return avatar_id;
    }

    public void setAvatar_id(short avatar_id) {
        this.avatar_id = avatar_id;
    }

    public String getChassis_serial_number() {
        return chassis_serial_number;
    }

    public void setChassis_serial_number(String chassis_serial_number) {
        this.chassis_serial_number = chassis_serial_number;
    }

    public String getEngine_serial_number() {
        return engine_serial_number;
    }

    public void setEngine_serial_number(String engine_serial_number) {
        this.engine_serial_number = engine_serial_number;
    }

    public short getEngine_power() {
        return engine_power;
    }

    public void setEngine_power(short engine_power) {
        this.engine_power = engine_power;
    }

    public String getFuel_type() {
        return fuel_type;
    }

    public void setFuel_type(String fuel_type) {
        this.fuel_type = fuel_type;
    }

    public double getFuel_tank_size() {
        return fuel_tank_size;
    }

    public void setFuel_tank_size(double fuel_tank_size) {
        this.fuel_tank_size = fuel_tank_size;
    }

    public double getFuel_consumption_norm() {
        return fuel_consumption_norm;
    }

    public void setFuel_consumption_norm(double fuel_consumption_norm) {
        this.fuel_consumption_norm = fuel_consumption_norm;
    }

    public String getLegal_company() {
        return legal_company;
    }

    public void setLegal_company(String legal_company) {
        this.legal_company = legal_company;
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

    public String getAdditional_1() {
        return additional_1;
    }

    public void setAdditional_1(String additional_1) {
        this.additional_1 = additional_1;
    }

    public String getAdditional_2() {
        return additional_2;
    }

    public void setAdditional_2(String additional_2) {
        this.additional_2 = additional_2;
    }

    public String getAdditional_info() {
        return additional_info;
    }

    public void setAdditional_info(String additional_info) {
        this.additional_info = additional_info;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
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

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }

    public FuelType getFuelType() {
        return fuelType;
    }

    public void setFuelType(FuelType fuelType) {
        this.fuelType = fuelType;
    }

    public String getRefuel_source() {
        return refuel_source;
    }

    public void setRefuel_source(String refuel_source) {
        this.refuel_source = refuel_source;
    }

    public double getEngine_capacity() {
        return engine_capacity;
    }

    public void setEngine_capacity(double engine_capacity) {
        this.engine_capacity = engine_capacity;
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

    public boolean isUnchanged_default_implement() {
        return unchanged_default_implement;
    }

    public void setUnchanged_default_implement(boolean unchanged_default_implement) {
        this.unchanged_default_implement = unchanged_default_implement;
    }

    public short getMin_downtime_in_seconds() {
        return min_downtime_in_seconds;
    }

    public void setMin_downtime_in_seconds(short min_downtime_in_seconds) {
        this.min_downtime_in_seconds = min_downtime_in_seconds;
    }

    public String getCalculate_downtimes() {
        return calculate_downtimes;
    }

    public void setCalculate_downtimes(String calculate_downtimes) {
        this.calculate_downtimes = calculate_downtimes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Machine machine = (Machine) o;
        return year == machine.year && avatar_id == machine.avatar_id && engine_power == machine.engine_power && Double.compare(fuel_tank_size, machine.fuel_tank_size) == 0 && Double.compare(fuel_consumption_norm, machine.fuel_consumption_norm) == 0 && Double.compare(engine_capacity, machine.engine_capacity) == 0 && Double.compare(weight, machine.weight) == 0 && Double.compare(height, machine.height) == 0 && Double.compare(width, machine.width) == 0 && Double.compare(length, machine.length) == 0 && unchanged_default_implement == machine.unchanged_default_implement && min_downtime_in_seconds == machine.min_downtime_in_seconds && Objects.equals(id, machine.id) && Objects.equals(name, machine.name) && Objects.equals(model, machine.model) && Objects.equals(manufacturer, machine.manufacturer) && Objects.equals(registration_number, machine.registration_number) && Objects.equals(inventory_number, machine.inventory_number) && Objects.equals(machineGroup, machine.machineGroup) && Objects.equals(machine_type, machine.machine_type) && Objects.equals(machine_subtype, machine.machine_subtype) && Objects.equals(chassis_serial_number, machine.chassis_serial_number) && Objects.equals(engine_serial_number, machine.engine_serial_number) && Objects.equals(fuel_type, machine.fuel_type) && Objects.equals(legal_company, machine.legal_company) && Objects.equals(description, machine.description) && Objects.equals(defaultImplement, machine.defaultImplement) && Objects.equals(defaultDriver, machine.defaultDriver) && Objects.equals(additional_1, machine.additional_1) && Objects.equals(additional_2, machine.additional_2) && Objects.equals(additional_info, machine.additional_info) && Objects.equals(phone_number, machine.phone_number) && Objects.equals(created_at, machine.created_at) && Objects.equals(updated_at, machine.updated_at) && Objects.equals(external_id, machine.external_id) && Objects.equals(fuelType, machine.fuelType) && Objects.equals(refuel_source, machine.refuel_source) && Objects.equals(calculate_downtimes, machine.calculate_downtimes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, model, manufacturer, year, registration_number, inventory_number, machineGroup, machine_type, machine_subtype, avatar_id, chassis_serial_number, engine_serial_number, engine_power, fuel_type, fuel_tank_size, fuel_consumption_norm, legal_company, description, defaultImplement, defaultDriver, additional_1, additional_2, additional_info, phone_number, created_at, updated_at, external_id, fuelType, refuel_source, engine_capacity, weight, height, width, length, unchanged_default_implement, min_downtime_in_seconds, calculate_downtimes);
    }

    @Override
    public String toString() {
        return "Machine{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                ", registration_number='" + registration_number + '\'' +
                ", inventory_number='" + inventory_number + '\'' +
                ", machineGroup=" + machineGroup +
                ", machine_type='" + machine_type + '\'' +
                ", machine_subtype='" + machine_subtype + '\'' +
                ", avatar_id=" + avatar_id +
                ", chassis_serial_number='" + chassis_serial_number + '\'' +
                ", engine_serial_number='" + engine_serial_number + '\'' +
                ", engine_power=" + engine_power +
                ", fuel_type='" + fuel_type + '\'' +
                ", fuel_tank_size=" + fuel_tank_size +
                ", fuel_consumption_norm=" + fuel_consumption_norm +
                ", legal_company='" + legal_company + '\'' +
                ", description='" + description + '\'' +
                ", defaultImplement=" + defaultImplement +
                ", defaultDriver=" + defaultDriver +
                ", additional_1='" + additional_1 + '\'' +
                ", additional_2='" + additional_2 + '\'' +
                ", additional_info='" + additional_info + '\'' +
                ", phone_number='" + phone_number + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", external_id='" + external_id + '\'' +
                ", fuelType=" + fuelType +
                ", refuel_source='" + refuel_source + '\'' +
                ", engine_capacity=" + engine_capacity +
                ", weight=" + weight +
                ", height=" + height +
                ", width=" + width +
                ", length=" + length +
                ", unchanged_default_implement=" + unchanged_default_implement +
                ", min_downtime_in_seconds=" + min_downtime_in_seconds +
                ", calculate_downtimes='" + calculate_downtimes + '\'' +
                '}';
    }
}
