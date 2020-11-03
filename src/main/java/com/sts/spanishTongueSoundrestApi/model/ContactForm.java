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

    private String sexContactForm;

    private String emailContactForm;

    private Number phoneContactForm;

    private String countryContactForm;

    private String boxMessageContactForm;

    //private Boolean formRequestAnswer

}
