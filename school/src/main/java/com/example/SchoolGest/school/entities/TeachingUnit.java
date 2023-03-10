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
@Table(name="teachingUnit")
public class TeachingUnit {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "unit_id", nullable = false)

    private int id_unit;
    private String band;
    private String coded;
    private int status_unit;
    private String etat_level;
    private String create_at;
    private String update_at;
    private String delete_at;
}
