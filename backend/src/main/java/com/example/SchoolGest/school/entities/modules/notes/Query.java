package com.example.SchoolGest.school.entities.modules.notes;

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
@Table(name="query")
public class Query {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "query_id", nullable = false)

    private int id_query;
    @Column(nullable = false)
    private String name;
    private String pattern;
    private String etat_query;
    private int status_query;
    @ManyToOne
    @JoinColumn(name = "student_id", nullable = false)
    private Student student;
    private String create_at;
    private String update_at;
    private String delete_at;


}
