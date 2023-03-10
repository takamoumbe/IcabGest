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
@Table(name="sector")
public class Sector {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "sector_id", nullable = false)

    private  int id_sector;
    @Column(nullable = false)
    private  String code;
    @Column(nullable = false)
    private  String name;
    private  int status_sector;
    private  String etat_sector;
    private  String create_at;
    private  String update_at;
    private  String delete_at;
}
