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
    private int machineTaskId;

    @Column(name="agro_operation_id")
    private int agroOperationId;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    public MachineTaskAgroOperationsMappingItem(Integer id, int machineTaskId, int agroOperationId, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.machineTaskId = machineTaskId;
        this.agroOperationId = agroOperationId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public MachineTaskAgroOperationsMappingItem() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public int getMachineTaskId() {
        return machineTaskId;
    }

    public void setMachineTaskId(int machineTaskId) {
        this.machineTaskId = machineTaskId;
    }

    public int getAgroOperationId() {
        return agroOperationId;
    }

    public void setAgroOperationId(int agroOperationId) {
        this.agroOperationId = agroOperationId;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MachineTaskAgroOperationsMappingItem that = (MachineTaskAgroOperationsMappingItem) o;
        return Objects.equals(id, that.id) && Objects.equals(machineTaskId, that.machineTaskId) && Objects.equals(agroOperationId, that.agroOperationId) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, machineTaskId, agroOperationId, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "MachineTaskAgroOperationsMappingItem{" +
                "id=" + id +
                ", machineTaskId=" + machineTaskId +
                ", agroOperationId=" + agroOperationId +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
