package com.example.SchoolGest.school.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;

@Entity
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Table(name="years")
public class Years {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "year_id", nullable = false)

    private int id_year;
    private String name_year;
    private String start_date;
    private String end_date;
    private int statut_date;
    private String etat_date;
    private String year_status;
    @ManyToOne
    @JoinColumn(name = "programme_id", nullable = false)
    private Program program;
    private String create_at;
    private String update_at;
    private String delete_at;

}
