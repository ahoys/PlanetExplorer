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
	public void testMoveForward() {
		PlanetExplorer planet = new PlanetExplorer(100,100,null);
		assertEquals("(0,0,N)",planet.executeCommand("f"));
	}
	
	@Test
	public void testMoveBackward() {
		PlanetExplorer planet = new PlanetExplorer(100,100,null);
		assertEquals("(0,99,N)",planet.executeCommand("b"));
	}
	
	@Test
	public void testTurnRight() {
		PlanetExplorer planet = new PlanetExplorer(100,100,null);
		assertEquals("(1,1,N)",planet.executeCommand("r"));
	}
	
	@Test
	public void testTurnLeft() {
		PlanetExplorer planet = new PlanetExplorer(100,100,null);
		assertEquals("(1,1,W)",planet.executeCommand("l"));
	}
	
	@Test
	public void testRoute() {
		PlanetExplorer planet = new PlanetExplorer(100,100,null);
		assertEquals("(1,1,W)",planet.executeCommand("ffrflbl"));
	}
	
	// Aaaand End of time...
	
}
