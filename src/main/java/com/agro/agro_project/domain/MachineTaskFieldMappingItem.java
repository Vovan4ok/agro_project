package com.agro.agro_project.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="machine_task_field_mapping_items", schema="cropwise_data")
public class MachineTaskFieldMappingItem {
    @Id
    @Column
    private Integer id;

    @Column(name="machine_task_id")
    private Integer machineTaskId;

    @Column(name="field_id")
    private Integer fieldId;

    public MachineTaskFieldMappingItem(Integer id, Integer machineTaskId, Integer fieldId) {
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

    public Integer getMachineTaskId() {
        return machineTaskId;
    }

    public void setMachineTaskId(Integer machineTaskId) {
        this.machineTaskId = machineTaskId;
    }

    public Integer getFieldId() {
        return fieldId;
    }

    public void setFieldId(Integer fieldId) {
        this.fieldId = fieldId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MachineTaskFieldMappingItem that = (MachineTaskFieldMappingItem) o;
        return Objects.equals(machineTaskId, that.machineTaskId) && Objects.equals(fieldId, that.fieldId) && Objects.equals(id, that.id);
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
