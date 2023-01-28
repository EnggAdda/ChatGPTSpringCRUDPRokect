package com.example.chatgptspringcrudprokect.repo;

import com.example.chatgptspringcrudprokect.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository<Student, Long> {
}

