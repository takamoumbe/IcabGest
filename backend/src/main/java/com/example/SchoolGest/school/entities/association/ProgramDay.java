package com.example.SchoolGest.school.entities.association;

import com.example.SchoolGest.school.entities.modules.notes.Day;
import com.example.SchoolGest.school.entities.modules.emploiTemp.Program;
import com.example.SchoolGest.school.entities.key.ProgramDayKey;

import javax.persistence.*;

@Entity
@Table(name = "progrmeDay")
public class ProgramDay {
    @EmbeddedId()
    private ProgramDayKey programDayKey;

    @ManyToOne()
    @MapsId("program_id")
    @JoinColumn(name = "program_id")
    private Program program;

    @ManyToOne()
    @MapsId("day_id")
    @JoinColumn(name = "day_id")
    private Day day;

    private String create_at;
    private String update_at;
    private String delete_at;
}
