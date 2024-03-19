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
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    @Column(name="external_id", length=50)
    private String external_id;


    public GroupFolder(Short id, GroupFolder parent, String name, Timestamp created_at, Timestamp updated_at, String external_id) {
        this.id = id;
        this.parent = parent;
        this.name = name;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.external_id = external_id;
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

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GroupFolder that = (GroupFolder) o;
        return Objects.equals(id, that.id) && Objects.equals(parent, that.parent) && Objects.equals(name, that.name) && Objects.equals(created_at, that.created_at) && Objects.equals(updated_at, that.updated_at) && Objects.equals(external_id, that.external_id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parent, name, created_at, updated_at, external_id);
    }

    @Override
    public String toString() {
        return "GroupFolder{" +
                "id=" + id +
                ", parent=" + parent +
                ", name='" + name + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", external_id='" + external_id + '\'' +
                '}';
    }
}
