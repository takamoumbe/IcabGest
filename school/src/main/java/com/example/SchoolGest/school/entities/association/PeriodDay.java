package com.example.SchoolGest.school.entities.association;

import com.example.SchoolGest.school.entities.Day;
import com.example.SchoolGest.school.entities.Period;
import com.example.SchoolGest.school.entities.key.PeriodDayKey;

import javax.persistence.*;

@Entity
@Table(name="periodDay")
public class PeriodDay {
    @EmbeddedId
    private PeriodDayKey periodDayKey;

    @ManyToOne()
    @MapsId("day_id")
    @JoinColumn(name = "day_id")
    private Day day;
    @ManyToOne()
    @MapsId("period_id")
    @JoinColumn(name = "period_id")
    private Period period;
    @Column(nullable = false)
    private String create_at;
    private String delete_at;
    private String update_at;


}
