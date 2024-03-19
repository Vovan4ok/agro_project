package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="scouting_task_points")
public class ScoutingTaskPoint {
    @Id
    @Column(name="id")
    private Short id;

    @ManyToOne
    @JoinColumn(name="scouting_task_id")
    private ScoutingTask scoutingTask;

    @Column(name="idempotency_key", length=100)
    private String idempotency_key;

    @Column(name="external_id", length=50)
    private String external_id;

    @Column(name="latitude")
    private double latitude;

    @Column(name="longitude")
    private double longitude;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    @Column(name="name", length=20)
    private String name;

    @Column(name="sequence_number")
    private short sequence_number;
}
