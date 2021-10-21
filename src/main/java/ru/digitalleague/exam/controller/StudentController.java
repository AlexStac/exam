package ru.digitalleague.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.digitalleague.exam.api.StudentService;
import ru.digitalleague.exam.model.StudentEntity;

@RestController
public class StudentController {
    @Autowired
    private StudentService studentService;


    @GetMapping("/findStudent/{id}")
    public StudentEntity findById(@PathVariable long id) {
        return studentService.findStudentById(id);
    }


    @PostMapping("/addStudent")
    public void addStudent(@RequestBody StudentEntity studentEntity) {
        studentService.addStudent(studentEntity);
    }

    @GetMapping("/getStudent")
    public Iterable<StudentEntity> getStudent() {
        return studentService.getStudents();
    }

    @PostMapping("/editStudent/{id}")
    public void editStudent(@PathVariable long id, @RequestBody StudentEntity studentEntity) {
        studentService.editStudent(id, studentEntity);
    }


    @PostMapping("/deleteStudent/{id}")
    public void deleteStudent(@PathVariable long id) {
        studentService.deleteStudent(id);
    }
}
