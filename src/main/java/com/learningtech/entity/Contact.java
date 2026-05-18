package com.learningtech.entity;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "contacts")
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Contact {

    @Id
    private String id;

    private String name;
    private String email;
    private String subject;
    private String message;
}