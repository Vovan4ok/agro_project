package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="users")
public class User {
    @Id
    @Column(name="id")
    private Integer id;

    @Column(name="username", length=100)
    private String username;

    @Column(name="email", length=100)
    private String email;

    @Column(name="mobile_phone", length=15)
    private String mobile_phone;

    @Column(name="position", length=50)
    private String position;

    @Column(name="language", length=5)
    private String language;

    @Column(name="time_zone", length=50)
    private String time_zone;

    @Column(name="yield_units", length=20)
    private String yield_units;

    @Column(name="telematics_specialist")
    private boolean telematics_specialist;

    @Column(name="individual_insurance_number")
    private int individual_insurance_number;

    @Column(name="status", length=20)
    private String status;

    @Column(name="dispatcher")
    private boolean dispatcher;

    @Column(name="driver")
    private boolean driver;

    @Column(name="agronomist")
    private boolean agronomist;

    @Column(name="additional_info")
    @Lob
    private String additional_info;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="rfid",length=15)
    private String rfid;

    @Column(name="tax_identification_number", length=20)
    private String tax_identification_number;

    @Column(name="last_sign_in_at")
    private Timestamp last_sign_in_at;

    @Column(name="current_sign_in_at")
    private Timestamp current_sign_in_at;

    @Column(name="consulting_company_id")
    private int consulting_company_id;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    @Column(name="external_id", length=50)
    private String external_id;

    @Column(name="auth_method", length=15)
    private String auth_method;

    public User(Integer id, String username, String email, String mobile_phone, String position, String language, String time_zone, String yield_units, boolean telematics_specialist, int individual_insurance_number, String status, boolean dispatcher, boolean driver, boolean agronomist, String additional_info, String description, String rfid, String tax_identification_number, Timestamp last_sign_in_at, Timestamp current_sign_in_at, int consulting_company_id, Timestamp created_at, Timestamp updated_at, String external_id, String auth_method) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.mobile_phone = mobile_phone;
        this.position = position;
        this.language = language;
        this.time_zone = time_zone;
        this.yield_units = yield_units;
        this.telematics_specialist = telematics_specialist;
        this.individual_insurance_number = individual_insurance_number;
        this.status = status;
        this.dispatcher = dispatcher;
        this.driver = driver;
        this.agronomist = agronomist;
        this.additional_info = additional_info;
        this.description = description;
        this.rfid = rfid;
        this.tax_identification_number = tax_identification_number;
        this.last_sign_in_at = last_sign_in_at;
        this.current_sign_in_at = current_sign_in_at;
        this.consulting_company_id = consulting_company_id;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.external_id = external_id;
        this.auth_method = auth_method;
    }

    public User() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMobile_phone() {
        return mobile_phone;
    }

    public void setMobile_phone(String mobile_phone) {
        this.mobile_phone = mobile_phone;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public String getTime_zone() {
        return time_zone;
    }

    public void setTime_zone(String time_zone) {
        this.time_zone = time_zone;
    }

    public String getYield_units() {
        return yield_units;
    }

    public void setYield_units(String yield_units) {
        this.yield_units = yield_units;
    }

    public boolean isTelematics_specialist() {
        return telematics_specialist;
    }

    public void setTelematics_specialist(boolean telematics_specialist) {
        this.telematics_specialist = telematics_specialist;
    }

    public int getIndividual_insurance_number() {
        return individual_insurance_number;
    }

    public void setIndividual_insurance_number(int individual_insurance_number) {
        this.individual_insurance_number = individual_insurance_number;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public boolean isDispatcher() {
        return dispatcher;
    }

    public void setDispatcher(boolean dispatcher) {
        this.dispatcher = dispatcher;
    }

    public boolean isDriver() {
        return driver;
    }

    public void setDriver(boolean driver) {
        this.driver = driver;
    }

    public boolean isAgronomist() {
        return agronomist;
    }

    public void setAgronomist(boolean agronomist) {
        this.agronomist = agronomist;
    }

    public String getAdditional_info() {
        return additional_info;
    }

    public void setAdditional_info(String additional_info) {
        this.additional_info = additional_info;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getRfid() {
        return rfid;
    }

    public void setRfid(String rfid) {
        this.rfid = rfid;
    }

    public String getTax_identification_number() {
        return tax_identification_number;
    }

    public void setTax_identification_number(String tax_identification_number) {
        this.tax_identification_number = tax_identification_number;
    }

    public Timestamp getLast_sign_in_at() {
        return last_sign_in_at;
    }

    public void setLast_sign_in_at(Timestamp last_sign_in_at) {
        this.last_sign_in_at = last_sign_in_at;
    }

    public Timestamp getCurrent_sign_in_at() {
        return current_sign_in_at;
    }

    public void setCurrent_sign_in_at(Timestamp current_sign_in_at) {
        this.current_sign_in_at = current_sign_in_at;
    }

    public int getConsulting_company_id() {
        return consulting_company_id;
    }

    public void setConsulting_company_id(int consulting_company_id) {
        this.consulting_company_id = consulting_company_id;
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

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }

    public String getAuth_method() {
        return auth_method;
    }

    public void setAuth_method(String auth_method) {
        this.auth_method = auth_method;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return telematics_specialist == user.telematics_specialist && individual_insurance_number == user.individual_insurance_number && dispatcher == user.dispatcher && driver == user.driver && agronomist == user.agronomist && consulting_company_id == user.consulting_company_id && Objects.equals(id, user.id) && Objects.equals(username, user.username) && Objects.equals(email, user.email) && Objects.equals(mobile_phone, user.mobile_phone) && Objects.equals(position, user.position) && Objects.equals(language, user.language) && Objects.equals(time_zone, user.time_zone) && Objects.equals(yield_units, user.yield_units) && Objects.equals(status, user.status) && Objects.equals(additional_info, user.additional_info) && Objects.equals(description, user.description) && Objects.equals(rfid, user.rfid) && Objects.equals(tax_identification_number, user.tax_identification_number) && Objects.equals(last_sign_in_at, user.last_sign_in_at) && Objects.equals(current_sign_in_at, user.current_sign_in_at) && Objects.equals(created_at, user.created_at) && Objects.equals(updated_at, user.updated_at) && Objects.equals(external_id, user.external_id) && Objects.equals(auth_method, user.auth_method);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, email, mobile_phone, position, language, time_zone, yield_units, telematics_specialist, individual_insurance_number, status, dispatcher, driver, agronomist, additional_info, description, rfid, tax_identification_number, last_sign_in_at, current_sign_in_at, consulting_company_id, created_at, updated_at, external_id, auth_method);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", mobile_phone='" + mobile_phone + '\'' +
                ", position='" + position + '\'' +
                ", language='" + language + '\'' +
                ", time_zone='" + time_zone + '\'' +
                ", yield_units='" + yield_units + '\'' +
                ", telematics_specialist=" + telematics_specialist +
                ", individual_insurance_number=" + individual_insurance_number +
                ", status='" + status + '\'' +
                ", dispatcher=" + dispatcher +
                ", driver=" + driver +
                ", agronomist=" + agronomist +
                ", additional_info='" + additional_info + '\'' +
                ", description='" + description + '\'' +
                ", rfid='" + rfid + '\'' +
                ", tax_identification_number='" + tax_identification_number + '\'' +
                ", last_sign_in_at=" + last_sign_in_at +
                ", current_sign_in_at=" + current_sign_in_at +
                ", consulting_company_id=" + consulting_company_id +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", external_id='" + external_id + '\'' +
                ", auth_method='" + auth_method + '\'' +
                '}';
    }
}
