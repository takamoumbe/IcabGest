package com.example.SchoolGest.school.entities.association;

import com.example.SchoolGest.school.entities.modules.emploiTemp.Period;
import com.example.SchoolGest.school.entities.modules.notes.Student;
import com.example.SchoolGest.school.entities.key.AttendanceRecordKey;

import javax.persistence.*;

@Entity
@Table(name="attendanceRecord")
public class AttendanceRecord {

    @EmbeddedId
    private AttendanceRecordKey attendanceRecordKey;
    @ManyToOne()
    @MapsId("student_id")
    @JoinColumn(name = "student_id")
    private Student student;

    @ManyToOne()
    @MapsId("period_id")
    @JoinColumn(name = "period_id")
    private Period period;

    private String date_form;
    private int status_form;
    private String create_at;
    private String update_at;
    private String delete_at;


}
