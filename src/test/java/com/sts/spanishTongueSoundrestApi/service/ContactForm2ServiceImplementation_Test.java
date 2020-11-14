package com.sts.spanishTongueSoundrestApi.service;

import com.sts.spanishTongueSoundrestApi.model.ContactForm2;
import com.sts.spanishTongueSoundrestApi.service.implementation.ContactForm2ServiceImplementation;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ContactForm2ServiceImplementation_Test {

    @Autowired
    ContactForm2ServiceImplementation contactForm2ServiceImplementation;

    @Test
    void SeeContactForm_test(){

        ContactForm2 particularContactForm21 = new ContactForm2();
        particularContactForm21.setIdContactForm("8dfdg89fhlkh");
        particularContactForm21.setFullnameContactForm("Julio Perez");
        particularContactForm21.setEmailContacForm("julio@mail");
        particularContactForm21.setPhoneContactForm(123435465);
        particularContactForm21.setFinishProcess(true);

        ContactForm2 particularContactForm2 = new ContactForm2();
        particularContactForm2.setIdContactForm("4dgdg129lllp");
        particularContactForm2.setFullnameContactForm("Maria Viloria");
        particularContactForm2.setEmailContacForm("maria@mail");
        particularContactForm2.setPhoneContactForm(9898654);
        particularContactForm2.setFinishProcess(false);

        System.out.println(particularContactForm21.toString());
        System.out.println(particularContactForm2.toString());
    }

    @Test
    void changeProcessById_test(String idContactForm){
        List<Boolean> particularContactForm = new ArrayList<>();
        particularContactForm.add(Integer.parseInt("1"), true);
        particularContactForm.add(Integer.parseInt("2"), false);
        particularContactForm.add(Integer.parseInt("3"), false);

        contactForm2ServiceImplementation.changeProcessStatusById("1");
    }
}
