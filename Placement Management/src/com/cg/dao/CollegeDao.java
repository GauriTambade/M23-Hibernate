package com.cg.dao;

import com.cg.entities.College;

public interface CollegeDao 
{
	College addCollege(College college);
	College updateCollege(College college);
	College searchCollege(long id);
	boolean deleteCollege(long id);
	
	void beginTransaction() ;
	void commitTransaction();

}
