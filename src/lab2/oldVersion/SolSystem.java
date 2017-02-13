/**
 * CSI 201 Lab Assignment 1: SolSystem.java – Solar System
 * @author Surendra Persaud NETID: SP155681
 * @dateAssigned 10/18/16
 * @collaborators Khoa, Abeer, Mitchell
 * 
 */

//I commented your code @Professor Wang -_- 


package lab2.oldVersion;
import edu.princeton.cs.introcs.StdDraw;

import java.awt.Color;

public class SolSystem {
	
	//Static variables for Window size and background color
	public static int WINDOW_WIDTH = 200;
	public static int WINDOW_HEIGHT = 200;
	public static final Color BLACK = Color.BLACK;
	
	//Static variables for the top of the window, bottom, the radius & mass
	public static int FLOOR_Y = 50;
	public static int CEILING_Y = WINDOW_HEIGHT - FLOOR_Y;
	public static int BALL_RADIUS = 10;
	public static double BALL_MASS = 0.2;
	
	//Static variables for physics constants
	public static double PIXEL_PER_METER = 5.0;
	public static double EARTH_GRAVITY_ACC = - 9.8;
	public static double SPRING_CONSTANT = 1.0;
	public static int POST_X = 20;
	public static int POST_Y = 20;
	
	//Static variables for the frame rate
	public static int FRAME_RATE = 60;
	public static double TIMESTEP = 1.0 / FRAME_RATE;
	
	public Body b;
	public Body post;
	   
	//Constructor Method which takes in parameters defined later by body class 
	public SolSystem(double bodyX, double bodyY, double bodyVX, double bodyVY, double bodyRadius, int bodyR, int bodyG, int bodyB, double bodyMass) {
	
	b = new Body(bodyX, bodyY, bodyVX, bodyVY, bodyRadius, bodyR, bodyG, bodyB);
	
	b.setMass(bodyMass);
	
	post = new Body(POST_X, POST_Y, 0, 0, 15, 0, 153, 0);
	
    }
	
	//Method to draw the system objects 
	public void draw() {
	    StdDraw.clear(BLACK);
	    b.draw(PIXEL_PER_METER);
	     
	    post.draw(PIXEL_PER_METER);
	     
	     
	    StdDraw.setPenColor(StdDraw.BLACK);
	    StdDraw.setPenRadius(0.02);
	    
	    StdDraw.show((int)(1000 * TIMESTEP));
	  }
	   
	//Method to calculate the X & Y displacement
	  public double distance() {
	    double dx = b.x - post.x;
	    double dy = b.y - post.y;
	     
	    return Math.sqrt(dx*dx + dy*dy);
	  }
	  
	  //Method to calculate the spring force and store as double K
	  public double springForce(double k) {
	    return distance() * k;
	  }
	   
	  //Method to compute the acceleration for the spring
	  public double computeAccleration(double k) {
	    double a;
	    a = springForce(k) / b.mass;
	    return a;
	  }
	   
	  //Method to compute the acceleration in X for the spring 
	  public double computeAx(double a) {
	    double dx = post.x - b.x;
	    return a * dx / distance();
	  }
	 
	  //Method to compute the acceleration in Y for the spring 
	  public double computeAy(double a) {
	    double dy = post.y - b.y;
	    return a * dy / distance();
	  }
	   
	 // Method to update the position given the constant and timestep
	  public void update(double k, double timestep) {
	 
	    b.updatePosition(timestep);
	    double a = computeAccleration(SPRING_CONSTANT);
	    double ax = computeAx(a);
	    double ay = computeAy(a);
	     
	    b.updateVelocity(ax, ay, timestep);
	     
	  }
}
