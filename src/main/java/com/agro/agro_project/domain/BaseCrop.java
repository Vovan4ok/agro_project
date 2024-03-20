package com.agro.agro_project.domain;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name="base_crops")
public class BaseCrop {
    @Id
    @Column(name="id")
    private Short id;

    @Column(name="name", length=50)
    private String name;

    @Column(name="standard_name", length=50)
    private String standardName;

    public BaseCrop(Short id, String name, String standardName) {
        this.id = id;
        this.name = name;
        this.standardName = standardName;
    }

    public BaseCrop() {
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

    public String getStandardName() {
        return standardName;
    }

    public void setStandardName(String standardName) {
        this.standardName = standardName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        BaseCrop baseCrop = (BaseCrop) o;
        return Objects.equals(id, baseCrop.id) && Objects.equals(name, baseCrop.name) && Objects.equals(standardName, baseCrop.standardName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, standardName);
    }

    @Override
    public String toString() {
        return "BaseCrop{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", standardName='" + standardName + '\'' +
                '}';
    }
}
