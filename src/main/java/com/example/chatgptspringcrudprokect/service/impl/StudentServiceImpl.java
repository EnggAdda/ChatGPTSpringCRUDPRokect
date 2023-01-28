package com.example.chatgptspringcrudprokect.service.impl;

import java.util.List;

import com.example.chatgptspringcrudprokect.entity.Student;
import com.example.chatgptspringcrudprokect.repo.StudentRepository;
import com.example.chatgptspringcrudprokect.service.StudentService;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    private final StudentRepository studentRepository;

    public StudentServiceImpl(StudentRepository studentRepository) {
        this.studentRepository = studentRepository;
    }

    @Override
    public List<Student> findAll() {
        return studentRepository.findAll();
    }

    @Override
    public Student findById(Long id) {
        return studentRepository.findById(id).orElse(null);
    }

    @Override
    public Student save(Student student) {
        return studentRepository.save(student);
    }

    @Override
    public void deleteById(Long id) {
        studentRepository.deleteById(id);
    }
}

