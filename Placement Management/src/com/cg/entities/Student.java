package com.cg.entities;


import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="Student")
public class Student 
{
    @Id	
    
	private int id;   
	private int rollno;
	private String qualification;
    private String course;    
	private int year;
	private int hallticketno;
	
	@OneToOne(cascade=CascadeType.ALL)
	@JoinColumn(name="Cert_Id")	
	private Certificate certificate;

	//getters and setters method
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getRollno() {
		return rollno;
	}

	public void setRollno(int rollno) {
		this.rollno = rollno;
	}

	public String getQualification() {
		return qualification;
	}

	public void setQualification(String qualification) {
		this.qualification = qualification;
	}

	public String getCourse() {
		return course;
	}

	public void setCourse(String course) {
		this.course = course;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getHallticketno() {
		return hallticketno;
	}

	public void setHallticketno(int hallticketno) {
		this.hallticketno = hallticketno;
	}

	public Certificate getCertificate() {
		return certificate;
	}

	public void setCertificate(Certificate certificate) {
		this.certificate = certificate;
	}
	
}
