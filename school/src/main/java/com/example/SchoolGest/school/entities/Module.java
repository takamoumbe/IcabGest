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
@Table(name="module")
public class Module {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "module_id", nullable = false)
    private  int id_module;
    private  String name;
    private  String code;
    private  int status_module;
    private  String etat_module;
    private  String create_at;
    private  String update_at;
    private  String delete_at;

}
