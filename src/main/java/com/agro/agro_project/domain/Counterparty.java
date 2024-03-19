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
    private String first_name;

    @Column(name="middle_name", length=50)
    private String middle_name;

    @Column(name="last_name", length=70)
    private String last_name;

    @Column(name="birth_date")
    private Date birth_date;

    @Column(name="phone_number", length=50)
    private String phone_number;

    @Column(name="passport_code", length=20)
    private String passport_code;

    @Column(name="email", length=30)
    private String email;

    @Column(name="passport_issuing_date")
    private Date passport_issuing_date;

    @Column(name="identification_code", length=20)
    private String identification_code;

    @Column(name="passport_issued_by")
    private String passport_issued_by;

    @Column(name="passport_issuing_date_presence")
    private boolean passport_issuing_date_presence;

    @Column(name="external_id", length=50)
    private String external_id;

    @Column(name="counterparty_type", length=30)
    private String counterparty_type;

    @Column(name="street", length=30)
    private String street;

    @Column(name="region", length=30)
    private String region;

    @Column(name="locality", length=30)
    private String locality;

    @Column(name="district", length=30)
    private String district;

    @Column(name="house_number", length=20)
    private String house_number;

    @Column(name="postcode", length=20)
    private String postcode;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    @Column(name="legal_name", length=50)
    private String legal_name;

    @Column(name="legal_address", length=50)
    private String legal_address;

    @Column(name="index")
    private short index;

    @Column(name="company_number", length=30)
    private String company_number;

    @Column(name="signatory", length=50)
    private String signatory;

    @Column(name="contact_person", length=50)
    private String contact_person;

    @Column(name="vat_payer")
    private boolean vat_payer;

    @Column(name="counterparty_group_id")
    private short counterparty_group_id;

    @Column(name="x_custom_rozrakhunkovii_rakhunok", length=20)
    private String x_custom_rozrakhunkovii_rakhunok;

    @Column(name="x_custom_nomer_karti", length=100)
    private String x_custom_nomer_karti;

    public Counterparty(Short id, String first_name, String middle_name, String last_name, Date birth_date, String phone_number, String passport_code, String email, Date passport_issuing_date, String identification_code, String passport_issued_by, boolean passport_issuing_date_presence, String external_id, String counterparty_type, String street, String region, String locality, String district, String house_number, String postcode, Timestamp created_at, Timestamp updated_at, String legal_name, String legal_address, short index, String company_number, String signatory, String contact_person, boolean vat_payer, short counterparty_group_id, String x_custom_rozrakhunkovii_rakhunok, String x_custom_nomer_karti) {
        this.id = id;
        this.first_name = first_name;
        this.middle_name = middle_name;
        this.last_name = last_name;
        this.birth_date = birth_date;
        this.phone_number = phone_number;
        this.passport_code = passport_code;
        this.email = email;
        this.passport_issuing_date = passport_issuing_date;
        this.identification_code = identification_code;
        this.passport_issued_by = passport_issued_by;
        this.passport_issuing_date_presence = passport_issuing_date_presence;
        this.external_id = external_id;
        this.counterparty_type = counterparty_type;
        this.street = street;
        this.region = region;
        this.locality = locality;
        this.district = district;
        this.house_number = house_number;
        this.postcode = postcode;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.legal_name = legal_name;
        this.legal_address = legal_address;
        this.index = index;
        this.company_number = company_number;
        this.signatory = signatory;
        this.contact_person = contact_person;
        this.vat_payer = vat_payer;
        this.counterparty_group_id = counterparty_group_id;
        this.x_custom_rozrakhunkovii_rakhunok = x_custom_rozrakhunkovii_rakhunok;
        this.x_custom_nomer_karti = x_custom_nomer_karti;
    }

    public Counterparty() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getMiddle_name() {
        return middle_name;
    }

    public void setMiddle_name(String middle_name) {
        this.middle_name = middle_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public Date getBirth_date() {
        return birth_date;
    }

    public void setBirth_date(Date birth_date) {
        this.birth_date = birth_date;
    }

    public String getPhone_number() {
        return phone_number;
    }

    public void setPhone_number(String phone_number) {
        this.phone_number = phone_number;
    }

    public String getPassport_code() {
        return passport_code;
    }

    public void setPassport_code(String passport_code) {
        this.passport_code = passport_code;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getPassport_issuing_date() {
        return passport_issuing_date;
    }

    public void setPassport_issuing_date(Date passport_issuing_date) {
        this.passport_issuing_date = passport_issuing_date;
    }

    public String getIdentification_code() {
        return identification_code;
    }

    public void setIdentification_code(String identification_code) {
        this.identification_code = identification_code;
    }

    public String getPassport_issued_by() {
        return passport_issued_by;
    }

    public void setPassport_issued_by(String passport_issued_by) {
        this.passport_issued_by = passport_issued_by;
    }

    public boolean isPassport_issuing_date_presence() {
        return passport_issuing_date_presence;
    }

    public void setPassport_issuing_date_presence(boolean passport_issuing_date_presence) {
        this.passport_issuing_date_presence = passport_issuing_date_presence;
    }

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }

    public String getCounterparty_type() {
        return counterparty_type;
    }

    public void setCounterparty_type(String counterparty_type) {
        this.counterparty_type = counterparty_type;
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

    public String getHouse_number() {
        return house_number;
    }

    public void setHouse_number(String house_number) {
        this.house_number = house_number;
    }

    public String getPostcode() {
        return postcode;
    }

    public void setPostcode(String postcode) {
        this.postcode = postcode;
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

    public String getLegal_name() {
        return legal_name;
    }

    public void setLegal_name(String legal_name) {
        this.legal_name = legal_name;
    }

    public String getLegal_address() {
        return legal_address;
    }

    public void setLegal_address(String legal_address) {
        this.legal_address = legal_address;
    }

    public short getIndex() {
        return index;
    }

    public void setIndex(short index) {
        this.index = index;
    }

    public String getCompany_number() {
        return company_number;
    }

    public void setCompany_number(String company_number) {
        this.company_number = company_number;
    }

    public String getSignatory() {
        return signatory;
    }

    public void setSignatory(String signatory) {
        this.signatory = signatory;
    }

    public String getContact_person() {
        return contact_person;
    }

    public void setContact_person(String contact_person) {
        this.contact_person = contact_person;
    }

    public boolean isVat_payer() {
        return vat_payer;
    }

    public void setVat_payer(boolean vat_payer) {
        this.vat_payer = vat_payer;
    }

    public short getCounterparty_group_id() {
        return counterparty_group_id;
    }

    public void setCounterparty_group_id(short counterparty_group_id) {
        this.counterparty_group_id = counterparty_group_id;
    }

    public String getX_custom_rozrakhunkovii_rakhunok() {
        return x_custom_rozrakhunkovii_rakhunok;
    }

    public void setX_custom_rozrakhunkovii_rakhunok(String x_custom_rozrakhunkovii_rakhunok) {
        this.x_custom_rozrakhunkovii_rakhunok = x_custom_rozrakhunkovii_rakhunok;
    }

    public String getX_custom_nomer_karti() {
        return x_custom_nomer_karti;
    }

    public void setX_custom_nomer_karti(String x_custom_nomer_karti) {
        this.x_custom_nomer_karti = x_custom_nomer_karti;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Counterparty that = (Counterparty) o;
        return passport_issuing_date_presence == that.passport_issuing_date_presence && index == that.index && vat_payer == that.vat_payer && counterparty_group_id == that.counterparty_group_id && Objects.equals(id, that.id) && Objects.equals(first_name, that.first_name) && Objects.equals(middle_name, that.middle_name) && Objects.equals(last_name, that.last_name) && Objects.equals(birth_date, that.birth_date) && Objects.equals(phone_number, that.phone_number) && Objects.equals(passport_code, that.passport_code) && Objects.equals(email, that.email) && Objects.equals(passport_issuing_date, that.passport_issuing_date) && Objects.equals(identification_code, that.identification_code) && Objects.equals(passport_issued_by, that.passport_issued_by) && Objects.equals(external_id, that.external_id) && Objects.equals(counterparty_type, that.counterparty_type) && Objects.equals(street, that.street) && Objects.equals(region, that.region) && Objects.equals(locality, that.locality) && Objects.equals(district, that.district) && Objects.equals(house_number, that.house_number) && Objects.equals(postcode, that.postcode) && Objects.equals(created_at, that.created_at) && Objects.equals(updated_at, that.updated_at) && Objects.equals(legal_name, that.legal_name) && Objects.equals(legal_address, that.legal_address) && Objects.equals(company_number, that.company_number) && Objects.equals(signatory, that.signatory) && Objects.equals(contact_person, that.contact_person) && Objects.equals(x_custom_rozrakhunkovii_rakhunok, that.x_custom_rozrakhunkovii_rakhunok) && Objects.equals(x_custom_nomer_karti, that.x_custom_nomer_karti);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, first_name, middle_name, last_name, birth_date, phone_number, passport_code, email, passport_issuing_date, identification_code, passport_issued_by, passport_issuing_date_presence, external_id, counterparty_type, street, region, locality, district, house_number, postcode, created_at, updated_at, legal_name, legal_address, index, company_number, signatory, contact_person, vat_payer, counterparty_group_id, x_custom_rozrakhunkovii_rakhunok, x_custom_nomer_karti);
    }

    @Override
    public String toString() {
        return "Counterparty{" +
                "id=" + id +
                ", first_name='" + first_name + '\'' +
                ", middle_name='" + middle_name + '\'' +
                ", last_name='" + last_name + '\'' +
                ", birth_date=" + birth_date +
                ", phone_number='" + phone_number + '\'' +
                ", passport_code='" + passport_code + '\'' +
                ", email='" + email + '\'' +
                ", passport_issuing_date=" + passport_issuing_date +
                ", identification_code='" + identification_code + '\'' +
                ", passport_issued_by='" + passport_issued_by + '\'' +
                ", passport_issuing_date_presence=" + passport_issuing_date_presence +
                ", external_id='" + external_id + '\'' +
                ", counterparty_type='" + counterparty_type + '\'' +
                ", street='" + street + '\'' +
                ", region='" + region + '\'' +
                ", locality='" + locality + '\'' +
                ", district='" + district + '\'' +
                ", house_number='" + house_number + '\'' +
                ", postcode='" + postcode + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", legal_name='" + legal_name + '\'' +
                ", legal_address='" + legal_address + '\'' +
                ", index=" + index +
                ", company_number='" + company_number + '\'' +
                ", signatory='" + signatory + '\'' +
                ", contact_person='" + contact_person + '\'' +
                ", vat_payer=" + vat_payer +
                ", counterparty_group_id=" + counterparty_group_id +
                ", x_custom_rozrakhunkovii_rakhunok='" + x_custom_rozrakhunkovii_rakhunok + '\'' +
                ", x_custom_nomer_karti='" + x_custom_nomer_karti + '\'' +
                '}';
    }
}
