package com.example.SchoolGest.school.entities.association;

import com.example.SchoolGest.school.entities.modules.notes.Level;
import com.example.SchoolGest.school.entities.modules.notes.Semester;
import com.example.SchoolGest.school.entities.key.LevelSemesKey;

import javax.persistence.*;
@Entity
@Table(name="levelSemes")
public class LevelSemes {
    @EmbeddedId
    private LevelSemesKey levelSemesKey;
    @MapsId("level_id")
    @JoinColumn(name = "level_id")
    private Level level;
    @ManyToOne()
    @MapsId("semes_id")
    @JoinColumn(name = "semes_id")
    private Semester semester;
    @Column(nullable = true)
    private int status_levelSemes;
    private String etat_levelSemes;
    private String create_at;
    private String update_at;
    private String delete_at;


}
