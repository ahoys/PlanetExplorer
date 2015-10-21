package org.unioulu.tol.sqat2015.planetExplorer.tests;

import static org.junit.Assert.*;

import org.junit.Test;
import org.unioulu.tol.sqat2015.planetExplorer.PlanetExplorer;

public class TestPlanetExplorer {
	
	@Test
	public void testInitialStatusRequest() {
		// Test returning the location and heading of the explorer.
		PlanetExplorer command = new PlanetExplorer(100, 100, null);
		assertEquals("(0,0,N)",command.executeCommand(""));
	}
}
