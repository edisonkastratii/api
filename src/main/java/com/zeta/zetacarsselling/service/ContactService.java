package com.zeta.zetacarsselling.service;

import com.zeta.zetacarsselling.model.Contact;
import com.zeta.zetacarsselling.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactService {
    private ContactRepository contactRepository;

    @Autowired
    public ContactService(ContactRepository contactRepository) {
        this.contactRepository = contactRepository;
    }

    public Optional<Contact> findOne(int id){
        return contactRepository.findById(id);
    }

    public List<Contact> findAll(){
        return contactRepository.findAll();
    }

    public void save(Contact contact){
        contactRepository.save(contact);
    }

    public void delete(int id){
        contactRepository.deleteById(id);
    }
}
