package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="alerts")
public class Alert {
    @Id
    @Column(name="id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name="alert_type_id")
    private AlertType alertType;

    @Column(name="alertable_id")
    private int alertable_id;

    @Column(name="event_start_time")
    private Timestamp event_start_time;

    @Column(name="status", length=15)
    private String status;

    @Column(name="description")
    @Lob
    private String description;

    @ManyToOne
    @JoinColumn(name="responsible_person_id")
    private User responsiblePerson;

    @ManyToOne
    @JoinColumn(name="created_by_user_id")
    private User createdByUser;

    @Column(name="event_stop_time")
    private Timestamp event_stop_time;

    @Column(name="alert_closed_at")
    private Timestamp alert_closed_at;

    @Column(name="alertable_type", length=15)
    private String alertable_type;

    @Column(name="automatic_alert_id")
    private short automatic_alert_id;

    @Column(name="system_info")
    @Lob
    private String system_info;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    @Column(name="description_data")
    @Lob
    private String description_data;

    public Alert(Integer id, AlertType alertType, int alertable_id, Timestamp event_start_time, String status, String description, User responsiblePerson, User createdByUser, Timestamp event_stop_time, Timestamp alert_closed_at, String alertable_type, short automatic_alert_id, String system_info, Timestamp created_at, Timestamp updated_at, String description_data) {
        this.id = id;
        this.alertType = alertType;
        this.alertable_id = alertable_id;
        this.event_start_time = event_start_time;
        this.status = status;
        this.description = description;
        this.responsiblePerson = responsiblePerson;
        this.createdByUser = createdByUser;
        this.event_stop_time = event_stop_time;
        this.alert_closed_at = alert_closed_at;
        this.alertable_type = alertable_type;
        this.automatic_alert_id = automatic_alert_id;
        this.system_info = system_info;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.description_data = description_data;
    }

    public Alert() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public AlertType getAlertType() {
        return alertType;
    }

    public void setAlertType(AlertType alertType) {
        this.alertType = alertType;
    }

    public int getAlertable_id() {
        return alertable_id;
    }

    public void setAlertable_id(int alertable_id) {
        this.alertable_id = alertable_id;
    }

    public Timestamp getEvent_start_time() {
        return event_start_time;
    }

    public void setEvent_start_time(Timestamp event_start_time) {
        this.event_start_time = event_start_time;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public User getResponsiblePerson() {
        return responsiblePerson;
    }

    public void setResponsiblePerson(User responsiblePerson) {
        this.responsiblePerson = responsiblePerson;
    }

    public User getCreatedByUser() {
        return createdByUser;
    }

    public void setCreatedByUser(User createdByUser) {
        this.createdByUser = createdByUser;
    }

    public Timestamp getEvent_stop_time() {
        return event_stop_time;
    }

    public void setEvent_stop_time(Timestamp event_stop_time) {
        this.event_stop_time = event_stop_time;
    }

    public Timestamp getAlert_closed_at() {
        return alert_closed_at;
    }

    public void setAlert_closed_at(Timestamp alert_closed_at) {
        this.alert_closed_at = alert_closed_at;
    }

    public String getAlertable_type() {
        return alertable_type;
    }

    public void setAlertable_type(String alertable_type) {
        this.alertable_type = alertable_type;
    }

    public short getAutomatic_alert_id() {
        return automatic_alert_id;
    }

    public void setAutomatic_alert_id(short automatic_alert_id) {
        this.automatic_alert_id = automatic_alert_id;
    }

    public String getSystem_info() {
        return system_info;
    }

    public void setSystem_info(String system_info) {
        this.system_info = system_info;
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

    public String getDescription_data() {
        return description_data;
    }

    public void setDescription_data(String description_data) {
        this.description_data = description_data;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Alert alert = (Alert) o;
        return alertable_id == alert.alertable_id && automatic_alert_id == alert.automatic_alert_id && Objects.equals(id, alert.id) && Objects.equals(alertType, alert.alertType) && Objects.equals(event_start_time, alert.event_start_time) && Objects.equals(status, alert.status) && Objects.equals(description, alert.description) && Objects.equals(responsiblePerson, alert.responsiblePerson) && Objects.equals(createdByUser, alert.createdByUser) && Objects.equals(event_stop_time, alert.event_stop_time) && Objects.equals(alert_closed_at, alert.alert_closed_at) && Objects.equals(alertable_type, alert.alertable_type) && Objects.equals(system_info, alert.system_info) && Objects.equals(created_at, alert.created_at) && Objects.equals(updated_at, alert.updated_at) && Objects.equals(description_data, alert.description_data);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, alertType, alertable_id, event_start_time, status, description, responsiblePerson, createdByUser, event_stop_time, alert_closed_at, alertable_type, automatic_alert_id, system_info, created_at, updated_at, description_data);
    }

    @Override
    public String toString() {
        return "Alert{" +
                "id=" + id +
                ", alertType=" + alertType +
                ", alertable_id=" + alertable_id +
                ", event_start_time=" + event_start_time +
                ", status='" + status + '\'' +
                ", description='" + description + '\'' +
                ", responsiblePerson=" + responsiblePerson +
                ", createdByUser=" + createdByUser +
                ", event_stop_time=" + event_stop_time +
                ", alert_closed_at=" + alert_closed_at +
                ", alertable_type='" + alertable_type + '\'' +
                ", automatic_alert_id=" + automatic_alert_id +
                ", system_info='" + system_info + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", description_data='" + description_data + '\'' +
                '}';
    }
}
