package com.example.SchoolGest.school.entities.key;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class LevelSemesKey implements Serializable {
    private static final long serialVersionUID = -7363637040408643982L;
    @Column(nullable = false)
    private Integer semes_id;
    @Column(nullable = false)
    private Integer level_id;

}
