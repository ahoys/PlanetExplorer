package org.unioulu.tol.sqat2015.planetExplorer.tests;
package org.unioulu.tol.sqat2015.planetExplorer;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestPlanetExplorer {
	
	public static String validJourney = "ffrflb";
	public static String invalidJourney = "fgblfr";
	public static String validObstacle = "(0,1)(4,4)";
	public static String invalidObastacle = "(0,a)(0,10)";
	
	@Test
	public void testInitialStatusRequest() {
		PlanetExplorer explorerCommand = new PlanetExplorer();
		assertEquals("(0,0,N)",explorerCommand(""));
	}
}
