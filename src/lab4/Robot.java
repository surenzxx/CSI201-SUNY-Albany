/**
 * CSI 201 EC Lab 4: Robot.java – Robot
 * @author Surendra Persaud NETID: SP155681
 * @dateAssigned 11/30/16
 * 
 */


package lab4;

import edu.princeton.cs.introcs.StdDraw;

public class Robot {
	
	//Global variables
	public int circleRadius = 10;
	public int direction;

	//Initializes Position object 'p'
	public Position p;

	//Constructor method
	public Robot() {
		
		p = new Position(Math.random() * 500, Math.random() * 500); //Sets 'p' as a position object as a random number multiplied by CANVAS SCALE. 

		direction = (int) (Math.random() * 360); //Sets direction to a random number between 1 and 360 (robot moves in a circle).

	}

	//Method to draw the robot as a circle with information from the 'r' Robot object.
	public void drawRobot(Robot r, int W, int H) {
		
		//The X & Y values for the robot are in the r object which contains a position object  then stores the X & Y coordinates.
		double x = r.p.x;
		double y = r.p.y;

		//Draws the outline and inside of the robot.
		StdDraw.setPenRadius(0.005);
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(x, y, 5);
		StdDraw.setPenColor(StdDraw.GREEN);
		StdDraw.setPenRadius(0.005);
		
		//Variables for the new X and Y values.
		double x1;
		double y1;
		
		//Computed using TRIG functions – TA helped with logic. 
		x1 = x + (5.0 * Math.cos(Math.toRadians(direction)));
		y1 = y + (5.0 * Math.sin(Math.toRadians(direction)));

		StdDraw.line(x, y, x1, y1);		

	}

	//Method that moves the robot. 
	public void moveRobot(Robot r, double speed) {
		double x1, y1;
		
		//New X & Y values computed using logic above but instead multiplied by speed. 
		x1 = r.p.x + (speed * Math.cos(Math.toRadians(direction)));
		y1 = r.p.y + (speed * Math.sin(Math.toRadians(direction)));
		
		//Prevents the robot from going out of bounds
		if (x1 >  (Room.Window_Length - Room.stored_Length) || x1 < (Room.stored_Length)) {
			direction = (int) (Math.random() * 360);

		}
		
		//Prevents the robot from going out of bounds
		else if (y1 > (Room.Window_Width - Room.stored_Width) || y1 < (Room.stored_Width)) {
			direction = (int) (Math.random() * 360);

		}
		
		else {
			r.p.updatePosition(x1, y1);
		}
	}

}
