package org.example.homework2.entity;

import jakarta.persistence.*;

@Entity
public class StudentTeacher {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int studentId;

    private int teacherId;

    public StudentTeacher() {
    }

    public int getId() {
        return id;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }


    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }
}
