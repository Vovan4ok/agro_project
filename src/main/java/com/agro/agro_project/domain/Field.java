package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Time;
import java.sql.Timestamp;

@Entity
@Table(name="fields")
public class Field {
    @Id
    @Column(name="id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name="field_group_id")
    private FieldGroup fieldGroup;

    @Column(name="name", length=50)
    private String name;

    @Column(name="additional_name", length=50)
    private String additional_name;

    @Column(name="additional_info")
    @Lob
    private String additional_info;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="administrative_area_name", length=50)
    private String administrative_area_name;

    @Column(name="subadministrative_area_name", length=50)
    private String subadministrative_area_name;

    @Column(name="locality", length=20)
    private String locality;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    @Column(name="external_id", length=20)
    private String external_id;

    @Column(name="idempotency_key", length=20)
    private String idempotency_key;

    @ManyToOne
    @JoinColumn(name="region_id")
    private AdminRegion region;

    @ManyToOne
    @JoinColumn(name="country_id")
    private AdminRegion country;

    @ManyToOne
    @JoinColumn(name="district_id")
    private AdminRegion district;

    @Column(name="x_custom_fields_data")
    @Lob
    private String x_custom_fields_data;
}
