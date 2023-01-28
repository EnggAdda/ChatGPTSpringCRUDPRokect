package com.example.chatgptspringcrudprokect.controller;

import java.util.List;

import com.example.chatgptspringcrudprokect.entity.Student;
import com.example.chatgptspringcrudprokect.service.StudentService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/students")
public class StudentController {

    private final StudentService studentService;

    public StudentController(StudentService studentService) {
        this.studentService = studentService;
    }

    @GetMapping
    public List<Student> findAll() {
        return studentService.findAll();
    }

    @GetMapping("/{id}")
    public Student findById(@PathVariable Long id) {
        return studentService.findById(id);
    }

    @PostMapping
    public Student create(@RequestBody Student student) {
        return studentService.save(student);
    }

    @PutMapping("/{id}")
    public Student update(@PathVariable Long id, @RequestBody Student student) {
        student.setId(id);
        return studentService.save(student);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        studentService.deleteById(id);
    }
}

