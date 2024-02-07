package com.zeta.zetacarsselling.controller;

import com.zeta.zetacarsselling.model.Contact;
import com.zeta.zetacarsselling.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/contact")
public class ContactController {

    private ContactService contactService;

    @Autowired
    public ContactController(ContactService contactService) {
        this.contactService = contactService;
    }

    @GetMapping("/{contactId}")
    public Optional<Contact> findOne(@PathVariable int contactId){
        return contactService.findOne(contactId);
    }

    @GetMapping("/")
    public List<Contact> findAll(){
        return contactService.findAll();
    }

    @PostMapping("/")
    public void post(@RequestBody Contact contact){
        contactService.save(contact);
    }

    @PutMapping("/")
    public void update(@RequestBody Contact contact){
        contactService.save(contact);
    }

    @DeleteMapping("/{contactId}")
    public void delete(@PathVariable int contactId){
        contactService.delete(contactId);
    }
}
