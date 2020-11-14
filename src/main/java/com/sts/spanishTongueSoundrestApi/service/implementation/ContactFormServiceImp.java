package com.sts.spanishTongueSoundrestApi.service.implementation;

import com.sts.spanishTongueSoundrestApi.model.ContactForm;
import com.sts.spanishTongueSoundrestApi.repository.ContactFormRepository;
import com.sts.spanishTongueSoundrestApi.service.ContactFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactFormServiceImp implements ContactFormService {
    @Autowired
    ContactFormRepository contactFormRepository;

    @Override
    public List<ContactForm> getAllForms() {return contactFormRepository.findAll();}

    @Override
    public String saveForm(ContactForm contactForm) {
        contactFormRepository.save(contactForm);
        return "The Contact Form was successfully saved";
    }

}
