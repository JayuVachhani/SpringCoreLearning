package com.jdbc.withoutxml.dao;

import java.util.List;

import com.spring.jdbc.entities.Student;

//Spring container start from here
public interface StudentDao {
	public int insert(Student student);
	public int update(Student student);
	public int delete(Student student);
	public Student getStudent(int studentId);
	public List<Student> getAllStudents();
}
