package com.agro.agro_project.domain;

import javax.persistence.*;
import java.sql.Timestamp;
import java.util.Objects;

@Entity
@Table(name="field_shapes")
public class FieldShape {
    @Id
    @Column(name="id")
    private Integer id;

    @ManyToOne
    @JoinColumn(name="field_id")
    private Field field;

    @Column(name="start_time")
    private Timestamp start_time;

    @Column(name="end_time")
    private Timestamp end_time;

    @Column(name="calculated_area")
    private double calculated_area;

    @Column(name="legal_area")
    private double legal_area;

    @Column(name="tillable_area")
    private double tillable_area;

    @Column(name="simplified_shape")
    @Lob
    private String simplified_shape;

    @Column(name="shape_simplified_geojson")
    @Lob
    private String shape_simplified_geojson;

    @Column(name="point_lon")
    private double point_lon;

    @Column(name="point_lat")
    private double point_lat;

    @Column(name="external_id", length=50)
    private String external_id;

    @Column(name="legal_perimeter")
    private double legal_perimeter;

    @Column(name="description")
    @Lob
    private String description;

    @Column(name="land_quality_assessment")
    @Lob
    private String land_quality_assessment;

    @Column(name="created_at")
    private Timestamp created_at;

    @Column(name="updated_at")
    private Timestamp updated_at;

    public FieldShape(Integer id, Field field, Timestamp start_time, Timestamp end_time, double calculated_area, double legal_area, double tillable_area, String simplified_shape, String shape_simplified_geojson, double point_lon, double point_lat, String external_id, double legal_perimeter, String description, String land_quality_assessment, Timestamp created_at, Timestamp updated_at) {
        this.id = id;
        this.field = field;
        this.start_time = start_time;
        this.end_time = end_time;
        this.calculated_area = calculated_area;
        this.legal_area = legal_area;
        this.tillable_area = tillable_area;
        this.simplified_shape = simplified_shape;
        this.shape_simplified_geojson = shape_simplified_geojson;
        this.point_lon = point_lon;
        this.point_lat = point_lat;
        this.external_id = external_id;
        this.legal_perimeter = legal_perimeter;
        this.description = description;
        this.land_quality_assessment = land_quality_assessment;
        this.created_at = created_at;
        this.updated_at = updated_at;
    }

    public FieldShape() {
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Field getField() {
        return field;
    }

    public void setField(Field field) {
        this.field = field;
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

    public double getCalculated_area() {
        return calculated_area;
    }

    public void setCalculated_area(double calculated_area) {
        this.calculated_area = calculated_area;
    }

    public double getLegal_area() {
        return legal_area;
    }

    public void setLegal_area(double legal_area) {
        this.legal_area = legal_area;
    }

    public double getTillable_area() {
        return tillable_area;
    }

    public void setTillable_area(double tillable_area) {
        this.tillable_area = tillable_area;
    }

    public String getSimplified_shape() {
        return simplified_shape;
    }

    public void setSimplified_shape(String simplified_shape) {
        this.simplified_shape = simplified_shape;
    }

    public String getShape_simplified_geojson() {
        return shape_simplified_geojson;
    }

    public void setShape_simplified_geojson(String shape_simplified_geojson) {
        this.shape_simplified_geojson = shape_simplified_geojson;
    }

    public double getPoint_lon() {
        return point_lon;
    }

    public void setPoint_lon(double point_lon) {
        this.point_lon = point_lon;
    }

    public double getPoint_lat() {
        return point_lat;
    }

    public void setPoint_lat(double point_lat) {
        this.point_lat = point_lat;
    }

    public String getExternal_id() {
        return external_id;
    }

    public void setExternal_id(String external_id) {
        this.external_id = external_id;
    }

    public double getLegal_perimeter() {
        return legal_perimeter;
    }

    public void setLegal_perimeter(double legal_perimeter) {
        this.legal_perimeter = legal_perimeter;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getLand_quality_assessment() {
        return land_quality_assessment;
    }

    public void setLand_quality_assessment(String land_quality_assessment) {
        this.land_quality_assessment = land_quality_assessment;
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
        FieldShape that = (FieldShape) o;
        return Double.compare(calculated_area, that.calculated_area) == 0 && Double.compare(legal_area, that.legal_area) == 0 && Double.compare(tillable_area, that.tillable_area) == 0 && Double.compare(point_lon, that.point_lon) == 0 && Double.compare(point_lat, that.point_lat) == 0 && Double.compare(legal_perimeter, that.legal_perimeter) == 0 && Objects.equals(id, that.id) && Objects.equals(field, that.field) && Objects.equals(start_time, that.start_time) && Objects.equals(end_time, that.end_time) && Objects.equals(simplified_shape, that.simplified_shape) && Objects.equals(shape_simplified_geojson, that.shape_simplified_geojson) && Objects.equals(external_id, that.external_id) && Objects.equals(description, that.description) && Objects.equals(land_quality_assessment, that.land_quality_assessment) && Objects.equals(created_at, that.created_at) && Objects.equals(updated_at, that.updated_at);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, field, start_time, end_time, calculated_area, legal_area, tillable_area, simplified_shape, shape_simplified_geojson, point_lon, point_lat, external_id, legal_perimeter, description, land_quality_assessment, created_at, updated_at);
    }

    @Override
    public String toString() {
        return "FieldShape{" +
                "id=" + id +
                ", field=" + field +
                ", start_time=" + start_time +
                ", end_time=" + end_time +
                ", calculated_area=" + calculated_area +
                ", legal_area=" + legal_area +
                ", tillable_area=" + tillable_area +
                ", simplified_shape='" + simplified_shape + '\'' +
                ", shape_simplified_geojson='" + shape_simplified_geojson + '\'' +
                ", point_lon=" + point_lon +
                ", point_lat=" + point_lat +
                ", external_id='" + external_id + '\'' +
                ", legal_perimeter=" + legal_perimeter +
                ", description='" + description + '\'' +
                ", land_quality_assessment='" + land_quality_assessment + '\'' +
                ", created_at=" + created_at +
                ", updated_at=" + updated_at +
                '}';
    }
}
