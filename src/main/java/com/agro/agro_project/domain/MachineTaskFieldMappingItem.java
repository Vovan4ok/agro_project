package com.agro.agro_project.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="machine_task_field_mapping_items")
public class MachineTaskFieldMappingItem {
    @Id
    @Column
    private Integer id;

    @Column(name="machine_task_id")
    private int machineTaskId;

    @Column(name="field_id")
    private int fieldId;

    public MachineTaskFieldMappingItem(Integer id, int machineTaskId, int fieldId) {
        this.id = id;
        this.machineTaskId = machineTaskId;
        this.fieldId = fieldId;
    }

    public MachineTaskFieldMappingItem() {
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

    public int getFieldId() {
        return fieldId;
    }

    public void setFieldId(int fieldId) {
        this.fieldId = fieldId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MachineTaskFieldMappingItem that = (MachineTaskFieldMappingItem) o;
        return machineTaskId == that.machineTaskId && fieldId == that.fieldId && Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, machineTaskId, fieldId);
    }

    @Override
    public String toString() {
        return "MachineTaskFieldMappingItem{" +
                "id=" + id +
                ", machineTaskId=" + machineTaskId +
                ", fieldId=" + fieldId +
                '}';
    }
}
