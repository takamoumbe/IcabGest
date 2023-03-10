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
@Table(name="student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id", nullable = false)

    private  int id_student;
    private  String name;
    private  String surname;
    private  String date_of_birth;
    private  String registration_number;
    private  String sex;
    private  String birth_place;
    private  String photo;
    private  String email;
    private  String tel;
    private  String registration_date;
    private  String nationality;
    private  int student_status;
    @ManyToOne
    @JoinColumn(name = "level_id", nullable = false)
    private Level level;
    @ManyToOne
    @JoinColumn(name = "parent_id", nullable = false)
    private Parent parent;
    @ManyToOne
    @JoinColumn(name = "sector_id", nullable = false)
    private Sector sector;
    private  String create_at;
    private  String update_at;
    private  String delete_at;

}
