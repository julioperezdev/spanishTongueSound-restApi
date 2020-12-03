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
public class SmtpSenderImplementeation {

    @Autowired
    private JavaMailSender javaMailSender;

    public void send(ContactForm contactForm) throws MessagingException, UnsupportedEncodingException {


        MimeMessage message = javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message);


        String mailSubject = contactForm.getNameContactForm() + " would like to concrete a schedule for an Online course ";
        String mailContent = "<h1><center>Spanish Tongue Sound</h1></center>" +
                "<h2>You have received a new inquiry </h2>" +
                "<p>" + contactForm.getNameContactForm() + " has contacted you for a spanish course. </p>" +
                "<ul>" +
                "<li><p><b>Name: </b>"+ contactForm.getNameContactForm() + "</p>" + "</li>" +
                "<li><p><b>Phone Number: </b>"+ contactForm.getPhoneContactForm() + "</p>" + "</li>" +
                "<li><p><b>Email: </b>"+ contactForm.getEmailContactForm() + "</p>" + "</li>" +
                "<li><p><b>Age: </b>"+ contactForm.getAgeContactForm() + "</p>" + "</li>" +
                "<li><p><b>Sex: </b>"+ contactForm.getSexContactForm() + "</p>" + "</li>" +
                "<li><p><b>Country: </b>"+ contactForm.getCountryContactForm() + "</p>"+ "</li>" +
                "<li><p><b>Message: </b>"+ contactForm.getBoxMessageContactForm() + "</p>" + "</li>" + "</ul>";

        helper.setFrom("ceo@protobot.dev", "Spanish Tongue Sound");
        helper.setSubject(mailSubject);
        helper.setTo("andrese.959595@gmail.com");
        helper.setText(mailContent,true);

        javaMailSender.send(message);
    }
}
