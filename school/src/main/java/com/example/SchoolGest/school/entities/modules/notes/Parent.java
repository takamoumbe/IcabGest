package com.example.SchoolGest.school.entities.modules.notes;

import lombok.*;

import javax.persistence.*;

@Data
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name="parent")
public class Parent {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "parent_id", nullable = false)
    private int id_parent;

    private String name;
    private String surname;
    @Column(nullable = false)
    private String numero;
    @Column(nullable = false)
    private String sexe;
    private String tuteur;
    private int status_parent;
    private String etat_parent;
    @Column(nullable = false)
    private String create_at;
    @Column(nullable = false)
    private String update_at;
    private String delete_at;

}
