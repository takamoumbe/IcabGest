package com.example.SchoolGest.school.entities.modules.notes;

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
    @Column(nullable = false)
    private  String name;
    @Column(nullable = false)
    private  String surname;
    @Column(nullable = false)
    private  String date_of_birth;
    @Column(nullable = false)
    private  String registration_number;
    @Column(nullable = false)
    private  String sex;
    @Column(nullable = false)
    private  String birth_place;
    private  String photo;
    private  String email;
    private  String tel;
    @Column(nullable = false)
    private  String registration_date;
    @Column(nullable = false)
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
    @ManyToOne
    @JoinColumn(name = "university_id", nullable = false)
    private University university;
    @Column(nullable = false)
    private  String create_at;
    private  String update_at;
    private  String delete_at;

}
