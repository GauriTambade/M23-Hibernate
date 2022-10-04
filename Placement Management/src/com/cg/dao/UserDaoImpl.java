package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entities.User;

public class UserDaoImpl implements UserDao
{

private EntityManager em;
	
	

	public UserDaoImpl() {
		super();
		em=JPAUtil.getEntityManager();
		
	}



	@Override
	public User addNewUser(User user) {
		em.persist(user);
		return null;
	}



	@Override
	public User updatedUser(User user) {
		em.merge(user);
		return user;
	}



	@Override
	public User deleteUser(long id) {
		em.remove(id);
		return null;
	}



	@Override
	public void beginTransaction() {
		em.getTransaction().begin();
		
	}



	@Override
	public void commitTransaction() {
		em.getTransaction().commit();
		
	}




	
}
