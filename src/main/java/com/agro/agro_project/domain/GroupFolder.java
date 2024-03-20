package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="group_folders")
public class GroupFolder {
    @Id
    @Column(name="id")
    private Short id;

    @ManyToOne
    @JoinColumn(name="parent_id")
    private GroupFolder parent;

    @Column(name="name", length=50)
    private String name;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    @Column(name="external_id", length=50)
    private String externalId;


    public GroupFolder(Short id, GroupFolder parent, String name, Timestamp createdAt, Timestamp updatedAt, String externalId) {
        this.id = id;
        this.parent = parent;
        this.name = name;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.externalId = externalId;
    }

    public GroupFolder() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public GroupFolder getParent() {
        return parent;
    }

    public void setParent(GroupFolder parent) {
        this.parent = parent;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupFolder that = (GroupFolder) o;
        return Objects.equals(id, that.id) && Objects.equals(parent, that.parent) && Objects.equals(name, that.name) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt) && Objects.equals(externalId, that.externalId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parent, name, createdAt, updatedAt, externalId);
    }

    @Override
    public String toString() {
        return "GroupFolder{" +
                "id=" + id +
                ", parent=" + parent +
                ", name='" + name + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", externalId='" + externalId + '\'' +
                '}';
    }
}
