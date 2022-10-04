package com.cg.service;

import com.cg.dao.PlacementDao;
import com.cg.dao.PlacementDaoImpl;
import com.cg.entities.Placement;

public class PlacementServiceImpl implements PlacementService
{
private PlacementDao dao;
	
public PlacementServiceImpl() {
	super();
	dao=new PlacementDaoImpl();
}

	@Override
	public Placement addPlacement(Placement placement) {
		dao.beginTransaction();
		dao.addPlacement(placement);
		dao.commitTransaction();
		return placement;
	}

	@Override
	public Placement updatePlacement(Placement placement) {
		dao.beginTransaction();
		dao.updatePlacement(placement);
		dao.commitTransaction();
		return placement;
	}

	@Override
	public Placement searchPlacement(long id) {
		Placement placement=dao.searchPlacement(id);
		return placement;
	}

	@Override
	public boolean cancelPlacement(long id) {
		dao.beginTransaction();
		boolean res=dao.cancelPlacement(id);
		dao.commitTransaction();
		return res;
	}
	
}
