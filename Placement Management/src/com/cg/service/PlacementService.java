package com.cg.service;

import com.cg.entities.Placement;

public interface PlacementService 
{
	Placement addPlacement(Placement placement);
	Placement updatePlacement(Placement placement);
	Placement searchPlacement(long id);
	boolean   cancelPlacement(long id);
}
