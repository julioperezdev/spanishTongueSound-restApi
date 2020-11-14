package com.sts.spanishTongueSoundrestApi.controller;

import com.sts.spanishTongueSoundrestApi.model.ContactForm2;
import com.sts.spanishTongueSoundrestApi.service.implementation.ContactForm2ServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("contactForm")
public class ContactForm2Controller {

    @Autowired
    ContactForm2ServiceImplementation contactForm2ServiceImplementation;

    @GetMapping
    public List<ContactForm2> getAllContactForm(){
        return contactForm2ServiceImplementation.getAllContactForm();
    }

    @GetMapping("/{idContactForm}")
    public Optional<ContactForm2> getContactFormById (@PathVariable String idContactForm){
        return contactForm2ServiceImplementation.getContactFormById(idContactForm);
    }

    @PostMapping
    public String saveContactForm(@RequestBody ContactForm2 contactForm2){
        return contactForm2ServiceImplementation.saveContactForm(contactForm2);
    }

    @PostMapping("changeStatus/{idContactForm}")
    public String changeProcessById(@PathVariable String idContactForm){
        return contactForm2ServiceImplementation.changeProcessStatusById(idContactForm);
    }
}
