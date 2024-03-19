package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="wh_items")
public class WhItem {
    @Id
    @Column(name="id")
    private Short id;

    @Column(name="name", length=100)
    private String name;

    @Column(name="variant_name", length=30)
    private String variant_name;

    @Column(name="barcode", length=30)
    private String barcode;

    @Column(name="is_expiration_date")
    private boolean is_expiration_date;

    @ManyToOne
    @JoinColumn(name="wh_item_group_id")
    private WhItemGroup whItemGroup;

    @Column(name="related_object_type")
    private String related_object_type;

    @Column(name="related_object_id")
    private Short related_object_id;

    @ManyToOne
    @JoinColumn(name="wh_item_base_unit_id")
    private Unit whItemBaseUnit;

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
}
