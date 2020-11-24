package com.sts.spanishTongueSoundrestApi.controller;

import com.sts.spanishTongueSoundrestApi.model.ContactForm;
import com.sts.spanishTongueSoundrestApi.service.implementation.ContactFormServiceImp;
import com.sts.spanishTongueSoundrestApi.service.implementation.SmtpSenderImplementeation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.mail.MessagingException;
import java.io.UnsupportedEncodingException;
import java.util.List;

@RestController
@RequestMapping("api/v1/SpanishTongueSound")
public class ContactFormController {

    @Autowired
    ContactFormServiceImp contactFormServiceImp;

    @Autowired
    SmtpSenderImplementeation smtpSenderImplementeation;

    @GetMapping
    public List<ContactForm> getForms() {
        return contactFormServiceImp.getAllForms();
    }

    @PostMapping
    public String saveForms(@RequestBody ContactForm contactForm) {
        return contactFormServiceImp.saveForm(contactForm);
    }

    @PostMapping("/sendmail")
    public void savdeForms(@RequestBody ContactForm contactForm) throws UnsupportedEncodingException, MessagingException {
    smtpSenderImplementeation.send(contactForm);
    }
}
