package ru.digitalleague.exam.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;

@Entity
@Table(name = "teacher_student_link")
@Data
public class TeacherStudentEntity {

    @Column(name = "teacher_id")
    private Long teacherId;

    @Column(name = "student_id")
    @CreationTimestamp
    private Long studentId;
}
