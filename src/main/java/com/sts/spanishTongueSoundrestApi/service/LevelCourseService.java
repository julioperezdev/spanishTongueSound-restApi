package com.sts.spanishTongueSoundrestApi.service;

import com.sts.spanishTongueSoundrestApi.model.LevelCourse;

import java.util.List;
import java.util.Optional;

public interface LevelCourseService {

    List<LevelCourse> getAllLevelCourses();

    Optional<LevelCourse> getLevelCourseById(String idLevelCourse);

    String saveLevelCourse (LevelCourse levelCourse);

    LevelCourse updateInformationLevelCourseById(String idLevelCourse, LevelCourse levelCourse);

    LevelCourse addStudentById(String idLevelCourse);

//    String registeringIdStudentById(String idLevelCourse, String idStrudent);
}
