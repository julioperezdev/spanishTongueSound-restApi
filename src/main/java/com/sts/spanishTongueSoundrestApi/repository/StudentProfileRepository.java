package com.sts.spanishTongueSoundrestApi.repository;

import com.sts.spanishTongueSoundrestApi.model.StudentProfile;
import org.springframework.stereotype.Repository;

@Repository

public interface StudentProfileRepository extends MongoRepository<StudentProfile , String> {
}
