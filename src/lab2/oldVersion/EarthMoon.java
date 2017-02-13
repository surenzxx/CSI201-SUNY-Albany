/**
 * CSI 201 Lab Assignment 1: EarthMoon.java – Solar System
 * @author Surendra Persaud NETID: SP155681
 * @dateAssigned 10/18/16
 * @collaborators Khoa, Abeer, Mitchell
 * 
 */

package lab2.oldVersion;

import edu.princeton.cs.introcs.StdDraw;

public class EarthMoon {

	//Static variables for the window size
	public static int WINDOW_WIDTH = 200;
	public static int WINDOW_HEIGHT = 200;

	//Static variables for constants
	public static double SPRING_CONSTANT = 1.0;
	public static double PIXEL_PER_METER = 5.0;

	//Static variables for the post values
	public static int POSTX = 20;
	public static int POSTY = 20;
	
	//Static variables for the framerate and timestep
	public static int FRAMERATE = 50;
	public static double TIMESTEP = 1.0 / FRAMERATE;

	//Main method that creates a moon, earth, and system object which contains the Earth & the Moon and simulates the interaction between them
	public static void main(String[] args) {

		double x = 25 , y = 10;
		double v_x = 10, v_y = 10.0;

		StdDraw.setXscale(0, WINDOW_WIDTH);
		StdDraw.setYscale(0, WINDOW_HEIGHT);

		SolSystem sunMoon = new SolSystem(x, y, v_x, v_y, 5, 180, 180, 180, 0.5);

		while (true) {

			sunMoon.draw();

			sunMoon.update(SPRING_CONSTANT, TIMESTEP);


		}

	}

}
