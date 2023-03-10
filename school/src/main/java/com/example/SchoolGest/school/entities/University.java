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
@Table(name="university")
public class University {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "universuty_id", nullable = false)

    private int id_university;
    @Column(nullable = false)
    private String name;
    @Column(nullable = false)
    private String manager;
    @Column(nullable = false)
    private String slogan;
    @Column(nullable = false)
    private String location;
    @Column(nullable = false)
    private String creation_date;
    private String approval;
    private String logo;
    private int status_univesity;
    private String etat_university;
    @Column(nullable = false)
    private String create_at;
    private String update_at;
    private String delete_at;
}
