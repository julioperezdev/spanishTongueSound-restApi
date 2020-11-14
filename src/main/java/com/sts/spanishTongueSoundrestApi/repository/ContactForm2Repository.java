package com.sts.spanishTongueSoundrestApi.repository;

import com.sts.spanishTongueSoundrestApi.model.ContactForm2;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContactForm2Repository extends MongoRepository<ContactForm2, String> {
}
