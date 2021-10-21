package ru.digitalleague.exam.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.digitalleague.exam.api.TeacherStudentService;
import ru.digitalleague.exam.model.StudentEntity;
import ru.digitalleague.exam.model.TeacherEntity;
import ru.digitalleague.exam.model.TeacherStudentEntity;
import ru.digitalleague.exam.repository.StudentRepository;
import ru.digitalleague.exam.repository.TeacherStudentRepository;

@Service
@Slf4j
public class TeacherStudentServiceImpl implements TeacherStudentService {

    @Autowired
    TeacherStudentRepository teacherStudentRepository;

    @Override
    public Iterable<StudentEntity> findStudentsByTeacher(Long id) {
        return null;
    }

    @Override
    public Iterable<TeacherEntity> findTeachersByStudent(Long id) {
        return null;
    }

    @Override
    public void addTeacherStudent(TeacherStudentEntity teacherStudentEntity) {
        teacherStudentRepository.save(teacherStudentEntity);
    }

    @Override
    public void deleteTeacherStudent(Long id) {
        TeacherStudentEntity delTeacherStud = teacherStudentRepository.findById(id).get();
        teacherStudentRepository.delete(delTeacherStud);
    }
}
