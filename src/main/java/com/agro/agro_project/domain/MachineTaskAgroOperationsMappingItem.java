package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="machine_task_agro_operations_mapping_item")
public class MachineTaskAgroOperationsMappingItem {
    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="machine_task_id")
    private int machine_task_id;

    @Column(name="agro_operation_id")
    private int agro_operation_id;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    public MachineTaskAgroOperationsMappingItem(Integer id, int machine_task_id, int agro_operation_id, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.machine_task_id = machine_task_id;
        this.agro_operation_id = agro_operation_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public MachineTaskAgroOperationsMappingItem() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getMachine_task_id() {
        return machine_task_id;
    }

    public void setMachine_task_id(int machine_task_id) {
        this.machine_task_id = machine_task_id;
    }

    public int getAgro_operation_id() {
        return agro_operation_id;
    }

    public void setAgro_operation_id(int agro_operation_id) {
        this.agro_operation_id = agro_operation_id;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MachineTaskAgroOperationsMappingItem that = (MachineTaskAgroOperationsMappingItem) o;
        return Objects.equals(id, that.id) && Objects.equals(machine_task_id, that.machine_task_id) && Objects.equals(agro_operation_id, that.agro_operation_id) && Objects.equals(created_at, that.created_at) && Objects.equals(updated_at, that.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, machine_task_id, agro_operation_id, created_at, updated_at);
    }

    @Override
    public String toString() {
        return "MachineTaskAgroOperationsMappingItem{" +
                "id=" + id +
                ", machine_task_id=" + machine_task_id +
                ", agroOperation=" + agro_operation_id +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
