package ru.digitalleague.exam.api;


import ru.digitalleague.exam.model.TeacherEntity;

public interface TeacherService {

    TeacherEntity findTeacherById(Long id);

    void addTeacher(TeacherEntity teacherEntity);

    Iterable<TeacherEntity> getTeachers();

    void editTeacher(Long id, TeacherEntity teacherEntity);

    void deleteTeacher(Long id);
}
