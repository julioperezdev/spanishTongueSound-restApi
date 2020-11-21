package com.sts.spanishTongueSoundrestApi.service.implementation;

import com.sts.spanishTongueSoundrestApi.model.LevelCourse;
import com.sts.spanishTongueSoundrestApi.repository.LevelCourseRepository;
import com.sts.spanishTongueSoundrestApi.service.LevelCourseService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class LevelCourseServiceImplementation implements LevelCourseService {

    @Autowired
    LevelCourseRepository levelCourseRepository;

    @Override
    public List<LevelCourse> getAllLevelCourses() {
        return levelCourseRepository.findAll();
    }

    @Override
    public Optional<LevelCourse> getLevelCourseById(String idLevelCourse) {
        return levelCourseRepository.findById(idLevelCourse);
    }

    @Override
    public String saveLevelCourse(LevelCourse levelCourse) {
        levelCourseRepository.save(levelCourse);
        return "saved";
    }

    @Override
    public LevelCourse updateInformationLevelCourseById(String idLevelCourse, LevelCourse levelCourse) {
        Optional<LevelCourse> particularLevelCourse = levelCourseRepository.findById(idLevelCourse);
        particularLevelCourse.get().setNameLevelCourse(levelCourse.getNameLevelCourse());
        particularLevelCourse.get().setValueLevelCourse(levelCourse.getValueLevelCourse());
        System.out.println("new information to this Level Course is update");
        return levelCourseRepository.save(particularLevelCourse.get());
    }

    @Override
    public LevelCourse addStudentById(String idLevelCourse) {
        Optional<LevelCourse> particularLevelCourse = levelCourseRepository.findById(idLevelCourse);
        int allStudents = particularLevelCourse.get().getActiveStudents();
        particularLevelCourse.get().setActiveStudents(allStudents+1);
        return levelCourseRepository.save(particularLevelCourse.get());
    }

//    @Override
//    public String registeringIdStudentById(String idLevelCourse, String idStrudent) {
//        Optional<LevelCourse> particularLevelCourse = levelCourseRepository.findById(idLevelCourse);
//        String[] addingIdStudent = particularLevelCourse.get().setIdStudentList(idStrudent);
//
//        return"jahdfklad";
//    }

}
