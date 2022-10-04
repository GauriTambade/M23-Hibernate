package com.cg.service;

import com.cg.dao.StudentDao;
import com.cg.dao.StudentDaoImpl;
import com.cg.entities.Student;

public class StudentServiceImpl implements StudentService
{
   public StudentDao dao;
	
	public StudentServiceImpl() {
		super(); 
		dao=new StudentDaoImpl();
	}

	@Override
	public Student addStudent(Student student) {
		dao.beginTransaction();
		dao.addStudent(student);
		dao.commitTransaction();
		return student;
	}

	@Override
	public Student updateStudent(Student student) {
		dao.beginTransaction();
		dao.updateStudent(student);
		dao.commitTransaction();
		return student;
	}

	@Override
	public boolean deleteStudent(int id) {
		dao.beginTransaction();
		@SuppressWarnings("unused")
		boolean res=dao.deleteStudent(id);
		dao.commitTransaction();
		return false;
	}

	@Override
	public Student searchStudentById(int id) {
		Student student=dao.searchStudentById(id);
		return student;
	}

	@Override
	public Student searchStudentByHallTicketno(int hallticketno) {
		Student student=dao.searchStudentByHallTicketno(hallticketno);
		return student;
	}

	

	
}
