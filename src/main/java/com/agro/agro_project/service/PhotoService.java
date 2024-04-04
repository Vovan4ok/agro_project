package com.agro.agro_project.service;

import com.agro.agro_project.dao.PhotoRepository;
import com.agro.agro_project.domain.Photo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("photoService")
public class PhotoService {
    @Autowired
    PhotoRepository photoRepository;

    public List<Photo> findAllByPhotoableIdAndPhotoableType(Integer photoableId, String photoableType) {
        return photoRepository.findAllByPhotoableIdAndPhotoableType(photoableId, photoableType);
    }
}
