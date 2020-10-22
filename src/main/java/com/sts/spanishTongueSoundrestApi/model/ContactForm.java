package com.sts.spanishTongueSoundrestApi.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document

public class ContactForm {
    @Id
    private String idContactForm;

    private String nameContactForm;

    private Number ageContactForm;

    private String emailContactForm;

    private Number phoneContactForm;

    //contactForm//
    //private Boolean formRequestAnswer
    //private String "contact box message, question or inscription"

}
