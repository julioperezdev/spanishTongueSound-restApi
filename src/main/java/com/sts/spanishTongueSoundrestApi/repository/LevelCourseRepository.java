package com.sts.spanishTongueSoundrestApi.repository;

import com.sts.spanishTongueSoundrestApi.model.LevelCourse;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LevelCourseRepository extends MongoRepository<LevelCourse, String> {
}
