package com.sts.spanishTongueSoundrestApi.service.implementation;


import com.sts.spanishTongueSoundrestApi.model.StudentProfile;
import com.sts.spanishTongueSoundrestApi.repository.StudentProfileRepository;
import com.sts.spanishTongueSoundrestApi.service.StudentProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StudentProfileImplementation implements StudentProfileService {

    @Autowired
    StudentProfileRepository studentProfileRepository;

    @Override
    public List<StudentProfile> getAllForms() {return studentProfileRepository.findAll();}

    @Override
    public String saveForm(StudentProfile studentProfile) {
        studentProfileRepository.save(studentProfile);
        return "Student profile was created successfully";
    }


}
