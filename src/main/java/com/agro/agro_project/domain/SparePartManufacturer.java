package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="spare_part_manufacturers")
public class SparePartManufacturer {
    @Id
    @Column(name="id")
    private Short id;

    @Column(name="name", length=20)
    private String name;

    @Column(name="external_id", length=50)
    private String external_id;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;
}
