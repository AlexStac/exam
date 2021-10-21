package ru.digitalleague.exam.model;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.springframework.boot.autoconfigure.domain.EntityScan;

import javax.persistence.*;

@Entity
@Table(name = "student")
@Data
public class StudentEntity {
    @Id
    @Column(name = "student_id")
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "teacher_seq")
    @SequenceGenerator(name = "teacher_seq", sequenceName = "teacher_seq", allocationSize = 1)
    private Long studentId;

    @Column(name = "fio_student")
    private String fioStudent;

    @Column(name = "specification_student")
    @CreationTimestamp
    private String specification;

    @Column(name = "course")
    @CreationTimestamp
    private int course;
}
