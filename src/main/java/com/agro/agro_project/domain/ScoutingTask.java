package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="scouting_tasks")
public class ScoutingTask {
    @Id
    @Column(name="id")
    private Short id;

    @ManyToOne
    @JoinColumn(name="field_id")
    private Field field;

    @ManyToOne
    @JoinColumn(name="responsible_id")
    private User responsibleUser;

    @ManyToOne
    @JoinColumn(name="author_id")
    private User author;

    @Column(name="external_id", length=50)
    private String external_id;

    @Column(name="idempotency_key", length=50)
    private String idempotency_key;

    @Column(name="start_time")
    private Timestamp start_time;

    @Column(name="end_time")
    private Timestamp end_time;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    @Column(name="status", length=20)
    private String status;

    @Column(name="image_type", length=20)
    private String image_type;

    @Column(name="image_date")
    private Date image_date;

    @Column(name="image_source_sign", length=10)
    private String image_source_sign;

    @Column(name="scout_report_template_id")
    private short scout_report_template_id;

    @Column(name="season")
    private short season;

    @ManyToOne
    @JoinColumn(name="agro_operation_id")
    private AgroOperation agroOperation;

    @Column(name="automatic_scouting_task_id")
    private int automatic_scouting_task_id;

    @Column(name="history_item_id")
    private int history_item_id;

    public ScoutingTask(Short id, Field field, User responsibleUser, User author, String external_id, String idempotency_key, Timestamp start_time, Timestamp end_time, String description, Timestamp created_at, Timestamp updated_at, String status, String image_type, Date image_date, String image_source_sign, short scout_report_template_id, short season, AgroOperation agroOperation, int automatic_scouting_task_id, int history_item_id) {
        this.id = id;
        this.field = field;
        this.responsibleUser = responsibleUser;
        this.author = author;
        this.external_id = external_id;
        this.idempotency_key = idempotency_key;
        this.start_time = start_time;
        this.end_time = end_time;
        this.description = description;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.status = status;
        this.image_type = image_type;
        this.image_date = image_date;
        this.image_source_sign = image_source_sign;
        this.scout_report_template_id = scout_report_template_id;
        this.season = season;
        this.agroOperation = agroOperation;
        this.automatic_scouting_task_id = automatic_scouting_task_id;
        this.history_item_id = history_item_id;
    }

    public ScoutingTask() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
    }

    public User getResponsibleUser() {
        return responsibleUser;
    }

    public void setResponsibleUser(User responsibleUser) {
        this.responsibleUser = responsibleUser;
    }

    public User getAuthor() {
        return author;
    }

    public void setAuthor(User author) {
        this.author = author;
    }

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }

    public String getIdempotency_key() {
        return idempotency_key;
    }

    public void setIdempotency_key(String idempotency_key) {
        this.idempotency_key = idempotency_key;
    }

    public Timestamp getStart_time() {
        return start_time;
    }

    public void setStart_time(Timestamp start_time) {
        this.start_time = start_time;
    }

    public Timestamp getEnd_time() {
        return end_time;
    }

    public void setEnd_time(Timestamp end_time) {
        this.end_time = end_time;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Timestamp getCreated_at() {
        return created_at;
    }

    public void setCreated_at(Timestamp created_at) {
        this.created_at = created_at;
    }

    public Timestamp getUpdated_at() {
        return updated_at;
    }

    public void setUpdated_at(Timestamp updated_at) {
        this.updated_at = updated_at;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getImage_type() {
        return image_type;
    }

    public void setImage_type(String image_type) {
        this.image_type = image_type;
    }

    public Date getImage_date() {
        return image_date;
    }

    public void setImage_date(Date image_date) {
        this.image_date = image_date;
    }

    public String getImage_source_sign() {
        return image_source_sign;
    }

    public void setImage_source_sign(String image_source_sign) {
        this.image_source_sign = image_source_sign;
    }

    public short getScout_report_template_id() {
        return scout_report_template_id;
    }

    public void setScout_report_template_id(short scout_report_template_id) {
        this.scout_report_template_id = scout_report_template_id;
    }

    public short getSeason() {
        return season;
    }

    public void setSeason(short season) {
        this.season = season;
    }

    public AgroOperation getAgroOperation() {
        return agroOperation;
    }

    public void setAgroOperation(AgroOperation agroOperation) {
        this.agroOperation = agroOperation;
    }

    public int getAutomatic_scouting_task_id() {
        return automatic_scouting_task_id;
    }

    public void setAutomatic_scouting_task_id(int automatic_scouting_task_id) {
        this.automatic_scouting_task_id = automatic_scouting_task_id;
    }

    public int getHistory_item_id() {
        return history_item_id;
    }

    public void setHistory_item_id(int history_item_id) {
        this.history_item_id = history_item_id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ScoutingTask that = (ScoutingTask) o;
        return scout_report_template_id == that.scout_report_template_id && season == that.season && automatic_scouting_task_id == that.automatic_scouting_task_id && history_item_id == that.history_item_id && Objects.equals(id, that.id) && Objects.equals(field, that.field) && Objects.equals(responsibleUser, that.responsibleUser) && Objects.equals(author, that.author) && Objects.equals(external_id, that.external_id) && Objects.equals(idempotency_key, that.idempotency_key) && Objects.equals(start_time, that.start_time) && Objects.equals(end_time, that.end_time) && Objects.equals(description, that.description) && Objects.equals(created_at, that.created_at) && Objects.equals(updated_at, that.updated_at) && Objects.equals(status, that.status) && Objects.equals(image_type, that.image_type) && Objects.equals(image_date, that.image_date) && Objects.equals(image_source_sign, that.image_source_sign) && Objects.equals(agroOperation, that.agroOperation);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, field, responsibleUser, author, external_id, idempotency_key, start_time, end_time, description, created_at, updated_at, status, image_type, image_date, image_source_sign, scout_report_template_id, season, agroOperation, automatic_scouting_task_id, history_item_id);
    }

    @Override
    public String toString() {
        return "ScoutingTask{" +
                "id=" + id +
                ", field=" + field +
                ", responsibleUser=" + responsibleUser +
                ", author=" + author +
                ", external_id='" + external_id + '\'' +
                ", idempotency_key='" + idempotency_key + '\'' +
                ", start_time=" + start_time +
                ", end_time=" + end_time +
                ", description='" + description + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", status='" + status + '\'' +
                ", image_type='" + image_type + '\'' +
                ", image_date=" + image_date +
                ", image_source_sign='" + image_source_sign + '\'' +
                ", scout_report_template_id=" + scout_report_template_id +
                ", season=" + season +
                ", agroOperation=" + agroOperation +
                ", automatic_scouting_task_id=" + automatic_scouting_task_id +
                ", history_item_id=" + history_item_id +
                '}';
    }
}
