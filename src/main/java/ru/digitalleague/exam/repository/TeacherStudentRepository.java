package ru.digitalleague.exam.repository;

import org.apache.ibatis.annotations.Param;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import ru.digitalleague.exam.model.StudentEntity;
import ru.digitalleague.exam.model.TeacherStudentEntity;

public interface TeacherStudentRepository extends CrudRepository<TeacherStudentEntity, Long> {

    @Query("SELECT \* FROM university.student s LEFT JOIN university.teacher_student_link tsl on s.id = tsl.student_id " +
            "where tsl.teacher_id = :id")
    List<StudentEntity> findStudents( @Param("id") long id);
}
