package ru.digitalleague.exam.api;

import ru.digitalleague.exam.model.StudentEntity;
import ru.digitalleague.exam.model.TeacherEntity;
import ru.digitalleague.exam.model.TeacherStudentEntity;

public interface TeacherStudentService {

    Iterable<StudentEntity> findStudentsByTeacher(Long id);

    Iterable<TeacherEntity> findTeachersByStudent(Long id);

    void addTeacherStudent(TeacherStudentEntity teacherStudentEntity);

    void deleteTeacherStudent(Long id);
}
