package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="alert_types")
public class AlertType {
    @Id
    @Column(name="id")
    private Short id;

    @Column(name="alert_type", length=50)
    private String alert_type;

    @Column(name="name", length=50)
    private String name;

    @Column(name="priority", length=10)
    private String priority;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="additional_info")
    @Lob
    private String additional_info;

    @Column(name="archived")
    private boolean archived;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;
}
