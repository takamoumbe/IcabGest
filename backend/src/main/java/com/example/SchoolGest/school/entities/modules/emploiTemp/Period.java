package com.example.SchoolGest.school.entities.modules.emploiTemp;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Table(name="period")
public class Period {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "period_id", nullable = false)

    private int id_period;
    private String during;
    private int status_period;
    private String create_at;
    private String delete_at;
    private String update_at;
}
