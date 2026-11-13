package com.mawa.firstapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service // "Nenu Chef ni mawa! Nannu Bean ga cheyi!"
public class StudentService {

    @Autowired
    StudentRepository repo; // Store Room ni aduguthunnam!

    public Student save(Student s){
        return repo.save(s); // DB lo save cheyi!
    }
    public List<Student> getAll(){
        return repo.findAll(); // Anni theesuko ra!
    }
}