package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Date;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="chemicals")
public class Chemical {
    @Id
    @Column(name="id")
    private Short id;

    @Column(name="name", length=50)
    private String name;

    @Column(name="chemical_type", length=30)
    private String chemicalType;

    @Column(name="units_of_measurement", length=10)
    private String unitsOfMeasurement;

    @Column(name="additional_info")
    @Lob
    private String additionalInfo;

    @Column(name="description")
    private String description;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    @Column(name="archived")
    private boolean archived;

    @Column(name="external_id", length=50)
    private String externalId;

    @Column(name="toxicity_class")
    private short toxicityClass;

    @Column(name="action_term")
    private short actionTerm;

    @Column(name="action_term_units", length=10)
    private String actionTermUnits;

    @Column(name="active_substance", length=255)
    private String activeSubstance;

    @Column(name="drug_form", length=30)
    private String drugForm;

    @Column(name="influence_method", length=10)
    private String influenceMethod;

    @Column(name="bees_isolating_recommended_term")
    private short beesIsolatingRecommendedTerm;

    @Column(name="bees_isolating_recommended_term_units", length=10)
    private String beesIsolatingRecommendedTermUnits;

    @Column(name="sale_term")
    private Date saleTerm;

    @Column(name="term_of_use")
    private Date termOfUse;

    @ManyToOne
    @JoinColumn(name="wh_item_id")
    private WhItem whItem;

    @ManyToOne
    @JoinColumn(name="wh_item_base_unit_id")
    private Unit whItemBaseUnit;

    public Chemical(Short id, String name, String chemicalType, String unitsOfMeasurement, String additionalInfo, String description, Timestamp createdAt, Timestamp updatedAt, boolean archived, String externalId, short toxicityClass, short actionTerm, String actionTermUnits, String activeSubstance, String drugForm, String influenceMethod, short beesIsolatingRecommendedTerm, String beesIsolatingRecommendedTermUnits, Date saleTerm, Date termOfUse, WhItem whItem, Unit whItemBaseUnit) {
        this.id = id;
        this.name = name;
        this.chemicalType = chemicalType;
        this.unitsOfMeasurement = unitsOfMeasurement;
        this.additionalInfo = additionalInfo;
        this.description = description;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
        this.archived = archived;
        this.externalId = externalId;
        this.toxicityClass = toxicityClass;
        this.actionTerm = actionTerm;
        this.actionTermUnits = actionTermUnits;
        this.activeSubstance = activeSubstance;
        this.drugForm = drugForm;
        this.influenceMethod = influenceMethod;
        this.beesIsolatingRecommendedTerm = beesIsolatingRecommendedTerm;
        this.beesIsolatingRecommendedTermUnits = beesIsolatingRecommendedTermUnits;
        this.saleTerm = saleTerm;
        this.termOfUse = termOfUse;
        this.whItem = whItem;
        this.whItemBaseUnit = whItemBaseUnit;
    }

    public Chemical() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getChemicalType() {
        return chemicalType;
    }

    public void setChemicalType(String chemicalType) {
        this.chemicalType = chemicalType;
    }

    public String getUnitsOfMeasurement() {
        return unitsOfMeasurement;
    }

    public void setUnitsOfMeasurement(String unitsOfMeasurement) {
        this.unitsOfMeasurement = unitsOfMeasurement;
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

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public short getToxicityClass() {
        return toxicityClass;
    }

    public void setToxicityClass(short toxicityClass) {
        this.toxicityClass = toxicityClass;
    }

    public short getActionTerm() {
        return actionTerm;
    }

    public void setActionTerm(short actionTerm) {
        this.actionTerm = actionTerm;
    }

    public String getActionTermUnits() {
        return actionTermUnits;
    }

    public void setActionTermUnits(String actionTermUnits) {
        this.actionTermUnits = actionTermUnits;
    }

    public String getActiveSubstance() {
        return activeSubstance;
    }

    public void setActiveSubstance(String activeSubstance) {
        this.activeSubstance = activeSubstance;
    }

    public String getDrugForm() {
        return drugForm;
    }

    public void setDrugForm(String drugForm) {
        this.drugForm = drugForm;
    }

    public String getInfluenceMethod() {
        return influenceMethod;
    }

    public void setInfluenceMethod(String influenceMethod) {
        this.influenceMethod = influenceMethod;
    }

    public short getBeesIsolatingRecommendedTerm() {
        return beesIsolatingRecommendedTerm;
    }

    public void setBeesIsolatingRecommendedTerm(short beesIsolatingRecommendedTerm) {
        this.beesIsolatingRecommendedTerm = beesIsolatingRecommendedTerm;
    }

    public String getBeesIsolatingRecommendedTermUnits() {
        return beesIsolatingRecommendedTermUnits;
    }

    public void setBeesIsolatingRecommendedTermUnits(String beesIsolatingRecommendedTermUnits) {
        this.beesIsolatingRecommendedTermUnits = beesIsolatingRecommendedTermUnits;
    }

    public Date getSaleTerm() {
        return saleTerm;
    }

    public void setSaleTerm(Date saleTerm) {
        this.saleTerm = saleTerm;
    }

    public Date getTermOfUse() {
        return termOfUse;
    }

    public void setTermOfUse(Date termOfUse) {
        this.termOfUse = termOfUse;
    }

    public WhItem getWhItem() {
        return whItem;
    }

    public void setWhItem(WhItem whItem) {
        this.whItem = whItem;
    }

    public Unit getWhItemBaseUnit() {
        return whItemBaseUnit;
    }

    public void setWhItemBaseUnit(Unit whItemBaseUnit) {
        this.whItemBaseUnit = whItemBaseUnit;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Chemical chemical = (Chemical) o;
        return archived == chemical.archived && toxicityClass == chemical.toxicityClass && actionTerm == chemical.actionTerm && beesIsolatingRecommendedTerm == chemical.beesIsolatingRecommendedTerm && Objects.equals(id, chemical.id) && Objects.equals(name, chemical.name) && Objects.equals(chemicalType, chemical.chemicalType) && Objects.equals(unitsOfMeasurement, chemical.unitsOfMeasurement) && Objects.equals(additionalInfo, chemical.additionalInfo) && Objects.equals(description, chemical.description) && Objects.equals(createdAt, chemical.createdAt) && Objects.equals(updatedAt, chemical.updatedAt) && Objects.equals(externalId, chemical.externalId) && Objects.equals(actionTermUnits, chemical.actionTermUnits) && Objects.equals(activeSubstance, chemical.activeSubstance) && Objects.equals(drugForm, chemical.drugForm) && Objects.equals(influenceMethod, chemical.influenceMethod) && Objects.equals(beesIsolatingRecommendedTermUnits, chemical.beesIsolatingRecommendedTermUnits) && Objects.equals(saleTerm, chemical.saleTerm) && Objects.equals(termOfUse, chemical.termOfUse) && Objects.equals(whItem, chemical.whItem) && Objects.equals(whItemBaseUnit, chemical.whItemBaseUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, chemicalType, unitsOfMeasurement, additionalInfo, description, createdAt, updatedAt, archived, externalId, toxicityClass, actionTerm, actionTermUnits, activeSubstance, drugForm, influenceMethod, beesIsolatingRecommendedTerm, beesIsolatingRecommendedTermUnits, saleTerm, termOfUse, whItem, whItemBaseUnit);
    }

    @Override
    public String toString() {
        return "Chemical{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", chemicalType='" + chemicalType + '\'' +
                ", unitsOfMeasurement='" + unitsOfMeasurement + '\'' +
                ", additionalInfo='" + additionalInfo + '\'' +
                ", description='" + description + '\'' +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                ", archived=" + archived +
                ", externalId='" + externalId + '\'' +
                ", toxicityClass=" + toxicityClass +
                ", actionTerm=" + actionTerm +
                ", actionTermUnits='" + actionTermUnits + '\'' +
                ", activeSubstance='" + activeSubstance + '\'' +
                ", drugForm='" + drugForm + '\'' +
                ", influenceMethod='" + influenceMethod + '\'' +
                ", beesIsolatingRecommendedTerm=" + beesIsolatingRecommendedTerm +
                ", beesIsolatingRecommendedTermUnits='" + beesIsolatingRecommendedTermUnits + '\'' +
                ", saleTerm=" + saleTerm +
                ", termOfUse=" + termOfUse +
                ", whItem=" + whItem +
                ", whItemBaseUnit=" + whItemBaseUnit +
                '}';
    }
}
