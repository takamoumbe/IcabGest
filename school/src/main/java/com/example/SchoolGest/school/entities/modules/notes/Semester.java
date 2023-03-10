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
@Table(name="semestre")
public class Semester {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "semes_id", nullable = false)

    private int id_semes;
    private String name;
    private String code;
    private int status_semes;
    private String etat_semes;
    private String create_at;
    private String update_at;
    private String delete_at;
}
