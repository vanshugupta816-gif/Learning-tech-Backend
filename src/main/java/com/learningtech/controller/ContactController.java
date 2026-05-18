package com.learningtech.controller;

import com.learningtech.entity.Contact;
import com.learningtech.service.ContactService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/contact")
public class ContactController {

    private final ContactService service;

    public ContactController(ContactService service) {
        this.service = service;
    }

    // Save Contact Message
    @PostMapping
    public Contact saveContact(@RequestBody Contact contact) {
        return service.save(contact);
    }

    // Get All Messages
    @GetMapping
    public List<Contact> getAllMessages() {
        return service.getAllMessages();
    }

    // Get Message By ID
    @GetMapping("/{id}")
    public Contact getMessageById(@PathVariable String id) {
        return service.getMessageById(id);
    }

    // Delete Message
    @DeleteMapping("/{id}")
    public String deleteMessage(@PathVariable String id) {
        service.deleteMessage(id);
        return "Message Deleted Successfully";
    }

    // Update Message
    @PutMapping("/{id}")
    public Contact updateMessage(
            @PathVariable String id,
            @RequestBody Contact contact) {
        return service.updateMessage(id, contact);
    }
}