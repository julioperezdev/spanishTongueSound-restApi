package com.sts.spanishTongueSoundrestApi.controller;

import com.sts.spanishTongueSoundrestApi.model.ContactForm;
import com.sts.spanishTongueSoundrestApi.service.implementation.ContactFormServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/SpanishTongueSound")
public class ContactFormController {

    @Autowired
    ContactFormServiceImp contactFormServiceImp;

    @GetMapping
    public List<ContactForm> getForms() {
        return contactFormServiceImp.getAllForms();
    }

    @PostMapping
    public String saveForms(@RequestBody ContactForm contactForm) {
        return contactFormServiceImp.saveForm(contactForm);
    }
}
