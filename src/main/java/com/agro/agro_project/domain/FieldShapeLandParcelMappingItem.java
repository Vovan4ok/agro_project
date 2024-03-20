package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="field_shape_land_parcel_mapping_items")
public class FieldShapeLandParcelMappingItem {
    @Id
    @Column(name="id")
    private Short id;

    @ManyToOne
    @JoinColumn(name="field_shape_id")
    private FieldShape fieldShape;

    @ManyToOne
    @JoinColumn(name="land_parcel_id")
    private LandParcel landParcel;

    @Column(name="external_id", length=50)
    private String externalId;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    public FieldShapeLandParcelMappingItem(Short id, FieldShape fieldShape, LandParcel landParcel, String externalId, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.fieldShape = fieldShape;
        this.landParcel = landParcel;
        this.externalId = externalId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public FieldShapeLandParcelMappingItem() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public FieldShape getFieldShape() {
        return fieldShape;
    }

    public void setFieldShape(FieldShape fieldShape) {
        this.fieldShape = fieldShape;
    }

    public LandParcel getLandParcel() {
        return landParcel;
    }

    public void setLandParcel(LandParcel landParcel) {
        this.landParcel = landParcel;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
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
        FieldShapeLandParcelMappingItem that = (FieldShapeLandParcelMappingItem) o;
        return Objects.equals(id, that.id) && Objects.equals(fieldShape, that.fieldShape) && Objects.equals(landParcel, that.landParcel) && Objects.equals(externalId, that.externalId) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fieldShape, landParcel, externalId, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "FieldShapeLandParcelMappingItem{" +
                "id=" + id +
                ", fieldShape=" + fieldShape +
                ", landParcel=" + landParcel +
                ", external_id='" + externalId + '\'' +
                ", created_at=" + createdAt +
                ", updated_at=" + updatedAt +
                '}';
    }
}
