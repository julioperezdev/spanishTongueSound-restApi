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

public class InscriptionForm {
    @Id
    private String idForm;

    private String nameForm;

    private Number ageForm;

    private String emailForm;

    private Number phoneForm;

    //private String "contact box message, question or inscription"

}
