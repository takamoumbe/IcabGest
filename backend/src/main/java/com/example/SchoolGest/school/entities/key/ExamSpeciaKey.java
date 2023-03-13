package com.example.SchoolGest.school.entities.key;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
@Embeddable
public class ExamSpeciaKey implements Serializable {
    @Column(nullable = false)
    private int exam_id;
    @Column(nullable = false)
    private int speciality_id;
}
