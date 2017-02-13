/**
 * CSI 201 Lab 2: EarthMoon.java – Gravity Simulator
 * @author Surendra Persaud NETID: SP155681
 * @dateAssigned 10/18/16
 * @collaborators Khoa, Daryl, Robinson
 * 
 */

package lab2;

import java.util.ArrayList;
import edu.princeton.cs.introcs.StdDraw;


public class EarthMoon {

	//Static variables for the window size
	public static int WINDOW_MIN = 0;
	public static int WINDOW_WIDTH = 512;
	public static int WINDOW_HEIGHT = 512;

	//Static variables which simulates the Earth-Moon system
	public static double PIXEL_PER_METER =  3 / 1e7;
	public static double TIMESTEP = 1e4 / 3;
	public static double AU = 1.49598e11;
	public static double EM = 5.9736e24;

	//Main method that creates a moon, earth, and system object which contains the Earth & the Moon and simulates their interaction
	public static void main(String[] args) {

		StdDraw.setXscale(WINDOW_MIN, WINDOW_WIDTH);
		StdDraw.setYscale(WINDOW_MIN, WINDOW_HEIGHT);
				
		//Variables for earth mass and astronomical unit, and pixelPerMeter
		double earthMass = EM;
		double au = AU; 
		double pixelPerMeter = 3 / 1e7;

		//Variables needed to create the Earth & the Moon, and creates both
		double x = System.WINDOW_WIDTH / 2 / pixelPerMeter;
		double y = System.WINDOW_HEIGHT / 2 / pixelPerMeter;
		
		//Creates new arrayLists 'earth' and 'moon'
		Body earth = new Body(earthMass, x, y, 0, 0, 21, 0, 255, 0);
		Body moon = new Body(earthMass* 0.0123 , x - au * 0.002569553, y, 0, 1022, 5, 225, 225, 225);

		//Constructs Earth-Moon system in a new arrayList
		ArrayList<Body> planets = new ArrayList<Body>();
		planets.add(earth);
		planets.add(moon);

		System earthMoon = new System(planets);

		//Simulation of the Earth-Moon system
		while (true) {

			earthMoon.draw(PIXEL_PER_METER);
			earthMoon.update(TIMESTEP);
		}

	}
}
