package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="wh_items")
public class WhItem {
    @Id
    @Column(name="id")
    private Short id;

    @Column(name="name", length=100)
    private String name;

    @Column(name="variant_name", length=30)
    private String variantName;

    @Column(name="barcode", length=30)
    private String barcode;

    @Column(name="is_expiration_date")
    private boolean isExpirationDate;

    @ManyToOne
    @JoinColumn(name="wh_item_group_id")
    private WhItemGroup whItemGroup;

    @Column(name="related_object_type")
    private String relatedObjectType;

    @Column(name="related_object_id")
    private Short relatedObjectId;

    @ManyToOne
    @JoinColumn(name="wh_item_base_unit_id")
    private Unit whItemBaseUnit;

    @Column(name="additional_info")
    @Lob
    private String additionalInfo;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="external_id", length=50)
    private String externalId;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    public WhItem(Short id, String name, String variantName, String barcode, boolean isExpirationDate, WhItemGroup whItemGroup, String relatedObjectType, Short relatedObjectId, Unit whItemBaseUnit, String additionalInfo, String description, String externalId, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.name = name;
        this.variantName = variantName;
        this.barcode = barcode;
        this.isExpirationDate = isExpirationDate;
        this.whItemGroup = whItemGroup;
        this.relatedObjectType = relatedObjectType;
        this.relatedObjectId = relatedObjectId;
        this.whItemBaseUnit = whItemBaseUnit;
        this.additionalInfo = additionalInfo;
        this.description = description;
        this.externalId = externalId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public WhItem() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVariantName() {
        return variantName;
    }

    public void setVariantName(String variantName) {
        this.variantName = variantName;
    }

    public String getBarcode() {
        return barcode;
    }

    public void setBarcode(String barcode) {
        this.barcode = barcode;
    }

    public boolean isExpirationDate() {
        return isExpirationDate;
    }

    public void setExpirationDate(boolean expirationDate) {
        isExpirationDate = expirationDate;
    }

    public WhItemGroup getWhItemGroup() {
        return whItemGroup;
    }

    public void setWhItemGroup(WhItemGroup whItemGroup) {
        this.whItemGroup = whItemGroup;
    }

    public String getRelatedObjectType() {
        return relatedObjectType;
    }

    public void setRelatedObjectType(String relatedObjectType) {
        this.relatedObjectType = relatedObjectType;
    }

    public Short getRelatedObjectId() {
        return relatedObjectId;
    }

    public void setRelatedObjectId(Short relatedObjectId) {
        this.relatedObjectId = relatedObjectId;
    }

    public Unit getWhItemBaseUnit() {
        return whItemBaseUnit;
    }

    public void setWhItemBaseUnit(Unit whItemBaseUnit) {
        this.whItemBaseUnit = whItemBaseUnit;
    }

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
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
        WhItem whItem = (WhItem) o;
        return isExpirationDate == whItem.isExpirationDate && Objects.equals(id, whItem.id) && Objects.equals(name, whItem.name) && Objects.equals(variantName, whItem.variantName) && Objects.equals(barcode, whItem.barcode) && Objects.equals(whItemGroup, whItem.whItemGroup) && Objects.equals(relatedObjectType, whItem.relatedObjectType) && Objects.equals(relatedObjectId, whItem.relatedObjectId) && Objects.equals(whItemBaseUnit, whItem.whItemBaseUnit) && Objects.equals(additionalInfo, whItem.additionalInfo) && Objects.equals(description, whItem.description) && Objects.equals(externalId, whItem.externalId) && Objects.equals(createdAt, whItem.createdAt) && Objects.equals(updatedAt, whItem.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, variantName, barcode, isExpirationDate, whItemGroup, relatedObjectType, relatedObjectId, whItemBaseUnit, additionalInfo, description, externalId, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "WhItem{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", variantName='" + variantName + '\'' +
                ", barcode='" + barcode + '\'' +
                ", isExpirationDate=" + isExpirationDate +
                ", whItemGroup=" + whItemGroup +
                ", relatedObjectType='" + relatedObjectType + '\'' +
                ", relatedObjectId=" + relatedObjectId +
                ", whItemBaseUnit=" + whItemBaseUnit +
                ", additionalInfo='" + additionalInfo + '\'' +
                ", description='" + description + '\'' +
                ", externalId='" + externalId + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
