package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="fuel_types")
public class FuelType {
    @Id
    @Column(name="id")
    private Short id;

    @Column(name="name", length=20)
    private String name;

    @Column(name="short_name", length=10)
    private String short_name;

    @Column(name="standard_name", length=20)
    private String standard_name;

    @Column(name="category", length=20)
    private String category;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    @Column(name="external_id", length=50)
    private String external_id;
}
