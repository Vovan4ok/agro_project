package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="seasons")
public class Season {
    @Id
    @Column(name="id")
    private Short id;

    @Column(name="name", length=20)
    private String name;

    @Column(name="year")
    private short year;

    @Column(name="start_date")
    private Date start_date;

    @Column(name="end_date")
    private Date end_date;

    @Column(name="additional_info")
    @Lob
    private String additional_info;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="external_id", length=50)
    private String external_id;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    public Season(Short id, String name, short year, Date start_date, Date end_date, String additional_info, String description, String external_id, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.name = name;
        this.year = year;
        this.start_date = start_date;
        this.end_date = end_date;
        this.additional_info = additional_info;
        this.description = description;
        this.external_id = external_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public Season() {
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

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }

    public Date getStart_date() {
        return start_date;
    }

    public void setStart_date(Date start_date) {
        this.start_date = start_date;
    }

    public Date getEnd_date() {
        return end_date;
    }

    public void setEnd_date(Date end_date) {
        this.end_date = end_date;
    }

    public String getAdditional_info() {
        return additional_info;
    }

    public void setAdditional_info(String additional_info) {
        this.additional_info = additional_info;
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
        Season season = (Season) o;
        return year == season.year && Objects.equals(id, season.id) && Objects.equals(name, season.name) && Objects.equals(start_date, season.start_date) && Objects.equals(end_date, season.end_date) && Objects.equals(additional_info, season.additional_info) && Objects.equals(description, season.description) && Objects.equals(external_id, season.external_id) && Objects.equals(created_at, season.created_at) && Objects.equals(updated_at, season.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, year, start_date, end_date, additional_info, description, external_id, created_at, updated_at);
    }

    @Override
    public String toString() {
        return "Season{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", year=" + year +
                ", start_date=" + start_date +
                ", end_date=" + end_date +
                ", additional_info='" + additional_info + '\'' +
                ", description='" + description + '\'' +
                ", external_id='" + external_id + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
