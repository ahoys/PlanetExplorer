package org.unioulu.tol.sqat2015.planetExplorer;

// Before submitting write your ID and finish time here. Your ID is written on project description sheets.
// ID: 104
// Finish time: 16.27
public class PlanetExplorer {
	
	public static int 		planet_x_max = 0;			// Width of the planet in grid units.
	public static int 		planet_y_max = 0;			// Height of the planet in grid units.
	public static int 		location_x = 0;				// Explorer's location on the grid in horizontal axis.
	public static int 		location_y = 0;				// Explorer's location on the grid in vertical axis.
	public static String 	heading = "N";				// Explorer's heading in bearings N S W E.
	public static String[] 	obstacles = {};				// List of obstacles on the grid.
	
	public PlanetExplorer(int x, int y, String obstacles){
	/*	x and y represent the size of the grid.
	 *  Obstacles is a String formatted as follows: "(obs1_x,obs1_y)(obs2_x,obs2_y)...(obsN_x,obsN_y)" with no white spaces. 
	 *  
		Example use:
		PlanetExplorer explorer = new PlanetExplorer(100,100,"(5,5)(7,8)")  //A 100x100 grid with two obstacles at coordinates (5,5) and (7,8) 
	 */
		this.setPlanetSize(x, y);	// Set size of the grid (planet).
	}
	
	public String executeCommand(String command){
		
		/* The command string is composed of "f" (forward), "b" (backward), "l" (left) and "r" (right)
		 * Example: 
		 * The explorer is on a 100x100 grid at location (0, 0) and facing NORTH. 
		 * The explorer is given the commands "ffrff" and should end up at (2, 2) facing East.
		 
		 * The return string is in the format: "(pos_x,pos_y,facing)(obs1_x,obs1_y)(obs2_x,obs2_y)..(obsN_x,obsN_y)" 
		 * Where pos_x and pos_y are the final coordinates, facing is the current direction the explorer is pointing to (N,S,W,E).
		 * The return string should also contain a list of coordinates of the encountered obstacles. No white spaces.
		 */
		
		String[] commandList = command.split("");
		
		for(int i = 0; i < commandList.length; i++) {
			String thisCommand = commandList[i];
			
			// Empty request returns the current status of the Explorer.
			if (thisCommand == null || thisCommand.isEmpty()) {
				return getExplorerState();
			}
			
			// Moving
			switch (thisCommand) {
			case "f":
				break;
			case "b":
				break;
			case "l":
				break;
			case "r":
				break;
			}
			
		}
		
		return null;
	}
	
	public String getExplorerState() {
		// Format components of the output message
		String explorerX = String.valueOf(location_x);
		String explorerY = String.valueOf(location_y);
		String explorerH = heading;
		String output = "(" + explorerX + "," + explorerY + "," + explorerH + ")";
		return output;
	}
	
	public int getPlanetSizeX() {
		return planet_x_max;
	}
	
	public int getPlanetSizeY() {
		return planet_y_max;
	}
	
	public void setPlanetSize(int x, int y) {
		planet_x_max = x;
		planet_y_max = y;
	}
	
	public void setLocationX(int x) {
		location_x = x;
	}
	
	public void setLocationY(int y) {
		location_y = y;
	}
	
	public int getLocationX() {
		return location_x;
	}
	
	public int getLocationY() {
		return location_y;
	}
	
	public void setHeading(String h) {
		heading = h;
	}
	
	public void moveForward() {
		switch (heading) {
		case "N":
			location_y = location_y + 1;
			break;
		case "S":
			location_y = location_y - 1;
			break;
		case "W":
			location_x = location_x - 1;
			break;
		case "E":
			location_x = location_x + 1;
			break;
		}
	}
	
	public void turnRight() {
		switch (heading) {
		case "N":
			heading = "E";
			break;
		case "S":
			heading = "W";
			break;
		case "W":
			heading = "N";
			break;
		case "E":
			heading = "S";
			break;
		}
	}
	
	public void turnLeft() {
		switch (heading) {
		case "N":
			heading = "W";
			break;
		case "S":
			heading = "E";
			break;
		case "W":
			heading = "S";
			break;
		case "E":
			heading = "N";
			break;
		}
	}
	
}
