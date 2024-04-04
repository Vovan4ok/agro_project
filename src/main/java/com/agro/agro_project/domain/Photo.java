package com.agro.agro_project.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.util.Objects;

@Entity
@Table(name="photos", schema="cropwise_data")
public class Photo {
    @Id
    @Column(name="id")
    private Short id;

    @Column(name="photoable_id")
    private Integer photoableId;

    @Column(name="photoable_type", length=30)
    private String photoableType;

    @Column(name="url")
    private String url;

    public Photo(Short id, Integer photoableId, String photoableType, String url) {
        this.id = id;
        this.photoableId = photoableId;
        this.photoableType = photoableType;
        this.url = url;
    }

    public Photo() {
    }

    public Short getId() {
        return id;
    }

    public void setId(Short id) {
        this.id = id;
    }

    public Integer getPhotoableId() {
        return photoableId;
    }

    public void setPhotoableId(Integer photoableId) {
        this.photoableId = photoableId;
    }

    public String getPhotoableType() {
        return photoableType;
    }

    public void setPhotoableType(String photoableType) {
        this.photoableType = photoableType;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Photo photo = (Photo) o;
        return Objects.equals(id, photo.id) && Objects.equals(photoableId, photo.photoableId) && Objects.equals(photoableType, photo.photoableType) && Objects.equals(url, photo.url);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, photoableId, photoableType, url);
    }

    @Override
    public String toString() {
        return "Photo{" +
                "id=" + id +
                ", photoableId=" + photoableId +
                ", photoableType='" + photoableType + '\'' +
                ", url='" + url + '\'' +
                '}';
    }
}
