package com.cg.service;


import com.cg.dao.CollegeDao;
import com.cg.dao.CollegeDaoImpl;
import com.cg.entities.College;

public class CollegeServiceImpl implements CollegeService
{
public CollegeDao dao;
	
	public CollegeServiceImpl() {
		super(); 
		dao=new CollegeDaoImpl();
	}
	@Override
	public College addCollege(College college) {
		dao.beginTransaction();
		dao.addCollege(college);
		dao.commitTransaction();
		return college;
	}

	@Override
	public College updateCollege(College college) {
		dao.beginTransaction();
		dao.updateCollege(college);
		dao.commitTransaction();
		return college;
	}

	@Override
	public boolean deleteCollege(long id) {
		boolean college=dao.deleteCollege(id);
		return college;
	}

	@Override
	public College searchCollege(long id) {
		College college=dao.searchCollege(id);	
		return college;
		
	}

	
}
