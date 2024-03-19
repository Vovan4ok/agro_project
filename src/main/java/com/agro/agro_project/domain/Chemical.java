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
    private String chemical_type;

    @Column(name="units_of_measurement", length=10)
    private String units_of_measurement;

    @Column(name="additional_info")
    @Lob
    private String additional_info;

    @Column(name="description")
    private String description;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    @Column(name="archived")
    private boolean archived;

    @Column(name="external_id", length=50)
    private String external_id;

    @Column(name="toxicity_class")
    private short toxicity_class;

    @Column(name="action_term")
    private short action_term;

    @Column(name="action_term_units", length=10)
    private String action_term_units;

    @Column(name="active_substance", length=255)
    private String active_substance;

    @Column(name="drug_form", length=30)
    private String drug_form;

    @Column(name="influence_method", length=10)
    private String influence_method;

    @Column(name="bees_isolating_recommended_term")
    private short bees_isolating_recommended_term;

    @Column(name="bees_isolating_recommended_term_units", length=10)
    private String bees_isolating_recommended_term_units;

    @Column(name="sale_term")
    private Date sale_term;

    @Column(name="term_of_use")
    private Date term_of_use;

    @ManyToOne
    @JoinColumn(name="wh_item_id")
    private WhItem whItem;

    @ManyToOne
    @JoinColumn(name="wh_item_base_unit_id")
    private Unit whItemBaseUnit;

    public Chemical(Short id, String name, String chemical_type, String units_of_measurement, String additional_info, String description, Timestamp created_at, Timestamp updated_at, boolean archived, String external_id, short toxicity_class, short action_term, String action_term_units, String active_substance, String drug_form, String influence_method, short bees_isolating_recommended_term, String bees_isolating_recommended_term_units, Date sale_term, Date term_of_use, WhItem whItem, Unit whItemBaseUnit) {
        this.id = id;
        this.name = name;
        this.chemical_type = chemical_type;
        this.units_of_measurement = units_of_measurement;
        this.additional_info = additional_info;
        this.description = description;
        this.created_at = created_at;
        this.updated_at = updated_at;
        this.archived = archived;
        this.external_id = external_id;
        this.toxicity_class = toxicity_class;
        this.action_term = action_term;
        this.action_term_units = action_term_units;
        this.active_substance = active_substance;
        this.drug_form = drug_form;
        this.influence_method = influence_method;
        this.bees_isolating_recommended_term = bees_isolating_recommended_term;
        this.bees_isolating_recommended_term_units = bees_isolating_recommended_term_units;
        this.sale_term = sale_term;
        this.term_of_use = term_of_use;
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

    public String getChemical_type() {
        return chemical_type;
    }

    public void setChemical_type(String chemical_type) {
        this.chemical_type = chemical_type;
    }

    public String getUnits_of_measurement() {
        return units_of_measurement;
    }

    public void setUnits_of_measurement(String units_of_measurement) {
        this.units_of_measurement = units_of_measurement;
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

    public boolean isArchived() {
        return archived;
    }

    public void setArchived(boolean archived) {
        this.archived = archived;
    }

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }

    public short getToxicity_class() {
        return toxicity_class;
    }

    public void setToxicity_class(short toxicity_class) {
        this.toxicity_class = toxicity_class;
    }

    public short getAction_term() {
        return action_term;
    }

    public void setAction_term(short action_term) {
        this.action_term = action_term;
    }

    public String getAction_term_units() {
        return action_term_units;
    }

    public void setAction_term_units(String action_term_units) {
        this.action_term_units = action_term_units;
    }

    public String getActive_substance() {
        return active_substance;
    }

    public void setActive_substance(String active_substance) {
        this.active_substance = active_substance;
    }

    public String getDrug_form() {
        return drug_form;
    }

    public void setDrug_form(String drug_form) {
        this.drug_form = drug_form;
    }

    public String getInfluence_method() {
        return influence_method;
    }

    public void setInfluence_method(String influence_method) {
        this.influence_method = influence_method;
    }

    public short getBees_isolating_recommended_term() {
        return bees_isolating_recommended_term;
    }

    public void setBees_isolating_recommended_term(short bees_isolating_recommended_term) {
        this.bees_isolating_recommended_term = bees_isolating_recommended_term;
    }

    public String getBees_isolating_recommended_term_units() {
        return bees_isolating_recommended_term_units;
    }

    public void setBees_isolating_recommended_term_units(String bees_isolating_recommended_term_units) {
        this.bees_isolating_recommended_term_units = bees_isolating_recommended_term_units;
    }

    public Date getSale_term() {
        return sale_term;
    }

    public void setSale_term(Date sale_term) {
        this.sale_term = sale_term;
    }

    public Date getTerm_of_use() {
        return term_of_use;
    }

    public void setTerm_of_use(Date term_of_use) {
        this.term_of_use = term_of_use;
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
        return archived == chemical.archived && toxicity_class == chemical.toxicity_class && action_term == chemical.action_term && bees_isolating_recommended_term == chemical.bees_isolating_recommended_term && Objects.equals(id, chemical.id) && Objects.equals(name, chemical.name) && Objects.equals(chemical_type, chemical.chemical_type) && Objects.equals(units_of_measurement, chemical.units_of_measurement) && Objects.equals(additional_info, chemical.additional_info) && Objects.equals(description, chemical.description) && Objects.equals(created_at, chemical.created_at) && Objects.equals(updated_at, chemical.updated_at) && Objects.equals(external_id, chemical.external_id) && Objects.equals(action_term_units, chemical.action_term_units) && Objects.equals(active_substance, chemical.active_substance) && Objects.equals(drug_form, chemical.drug_form) && Objects.equals(influence_method, chemical.influence_method) && Objects.equals(bees_isolating_recommended_term_units, chemical.bees_isolating_recommended_term_units) && Objects.equals(sale_term, chemical.sale_term) && Objects.equals(term_of_use, chemical.term_of_use) && Objects.equals(whItem, chemical.whItem) && Objects.equals(whItemBaseUnit, chemical.whItemBaseUnit);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, chemical_type, units_of_measurement, additional_info, description, created_at, updated_at, archived, external_id, toxicity_class, action_term, action_term_units, active_substance, drug_form, influence_method, bees_isolating_recommended_term, bees_isolating_recommended_term_units, sale_term, term_of_use, whItem, whItemBaseUnit);
    }

    @Override
    public String toString() {
        return "Chemical{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", chemical_type='" + chemical_type + '\'' +
                ", units_of_measurement='" + units_of_measurement + '\'' +
                ", additional_info='" + additional_info + '\'' +
                ", description='" + description + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                ", archived=" + archived +
                ", external_id='" + external_id + '\'' +
                ", toxicity_class=" + toxicity_class +
                ", action_term=" + action_term +
                ", action_term_units='" + action_term_units + '\'' +
                ", active_substance='" + active_substance + '\'' +
                ", drug_form='" + drug_form + '\'' +
                ", influence_method='" + influence_method + '\'' +
                ", bees_isolating_recommended_term=" + bees_isolating_recommended_term +
                ", bees_isolating_recommended_term_units='" + bees_isolating_recommended_term_units + '\'' +
                ", sale_term=" + sale_term +
                ", term_of_use=" + term_of_use +
                ", whItem=" + whItem +
                ", whItemBaseUnit=" + whItemBaseUnit +
                '}';
    }
}
