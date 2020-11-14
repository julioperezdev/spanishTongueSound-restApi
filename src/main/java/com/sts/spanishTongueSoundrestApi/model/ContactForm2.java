package com.sts.spanishTongueSoundrestApi.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@ToString
@Document(collection = "contactForm")
public class ContactForm2 {

    @Id
    private String idContactForm;
    private String fullnameContactForm;
    private String emailContacForm;
    private int phoneContactForm;
    private Boolean finishProcess;

}
