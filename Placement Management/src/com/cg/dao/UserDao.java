package com.cg.dao;

import com.cg.entities.User;

public interface UserDao {
	User addNewUser(User user); //add
	User updatedUser(User user); // update
	User deleteUser(long id) ; //delete 
	
	public void beginTransaction();//begin the operation of Entity Manager
	 public void commitTransaction();// close an entity manager

}