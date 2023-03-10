package com.example.SchoolGest.school.entities.modules.notes;

import com.example.SchoolGest.school.entities.modules.notes.Student;
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
@Table(name="attendance")
public class Attendance {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "att_id", nullable = false)

    private int id_att;
    private String average;
    private String pattern;
    private int status_att;
    private String etat_att;
    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;
    private String create_at;
    private String update_at;
    private String delete_at;


}
