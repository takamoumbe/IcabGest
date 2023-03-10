package com.example.SchoolGest.school.entities.association;

import com.example.SchoolGest.school.entities.Exam;
import com.example.SchoolGest.school.entities.Speciality;
import com.example.SchoolGest.school.entities.key.ExamSpeciaKey;

import javax.persistence.*;

@Entity
@Table(name="examSpecia")
public class ExamSpecia {
    @EmbeddedId
    private ExamSpeciaKey examSpeciaKey;
    @ManyToOne()
    @MapsId("exam_id")
    @JoinColumn(name = "exam_id")
    private Exam exam;

    @ManyToOne()
    @MapsId("speciality_id")
    @JoinColumn(name = "speciality_id")
    private Speciality speciality;

    private String create_at;
    private String update_at;
    private String delete_at;

}
