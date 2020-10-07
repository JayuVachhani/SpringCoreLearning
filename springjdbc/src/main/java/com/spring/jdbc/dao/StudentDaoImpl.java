package com.spring.jdbc.dao;

import java.util.List;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import com.spring.jdbc.entities.Student;

public class StudentDaoImpl implements StudentDao {
	
//	JdbcTemplate provides features for database query execution
//	we don't need to open and close connection after execution
//	it manages database automatic
	private JdbcTemplate jdbctemplate;
	
	public int insert(Student student) {
		String query = "insert into Student (sid,name,city) values(?,?,?)";
//		using update method of JdbcTemplate we can fire the query to the database
		int result = this.jdbctemplate.update(query,student.getSid(),student.getName(),student.getCity());
		return result;
	}
	public int update(Student student) {
		String query="update Student set name=?, city=? where sid=? ";
		int result = this.jdbctemplate.update(query,student.getName(),student.getCity(),student.getSid());
		return result;
	}
	public int delete(Student student) {
		String query = "delete from student where sid=? ";
		int result = this.jdbctemplate.update(query,student.getSid());
		return result;
	}
	
	public Student getStudent(int studentId) {
		String query = "select * from Student where sid=? ";
		RowMapper<Student> rowMapper= new rowMapperImpl();
		Student result = this.jdbctemplate.queryForObject(query, rowMapper,studentId);
		return result;
	}

	public List<Student> getAllStudents() {
		String query="select * from Student";
		List<Student> result = this.jdbctemplate.query(query, new rowMapperImpl());
		return result;
	}
	public JdbcTemplate getJdbctemplate() {
		return jdbctemplate;
	}

	public void setJdbctemplate(JdbcTemplate jdbctemplate) {
		this.jdbctemplate = jdbctemplate;
	}
	
	
	

	
	

}
