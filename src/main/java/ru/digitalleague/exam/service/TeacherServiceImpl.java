package ru.digitalleague.exam.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.digitalleague.exam.api.TeacherService;
import ru.digitalleague.exam.model.StudentEntity;
import ru.digitalleague.exam.model.TeacherEntity;
import ru.digitalleague.exam.repository.TeacherRepository;

@Service
@Slf4j
public class TeacherServiceImpl implements TeacherService {

    @Autowired
    TeacherRepository teacherRepository;

    @Override
    public TeacherEntity findTeacherById(Long id) {
        return teacherRepository.findById(id).get();
    }

    @Override
    public void addTeacher(TeacherEntity teacherEntity) {
        teacherRepository.save(teacherEntity);
    }

    @Override
    public Iterable<TeacherEntity> getTeachers() {
        return teacherRepository.findAll();
    }

    @Override
    public void editTeacher(Long id, TeacherEntity teacherEntity) {
        if (!teacherRepository.existsById(id)) {
            log.info("Teacher with id " + id + " not found");
        } else {
            TeacherEntity teacherById = teacherRepository.findById(id).get();
            teacherById.setFioTeacher(teacherEntity.getFioTeacher());
            teacherById.setDepartmentTeacher(teacherEntity.getDepartmentTeacher());
            teacherRepository.save(teacherById);
        }
    }

    @Override
    public void deleteTeacher(Long id) {
        TeacherEntity delTacher = teacherRepository.findById(id).get();
        teacherRepository.delete(delTacher);
    }
}
