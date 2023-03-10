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
@Table(name="exam")
public class Exam {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "exam_id", nullable = false)

    private int id_exam;
    private String name_exam;
    private String type;

    private int percentage;
    private String session;
    private int status_exam;
    private String etat_exam;
    private String create_at;
    private String update_at;
    private String delete_at;
}
