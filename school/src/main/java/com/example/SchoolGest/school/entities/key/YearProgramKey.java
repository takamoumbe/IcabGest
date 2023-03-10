package com.example.SchoolGest.school.entities.key;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class YearProgramKey implements Serializable {
    @Column(nullable = false)
    private int year_id;
    @Column(nullable = false)
    private int program_id;
}
