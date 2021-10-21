package ru.digitalleague.exam.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity
@Table(name = "teacher")
@Data
public class TeacherEntity {
    @Id
    @Column(name = "teacher_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teacher_seq")
    @SequenceGenerator(name = "teacher_seq", sequenceName = "teacher_seq", allocationSize = 1)
    private Long id;

    @Column(name = "fio_teacher")
    private String fioTeacher;

    @Column(name = "department_teacher")
    @CreationTimestamp
    private int departmentTeacher;
}
