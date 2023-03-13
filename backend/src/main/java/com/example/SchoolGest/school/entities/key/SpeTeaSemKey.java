package com.example.SchoolGest.school.entities.key;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import javax.persistence.Entity;
import java.io.Serializable;
@Embeddable
public class SpeTeaSemKey implements Serializable {
    @Column(nullable = false)
    private int speciality_id;
    @Column(nullable = false)
    private int unit_id;
    @Column(nullable = false)
    private int semes_id;

}
