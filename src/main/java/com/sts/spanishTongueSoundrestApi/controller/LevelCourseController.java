package com.sts.spanishTongueSoundrestApi.controller;

import com.sts.spanishTongueSoundrestApi.model.LevelCourse;
import com.sts.spanishTongueSoundrestApi.service.implementation.LevelCourseServiceImplementation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("levelCourse/")
public class LevelCourseController {

    @Autowired
    LevelCourseServiceImplementation levelCourseServiceImplementation;

    @GetMapping
    public List<LevelCourse> getAllLevelCourse(){
        return levelCourseServiceImplementation.getAllLevelCourses();
    }

    @GetMapping("/{idLevelCourse}")
    public Optional<LevelCourse> getLevelCourseById(@PathVariable String idLevelCourse){
        return levelCourseServiceImplementation.getLevelCourseById(idLevelCourse);
    }

    @PostMapping
    public String saveLevelCourse(LevelCourse levelCourse){
        return levelCourseServiceImplementation.saveLevelCourse(levelCourse);
    }

    @PostMapping
    public LevelCourse addStudentById(String idLevelStudent){
        return levelCourseServiceImplementation.addStudentById(idLevelStudent);
    }

}
