package com.mycompany.springcore.jdbc.dao;

import java.util.List;

import com.mycompany.springcore.jdbc.entities.Student;

public interface StudentDao {
	public int insert(Student student);
	public int change(Student student);
	public int delete(int studentId);
	public Student getStudent(int stduntId);
	public List<Student> getAllStudents();
}
