package com.learningtech.repository;

import com.learningtech.entity.Gallery;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface GalleryRepository extends MongoRepository<Gallery, String > {
}
