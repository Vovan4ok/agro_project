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
    private String registration_number;

    @Column(name="inventory_number", length=20)
    private String inventory_number;

    @Column(name="implement_type", length=20)
    private String implement_type;

    @Column(name="width")
    private double width;

    @Column(name="official_width")
    private double official_width;

    @Column(name="avatar_id")
    private short avatar_id;

    @Column(name="chassis_serial_number", length=50)
    private String chassis_serial_number;

    @Column(name="legal_company")
    @Lob
    private String legal_company;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="additional")
    @Lob
    private String additional;

    @Column(name="additional_info")
    @Lob
    private String additional_info;

    @Column(name="variable_width")
    private boolean variable_width;

    @Column(name="min_width")
    private double min_width;

    @Column(name="max_width")
    private double max_width;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    @Column(name="external_id", length=50)
    private String external_id;

    @Column(name="virtual")
    private boolean virtual;

    public Implement(Short id, String name, String model, String manufacturer, short year, String registration_number, String inventory_number, String implement_type, double width, double official_width, short avatar_id, String chassis_serial_number, String legal_company, String description, String additional, String additional_info, boolean variable_width, double min_width, double max_width, Timestamp created_at, Timestamp updated_at, String external_id, boolean virtual) {
        this.id = id;
        this.name = name;
        this.model = model;
        this.manufacturer = manufacturer;
        this.year = year;
        this.registration_number = registration_number;
        this.inventory_number = inventory_number;
        this.implement_type = implement_type;
        this.width = width;
        this.official_width = official_width;
        this.avatar_id = avatar_id;
        this.chassis_serial_number = chassis_serial_number;
        this.legal_company = legal_company;
        this.description = description;
        this.additional = additional;
        this.additional_info = additional_info;
        this.variable_width = variable_width;
        this.min_width = min_width;
        this.max_width = max_width;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.external_id = external_id;
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

    public String getImplement_type() {
        return implement_type;
    }

    public void setImplement_type(String implement_type) {
        this.implement_type = implement_type;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getOfficial_width() {
        return official_width;
    }

    public void setOfficial_width(double official_width) {
        this.official_width = official_width;
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

    public String getAdditional() {
        return additional;
    }

    public void setAdditional(String additional) {
        this.additional = additional;
    }

    public String getAdditional_info() {
        return additional_info;
    }

    public void setAdditional_info(String additional_info) {
        this.additional_info = additional_info;
    }

    public boolean isVariable_width() {
        return variable_width;
    }

    public void setVariable_width(boolean variable_width) {
        this.variable_width = variable_width;
    }

    public double getMin_width() {
        return min_width;
    }

    public void setMin_width(double min_width) {
        this.min_width = min_width;
    }

    public double getMax_width() {
        return max_width;
    }

    public void setMax_width(double max_width) {
        this.max_width = max_width;
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
        return year == implement.year && Double.compare(width, implement.width) == 0 && Double.compare(official_width, implement.official_width) == 0 && avatar_id == implement.avatar_id && variable_width == implement.variable_width && Double.compare(min_width, implement.min_width) == 0 && Double.compare(max_width, implement.max_width) == 0 && virtual == implement.virtual && Objects.equals(id, implement.id) && Objects.equals(name, implement.name) && Objects.equals(model, implement.model) && Objects.equals(manufacturer, implement.manufacturer) && Objects.equals(registration_number, implement.registration_number) && Objects.equals(inventory_number, implement.inventory_number) && Objects.equals(implement_type, implement.implement_type) && Objects.equals(chassis_serial_number, implement.chassis_serial_number) && Objects.equals(legal_company, implement.legal_company) && Objects.equals(description, implement.description) && Objects.equals(additional, implement.additional) && Objects.equals(additional_info, implement.additional_info) && Objects.equals(created_at, implement.created_at) && Objects.equals(updated_at, implement.updated_at) && Objects.equals(external_id, implement.external_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, model, manufacturer, year, registration_number, inventory_number, implement_type, width, official_width, avatar_id, chassis_serial_number, legal_company, description, additional, additional_info, variable_width, min_width, max_width, created_at, updated_at, external_id, virtual);
    }

    @Override
    public String toString() {
        return "Implement{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", model='" + model + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", year=" + year +
                ", registration_number='" + registration_number + '\'' +
                ", inventory_number='" + inventory_number + '\'' +
                ", implement_type='" + implement_type + '\'' +
                ", width=" + width +
                ", official_width=" + official_width +
                ", avatar_id=" + avatar_id +
                ", chassis_serial_number='" + chassis_serial_number + '\'' +
                ", legal_company='" + legal_company + '\'' +
                ", description='" + description + '\'' +
                ", additional='" + additional + '\'' +
                ", additional_info='" + additional_info + '\'' +
                ", variable_width=" + variable_width +
                ", min_width=" + min_width +
                ", max_width=" + max_width +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", external_id='" + external_id + '\'' +
                ", virtual=" + virtual +
                '}';
    }
}
