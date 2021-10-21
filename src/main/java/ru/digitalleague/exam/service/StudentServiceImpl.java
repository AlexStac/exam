package ru.digitalleague.exam.service;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.digitalleague.exam.api.StudentService;
import ru.digitalleague.exam.model.StudentEntity;
import ru.digitalleague.exam.repository.StudentRepository;

@Service
@Slf4j
public class StudentServiceImpl implements StudentService {

    @Autowired
    StudentRepository studentRepository;

    @Override
    public StudentEntity findStudentById(Long id) {
        return studentRepository.findById(id).get();
    }

    @Override
    public void addStudent(StudentEntity studentEntity) {
        studentRepository.save(studentEntity);
    }

    @Override
    public Iterable<StudentEntity> getStudents() {
        return studentRepository.findAll();
    }

    @Override
    public void editStudent(Long id, StudentEntity studentEntity) {
        if (!studentRepository.existsById(id)) {
            log.info("Student with id " + id + " not found");
        } else {
            StudentEntity studentById = studentRepository.findById(id).get();
            studentById.setFioStudent(studentEntity.getFioStudent());
            studentById.setSpecification(studentEntity.getSpecification());
            studentById.setCourse(studentEntity.getCourse());
            studentRepository.save(studentById);
        }
    }

    @Override
    public void deleteStudent(Long id) {
        StudentEntity delStudent = studentRepository.findById(id).get();
        studentRepository.delete(delStudent);
    }
}
