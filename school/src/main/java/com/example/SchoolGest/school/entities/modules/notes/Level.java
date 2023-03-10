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
@Table(name="level")
public class Level {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "level_id", nullable = false)

    private int id_level;
    @Column(nullable = false)
    private String name;
    private int statut_level;
    private String etat_level;
    @Column(nullable = false)
    private String create_at;
    private String update_at;
    private String delete_at;

}
