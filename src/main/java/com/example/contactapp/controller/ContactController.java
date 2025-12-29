package com.example.contactapp.controller;

import com.example.contactapp.model.Contact;
import com.example.contactapp.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/contacts")
public class ContactController {

    @Autowired
    private ContactRepository contactRepository;

    @PostMapping
    public Contact createContact(@RequestBody Contact contact) {
        return contactRepository.save(contact);
    }

    @GetMapping
    public List<Contact> getAllContacts() {
        return contactRepository.findAll();
    }

    @PutMapping("/{id}")
    public ResponseEntity<Contact> updateContact(@PathVariable Long id, @RequestBody Contact contactDetails) {
        return contactRepository.findById(id)
                .map(contact -> {
                    contact.setName(contactDetails.getName());
                    contact.setPhoneNumber(contactDetails.getPhoneNumber());
                    return ResponseEntity.ok(contactRepository.save(contact));
                })
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteContact(@PathVariable Long id) {
        return contactRepository.findById(id)
                .map(contact -> {
                    contactRepository.delete(contact);
                    return ResponseEntity.ok().<Void>build();
                })
                .orElse(ResponseEntity.notFound().build());
    }
}
