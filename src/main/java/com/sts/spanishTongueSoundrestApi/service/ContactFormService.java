package com.sts.spanishTongueSoundrestApi.service;

import com.sts.spanishTongueSoundrestApi.model.ContactForm2;

import java.util.List;
import java.util.Optional;

public interface ContactFormService {

    List<ContactForm2> getAllContactForm();

    Optional<ContactForm2> getContactFormById (String idContactForm);

    String saveContactForm(ContactForm2 contactForm2);

    String changeProcessStatusById(String idContactForm);



}
