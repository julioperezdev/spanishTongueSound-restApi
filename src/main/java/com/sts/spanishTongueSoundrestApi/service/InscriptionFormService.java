package com.sts.spanishTongueSoundrestApi.service;

import com.sts.spanishTongueSoundrestApi.model.InscriptionForm;

import java.util.List;

public interface InscriptionFormService {
    List<InscriptionForm> getAllForms();
    String saveForm (InscriptionForm inscriptionForm);
}
