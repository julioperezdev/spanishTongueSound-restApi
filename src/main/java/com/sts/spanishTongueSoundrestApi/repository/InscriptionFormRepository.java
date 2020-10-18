package com.sts.spanishTongueSoundrestApi.repository;

import com.sts.spanishTongueSoundrestApi.model.InscriptionForm;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository

public interface InscriptionFormRepository extends MongoRepository<InscriptionForm, String> {
}
