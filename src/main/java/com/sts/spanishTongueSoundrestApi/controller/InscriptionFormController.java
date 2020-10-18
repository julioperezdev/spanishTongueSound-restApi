package com.sts.spanishTongueSoundrestApi.controller;

import com.sts.spanishTongueSoundrestApi.model.InscriptionForm;
import com.sts.spanishTongueSoundrestApi.service.implementation.InscriptionFormServiceImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("api/v1/SpanishTongueSound")
public class InscriptionFormController {

    @Autowired
    InscriptionFormServiceImp inscriptionFormServiceImp;

    @GetMapping
    public List<InscriptionForm> getForms() {
        return inscriptionFormServiceImp.getAllForms();
    }

    @PostMapping
    public String saveForms(@RequestBody InscriptionForm inscriptionForm) {
        return inscriptionFormServiceImp.saveForm(inscriptionForm);
    }
}
