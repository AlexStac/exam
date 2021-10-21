package ru.digitalleague.exam.api;

import ru.digitalleague.exam.model.StudentEntity;

public interface StudentService {

    StudentEntity findStudentById(Long id);

    void addStudent(StudentEntity studentEntity);

    Iterable<StudentEntity> getStudents();

    void editStudent(Long id, StudentEntity studentEntity);

    void deleteStudent(Long id);

}
