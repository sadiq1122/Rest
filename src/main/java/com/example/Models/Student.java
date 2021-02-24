package com.example.Models;

public class Student {
    private String name;
    private String roll;
    private String courses;


    public static class StudentBuilder{

        private String name;
        private String roll;
        private String courses;



        public StudentBuilder(String roll)
        {
            this.roll = roll;
        }

        public StudentBuilder withName(String name)
        {
            this.name=name;
            return this;
        }

        public StudentBuilder withCourses(String courses)
        {
            this.courses=courses;
            return this;
        }


        public Student build()
        {
            Student student = new Student();
            student.roll=this.roll;
            student.name=this.name;
            student.courses=this.courses;
            return student;
        }

    }




    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getRoll() {
        return roll;
    }

    public void setRoll(String roll) {
        this.roll = roll;
    }

    public String getCourses() {
        return courses;
    }

    public void setCourses(String courses) {
        this.courses = courses;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", roll='" + roll + '\'' +
                ", courses='" + courses + '\'' +
                '}';
    }
}
