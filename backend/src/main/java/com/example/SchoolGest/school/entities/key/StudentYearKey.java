package com.example.SchoolGest.school.entities.key;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
@Embeddable
public class StudentYearKey implements Serializable {
    @Column(nullable = false)
    private Integer year_id;
    @Column(nullable = false)
    private Integer student_id;
}
