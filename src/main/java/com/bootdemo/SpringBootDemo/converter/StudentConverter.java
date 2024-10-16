package com.bootdemo.SpringBootDemo.converter;

import com.bootdemo.SpringBootDemo.dao.Student;
import com.bootdemo.SpringBootDemo.dto.StudentDTO;

public class StudentConverter {

    public static StudentDTO convertStudent(Student student) {
        StudentDTO studentDTO = new StudentDTO();
        studentDTO.setId(student.getId());
        studentDTO.setName(student.getName());
        studentDTO.setEmail(student.getEmail());
        return studentDTO;
    }

    public static Student convertStudent(StudentDTO studentDTO) {
        Student student = new Student();
        student.setName(studentDTO.getName());
        student.setEmail(studentDTO.getEmail());
        return student;
    }
}
