package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="notes", schema="cropwise_data")
public class Note {
    @Id
    @Column(name="id")
    private Short id;

    @Column(name="notable_id")
    private Integer notableId;

    @Column(name="notable_type", length=20)
    private String notableType;

    @ManyToOne
    @JoinColumn(name="user_id")
    private User user;

    @Column(name="title", length=100)
    private String title;

    @Column(name="description")
    private String description;

    @Column(name="created_by_user_at")
    private Timestamp createdByUserAt;

    @Column(name="updated_by_user_at")
    private Timestamp updatedByUserAt;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    public Note(Short id, Integer notableId, String notableType, User user, String title, String description, Timestamp createdByUserAt, Timestamp updatedByUserAt, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.notableId = notableId;
        this.notableType = notableType;
        this.user = user;
        this.title = title;
        this.description = description;
        this.createdByUserAt = createdByUserAt;
        this.updatedByUserAt = updatedByUserAt;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
    }

    public Note() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Integer getNotableId() {
        return notableId;
    }

    public void setNotableId(Integer notableId) {
        this.notableId = notableId;
    }

    public String getNotableType() {
        return notableType;
    }

    public void setNotableType(String notableType) {
        this.notableType = notableType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getCreatedByUserAt() {
        return createdByUserAt;
    }

    public void setCreatedByUserAt(Timestamp createdByUserAt) {
        this.createdByUserAt = createdByUserAt;
    }

    public Timestamp getUpdatedByUserAt() {
        return updatedByUserAt;
    }

    public void setUpdatedByUserAt(Timestamp updatedByUserAt) {
        this.updatedByUserAt = updatedByUserAt;
    }

    public Timestamp getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Timestamp createdAt) {
        this.createdAt = createdAt;
    }

    public Timestamp getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Timestamp updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Note note = (Note) o;
        return Objects.equals(notableId, note.notableId) && Objects.equals(id, note.id) && Objects.equals(notableType, note.notableType) && Objects.equals(user, note.user) && Objects.equals(title, note.title) && Objects.equals(description, note.description) && Objects.equals(createdByUserAt, note.createdByUserAt) && Objects.equals(updatedByUserAt, note.updatedByUserAt) && Objects.equals(createdAt, note.createdAt) && Objects.equals(updatedAt, note.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, notableId, notableType, user, title, description, createdByUserAt, updatedByUserAt, createdAt, updatedAt);
    }

    @Override
    public String toString() {
        return "Note{" +
                "id=" + id +
                ", notableId=" + notableId +
                ", notableType='" + notableType + '\'' +
                ", user=" + user +
                ", title='" + title + '\'' +
                ", description='" + description + '\'' +
                ", createdByUserAt=" + createdByUserAt +
                ", updatedByUserAt=" + updatedByUserAt +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
