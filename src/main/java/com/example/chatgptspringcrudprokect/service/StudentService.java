package com.example.chatgptspringcrudprokect.service;

import com.example.chatgptspringcrudprokect.entity.Student;

import java.util.List;

public interface StudentService {
    List<Student> findAll();
    Student findById(Long id);
    Student save(Student student);
    void deleteById(Long id);
}

