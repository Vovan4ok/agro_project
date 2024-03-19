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
    private String external_id;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    public FieldShapeLandParcelMappingItem(Short id, FieldShape fieldShape, LandParcel landParcel, String external_id, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.fieldShape = fieldShape;
        this.landParcel = landParcel;
        this.external_id = external_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public FieldShapeLandParcelMappingItem() {
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        FieldShapeLandParcelMappingItem that = (FieldShapeLandParcelMappingItem) o;
        return Objects.equals(id, that.id) && Objects.equals(fieldShape, that.fieldShape) && Objects.equals(landParcel, that.landParcel) && Objects.equals(external_id, that.external_id) && Objects.equals(created_at, that.created_at) && Objects.equals(updated_at, that.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, fieldShape, landParcel, external_id, created_at, updated_at);
    }

    @Override
    public String toString() {
        return "FieldShapeLandParcelMappingItem{" +
                "id=" + id +
                ", fieldShape=" + fieldShape +
                ", landParcel=" + landParcel +
                ", external_id='" + external_id + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
