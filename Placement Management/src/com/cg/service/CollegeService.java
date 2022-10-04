package com.cg.service;

import com.cg.entities.College;

public interface CollegeService
{
	College addCollege(College college);
	College updateCollege(College college);
	boolean deleteCollege(long id);
	College searchCollege(long id);
}
