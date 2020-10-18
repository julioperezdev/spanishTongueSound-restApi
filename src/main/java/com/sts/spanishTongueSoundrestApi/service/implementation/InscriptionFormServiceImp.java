package com.sts.spanishTongueSoundrestApi.service.implementation;

import com.sts.spanishTongueSoundrestApi.model.InscriptionForm;
import com.sts.spanishTongueSoundrestApi.repository.InscriptionFormRepository;
import com.sts.spanishTongueSoundrestApi.service.InscriptionFormService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InscriptionFormServiceImp implements InscriptionFormService {
    @Autowired
    InscriptionFormRepository inscriptionFormRepository;

    @Override
    public List<InscriptionForm> getAllForms() {return inscriptionFormRepository.findAll();}

    @Override
    public String saveForm(InscriptionForm inscriptionForm) {
        inscriptionFormRepository.save(inscriptionForm);
        return "The Inscription Form was successfully saved";
    }

}
