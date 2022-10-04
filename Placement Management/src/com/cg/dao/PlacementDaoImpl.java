package com.cg.dao;

import javax.persistence.EntityManager;

import com.cg.entities.Placement;

public abstract class PlacementDaoImpl implements PlacementDao
{
	private EntityManager em;
	
	

	public PlacementDaoImpl() {
		em=JPAUtil.getEntityManager();
		
	}

	@Override
	public Placement addPlacement(Placement placement) {
		em.persist(placement);
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		em.merge(placement);
		return placement;
	}

	@Override
	
public boolean canclePlacement(long id) {
		em.remove(id);
		return false;
	}
}
