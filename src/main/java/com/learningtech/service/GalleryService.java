package com.learningtech.service;

import com.learningtech.entity.Gallery;
import com.learningtech.repository.GalleryRepository;
import lombok.Data;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Data
public class GalleryService {
    private final GalleryRepository repository;

    public GalleryService(GalleryRepository repository) {
        this.repository = repository;
    }

    // Save Image
    public Gallery saveImage(Gallery gallery) {
        return repository.save(gallery);
    }

    // Get All Images
    public List<Gallery> getAllImages() {
        return repository.findAll();
    }

    // Get Image By ID
    public Gallery getImageById(String id) {
        return repository.findById(id).orElse(null);
    }

    // Delete Image
    public void deleteImage(String id) {
        repository.deleteById(id);
    }

}
