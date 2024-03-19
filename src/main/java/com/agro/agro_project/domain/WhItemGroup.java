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
    private String group_type;

    @Column(name="name", length=50)
    private String name;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="external_id", length=50)
    private String external_id;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    public WhItemGroup(Short id, WhItemGroup parent, String group_type, String name, String description, String external_id, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.parent = parent;
        this.group_type = group_type;
        this.name = name;
        this.description = description;
        this.external_id = external_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
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

    public String getGroup_type() {
        return group_type;
    }

    public void setGroup_type(String group_type) {
        this.group_type = group_type;
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

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
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
        WhItemGroup that = (WhItemGroup) o;
        return Objects.equals(id, that.id) && Objects.equals(parent, that.parent) && Objects.equals(group_type, that.group_type) && Objects.equals(name, that.name) && Objects.equals(description, that.description) && Objects.equals(external_id, that.external_id) && Objects.equals(created_at, that.created_at) && Objects.equals(updated_at, that.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, parent, group_type, name, description, external_id, created_at, updated_at);
    }

    @Override
    public String toString() {
        return "WhItemGroup{" +
                "id=" + id +
                ", parent=" + parent +
                ", group_type='" + group_type + '\'' +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", external_id='" + external_id + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
