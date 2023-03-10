package com.example.SchoolGest.school.entities.association;

import com.example.SchoolGest.school.entities.Student;
import com.example.SchoolGest.school.entities.Years;
import com.example.SchoolGest.school.entities.key.StudentYearKey;

import javax.persistence.*;

@Entity
@Table(name="students")
public class StudentsYear {
    @EmbeddedId
    private StudentYearKey studentsYear;
    @ManyToOne()
    @MapsId("etudiant_id")
    @JoinColumn(name = "etudiant_id")
    private Student student;
    @ManyToOne()
    @MapsId("year_id")
    @JoinColumn(name = "year_id")
    private Years years;
    @Column(nullable = false)
    private int status_studentsYear;
    private String etat_studentsYear;
    private String create_at;
    private String delete_at;
    private String update_at;
    
}
