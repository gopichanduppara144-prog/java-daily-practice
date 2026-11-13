package com.mawa.firstapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/students")
public class StudentController {

    @Autowired
    private StudentRepository repo;

    // GET ALL
    @GetMapping
    public List<Student> getAllStudents() {
        return repo.findAll();
    }

    // GET BY ID
    @GetMapping("/{id}")
    public Student getStudentById(@PathVariable Long id) {
        return repo.findById(id).orElseThrow();
    }

    // POST - CREATE
    @PostMapping
    public Student createStudent(@RequestBody Student student) {
        return repo.save(student);
    }

    // PUT - UPDATE
    @PutMapping("/{id}")
    public Student updateStudent(@PathVariable Long id, @RequestBody Student newData) {
        Student oldStudent = repo.findById(id).orElseThrow();
        oldStudent.setName(newData.getName());
        oldStudent.setAge(newData.getAge());
        oldStudent.setCourse(newData.getCourse());
        return repo.save(oldStudent);
    }

    // DELETE
    @DeleteMapping("/{id}")
    public String deleteStudent(@PathVariable Long id) {
        repo.deleteById(id);
        return "Student Deleted Mawa! ID: " + id;
    }
}