package com.example.DAO;
import com.example.Beans.ResponseDetails;
import com.example.Beans.Student;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class StudentDAO {
   Logger log  =  LoggerFactory.getLogger(StudentDAO.class);


    @Autowired
    private JdbcTemplate jdbcTemplate;

    public void saveStudent(Student student)
    {
        //inserting a single student object
        String sql="insert into student values(?,?,?)";
        Object[] b ={student.getName(),student.getRoll(),student.getCourses()};
        log.info(String.valueOf(student));
        jdbcTemplate.update(sql, b);
    }


 public ResponseDetails saveStudents(ArrayList<Student> students)
 {   int studentAdded;
     ResponseDetails responseDetails =  new ResponseDetails();
     String sql ="insert into student values(?,?,?)";
     Object[] obj;

     //Inserting list of students through loop
     try {
         for (int i = 0; i < students.size(); i++) {
             obj = new Object[]{students.get(i).getName(), students.get(i).getRoll(), students.get(i).getCourses()};
             studentAdded = jdbcTemplate.update(sql, obj);
         }
         responseDetails.setMessage("Success , Student List inserted");
         responseDetails.setStudentList(students);
         return responseDetails;
     }
     catch (Exception e)
     {
         responseDetails.setMessage("Error : Studentlist not inserted "+e);
         responseDetails.setStatus(500);
         return responseDetails;
     }
 }


    public ResponseDetails showStudents()
    {   log.info("hello");
        ResponseDetails responseDetails = new ResponseDetails();

        try {

            String sql = "select * from student";
            //Using RowMapper for mapping rows received from Database into list of students
            List<Student> students = jdbcTemplate.query(sql, new mapRows());
            responseDetails.setStudentList((ArrayList<Student>) students);

            return responseDetails;
        }
        catch (Exception e)
        {
            responseDetails.setMessage("Error Occurred " + e);
            responseDetails.setStatus(500);
            return responseDetails;

        }

    }


    public ResponseDetails getStudent(String roll) {
        ResponseDetails responseDetails = new ResponseDetails();
        String sql="select * from student where roll=?";
        Object[] obj={roll};
        try
        {
            Student student = jdbcTemplate.queryForObject(sql,obj,new mapRows());
            responseDetails.setStudent(student);
            return responseDetails;

        }
        catch (Exception e)
        {
            responseDetails.setMessage("Error Occured");
            responseDetails.setStatus(500);
            return responseDetails;
        }

    }

    public ResponseDetails countStudent() {

        ResponseDetails responseDetails =  new ResponseDetails();
        String sql="select count(*) from student";
        int count=0;
        try{

            count = jdbcTemplate.queryForObject(sql,Integer.class);
            responseDetails.setMessage("Total Students enrolled "+count);
            return responseDetails;

        }
        catch (Exception e)
        {
            responseDetails.setMessage("Error Occured "+e);
            responseDetails.setStatus(500);
            return responseDetails;
        }
    }
}
