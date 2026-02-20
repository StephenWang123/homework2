package org.example.homework2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.homework2.entity.Student;

public interface StudentRepo extends JpaRepository<Student, Integer> {
}
