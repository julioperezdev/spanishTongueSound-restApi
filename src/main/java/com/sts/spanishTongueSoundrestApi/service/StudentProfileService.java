package com.sts.spanishTongueSoundrestApi.service;

import com.sts.spanishTongueSoundrestApi.model.StudentProfile;
import java.util.List;

public interface StudentProfileService {
    List<StudentProfile> getAllForms();
    String saveForm (StudentProfile studentProfile);
}
