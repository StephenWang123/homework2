package org.example.homework2.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.example.homework2.entity.StudentTeacher;
import java.util.List;

public interface StudentTeacherRepo extends JpaRepository<StudentTeacher, Integer> {

    List<StudentTeacher> findByStudentId(Integer studentId);
}
