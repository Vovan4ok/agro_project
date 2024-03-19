package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="spare_parts")
public class SparePart {
    @Id
    @Column(name="id")
    private Short id;

    @ManyToOne
    @JoinColumn(name="spare_part_manufacturer_id")
    private SparePartManufacturer sparePartManufacturer;

    @Column(name="name", length=20)
    private String name;

    @Column(name="part_number", length=10)
    private String part_number;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="external_id", length=50)
    private String external_id;

    @Column(name="archived")
    private boolean archived;

    @Column(name="additional_info")
    @Lob
    private String additional_info;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    public SparePart(Short id, SparePartManufacturer sparePartManufacturer, String name, String part_number, String description, String external_id, boolean archived, String additional_info, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.sparePartManufacturer = sparePartManufacturer;
        this.name = name;
        this.part_number = part_number;
        this.description = description;
        this.external_id = external_id;
        this.archived = archived;
        this.additional_info = additional_info;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public SparePart() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public SparePartManufacturer getSparePartManufacturer() {
        return sparePartManufacturer;
    }

    public void setSparePartManufacturer(SparePartManufacturer sparePartManufacturer) {
        this.sparePartManufacturer = sparePartManufacturer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPart_number() {
        return part_number;
    }

    public void setPart_number(String part_number) {
        this.part_number = part_number;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SparePart sparePart = (SparePart) o;
        return archived == sparePart.archived && Objects.equals(id, sparePart.id) && Objects.equals(sparePartManufacturer, sparePart.sparePartManufacturer) && Objects.equals(name, sparePart.name) && Objects.equals(part_number, sparePart.part_number) && Objects.equals(description, sparePart.description) && Objects.equals(external_id, sparePart.external_id) && Objects.equals(additional_info, sparePart.additional_info) && Objects.equals(created_at, sparePart.created_at) && Objects.equals(updated_at, sparePart.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sparePartManufacturer, name, part_number, description, external_id, archived, additional_info, created_at, updated_at);
    }

    @Override
    public String toString() {
        return "SparePart{" +
                "id=" + id +
                ", sparePartManufacturer=" + sparePartManufacturer +
                ", name='" + name + '\'' +
                ", part_number='" + part_number + '\'' +
                ", description='" + description + '\'' +
                ", external_id='" + external_id + '\'' +
                ", archived=" + archived +
                ", additional_info='" + additional_info + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
