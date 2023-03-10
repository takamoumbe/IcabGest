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
@Table(name="document")
public class Document {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "document_id", nullable = false)

    private int id_document;
    private String name;
    private String location;
    @Column(nullable = false)
    private int status_document;
    @Column(nullable = false)
    private String etat_doc;
    @Column(nullable = false)
    private String create_at;
    @Column(nullable = false)
    private String update_at;
    private String delete_at;

}
