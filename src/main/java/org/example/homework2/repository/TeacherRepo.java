package org.example.homework2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.homework2.entity.Teacher;

public interface TeacherRepo extends JpaRepository<Teacher, Integer> {
}
