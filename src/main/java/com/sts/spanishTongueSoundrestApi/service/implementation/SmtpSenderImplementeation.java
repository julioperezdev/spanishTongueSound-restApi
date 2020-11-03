package com.sts.spanishTongueSoundrestApi.service.implementation;

import com.sts.spanishTongueSoundrestApi.model.ContactForm;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import javax.mail.MessagingException;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;

@Service
public class SmtpMailSenderImplementation {

    @Autowired
    private JavaMailSender javaMailSender;

    public void send(ContactForm contactForm) throws MessagingException, UnsupportedEncodingException {


        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);


        String mailSubject = contactForm.getNameContactForm() + " would like to concrete a schedule for an Online course ";
        String mailContent = "<h2>You have a new inquiry</h2>" +
                "<br><br><p>name: </p>"+ contactForm.getNameContactForm() +
                "<br><p>phone number: </p>"+ contactForm.getPhoneContactForm() +
                "<br><p>email: </p>"+ contactForm.getEmailContactForm() +
                "<br><p>age: </p>"+ contactForm.getAgeContactForm() +
                "<br><p>sex: </p>"+ contactForm.getSexContactForm() +
                "<br><p>country: </p>"+ contactForm.getCountryContactForm()+
                "<br><p>message: </p>"+ contactForm.getBoxMessageContactForm();

        helper.setFrom("ceo@protobot.dev", "Spanish Tongue Sound");
        helper.setSubject(mailSubject);
        helper.setTo("andrese.959595@gmail.com");
        helper.setText(mailContent,true);

        javaMailSender.send(message);
    }
}
