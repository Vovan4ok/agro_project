package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="counterparties")
public class Counterparty {
    @Id
    @Column(name="id")
    private Short id;

    @Column(name="first_name", length=50)
    private String firstName;

    @Column(name="middle_name", length=50)
    private String middleName;

    @Column(name="last_name", length=70)
    private String lastName;

    @Column(name="birth_date")
    private Date birthDate;

    @Column(name="phone_number", length=50)
    private String phoneNumber;

    @Column(name="passport_code", length=20)
    private String passportCode;

    @Column(name="email", length=30)
    private String email;

    @Column(name="passport_issuing_date")
    private Date passportIssuingDate;

    @Column(name="identification_code", length=20)
    private String identificationCode;

    @Column(name="passport_issued_by")
    private String passportIssuedBy;

    @Column(name="passport_issuing_date_presence")
    private boolean passportIssuingDatePresence;

    @Column(name="external_id", length=50)
    private String externalId;

    @Column(name="counterparty_type", length=30)
    private String counterpartyType;

    @Column(name="street", length=30)
    private String street;

    @Column(name="region", length=30)
    private String region;

    @Column(name="locality", length=30)
    private String locality;

    @Column(name="district", length=30)
    private String district;

    @Column(name="house_number", length=20)
    private String houseNumber;

    @Column(name="postcode", length=20)
    private String postcode;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    @Column(name="legal_name", length=50)
    private String legalName;

    @Column(name="legal_address", length=50)
    private String legalAddress;

    @Column(name="index")
    private short index;

    @Column(name="company_number", length=30)
    private String companyNumber;

    @Column(name="signatory", length=50)
    private String signatory;

    @Column(name="contact_person", length=50)
    private String contactPerson;

    @Column(name="vat_payer")
    private boolean vatPayer;

    @Column(name="counterparty_group_id")
    private short counterpartyGroupId;

    @Column(name="x_custom_rozrakhunkovii_rakhunok", length=20)
    private String xCustomRozrakhunkoviiRakhunok;

    @Column(name="x_custom_nomer_karti", length=100)
    private String xCustomNomerKarti;

    public Counterparty(Short id, String firstName, String middleName, String lastName, Date birthDate, String phoneNumber, String passportCode, String email, Date passportIssuingDate, String identificationCode, String passportIssuedBy, boolean passportIssuingDatePresence, String externalId, String counterpartyType, String street, String region, String locality, String district, String houseNumber, String postcode, Timestamp createdAt, Timestamp updatedAt, String legalName, String legalAddress, short index, String companyNumber, String signatory, String contactPerson, boolean vatPayer, short counterpartyGroupId, String xCustomRozrakhunkoviiRakhunok, String xCustomNomerKarti) {
        this.id = id;
        this.firstName = firstName;
        this.middleName = middleName;
        this.lastName = lastName;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.passportCode = passportCode;
        this.email = email;
        this.passportIssuingDate = passportIssuingDate;
        this.identificationCode = identificationCode;
        this.passportIssuedBy = passportIssuedBy;
        this.passportIssuingDatePresence = passportIssuingDatePresence;
        this.externalId = externalId;
        this.counterpartyType = counterpartyType;
        this.street = street;
        this.region = region;
        this.locality = locality;
        this.district = district;
        this.houseNumber = houseNumber;
        this.postcode = postcode;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.legalName = legalName;
        this.legalAddress = legalAddress;
        this.index = index;
        this.companyNumber = companyNumber;
        this.signatory = signatory;
        this.contactPerson = contactPerson;
        this.vatPayer = vatPayer;
        this.counterpartyGroupId = counterpartyGroupId;
        this.xCustomRozrakhunkoviiRakhunok = xCustomRozrakhunkoviiRakhunok;
        this.xCustomNomerKarti = xCustomNomerKarti;
    }

    public Counterparty() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getMiddleName() {
        return middleName;
    }

    public void setMiddleName(String middleName) {
        this.middleName = middleName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getPassportCode() {
        return passportCode;
    }

    public void setPassportCode(String passportCode) {
        this.passportCode = passportCode;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getPassportIssuingDate() {
        return passportIssuingDate;
    }

    public void setPassportIssuingDate(Date passportIssuingDate) {
        this.passportIssuingDate = passportIssuingDate;
    }

    public String getIdentificationCode() {
        return identificationCode;
    }

    public void setIdentificationCode(String identificationCode) {
        this.identificationCode = identificationCode;
    }

    public String getPassportIssuedBy() {
        return passportIssuedBy;
    }

    public void setPassportIssuedBy(String passportIssuedBy) {
        this.passportIssuedBy = passportIssuedBy;
    }

    public boolean isPassportIssuingDatePresence() {
        return passportIssuingDatePresence;
    }

    public void setPassportIssuingDatePresence(boolean passportIssuingDatePresence) {
        this.passportIssuingDatePresence = passportIssuingDatePresence;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public String getCounterpartyType() {
        return counterpartyType;
    }

    public void setCounterpartyType(String counterpartyType) {
        this.counterpartyType = counterpartyType;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public String getLocality() {
        return locality;
    }

    public void setLocality(String locality) {
        this.locality = locality;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getHouseNumber() {
        return houseNumber;
    }

    public void setHouseNumber(String houseNumber) {
        this.houseNumber = houseNumber;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
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

    public String getLegalName() {
        return legalName;
    }

    public void setLegalName(String legalName) {
        this.legalName = legalName;
    }

    public String getLegalAddress() {
        return legalAddress;
    }

    public void setLegalAddress(String legalAddress) {
        this.legalAddress = legalAddress;
    }

    public short getIndex() {
        return index;
    }

    public void setIndex(short index) {
        this.index = index;
    }

    public String getCompanyNumber() {
        return companyNumber;
    }

    public void setCompanyNumber(String companyNumber) {
        this.companyNumber = companyNumber;
    }

    public String getSignatory() {
        return signatory;
    }

    public void setSignatory(String signatory) {
        this.signatory = signatory;
    }

    public String getContactPerson() {
        return contactPerson;
    }

    public void setContactPerson(String contactPerson) {
        this.contactPerson = contactPerson;
    }

    public boolean isVatPayer() {
        return vatPayer;
    }

    public void setVatPayer(boolean vatPayer) {
        this.vatPayer = vatPayer;
    }

    public short getCounterpartyGroupId() {
        return counterpartyGroupId;
    }

    public void setCounterpartyGroupId(short counterpartyGroupId) {
        this.counterpartyGroupId = counterpartyGroupId;
    }

    public String getXCustomRozrakhunkoviiRakhunok() {
        return xCustomRozrakhunkoviiRakhunok;
    }

    public void setXCustomRozrakhunkoviiRakhunok(String xCustomRozrakhunkoviiRakhunok) {
        this.xCustomRozrakhunkoviiRakhunok = xCustomRozrakhunkoviiRakhunok;
    }

    public String getXCustomNomerKarti() {
        return xCustomNomerKarti;
    }

    public void setXCustomNomerKarti(String xCustomNomerKarti) {
        this.xCustomNomerKarti = xCustomNomerKarti;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Counterparty that = (Counterparty) o;
        return passportIssuingDatePresence == that.passportIssuingDatePresence && index == that.index && vatPayer == that.vatPayer && counterpartyGroupId == that.counterpartyGroupId && Objects.equals(id, that.id) && Objects.equals(firstName, that.firstName) && Objects.equals(middleName, that.middleName) && Objects.equals(lastName, that.lastName) && Objects.equals(birthDate, that.birthDate) && Objects.equals(phoneNumber, that.phoneNumber) && Objects.equals(passportCode, that.passportCode) && Objects.equals(email, that.email) && Objects.equals(passportIssuingDate, that.passportIssuingDate) && Objects.equals(identificationCode, that.identificationCode) && Objects.equals(passportIssuedBy, that.passportIssuedBy) && Objects.equals(externalId, that.externalId) && Objects.equals(counterpartyType, that.counterpartyType) && Objects.equals(street, that.street) && Objects.equals(region, that.region) && Objects.equals(locality, that.locality) && Objects.equals(district, that.district) && Objects.equals(houseNumber, that.houseNumber) && Objects.equals(postcode, that.postcode) && Objects.equals(createdAt, that.createdAt) && Objects.equals(updatedAt, that.updatedAt) && Objects.equals(legalName, that.legalName) && Objects.equals(legalAddress, that.legalAddress) && Objects.equals(companyNumber, that.companyNumber) && Objects.equals(signatory, that.signatory) && Objects.equals(contactPerson, that.contactPerson) && Objects.equals(xCustomRozrakhunkoviiRakhunok, that.xCustomRozrakhunkoviiRakhunok) && Objects.equals(xCustomNomerKarti, that.xCustomNomerKarti);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, firstName, middleName, lastName, birthDate, phoneNumber, passportCode, email, passportIssuingDate, identificationCode, passportIssuedBy, passportIssuingDatePresence, externalId, counterpartyType, street, region, locality, district, houseNumber, postcode, createdAt, updatedAt, legalName, legalAddress, index, companyNumber, signatory, contactPerson, vatPayer, counterpartyGroupId, xCustomRozrakhunkoviiRakhunok, xCustomNomerKarti);
    }

    @Override
    public String toString() {
        return "Counterparty{" +
                "id=" + id +
                ", firstName='" + firstName + '\'' +
                ", middleName='" + middleName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", birthDate=" + birthDate +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", passportCode='" + passportCode + '\'' +
                ", email='" + email + '\'' +
                ", passportIssuingDate=" + passportIssuingDate +
                ", identificationCode='" + identificationCode + '\'' +
                ", passportIssuedBy='" + passportIssuedBy + '\'' +
                ", passportIssuingDatePresence=" + passportIssuingDatePresence +
                ", externalId='" + externalId + '\'' +
                ", counterpartyType='" + counterpartyType + '\'' +
                ", street='" + street + '\'' +
                ", region='" + region + '\'' +
                ", locality='" + locality + '\'' +
                ", district='" + district + '\'' +
                ", houseNumber='" + houseNumber + '\'' +
                ", postcode='" + postcode + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", legalName='" + legalName + '\'' +
                ", legalAddress='" + legalAddress + '\'' +
                ", index=" + index +
                ", companyNumber='" + companyNumber + '\'' +
                ", signatory='" + signatory + '\'' +
                ", contactPerson='" + contactPerson + '\'' +
                ", vatPayer=" + vatPayer +
                ", counterpartyGroupId=" + counterpartyGroupId +
                ", xCustomRozrakhunkoviiRakhunok='" + xCustomRozrakhunkoviiRakhunok + '\'' +
                ", xCustomNomerKarti='" + xCustomNomerKarti + '\'' +
                '}';
    }
}
