package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="wh_item_groups")
public class WhItemGroup {
    @Id
    @Column(name="id")
    private Short id;

    @ManyToOne
    @JoinColumn(name="parent_id")
    private WhItemGroup parent;

    @Column(name="group_type", length=20)
    private String groupType;

    @Column(name="name", length=50)
    private String name;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="external_id", length=50)
    private String externalId;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    public WhItemGroup(Short id, WhItemGroup parent, String groupType, String name, String description, String externalId, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.parent = parent;
        this.groupType = groupType;
        this.name = name;
        this.description = description;
        this.externalId = externalId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public WhItemGroup() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public WhItemGroup getParent() {
        return parent;
    }

    public void setParent(WhItemGroup parent) {
        this.parent = parent;
    }

    public String getGroupType() {
        return groupType;
    }

    public void setGroupType(String groupType) {
        this.groupType = groupType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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
        WhItemGroup that = (WhItemGroup) o;
        return Objects.equals(id, that.id) && Objects.equals(parent, that.parent) && Objects.equals(groupType, that.groupType) && Objects.equals(name, that.name) && Objects.equals(description, that.description) && Objects.equals(externalId, that.externalId) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parent, groupType, name, description, externalId, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "WhItemGroup{" +
                "id=" + id +
                ", parent=" + parent +
                ", groupType='" + groupType + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", externalId='" + externalId + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
