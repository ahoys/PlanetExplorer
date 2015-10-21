package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {
	
	@Test
	public void testReturningPlanetSizeX(){
		// Return the x-size limit as a int value.
		PlanetExplorer planet = new PlanetExplorer(100,100,null);
		assertEquals(100,planet.getPlanetX());
	}
	
	@Test
	public void testReturningPlanetSizeY(){
		// Return the y-size limit as a int value.
		PlanetExplorer planet = new PlanetExplorer(100,100,null);
		assertEquals(100,planet.getPlanetY());
	}
	
	@Test
	public void testInitialStatusRequest() {
		// Test returning the location and heading of the explorer.
		PlanetExplorer planet = new PlanetExplorer(100,100,null);
		assertEquals("(0,0,N)",planet.executeCommand(""));
	}
	
	@Test
	public void testReturningNewExplorerXlocation() {
		// Test returning the location and heading of the explorer.
		PlanetExplorer planet = new PlanetExplorer(100,100,null);
		planet.setLocationX(1);
		assertEquals(1,planet.getLocationX());
	}
	
	@Test
	public void testReturningNewExplorerYlocation() {
		// Test returning the location and heading of the explorer.
		PlanetExplorer planet = new PlanetExplorer(100,100,null);
		planet.setLocationY(0);
		assertEquals(0,planet.getLocationX());
	}
	
}
