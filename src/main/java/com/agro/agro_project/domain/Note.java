package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;

@Entity
@Table(name="notes")
public class Note {
    @Id
    @Column(name="id")
    private Short id;

    @Column(name="notable_id")
    private int notable_id;

    @Column(name="notable_type", length=20)
    private String notable_type;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @Column(name="title", length=100)
    private String title;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="created_by_user_at")
    private Timestamp created_by_user_at;

    @Column(name="updated_by_user_at")
    private Timestamp updated_by_user_at;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;
}
