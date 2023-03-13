package com.example.SchoolGest.school.entities.association;

import com.example.SchoolGest.school.entities.modules.notes.Student;
import com.example.SchoolGest.school.entities.modules.notes.Years;
import com.example.SchoolGest.school.entities.key.StudentYearKey;

import javax.persistence.*;

@Entity
@Table(name="students")
public class StudentsYear {
    @EmbeddedId
    private StudentYearKey studentsYear;
    @ManyToOne()
    @MapsId("student_id")
    @JoinColumn(name = "student_id")
    private Student student;
    @ManyToOne()
    @MapsId("year_id")
    @JoinColumn(name = "year_id")
    private Years years;
    private int status_studentsYear;
    private String etat_studentsYear;
    @Column(nullable = false)
    private String create_at;
    private String delete_at;
    private String update_at;
    
}
