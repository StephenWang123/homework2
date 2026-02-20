package org.example.homework2.controller;

import org.springframework.web.bind.annotation.*;
import java.util.*;
import org.example.homework2.entity.*;
import org.example.homework2.repository.*;

@RestController
@RequestMapping("/students")
public class StudentController{

    private StudentRepo studentRepo;
    private TeacherRepo teacherRepo;
    private StudentTeacherRepo studentTeacherRepo;

    public StudentController(StudentRepo studentRepo, TeacherRepo teacherRepo, StudentTeacherRepo studentTeacherRepo) {
        this.studentRepo = studentRepo;
        this.teacherRepo = teacherRepo;
        this.studentTeacherRepo = studentTeacherRepo;
    }

    @PostMapping
    public Student create(@RequestBody Student student) {
        return studentRepo.save(student);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Integer id) {
        studentRepo.deleteById(id);
    }

    @GetMapping("/{id}")
    public Student get(@PathVariable Integer id) {
        return studentRepo.findById(id).orElse(null);
    }

    @GetMapping
    public List<Student> getAll() {
        return studentRepo.findAll();
    }


    @PutMapping("/{id}")
    public Student update(@PathVariable Integer id, @RequestBody Student newStudent) {

        Student oldStudent = studentRepo.findById(id).orElse(null);

        if (oldStudent == null)
            return null;

        oldStudent.setName(newStudent.getName());

        studentRepo.save(oldStudent);

        return oldStudent;
    }


    @GetMapping("/{id}/teachers")
    public List<Teacher> getTeachers(@PathVariable Integer id) {

        List<Teacher> result = new ArrayList<>();
        List<StudentTeacher> list = studentTeacherRepo.findByStudentId(id);

        for (StudentTeacher st : list) {
            Teacher t = teacherRepo.findById(st.getTeacherId()).orElse(null);

            if (t != null)
                result.add(t);
        }

        return result;
    }
}
