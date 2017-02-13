/**
 * CSI 201 Lab 2: System.java – Gravity Simulator
 * @author Surendra Persaud NETID: SP155681
 * @dateAssigned 10/18/16
 * @collaborators Khoa, Daryl, Robinson
 * 
 */

package lab2;

import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;
import java.util.ArrayList;

public class System{

	//Static variables for Window size 
	public static int WINDOW_WIDTH = 512;
	public static int WINDOW_HEIGHT = 512;


	//Static variables for the top of the window, bottom, the radius & mass
	public static int FLOOR_Y = 50;
	public static int CEILING_Y = WINDOW_HEIGHT - FLOOR_Y;
	public static int BALL_RADIUS = 10;
	public static double BALL_MASS = 0.2;

	//Static variables for physics constants
	public static double PIXEL_PER_METER = 5.0;
	public static double EARTH_GRAVITY_ACC = - 9.8;
	public static double SPRING_CONSTANT = 1.0;


	//Static variables for the frame rate
	public static int FRAME_RATE = 60;

	//Static variables for gravitational constants 
	public static double AU = 1.49598e11; 				//astronomical unit
	public static double EM = 5.9736e24;   				//one earth mass
	public static double TIMESTEP = 100000 / 30;

	ArrayList<Body> bodylist;

	//Constructor for the arrayList
	public System(ArrayList<Body> list) {

		bodylist = list;

	}

	//Method to draw the system objects using for loop for each planet in the ArrayList
	public void draw(double pixelsPerMeter) {
		StdDraw.clear(StdDraw.BLACK);

		for(Body planets: bodylist){
			planets.draw(pixelsPerMeter);
		}
		StdDraw.show(20);
	}

	//Method to calculate the X & Y displacement 
	public double distance(Body body1  ,Body  post) {
		double dx =  post.x - body1.x;
		double dy =  post.y - body1.y;

		return Math.sqrt(dx * dx + dy * dy);
	}

	//Method to compute the acceleration for the strings
	public double computeAccleration(Body post ,Body body2) {
		double gravitationalForce =  6.67384e-11 * body2.mass;
		double r = distance(post, body2);

		return gravitationalForce / (r * r);
	}

	//Method that computes X Acceleration from post & body1
	public double computeAx(Body body1, Body post) {

		double dx = post.x - body1.x;
		double a = computeAccleration(body1, post);
		double r = distance(body1, post);

		return a * dx / r; 
	}

	//Method that computes Y Acceleration from post & body1
	public double computeAy(Body body1, Body post) {
		double dy = post.y - body1.y;
		double a = computeAccleration(body1, post);
		double r = distance(body1, post);

		return a * dy / r;

	}


	// Method to update the position given the constant, time-step, acceleration, and velocity
	public void update(double timestep) {

		for (int i = 1; i < bodylist.size(); i++) {
			
			//Calculates the X&Y acceleration of a body given by other bodies
			double sumAx = 0;
			double sumAy = 0;

			for (int j = 0; j < bodylist.size(); j++) {

				if (j == i) { //Edge case to stop calculating a body's acceleration on itself
					continue; 
				}

				double ax = computeAx(bodylist.get(i), bodylist.get(j));
				double ay = computeAy(bodylist.get(i), bodylist.get(j));

				sumAx = sumAx + ax;
				sumAy = sumAy + ay;
			}

			//Updates body's velocity
			bodylist.get(i).updateVelocity(sumAx, sumAy, timestep);

			//Updates body's center position 
			bodylist.get(i).updatePosition(timestep);
		}
	}
}
