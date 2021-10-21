package ru.digitalleague.exam.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import ru.digitalleague.exam.api.TeacherService;
import ru.digitalleague.exam.model.TeacherEntity;

@RestController
public class TeacherController {
    @Autowired
    private TeacherService teacherService;


    @GetMapping("/findTeacher/{id}")
    public TeacherEntity findById(@PathVariable long id) {
        return teacherService.findTeacherById(id);
    }


    @PostMapping("/addTeacher")
    public void addTeacher(@RequestBody TeacherEntity teacherEntity) {
        teacherService.addTeacher(teacherEntity);
    }

    @GetMapping("/getTeacher")
    public Iterable<TeacherEntity> getTeacher() {
        return teacherService.getTeachers();
    }

    @PostMapping("/editTeacher/{id}")
    public void editTeacher(@PathVariable long id, @RequestBody TeacherEntity teacherEntity) {
        teacherService.editTeacher(id, teacherEntity);
    }


    @PostMapping("/deleteTeacher/{id}")
    public void deleteTeacher(@PathVariable long id) {
        teacherService.deleteTeacher(id);
    }
}
