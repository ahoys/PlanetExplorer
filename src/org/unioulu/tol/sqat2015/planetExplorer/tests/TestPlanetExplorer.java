package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {
	
	public static String validJourney = "ffrflb";
	public static String invalidJourney = "fgblfr";
	public static String validObstacle = "(0,1)(4,4)";
	public static String invalidObastacle = "(0,a)(0,10)";
	
	@Test
	public void testInitialStatusRequest() {
		// Test returning the location of the explorer.
		PlanetExplorer command = new PlanetExplorer(100, 100, null);
		assertEquals("(0,0,N)",command.executeCommand(""));
	}
}
