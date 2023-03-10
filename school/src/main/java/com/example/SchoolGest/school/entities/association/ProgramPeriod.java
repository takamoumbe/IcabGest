package com.example.SchoolGest.school.entities.association;

import com.example.SchoolGest.school.entities.modules.emploiTemp.Period;
import com.example.SchoolGest.school.entities.modules.emploiTemp.Program;
import com.example.SchoolGest.school.entities.key.ProgramPeriodKey;

import javax.persistence.*;

@Entity
@Table(name = "programPeriod")
public class ProgramPeriod {
    @EmbeddedId
    private ProgramPeriodKey programPeriodKey;

    @ManyToOne()
    @MapsId("program_id")
    @JoinColumn(name = "program_id")
    private Program program;

    @ManyToOne()
    @MapsId("period_id")
    @JoinColumn(name = "period_id")
    private Period period;

    private String create_at;
    private String update_at;
    private String delete_at;
}
