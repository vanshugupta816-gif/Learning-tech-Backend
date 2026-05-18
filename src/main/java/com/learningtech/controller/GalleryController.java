package com.learningtech.controller;

import com.learningtech.entity.Gallery;
import com.learningtech.service.GalleryService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/gallery")
@CrossOrigin(origins = "http://localhost:5173")
public class GalleryController {
    private final GalleryService service;

    public GalleryController(GalleryService service) {
        this.service = service;
    }

    // Save Image
    @PostMapping
    public Gallery saveImage(@RequestBody Gallery gallery) {
        return service.saveImage(gallery);
    }

    // Get All Images
    @GetMapping
    public List<Gallery> getAllImages() {
        return service.getAllImages();
    }

    // Get Image By ID
    @GetMapping("/{id}")
    public Gallery getImageById(@PathVariable String id) {
        return service.getImageById(id);
    }

    // Update Image
//    @PutMapping("/{id}")
//    public Gallery updateImage(
//            @PathVariable String id,
//            @RequestBody Gallery gallery) {
//
//        return service.updateImage(id, gallery);
//    }

    // Delete Image
    @DeleteMapping("/{id}")
    public String deleteImage(@PathVariable String id) {

        service.deleteImage(id);

        return "Image Deleted Successfully";
    }
}
