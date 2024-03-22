package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="spare_parts", schema="cropwise_data")
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
    private String partNumber;

    @Column(name="description")
    private String description;

    @Column(name="external_id", length=50)
    private String externalId;

    @Column(name="archived")
    private Boolean archived;

    @Column(name="additional_info")
    private String additionalInfo;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    public SparePart(Short id, SparePartManufacturer sparePartManufacturer, String name, String partNumber, String description, String externalId, Boolean archived, String additionalInfo, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.sparePartManufacturer = sparePartManufacturer;
        this.name = name;
        this.partNumber = partNumber;
        this.description = description;
        this.externalId = externalId;
        this.archived = archived;
        this.additionalInfo = additionalInfo;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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

    public String getPartNumber() {
        return partNumber;
    }

    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public Boolean isArchived() {
        return archived;
    }

    public void setArchived(Boolean archived) {
        this.archived = archived;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
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
        SparePart sparePart = (SparePart) o;
        return archived == sparePart.archived && Objects.equals(id, sparePart.id) && Objects.equals(sparePartManufacturer, sparePart.sparePartManufacturer) && Objects.equals(name, sparePart.name) && Objects.equals(partNumber, sparePart.partNumber) && Objects.equals(description, sparePart.description) && Objects.equals(externalId, sparePart.externalId) && Objects.equals(additionalInfo, sparePart.additionalInfo) && Objects.equals(createdAt, sparePart.createdAt) && Objects.equals(updatedAt, sparePart.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, sparePartManufacturer, name, partNumber, description, externalId, archived, additionalInfo, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "SparePart{" +
                "id=" + id +
                ", sparePartManufacturer=" + sparePartManufacturer +
                ", name='" + name + '\'' +
                ", partNumber='" + partNumber + '\'' +
                ", description='" + description + '\'' +
                ", externalId='" + externalId + '\'' +
                ", archived=" + archived +
                ", additionalInfo='" + additionalInfo + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
