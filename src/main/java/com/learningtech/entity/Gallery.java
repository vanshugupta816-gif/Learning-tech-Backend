package com.learningtech.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "gallery")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Gallery {

    @Id
    private String id;
    private String title;
    // Array Type
    private String images;
}
