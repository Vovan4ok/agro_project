package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="maintenance_record_rows")
public class MaintenanceRecordRow {
    @Id
    @Column(name="id")
    private Short id;

    @ManyToOne
    @JoinColumn(name="maintenance_record_id")
    private MaintenanceRecord maintenanceRecord;

    @ManyToOne
    @JoinColumn(name="maintenance_type_id")
    private MaintenanceType maintenanceType;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="repair_stage", length=20)
    private String repair_stage;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;
}
