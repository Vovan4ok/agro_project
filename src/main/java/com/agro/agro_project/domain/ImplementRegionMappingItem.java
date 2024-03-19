package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="implement_region_mapping_items")
public class ImplementRegionMappingItem {
    @Id
    @Column(name="id")
    private Short id;

    @ManyToOne
    @JoinColumn(name="implement_id")
    private Implement implement;

    @ManyToOne
    @JoinColumn(name="machine_region_id")
    private MachineRegion machineRegion;

    @Column(name="date_start")
    private Date date_start;

    @Column(name="date_end")
    private Date date_end;

    @Column(name="no_date_end")
    private boolean no_date_end;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    public ImplementRegionMappingItem(Short id, Implement implement, MachineRegion machineRegion, Date date_start, Date date_end, boolean no_date_end, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.implement = implement;
        this.machineRegion = machineRegion;
        this.date_start = date_start;
        this.date_end = date_end;
        this.no_date_end = no_date_end;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public ImplementRegionMappingItem() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Implement getImplement() {
        return implement;
    }

    public void setImplement(Implement implement) {
        this.implement = implement;
    }

    public MachineRegion getMachineRegion() {
        return machineRegion;
    }

    public void setMachineRegion(MachineRegion machineRegion) {
        this.machineRegion = machineRegion;
    }

    public Date getDate_start() {
        return date_start;
    }

    public void setDate_start(Date date_start) {
        this.date_start = date_start;
    }

    public Date getDate_end() {
        return date_end;
    }

    public void setDate_end(Date date_end) {
        this.date_end = date_end;
    }

    public boolean isNo_date_end() {
        return no_date_end;
    }

    public void setNo_date_end(boolean no_date_end) {
        this.no_date_end = no_date_end;
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
        ImplementRegionMappingItem that = (ImplementRegionMappingItem) o;
        return no_date_end == that.no_date_end && Objects.equals(id, that.id) && Objects.equals(implement, that.implement) && Objects.equals(machineRegion, that.machineRegion) && Objects.equals(date_start, that.date_start) && Objects.equals(date_end, that.date_end) && Objects.equals(created_at, that.created_at) && Objects.equals(updated_at, that.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, implement, machineRegion, date_start, date_end, no_date_end, created_at, updated_at);
    }

    @Override
    public String toString() {
        return "ImplementRegionMappingItem{" +
                "id=" + id +
                ", implement=" + implement +
                ", machineRegion=" + machineRegion +
                ", date_start=" + date_start +
                ", date_end=" + date_end +
                ", no_date_end=" + no_date_end +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
