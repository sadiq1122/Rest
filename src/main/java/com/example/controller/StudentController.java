package com.example.controller;
import com.example.Beans.ResponseDetails;
import com.example.Beans.Student;
import com.example.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;




    @RequestMapping(value="/saveStudent",method = RequestMethod.POST)
    private void saveStudent(@RequestBody Student student)
    {
        studentService.saveStudent(student);
    }

    @RequestMapping(value = "/showStudents",method = RequestMethod.GET)
    private ResponseDetails showStudents()
    {
        return studentService.showStudents();

    }


    @RequestMapping(value = "/getStudent/{roll}",method = RequestMethod.GET)
    private ResponseDetails getStudent(@PathVariable String roll)
    {
        return studentService.getStudent(roll);

    }


    @RequestMapping(value = "/saveStudents",method = RequestMethod.POST)
    private ResponseDetails saveStudents(@RequestBody ArrayList<Student> students)
    {
        return studentService.saveStudents(students);

    }

    @RequestMapping(value = "/countStudents",method = RequestMethod.GET)
    private ResponseDetails countStudents()
    {
        return studentService.countStudent();
    }



}
