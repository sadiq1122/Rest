package com.example.Service;

import com.example.Beans.ResponseDetails;
import com.example.Beans.Student;
import com.example.DAO.StudentDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class StudentService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Autowired
    private StudentDAO studentDAO;

    public void saveStudent(Student student)
    {

        studentDAO.saveStudent(student);
    }

    public ResponseDetails showStudents() {
        return studentDAO.showStudents();
    }

    public ResponseDetails getStudent(String roll) {
        return studentDAO.getStudent(roll);
    }

    public ResponseDetails saveStudents(ArrayList<Student> students)
    {
        return studentDAO.saveStudents(students);
    }


    public ResponseDetails countStudent() {
        return studentDAO.countStudent();
    }
}
