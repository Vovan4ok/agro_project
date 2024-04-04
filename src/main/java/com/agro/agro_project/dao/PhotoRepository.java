package com.agro.agro_project.dao;

import com.agro.agro_project.domain.Photo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("photoRepository")
public interface PhotoRepository extends JpaRepository<Photo, Short> {
    List<Photo> findAllByPhotoableIdAndPhotoableType(Integer photoableId, String photoableType);
}
