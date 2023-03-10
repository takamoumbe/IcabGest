package com.example.SchoolGest.school.entities.association;

import com.example.SchoolGest.school.entities.Day;
import com.example.SchoolGest.school.entities.Program;
import com.example.SchoolGest.school.entities.TeachingUnit;
import com.example.SchoolGest.school.entities.key.ProgramUnitKey;

import javax.persistence.*;

@Entity
@Table(name="progrmUnit")
public class ProgramUnit {
    @EmbeddedId
    private ProgramUnitKey programUnitKey;

    @ManyToOne()
    @MapsId("program_id")
    @JoinColumn(name = "program_id")
    private Program program;
    @ManyToOne()
    @MapsId("unit_id")
    @JoinColumn(name = "unit_id")
    private TeachingUnit teachingUnit;
    private String scheduled_hour;
    private String hour_done;
    private int status_programUnit;
    @Column(nullable = false)
    private String create_at;
    private String delete_at;
    private String update_at;
}
