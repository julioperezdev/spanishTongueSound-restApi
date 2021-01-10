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
@Document

public class StudentProfile {
    @Id
    private String idStudent;
    private String studentName;
    private String studentEmail;
    private Number studentPhone;
    private Number studentAge;
    private String studentSex;
    private Boolean studentPaymentConfirmation;
    private String studentCountry;
    private String studentCourseLevel;


}
