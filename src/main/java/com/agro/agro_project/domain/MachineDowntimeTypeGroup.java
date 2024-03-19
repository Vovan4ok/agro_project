package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="machine_downtime_type_groups")
public class MachineDowntimeTypeGroup {
    @Id
    @Column(name="id")
    private Short id;

    @Column(name="name", length=50)
    private String name;

    @Column(name="custom_name", length=50)
    private String custom_name;

    @Column(name="standard_name", length=50)
    private String standard_name;

    @Column(name="additional_info")
    @Lob
    private String additional_info;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    @Column(name="external_id", length=50)
    private String external_id;

    public MachineDowntimeTypeGroup(Short id, String name, String custom_name, String standard_name, String additional_info, Timestamp created_at, Timestamp updated_at, String external_id) {
        this.id = id;
        this.name = name;
        this.custom_name = custom_name;
        this.standard_name = standard_name;
        this.additional_info = additional_info;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.external_id = external_id;
    }

    public MachineDowntimeTypeGroup() {
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

    public String getCustom_name() {
        return custom_name;
    }

    public void setCustom_name(String custom_name) {
        this.custom_name = custom_name;
    }

    public String getStandard_name() {
        return standard_name;
    }

    public void setStandard_name(String standard_name) {
        this.standard_name = standard_name;
    }

    public String getAdditional_info() {
        return additional_info;
    }

    public void setAdditional_info(String additional_info) {
        this.additional_info = additional_info;
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
        MachineDowntimeTypeGroup that = (MachineDowntimeTypeGroup) o;
        return Objects.equals(id, that.id) && Objects.equals(name, that.name) && Objects.equals(custom_name, that.custom_name) && Objects.equals(standard_name, that.standard_name) && Objects.equals(additional_info, that.additional_info) && Objects.equals(created_at, that.created_at) && Objects.equals(updated_at, that.updated_at) && Objects.equals(external_id, that.external_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, custom_name, standard_name, additional_info, created_at, updated_at, external_id);
    }

    @Override
    public String toString() {
        return "MachineDowntimeTypeGroup{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", custom_name='" + custom_name + '\'' +
                ", standard_name='" + standard_name + '\'' +
                ", additional_info='" + additional_info + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", external_id='" + external_id + '\'' +
                '}';
    }
}
