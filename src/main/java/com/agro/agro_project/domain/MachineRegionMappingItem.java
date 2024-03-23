package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="machine_region_mapping_items", schema="cropwise_data")
public class MachineRegionMappingItem {
    @Id
    @Column(name="id")
    private Short id;

    @ManyToOne
    @JoinColumn(name="machine_id")
    private Machine machine;

    @ManyToOne
    @JoinColumn(name="machine_region_id")
    private MachineRegion machineRegion;

    @Column(name="date_start")
    private Date dateStart;

    @Column(name="date_end")
    private Date dateEnd;

    @Column(name="no_date_end")
    private Boolean noDateEnd;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    public MachineRegionMappingItem(Short id, Machine machine, MachineRegion machineRegion, Date dateStart, Date dateEnd, Boolean noDateEnd, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.machine = machine;
        this.machineRegion = machineRegion;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.noDateEnd = noDateEnd;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public MachineRegionMappingItem() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Machine getMachine() {
        return machine;
    }

    public void setMachine(Machine machine) {
        this.machine = machine;
    }

    public MachineRegion getMachineRegion() {
        return machineRegion;
    }

    public void setMachineRegion(MachineRegion machineRegion) {
        this.machineRegion = machineRegion;
    }

    public Date getDateStart() {
        return dateStart;
    }

    public void setDateStart(Date dateStart) {
        this.dateStart = dateStart;
    }

    public Date getDateEnd() {
        return dateEnd;
    }

    public void setDateEnd(Date dateEnd) {
        this.dateEnd = dateEnd;
    }

    public Boolean getNoDateEnd() {
        return noDateEnd;
    }

    public void setNoDateEnd(Boolean noDateEnd) {
        this.noDateEnd = noDateEnd;
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
        MachineRegionMappingItem that = (MachineRegionMappingItem) o;
        return noDateEnd == that.noDateEnd && Objects.equals(id, that.id) && Objects.equals(machine, that.machine) && Objects.equals(machineRegion, that.machineRegion) && Objects.equals(dateStart, that.dateStart) && Objects.equals(dateEnd, that.dateEnd) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, machine, machineRegion, dateStart, dateEnd, noDateEnd, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "MachineRegionMappingItem{" +
                "id=" + id +
                ", machine=" + machine +
                ", machineRegion=" + machineRegion +
                ", dateStart=" + dateStart +
                ", dateEnd=" + dateEnd +
                ", noDateEnd=" + noDateEnd +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
