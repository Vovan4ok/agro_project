package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="work_types", schema="cropwise_data")
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
    private Boolean agri;

    @Column(name="application")
    private Boolean application;

    @Column(name="sowing")
    private Boolean sowing;

    @Column(name="re_sowing")
    private Boolean reSowing;

    @Column(name="additional_sowing")
    private Boolean additionalSowing;

    @Column(name="harvesting")
    private Boolean harvesting;

    @Column(name="soil")
    private Boolean soil;

    @Column(name="standard_name", length=100)
    private String standardName;

    @Column(name="hidden")
    private Boolean hidden;

    @Column(name="decription")
    private String description;

    @Column(name="external_id", length=50)
    private String externalId;

    @Column(name="disable_first_track_rule_coverage")
    private Boolean disableFirstTrackRuleCoverage;

    @Column(name="created_at")
    private Timestamp createdAt;

    @Column(name="updated_at")
    private Timestamp updatedAt;

    public WorkType(Short id, WorkTypeGroup workTypeGroup, String name, Boolean agri, Boolean application, Boolean sowing, Boolean reSowing, Boolean additionalSowing, Boolean harvesting, Boolean soil, String standardName, Boolean hidden, String description, String externalId, Boolean disableFirstTrackRuleCoverage, Timestamp createdAt, Timestamp updatedAt) {
        this.id = id;
        this.workTypeGroup = workTypeGroup;
        this.name = name;
        this.agri = agri;
        this.application = application;
        this.sowing = sowing;
        this.reSowing = reSowing;
        this.additionalSowing = additionalSowing;
        this.harvesting = harvesting;
        this.soil = soil;
        this.standardName = standardName;
        this.hidden = hidden;
        this.description = description;
        this.externalId = externalId;
        this.disableFirstTrackRuleCoverage = disableFirstTrackRuleCoverage;
        this.createdAt = createdAt;
        this.updatedAt = updatedAt;
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

    public Boolean isAgri() {
        return agri;
    }

    public void setAgri(Boolean agri) {
        this.agri = agri;
    }

    public Boolean isApplication() {
        return application;
    }

    public void setApplication(Boolean application) {
        this.application = application;
    }

    public Boolean isSowing() {
        return sowing;
    }

    public void setSowing(Boolean sowing) {
        this.sowing = sowing;
    }

    public Boolean isReSowing() {
        return reSowing;
    }

    public void setReSowing(Boolean reSowing) {
        this.reSowing = reSowing;
    }

    public Boolean isAdditionalSowing() {
        return additionalSowing;
    }

    public void setAdditionalSowing(Boolean additionalSowing) {
        this.additionalSowing = additionalSowing;
    }

    public Boolean isHarvesting() {
        return harvesting;
    }

    public void setHarvesting(Boolean harvesting) {
        this.harvesting = harvesting;
    }

    public Boolean isSoil() {
        return soil;
    }

    public void setSoil(Boolean soil) {
        this.soil = soil;
    }

    public String getStandardName() {
        return standardName;
    }

    public void setStandardName(String standardName) {
        this.standardName = standardName;
    }

    public Boolean isHidden() {
        return hidden;
    }

    public void setHidden(Boolean hidden) {
        this.hidden = hidden;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getExternalId() {
        return externalId;
    }

    public void setExternalId(String externalId) {
        this.externalId = externalId;
    }

    public Boolean isDisableFirstTrackRuleCoverage() {
        return disableFirstTrackRuleCoverage;
    }

    public void setDisableFirstTrackRuleCoverage(Boolean disableFirstTrackRuleCoverage) {
        this.disableFirstTrackRuleCoverage = disableFirstTrackRuleCoverage;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkType workType = (WorkType) o;
        return agri == workType.agri && application == workType.application && sowing == workType.sowing && reSowing == workType.reSowing && additionalSowing == workType.additionalSowing && harvesting == workType.harvesting && soil == workType.soil && hidden == workType.hidden && disableFirstTrackRuleCoverage == workType.disableFirstTrackRuleCoverage && Objects.equals(id, workType.id) && Objects.equals(workTypeGroup, workType.workTypeGroup) && Objects.equals(name, workType.name) && Objects.equals(standardName, workType.standardName) && Objects.equals(description, workType.description) && Objects.equals(externalId, workType.externalId) && Objects.equals(createdAt, workType.createdAt) && Objects.equals(updatedAt, workType.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, workTypeGroup, name, agri, application, sowing, reSowing, additionalSowing, harvesting, soil, standardName, hidden, description, externalId, disableFirstTrackRuleCoverage, createdAt, updatedAt);
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
                ", reSowing=" + reSowing +
                ", additionalSowing=" + additionalSowing +
                ", harvesting=" + harvesting +
                ", soil=" + soil +
                ", standardName='" + standardName + '\'' +
                ", hidden=" + hidden +
                ", description='" + description + '\'' +
                ", externalId='" + externalId + '\'' +
                ", disableFirstTrackRuleCoverage=" + disableFirstTrackRuleCoverage +
                ", createdAt=" + createdAt +
                ", updatedAt=" + updatedAt +
                '}';
    }
}
