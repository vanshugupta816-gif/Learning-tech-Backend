package com.learningtech.service;

import com.learningtech.entity.Contact;
import com.learningtech.repository.ContactRepository;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    private final ContactRepository repository;

    public ContactService(ContactRepository repository) {
        this.repository = repository;
    }

    // Save Contact Message
    public Contact save(Contact contact) {
        return repository.save(contact);
    }

    // Get All Messages
    public List<Contact> getAllMessages() {
        return repository.findAll();
    }

    // Get Message By ID
    public Contact getMessageById(String id) {
        return repository.findById(id).orElse(null);
    }

    // Delete Message
    public void deleteMessage(String id) {
        repository.deleteById(id);
    }

    // Update Message
    public Contact updateMessage(String id, Contact updatedContact) {

        Contact existing = repository.findById(id).orElse(null);

        if (existing != null) {

            existing.setName(updatedContact.getName());
            existing.setEmail(updatedContact.getEmail());
            existing.setSubject(updatedContact.getSubject());
            existing.setMessage(updatedContact.getMessage());

            return repository.save(existing);
        }

        return null;
    }
}