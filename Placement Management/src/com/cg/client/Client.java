package com.cg.client;

import java.time.LocalDate;

import com.cg.entities.Admin;
import com.cg.entities.Certificate;
import com.cg.entities.College;
import com.cg.entities.Placement;
import com.cg.entities.Student;
import com.cg.entities.User;
import com.cg.service.AdminService;
import com.cg.service.AdminServiceImpl;
import com.cg.service.PlacementService;
import com.cg.service.PlacementServiceImpl;
import com.cg.service.StudentService;
import com.cg.service.StudentServiceImpl;

public class Client 
{
	public static void main(String[] args) 
	{
		
		Student s=new Student();
		StudentService service=new StudentServiceImpl();
        
		s.setId(11);
		s.setRollno(101);
		s.setQualification("BE");
		s.setCourse("IT");
		s.setYear(2021);
		s.setHallticketno(10101);
		
		Certificate c=new Certificate();
		c.setId(354);
		c.setYear(2021);
		
		//OneToOne bidirectional
		s.setCertificate(c);
		//c.setStudent(s);

		//College input 
		College C=new College();
		C.setCollege_id(40044);
		C.setCollegeName("Vogce");
		C.setLocation("Aghai");
		
		//Placement input
		Placement p=new Placement();
		PlacementService placement =new PlacementServiceImpl();
		p.setId(1515);
		p.setName("TNS Foundation");
		p.setQualification("BE");
		p.setYear(2022);
		p.setCollege(C);
		LocalDate date=LocalDate.now();
		p.setDate(date);
		placement.addPlacement(p);
		
		//for placement table
		System.out.println("Placement Id is: "+p.getId());
		System.out.println("Placement Date is: "+p.getDate());
		System.out.println("Placement Qualification is: "+p.getQualification());
		System.out.println("Placement Year is: "+p.getYear());
		System.out.println("Placement Name is: "+p.getName());
		System.out.println("Placement College is: "+p.getCollege());
		
		//For User
		User u=new User();
		u.setId(1010);
		u.setName("Sara");
		u.setPassword("14525");
		u.setType("new User");
		
		//Admin input 
		Admin a=new Admin();
		AdminService ad=new AdminServiceImpl();
		a.setId(4585);
		a.setName("Purva");
		a.setPassword("45345");
				
	
				
		//Adding data
		ad.addNewAdmin(a);
		
		//for User table
	    System.out.println("User ID is : " +u.getId());
		System.out.println("User Name is: "+u.getName());
		System.out.println("User Type is : "+u.getType());
		System.out.println("User Password is : "+u.getPassword());
		
		
		//Displaying output for admin table
		System.out.println("Admin ID is : " +a.getId());
		System.out.println("Admin Name is: "+a.getName());
		System.out.println("Admin Password is : "+a.getPassword());
		
		//adding data
		service.addStudent(s);
		service.searchStudentById(11);
		
		
		
		
}
}
