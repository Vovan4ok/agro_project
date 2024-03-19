package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="machine_downtime_types")
public class MachineDowntimeType {
    @Id
    @Column(name="id")
    private Short id;

    @Column(name="name", length=50)
    private String name;

    @Column(name="short_name", length=50)
    private String short_name;

    @Column(name="standard_name", length=50)
    private String standard_name;

    @ManyToOne
    @JoinColumn(name="machine_downtime_type_group_id")
    private MachineDowntimeTypeGroup machineDowntimeTypeGroup;

    @Column(name="additional_info")
    @Lob
    private String additional_info;

    @Column(name="hidden")
    private boolean hidden;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    @Column(name="external_id", length=50)
    private String external_id;

    public MachineDowntimeType(Short id, String name, String short_name, String standard_name, MachineDowntimeTypeGroup machineDowntimeTypeGroup, String additional_info, boolean hidden, Timestamp created_at, Timestamp updated_at, String external_id) {
        this.id = id;
        this.name = name;
        this.short_name = short_name;
        this.standard_name = standard_name;
        this.machineDowntimeTypeGroup = machineDowntimeTypeGroup;
        this.additional_info = additional_info;
        this.hidden = hidden;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.external_id = external_id;
    }

    public MachineDowntimeType() {
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

    public String getShort_name() {
        return short_name;
    }

    public void setShort_name(String short_name) {
        this.short_name = short_name;
    }

    public String getStandard_name() {
        return standard_name;
    }

    public void setStandard_name(String standard_name) {
        this.standard_name = standard_name;
    }

    public MachineDowntimeTypeGroup getMachineDowntimeTypeGroup() {
        return machineDowntimeTypeGroup;
    }

    public void setMachineDowntimeTypeGroup(MachineDowntimeTypeGroup machineDowntimeTypeGroup) {
        this.machineDowntimeTypeGroup = machineDowntimeTypeGroup;
    }

    public String getAdditional_info() {
        return additional_info;
    }

    public void setAdditional_info(String additional_info) {
        this.additional_info = additional_info;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MachineDowntimeType that = (MachineDowntimeType) o;
        return hidden == that.hidden && Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(short_name, that.short_name) && Objects.equals(standard_name, that.standard_name) && Objects.equals(machineDowntimeTypeGroup, that.machineDowntimeTypeGroup) && Objects.equals(additional_info, that.additional_info) && Objects.equals(created_at, that.created_at) && Objects.equals(updated_at, that.updated_at) && Objects.equals(external_id, that.external_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, short_name, standard_name, machineDowntimeTypeGroup, additional_info, hidden, created_at, updated_at, external_id);
    }

    @Override
    public String toString() {
        return "MachineDowntimeType{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", short_name='" + short_name + '\'' +
                ", standard_name='" + standard_name + '\'' +
                ", machineDowntimeTypeGroup=" + machineDowntimeTypeGroup +
                ", additional_info='" + additional_info + '\'' +
                ", hidden=" + hidden +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", external_id='" + external_id + '\'' +
                '}';
    }
}
