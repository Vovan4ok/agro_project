package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="work_types")
public class WorkType {
    @Id
    @Column(name="id")
    private Short id;

    @ManyToOne
    @JoinColumn(name="work_type_group_id")
    private WorkTypeGroup workTypeGroup;

    @Column(name="name", length=50)
    private String name;

    @Column(name="agri")
    private boolean agri;

    @Column(name="application")
    private boolean application;

    @Column(name="sowing")
    private boolean sowing;

    @Column(name="re_sowing")
    private boolean re_sowing;

    @Column(name="additional_sowing")
    private boolean additional_sowing;

    @Column(name="harvesting")
    private boolean harvesting;

    @Column(name="soil")
    private boolean soil;

    @Column(name="standard_name", length=100)
    private String standard_name;

    @Column(name="hidden")
    private boolean hidden;

    @Column(name="decription")
    @Lob
    private String description;

    @Column(name="external_id", length=50)
    private String external_id;

    @Column(name="disable_first_track_rule_coverage")
    private boolean disable_first_track_rule_coverage;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    public WorkType(Short id, WorkTypeGroup workTypeGroup, String name, boolean agri, boolean application, boolean sowing, boolean re_sowing, boolean additional_sowing, boolean harvesting, boolean soil, String standard_name, boolean hidden, String description, String external_id, boolean disable_first_track_rule_coverage, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.workTypeGroup = workTypeGroup;
        this.name = name;
        this.agri = agri;
        this.application = application;
        this.sowing = sowing;
        this.re_sowing = re_sowing;
        this.additional_sowing = additional_sowing;
        this.harvesting = harvesting;
        this.soil = soil;
        this.standard_name = standard_name;
        this.hidden = hidden;
        this.description = description;
        this.external_id = external_id;
        this.disable_first_track_rule_coverage = disable_first_track_rule_coverage;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public WorkType() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public WorkTypeGroup getWorkTypeGroup() {
        return workTypeGroup;
    }

    public void setWorkTypeGroup(WorkTypeGroup workTypeGroup) {
        this.workTypeGroup = workTypeGroup;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isAgri() {
        return agri;
    }

    public void setAgri(boolean agri) {
        this.agri = agri;
    }

    public boolean isApplication() {
        return application;
    }

    public void setApplication(boolean application) {
        this.application = application;
    }

    public boolean isSowing() {
        return sowing;
    }

    public void setSowing(boolean sowing) {
        this.sowing = sowing;
    }

    public boolean isRe_sowing() {
        return re_sowing;
    }

    public void setRe_sowing(boolean re_sowing) {
        this.re_sowing = re_sowing;
    }

    public boolean isAdditional_sowing() {
        return additional_sowing;
    }

    public void setAdditional_sowing(boolean additional_sowing) {
        this.additional_sowing = additional_sowing;
    }

    public boolean isHarvesting() {
        return harvesting;
    }

    public void setHarvesting(boolean harvesting) {
        this.harvesting = harvesting;
    }

    public boolean isSoil() {
        return soil;
    }

    public void setSoil(boolean soil) {
        this.soil = soil;
    }

    public String getStandard_name() {
        return standard_name;
    }

    public void setStandard_name(String standard_name) {
        this.standard_name = standard_name;
    }

    public boolean isHidden() {
        return hidden;
    }

    public void setHidden(boolean hidden) {
        this.hidden = hidden;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }

    public boolean isDisable_first_track_rule_coverage() {
        return disable_first_track_rule_coverage;
    }

    public void setDisable_first_track_rule_coverage(boolean disable_first_track_rule_coverage) {
        this.disable_first_track_rule_coverage = disable_first_track_rule_coverage;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkType workType = (WorkType) o;
        return agri == workType.agri && application == workType.application && sowing == workType.sowing && re_sowing == workType.re_sowing && additional_sowing == workType.additional_sowing && harvesting == workType.harvesting && soil == workType.soil && hidden == workType.hidden && disable_first_track_rule_coverage == workType.disable_first_track_rule_coverage && Objects.equals(id, workType.id) && Objects.equals(workTypeGroup, workType.workTypeGroup) && Objects.equals(name, workType.name) && Objects.equals(standard_name, workType.standard_name) && Objects.equals(description, workType.description) && Objects.equals(external_id, workType.external_id) && Objects.equals(created_at, workType.created_at) && Objects.equals(updated_at, workType.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, workTypeGroup, name, agri, application, sowing, re_sowing, additional_sowing, harvesting, soil, standard_name, hidden, description, external_id, disable_first_track_rule_coverage, created_at, updated_at);
    }

    @Override
    public String toString() {
        return "WorkType{" +
                "id=" + id +
                ", workTypeGroup=" + workTypeGroup +
                ", name='" + name + '\'' +
                ", agri=" + agri +
                ", application=" + application +
                ", sowing=" + sowing +
                ", re_sowing=" + re_sowing +
                ", additional_sowing=" + additional_sowing +
                ", harvesting=" + harvesting +
                ", soil=" + soil +
                ", standard_name='" + standard_name + '\'' +
                ", hidden=" + hidden +
                ", description='" + description + '\'' +
                ", external_id='" + external_id + '\'' +
                ", disable_first_track_rule_coverage=" + disable_first_track_rule_coverage +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
