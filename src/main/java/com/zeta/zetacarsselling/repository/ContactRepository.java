package com.zeta.zetacarsselling.repository;

import com.zeta.zetacarsselling.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Integer> {
}
