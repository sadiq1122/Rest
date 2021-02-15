package com.example.Beans;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ResponseDetails {
    private String message="success";
    private int status=200;


    private Student student;

    @JsonProperty("list")
    private ArrayList<Student> studentList;

    public String getMessage() {
        return message;
    }

    public int getStatus() {
        return status;
    }

    public Student getStudent() {
        return student;
    }

    public ArrayList<Student> getStudentList() {
        return studentList;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public void setStatus(int status) {
        this.status = status;
    }

    public void setStudent(Student student) {
        this.student = student;
    }

    public void setStudentList(ArrayList<Student> studentList) {
        this.studentList = studentList;
    }

    @Override
    public String toString() {
        return "ResponseDetails{" +
                "message='" + message + '\'' +
                ", status=" + status +
                ", student=" + student +
                ", studentList=" + studentList +
                '}';
    }
}
