package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

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
    private String idempotencyKey;

    @Column(name="external_id", length=50)
    private String externalId;

    @Column(name="latitude")
    private double latitude;

    @Column(name="longitude")
    private double longitude;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    @Column(name="name", length=20)
    private String name;

    @Column(name="sequence_number")
    private short sequenceNumber;

    public ScoutingTaskPoint(Short id, ScoutingTask scoutingTask, String idempotencyKey, String externalId, double latitude, double longitude, String description, Timestamp createdAt, Timestamp updatedAt, String name, short sequenceNumber) {
        this.id = id;
        this.scoutingTask = scoutingTask;
        this.idempotencyKey = idempotencyKey;
        this.externalId = externalId;
        this.latitude = latitude;
        this.longitude = longitude;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.name = name;
        this.sequenceNumber = sequenceNumber;
    }

    public ScoutingTaskPoint() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public ScoutingTask getScoutingTask() {
        return scoutingTask;
    }

    public void setScoutingTask(ScoutingTask scoutingTask) {
        this.scoutingTask = scoutingTask;
    }

    public String getIdempotencyKey() {
        return idempotencyKey;
    }

    public void setIdempotencyKey(String idempotencyKey) {
        this.idempotencyKey = idempotencyKey;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public double getLatitude() {
        return latitude;
    }

    public void setLatitude(double latitude) {
        this.latitude = latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    public void setLongitude(double longitude) {
        this.longitude = longitude;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getSequenceNumber() {
        return sequenceNumber;
    }

    public void setSequenceNumber(short sequenceNumber) {
        this.sequenceNumber = sequenceNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScoutingTaskPoint that = (ScoutingTaskPoint) o;
        return Double.compare(latitude, that.latitude) == 0 && Double.compare(longitude, that.longitude) == 0 && sequenceNumber == that.sequenceNumber && Objects.equals(id, that.id) && Objects.equals(scoutingTask, that.scoutingTask) && Objects.equals(idempotencyKey, that.idempotencyKey) && Objects.equals(externalId, that.externalId) && Objects.equals(description, that.description) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt) && Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, scoutingTask, idempotencyKey, externalId, latitude, longitude, description, createdAt, updatedAt, name, sequenceNumber);
    }

    @Override
    public String toString() {
        return "ScoutingTaskPoint{" +
                "id=" + id +
                ", scoutingTask=" + scoutingTask +
                ", idempotencyKey='" + idempotencyKey + '\'' +
                ", externalId='" + externalId + '\'' +
                ", latitude=" + latitude +
                ", longitude=" + longitude +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", name='" + name + '\'' +
                ", sequenceNumber=" + sequenceNumber +
                '}';
    }
}
