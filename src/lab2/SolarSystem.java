/**
 * CSI 201 Lab 2: SolarSystem.java – Gravity Simulator
 * @author Surendra Persaud NETID: SP155681
 * @dateAssigned 10/18/16
 * @collaborators Khoa, Daryl, Robinson
 * 
 */

package lab2;

import java.util.ArrayList;
import edu.princeton.cs.introcs.StdDraw;

public class SolarSystem {

	//Static variables for window size and gravitational constants
	public static int WINDOW_MIN = 0;
	public static int WINDOW_WIDTH = 512;
	public static int WINDOW_HEIGHT = 512;
	
	public static double AU = 1.49598e11;	//one astronomical unit
	public static double EM = 5.9736e24;	//one earth mass

	//Main method which creates the Solar System with 4 planets orbiting around the sun
	public static void main(String[] args) {
		
		//Creates scale for window
		StdDraw.setXscale(WINDOW_MIN, WINDOW_WIDTH);
		StdDraw.setYscale(WINDOW_MIN, WINDOW_HEIGHT);
		
		//Variables for earth mass and astronomical unit
		double au = AU;		
		double earthMass = EM; 	

		//Set the values to simulate the solar system
		double pixelPerMeter = 1 / 1e9;
		double timestep = 1e5 / 3;

		//Create the first five bodies of the solar system
		double x = WINDOW_WIDTH / 2 / pixelPerMeter;
		double y = WINDOW_HEIGHT / 2 / pixelPerMeter;
		
		//Each object's mass is multiplied by their difference relative to the Earth
		//Was helped by Khoa and TAs for this logic
		Body sun = new Body(earthMass * 332951.6539, x, y, 0, 0, 27, 255, 253, 56);
		Body mercury = new Body(earthMass * 0.055, x + au * 0.3871, y, 0, 48210, 3, 145, 144, 151);
		Body venus = new Body(earthMass * 0.81, x + au * 0.7233, y, 0, 35220, 7, 215, 149, 68);
		Body earth = new Body(earthMass, x + au, y, 0, 30000, 9, 57, 118, 40);
		Body mars = new Body(earthMass * 0.108, x + au * 1.524, y, 0, 24060, 5, 217, 106, 49);

		//Constructs the solar system within the ArrayList
		ArrayList<Body> planets = new ArrayList<Body>();
		planets.add(sun);
		planets.add(mercury);
		planets.add(venus);
		planets.add(earth);
		planets.add(mars);

		//Creates the arrayList 'solarSystem' with the values from the arrayList 'planets'
		System solarSystem = new System(planets);

		//Draws the solar system
		while (true) {
			solarSystem.draw(pixelPerMeter);
			solarSystem.update(timestep);
		}

	}

}
