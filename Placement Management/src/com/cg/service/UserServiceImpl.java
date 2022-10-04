package com.cg.service;

import java.util.Scanner;

import com.cg.dao.UserDaoImpl;
import com.cg.entities.User;

public class UserServiceImpl implements UserService
{
	private UserDaoImpl ur;
	Scanner s = new Scanner(System.in);
			
	
	public UserServiceImpl () {
		ur = new UserDaoImpl();
			}

	@Override
	public User addNewUser(User user) {
		ur.beginTransaction();
		ur.addNewUser(user);
		ur.commitTransaction();
		return user;
	}

	@Override
	public User updateUser(User user) {
		ur.beginTransaction();
		ur.updatedUser(user);
		ur.commitTransaction();
		return user;
	}

	@Override
	public User login(User user) {
		System.out.println("Enter the username : ");
		String username = s.nextLine();
		System.out.println(" Enter the passowrd :");
		String password = s.nextLine();
		if(username == user.getName() && password == user.getPassword())
		{
			return user;
		}
		else
		{
			System.out.println("Invalid Username and Password");
			return null;
		}
		
	}

	@Override
	public boolean logOut() {
		System.exit(0);
		return true;
		
	}

}
