package com.example.SchoolGest.school.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="note")
public class Notes {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "note_id", nullable = false)
    private  int id_note;
    private  float note_value;
    private  int note_status;
    private  String etat_note;
    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;
    @ManyToOne
    @JoinColumn(name = "exam_id", nullable = false)
    private Exam exam;
    @ManyToOne
    @JoinColumn(name = "teacherUnit_id", nullable = false)
    private TeachingUnit teachingUnit;
    @ManyToOne
    @JoinColumn(name = "year_id", nullable = false)
    private Years years;
    private  String create_at;
    private  String update_at;
    private  String delete_at;
}