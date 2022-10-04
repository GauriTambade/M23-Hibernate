package com.cg.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;


@Entity
@Table(name="Certificate")
public class Certificate
{
  @Id
  @Column(name="Cert_Id")
  private int cert_id;
  
  @Column(name="Year")
  private int year;
  
  @OneToOne(mappedBy="Certificate")
  private Student student;
  
  
  //getters and setters method
public int getId() {
	return cert_id;
}
public void setId(int id) {
	this.cert_id = id;
}
public int getYear() {
	return year;
}
public void setYear(int year) {
	this.year = year;
}
  
 
  
}
