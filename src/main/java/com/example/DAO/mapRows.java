package com.example.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;

import com.example.Models.Student;
import org.springframework.jdbc.core.RowMapper;


public class mapRows implements RowMapper<Student> {


	@Override
	public Student mapRow(ResultSet rs, int rowNum) throws SQLException {
		// TODO Auto-generated method stub
		Student student = new Student();
		student.setName((rs.getString("name")));
		student.setCourses(rs.getString("courses"));
		student.setRoll(rs.getString("roll"));
		

		return student;
	}

}
