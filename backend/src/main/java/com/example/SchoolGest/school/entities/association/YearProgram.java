package com.example.SchoolGest.school.entities.association;

import com.example.SchoolGest.school.entities.modules.emploiTemp.Program;
import com.example.SchoolGest.school.entities.modules.notes.Years;
import com.example.SchoolGest.school.entities.key.YearProgramKey;

import javax.persistence.*;

@Entity
@Table(name = "yearProgram")
public class YearProgram {
    @EmbeddedId
    private YearProgramKey yearProgramKey;
    @ManyToOne()
    @MapsId("year_id")
    @JoinColumn(name = "year_id")
    private Years years;

    @ManyToOne()
    @MapsId("program_id")
    @JoinColumn(name = "program_id")
    private Program program;
    @Column(nullable = false)
    private  String create_at;
    private  String update_at;
    private  String delete_at;
}
