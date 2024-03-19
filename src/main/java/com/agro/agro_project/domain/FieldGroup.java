package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Time;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="field_groups")
public class FieldGroup {
    @Id
    @Column(name="id")
    private Short id;

    @ManyToOne
    @JoinColumn(name="group_folder_id")
    private GroupFolder groupFolder;

    @Column(name="name", length=100)
    private String name;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="administrative_area_name", length=30)
    private String administrative_area_name;

    @Column(name="subadministrative_area_name", length=30)
    private String subadministrative_area_name;

    @Column(name="locality", length=10)
    private String locality;

    @Column(name="hidden")
    private boolean hidden;

    @Column(name="external_id", length=20)
    private String external_id;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    @Column(name="idempotency_key")
    private String idempotency_key;

    @Column(name="legal_entity", length=30)
    private String legal_entity;

    @Column(name="machine_task_default_duration")
    private Short machine_task_default_duration;

    @Column(name="accounting_period_closing_date")
    private Date accounting_period_closing_date;

    @Column(name="machine_task_default_start_time")
    private Time machine_task_default_start_time;

    public FieldGroup(Short id, GroupFolder groupFolder, String name, String description, String administrative_area_name, String subadministrative_area_name, String locality, boolean hidden, String external_id, Timestamp created_at, Timestamp updated_at, String idempotency_key, String legal_entity, Short machine_task_default_duration, Date accounting_period_closing_date, Time machine_task_default_start_time) {
        this.id = id;
        this.groupFolder = groupFolder;
        this.name = name;
        this.description = description;
        this.administrative_area_name = administrative_area_name;
        this.subadministrative_area_name = subadministrative_area_name;
        this.locality = locality;
        this.hidden = hidden;
        this.external_id = external_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.idempotency_key = idempotency_key;
        this.legal_entity = legal_entity;
        this.machine_task_default_duration = machine_task_default_duration;
        this.accounting_period_closing_date = accounting_period_closing_date;
        this.machine_task_default_start_time = machine_task_default_start_time;
    }

    public FieldGroup() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public GroupFolder getGroupFolder() {
        return groupFolder;
    }

    public void setGroupFolder(GroupFolder groupFolder) {
        this.groupFolder = groupFolder;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAdministrative_area_name() {
        return administrative_area_name;
    }

    public void setAdministrative_area_name(String administrative_area_name) {
        this.administrative_area_name = administrative_area_name;
    }

    public String getSubadministrative_area_name() {
        return subadministrative_area_name;
    }

    public void setSubadministrative_area_name(String subadministrative_area_name) {
        this.subadministrative_area_name = subadministrative_area_name;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
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

    public String getIdempotency_key() {
        return idempotency_key;
    }

    public void setIdempotency_key(String idempotency_key) {
        this.idempotency_key = idempotency_key;
    }

    public String getLegal_entity() {
        return legal_entity;
    }

    public void setLegal_entity(String legal_entity) {
        this.legal_entity = legal_entity;
    }

    public Short getMachine_task_default_duration() {
        return machine_task_default_duration;
    }

    public void setMachine_task_default_duration(Short machine_task_default_duration) {
        this.machine_task_default_duration = machine_task_default_duration;
    }

    public Date getAccounting_period_closing_date() {
        return accounting_period_closing_date;
    }

    public void setAccounting_period_closing_date(Date accounting_period_closing_date) {
        this.accounting_period_closing_date = accounting_period_closing_date;
    }

    public Time getMachine_task_default_start_time() {
        return machine_task_default_start_time;
    }

    public void setMachine_task_default_start_time(Time machine_task_default_start_time) {
        this.machine_task_default_start_time = machine_task_default_start_time;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FieldGroup that = (FieldGroup) o;
        return hidden == that.hidden && Objects.equals(id, that.id) && Objects.equals(groupFolder, that.groupFolder) && Objects.equals(name, that.name) && Objects.equals(description, that.description) && Objects.equals(administrative_area_name, that.administrative_area_name) && Objects.equals(subadministrative_area_name, that.subadministrative_area_name) && Objects.equals(locality, that.locality) && Objects.equals(external_id, that.external_id) && Objects.equals(created_at, that.created_at) && Objects.equals(updated_at, that.updated_at) && Objects.equals(idempotency_key, that.idempotency_key) && Objects.equals(legal_entity, that.legal_entity) && Objects.equals(machine_task_default_duration, that.machine_task_default_duration) && Objects.equals(accounting_period_closing_date, that.accounting_period_closing_date) && Objects.equals(machine_task_default_start_time, that.machine_task_default_start_time);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, groupFolder, name, description, administrative_area_name, subadministrative_area_name, locality, hidden, external_id, created_at, updated_at, idempotency_key, legal_entity, machine_task_default_duration, accounting_period_closing_date, machine_task_default_start_time);
    }

    @Override
    public String toString() {
        return "FieldGroup{" +
                "id=" + id +
                ", groupFolder=" + groupFolder +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", administrative_area_name='" + administrative_area_name + '\'' +
                ", subadministrative_area_name='" + subadministrative_area_name + '\'' +
                ", locality='" + locality + '\'' +
                ", hidden=" + hidden +
                ", external_id='" + external_id + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", idempotency_key='" + idempotency_key + '\'' +
                ", legal_entity='" + legal_entity + '\'' +
                ", machine_task_default_duration=" + machine_task_default_duration +
                ", accounting_period_closing_date=" + accounting_period_closing_date +
                ", machine_task_default_start_time=" + machine_task_default_start_time +
                '}';
    }
}
