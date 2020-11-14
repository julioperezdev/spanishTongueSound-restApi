package com.sts.spanishTongueSoundrestApi.service;

import com.sts.spanishTongueSoundrestApi.model.ContactForm;
import java.util.List;

public interface ContactFormService {
    List<ContactForm> getAllForms();
    String saveForm (ContactForm contactForm);

}
