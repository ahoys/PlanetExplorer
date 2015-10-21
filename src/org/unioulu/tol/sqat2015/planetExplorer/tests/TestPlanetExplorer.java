package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {
	
	@Test
	public void testReturningPlanetSizeX(){
		// Return the x-size limit as a int value.
		PlanetExplorer planet1 = new PlanetExplorer(100,100,null);
		assertEquals(100,planet1.getPlanetX());
	}
	
	@Test
	public void testReturningPlanetSizeY(){
		// Return the y-size limit as a int value.
		PlanetExplorer planet2 = new PlanetExplorer(100,100,null);
		assertEquals(100,planet2.getPlanetY());
	}
	
	@Test
	public void testInitialStatusRequest() {
		// Test returning the location and heading of the explorer.
		PlanetExplorer planet3 = new PlanetExplorer(100,100,null);
		assertEquals("(0,0,N)",planet3.executeCommand(""));
	}
	
	@Test
	public void testReturningNewExplorerXlocation() {
		// Test returning the location and heading of the explorer.
		PlanetExplorer planet4 = new PlanetExplorer(100,100,null);
		planet4.setLocationX(1);
		assertEquals(1,planet4.getLocationX());
	}
	
	@Test
	public void testReturningNewExplorerYlocation() {
		// Test returning the location and heading of the explorer.
		PlanetExplorer planet5 = new PlanetExplorer(100,100,null);
		planet5.setLocationY(2);
		assertEquals(2,planet5.getLocationY());
	}
	
}
