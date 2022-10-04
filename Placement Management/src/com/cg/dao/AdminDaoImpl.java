package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entities.Admin;

public class AdminDaoImpl implements AdminDao
{

	//for JPA LifeCycle
		private EntityManager em;
		
			//use Constructor
			public AdminDaoImpl() 
			{
			em=JPAUtil.getEntityManager();
			}

		@Override
		public Admin addNewAdmin(Admin admin) {
			em.persist(admin);
			return admin;
		}


		@Override
		public Admin updateAdmin(Admin admin) {
			em.persist(admin);
			return admin;
		}


		@Override
		public Admin deleteAdmin(long id) {
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
