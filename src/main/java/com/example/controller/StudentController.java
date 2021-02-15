package com.example.controller;
import com.example.Beans.ResponseDetails;
import com.example.Beans.Student;
import com.example.Service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;


@RestController
@RequestMapping("/Student")
public class StudentController {

    @Autowired
    private StudentService studentService;




    @RequestMapping(value="/save",method = RequestMethod.POST,consumes = "application/json")
    private void saveStudent(@RequestBody Student student)
    {
        studentService.saveStudent(student);
    }

    @RequestMapping(value = "/show",method = RequestMethod.GET, produces = "application/json")
    private ResponseDetails showStudents()
    {
        return studentService.showStudents();

    }


    @RequestMapping(value = "/get/{roll}",method = RequestMethod.GET,produces = "application/json")
    private ResponseDetails getStudent(@PathVariable String roll)
    {
        return studentService.getStudent(roll);

    }


    @RequestMapping(value = "/saveMany",method = RequestMethod.POST,consumes = "application/json")
    private ResponseDetails saveStudents(@RequestBody ArrayList<Student> students)
    {
        return studentService.saveStudents(students);

    }

    @RequestMapping(value = "/count",method = RequestMethod.GET,produces = "application/json")
    private ResponseDetails countStudents()
    {
        return studentService.countStudent();
    }



}
