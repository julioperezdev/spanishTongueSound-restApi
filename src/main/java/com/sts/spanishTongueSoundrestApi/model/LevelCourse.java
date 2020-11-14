package com.sts.spanishTongueSoundrestApi.model;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Getter
@Setter
@NoArgsConstructor
@Document(collection = "levelCourse")
public class LevelCourse {

    @Id
    private String idLevelCourse;
    private String nameLevelCourse;
    private int valueLevelCourse;
    private int activeStudents;
    private String[] idStudentList;
}
