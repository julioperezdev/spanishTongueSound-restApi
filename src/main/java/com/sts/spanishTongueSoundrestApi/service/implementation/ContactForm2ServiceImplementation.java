package com.sts.spanishTongueSoundrestApi.service.implementation;

import com.sts.spanishTongueSoundrestApi.model.ContactForm2;
import com.sts.spanishTongueSoundrestApi.repository.ContactForm2Repository;
import com.sts.spanishTongueSoundrestApi.service.ContactForm2Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ContactForm2ServiceImplementation implements ContactForm2Service {

    @Autowired
    ContactForm2Repository contactForm2Repository;

    @Override
    public List<ContactForm2> getAllContactForm() {
        return contactForm2Repository.findAll();
    }

    @Override
    public Optional<ContactForm2> getContactFormById(String idContactForm) {
        return contactForm2Repository.findById(idContactForm);
    }

    @Override
    public String saveContactForm(ContactForm2 contactForm2) {
        contactForm2Repository.save(contactForm2);
        return "Contact form was saved";
    }

    @Override
    public String changeProcessStatusById(String idContactForm) {
        Optional<ContactForm2> particularContactForm = contactForm2Repository.findById(idContactForm);
        //by default every contactForm have the FinishProcess attribute in FALSE
        if (particularContactForm.get().getFinishProcess() != true ){
            particularContactForm.get().setFinishProcess(true);
            contactForm2Repository.save(particularContactForm.get());
        }
        return "now, the status is " + particularContactForm.get().getFinishProcess();
    }
}
