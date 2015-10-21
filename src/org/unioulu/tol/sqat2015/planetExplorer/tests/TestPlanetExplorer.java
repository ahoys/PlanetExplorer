package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {
	
	@Test
	public void testReturningPlanetSizeX(){
		// Return the x-size limit as a int value.
		PlanetExplorer planet = new PlanetExplorer(100,100,null);
		assertEquals(100,planet.getPlanetSizeX());
	}
	
	@Test
	public void testReturningPlanetSizeY(){
		// Return the y-size limit as a int value.
		PlanetExplorer planet = new PlanetExplorer(100,100,null);
		assertEquals(100,planet.getPlanetSizeY());
	}
	
	@Test
	public void testReturningNewExplorerXlocation() {
		// Test setting a new X location for the Explorer.
		PlanetExplorer planet = new PlanetExplorer(100,100,null);
		planet.setLocationX(1);
		assertEquals(1,planet.getLocationX());
	}
	
	@Test
	public void testReturningNewExplorerYlocation() {
		// Test setting a new Y location for the Explorer.
		PlanetExplorer planet = new PlanetExplorer(100,100,null);
		planet.setLocationY(2);
		assertEquals(2,planet.getLocationY());
	}
	
	@Test
	public void testInitialStatusRequest() {
		// Test returning the location and heading of the explorer.
		PlanetExplorer planet = new PlanetExplorer(100,100,null);
		assertEquals("(1,0,N)",planet.executeCommand(""));
	}
	
	@Test
	public void testMoveForward() {
		PlanetExplorer planet = new PlanetExplorer(100,100,null);
		planet.moveForward();
		assertEquals("(0,1,N)",planet.executeCommand(""));
	}
	
	@Test
	public void testTurnRight() {
		PlanetExplorer planet = new PlanetExplorer(100,100,null);
		planet.turnRight();
		assertEquals("(1,1,E)",planet.executeCommand(""));
	}
	
	@Test
	public void testTurnLeft() {
		PlanetExplorer planet = new PlanetExplorer(100,100,null);
		planet.turnLeft();
		assertEquals("(1,1,N)",planet.executeCommand(""));
	}
	
}
