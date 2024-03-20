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
    private String mobilePhone;

    @Column(name="position", length=50)
    private String position;

    @Column(name="language", length=5)
    private String language;

    @Column(name="time_zone", length=50)
    private String timeZone;

    @Column(name="yield_units", length=20)
    private String yieldUnits;

    @Column(name="telematics_specialist")
    private boolean telematicsSpecialist;

    @Column(name="individual_insurance_number")
    private int individualInsuranceNumber;

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
    private String additionalInfo;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="rfid",length=15)
    private String rfid;

    @Column(name="tax_identification_number", length=20)
    private String taxIdentificationNumber;

    @Column(name="last_sign_in_at")
    private Timestamp lastSignInAt;

    @Column(name="current_sign_in_at")
    private Timestamp currentSignInAt;

    @Column(name="consulting_company_id")
    private int consultingCompanyId;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    @Column(name="external_id", length=50)
    private String externalId;

    @Column(name="auth_method", length=15)
    private String authMethod;

    public User(Integer id, String username, String email, String mobilePhone, String position, String language, String timeZone, String yieldUnits, boolean telematicsSpecialist, int individualInsuranceNumber, String status, boolean dispatcher, boolean driver, boolean agronomist, String additionalInfo, String description, String rfid, String taxIdentificationNumber, Timestamp lastSignInAt, Timestamp currentSignInAt, int consultingCompanyId, Timestamp createdAt, Timestamp updatedAt, String externalId, String authMethod) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.mobilePhone = mobilePhone;
        this.position = position;
        this.language = language;
        this.timeZone = timeZone;
        this.yieldUnits = yieldUnits;
        this.telematicsSpecialist = telematicsSpecialist;
        this.individualInsuranceNumber = individualInsuranceNumber;
        this.status = status;
        this.dispatcher = dispatcher;
        this.driver = driver;
        this.agronomist = agronomist;
        this.additionalInfo = additionalInfo;
        this.description = description;
        this.rfid = rfid;
        this.taxIdentificationNumber = taxIdentificationNumber;
        this.lastSignInAt = lastSignInAt;
        this.currentSignInAt = currentSignInAt;
        this.consultingCompanyId = consultingCompanyId;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.externalId = externalId;
        this.authMethod = authMethod;
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

    public String getMobilePhone() {
        return mobilePhone;
    }

    public void setMobilePhone(String mobilePhone) {
        this.mobilePhone = mobilePhone;
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

    public String getTimeZone() {
        return timeZone;
    }

    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }

    public String getYieldUnits() {
        return yieldUnits;
    }

    public void setYieldUnits(String yieldUnits) {
        this.yieldUnits = yieldUnits;
    }

    public boolean isTelematicsSpecialist() {
        return telematicsSpecialist;
    }

    public void setTelematicsSpecialist(boolean telematicsSpecialist) {
        this.telematicsSpecialist = telematicsSpecialist;
    }

    public int getIndividualInsuranceNumber() {
        return individualInsuranceNumber;
    }

    public void setIndividualInsuranceNumber(int individualInsuranceNumber) {
        this.individualInsuranceNumber = individualInsuranceNumber;
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

    public String getAdditionalInfo() {
        return additionalInfo;
    }

    public void setAdditionalInfo(String additionalInfo) {
        this.additionalInfo = additionalInfo;
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

    public String getTaxIdentificationNumber() {
        return taxIdentificationNumber;
    }

    public void setTaxIdentificationNumber(String taxIdentificationNumber) {
        this.taxIdentificationNumber = taxIdentificationNumber;
    }

    public Timestamp getLastSignInAt() {
        return lastSignInAt;
    }

    public void setLastSignInAt(Timestamp lastSignInAt) {
        this.lastSignInAt = lastSignInAt;
    }

    public Timestamp getCurrentSignInAt() {
        return currentSignInAt;
    }

    public void setCurrentSignInAt(Timestamp currentSignInAt) {
        this.currentSignInAt = currentSignInAt;
    }

    public int getConsultingCompanyId() {
        return consultingCompanyId;
    }

    public void setConsultingCompanyId(int consultingCompanyId) {
        this.consultingCompanyId = consultingCompanyId;
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

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getAuthMethod() {
        return authMethod;
    }

    public void setAuthMethod(String authMethod) {
        this.authMethod = authMethod;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        User user = (User) o;
        return telematicsSpecialist == user.telematicsSpecialist && individualInsuranceNumber == user.individualInsuranceNumber && dispatcher == user.dispatcher && driver == user.driver && agronomist == user.agronomist && consultingCompanyId == user.consultingCompanyId && Objects.equals(id, user.id) && Objects.equals(username, user.username) && Objects.equals(email, user.email) && Objects.equals(mobilePhone, user.mobilePhone) && Objects.equals(position, user.position) && Objects.equals(language, user.language) && Objects.equals(timeZone, user.timeZone) && Objects.equals(yieldUnits, user.yieldUnits) && Objects.equals(status, user.status) && Objects.equals(additionalInfo, user.additionalInfo) && Objects.equals(description, user.description) && Objects.equals(rfid, user.rfid) && Objects.equals(taxIdentificationNumber, user.taxIdentificationNumber) && Objects.equals(lastSignInAt, user.lastSignInAt) && Objects.equals(currentSignInAt, user.currentSignInAt) && Objects.equals(createdAt, user.createdAt) && Objects.equals(updatedAt, user.updatedAt) && Objects.equals(externalId, user.externalId) && Objects.equals(authMethod, user.authMethod);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, username, email, mobilePhone, position, language, timeZone, yieldUnits, telematicsSpecialist, individualInsuranceNumber, status, dispatcher, driver, agronomist, additionalInfo, description, rfid, taxIdentificationNumber, lastSignInAt, currentSignInAt, consultingCompanyId, createdAt, updatedAt, externalId, authMethod);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", email='" + email + '\'' +
                ", mobilePhone='" + mobilePhone + '\'' +
                ", position='" + position + '\'' +
                ", language='" + language + '\'' +
                ", timeZone='" + timeZone + '\'' +
                ", yieldUnits='" + yieldUnits + '\'' +
                ", telematicsSpecialist=" + telematicsSpecialist +
                ", individualInsuranceNumber=" + individualInsuranceNumber +
                ", status='" + status + '\'' +
                ", dispatcher=" + dispatcher +
                ", driver=" + driver +
                ", agronomist=" + agronomist +
                ", additionalInfo='" + additionalInfo + '\'' +
                ", description='" + description + '\'' +
                ", rfid='" + rfid + '\'' +
                ", taxIdentificationNumber='" + taxIdentificationNumber + '\'' +
                ", lastSignInAt=" + lastSignInAt +
                ", currentSignInAt=" + currentSignInAt +
                ", consultingCompanyId=" + consultingCompanyId +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", externalId='" + externalId + '\'' +
                ", authMethod='" + authMethod + '\'' +
                '}';
    }
}
