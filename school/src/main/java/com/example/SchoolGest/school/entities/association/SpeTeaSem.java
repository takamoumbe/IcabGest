package com.example.SchoolGest.school.entities.association;

import com.example.SchoolGest.school.entities.modules.emploiTemp.Program;
import com.example.SchoolGest.school.entities.modules.notes.Semester;
import com.example.SchoolGest.school.entities.modules.notes.TeachingUnit;
import com.example.SchoolGest.school.entities.key.SpeTeaSemKey;

import javax.persistence.*;

@Entity
@Table(name="speTeaSem")
public class SpeTeaSem {

    @EmbeddedId
    private SpeTeaSemKey speTeaSemKey;

    @ManyToOne()
    @MapsId("id_unit")
    @JoinColumn(name = "id_unit")
    private TeachingUnit teachingUnit;
    @ManyToOne()
    @MapsId("semes_id")
    @JoinColumn(name = "semes_id")
    private Semester semester;
    @ManyToOne()
    @MapsId("speciality_id")
    @JoinColumn(name = "speciality_id")
    private Program program;

    private int credit;
    private String hours;
    private int status;
    private String create_at;
    private String update_at;
    private String delete_at;
}
