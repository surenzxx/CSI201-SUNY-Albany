/**
 * CSI 201 Lab 2: Body.java – Gravity Simulator
 * @author Surendra Persaud NETID: SP155681
 * @dateAssigned 10/18/16
 * @collaborators Khoa, Daryl, Robinson
 * 
 */

package lab2;

import edu.princeton.cs.introcs.StdDraw;

public class Body {

	//Variables for the X, Y, object velocity on X, object velocity on Y, radius, and mass 
	public double x;     
	public double y;       
	public double vx;    
	public double vy;      
	public double radius;  
	public double mass;    


	//Variables for the RGB colors
	public int R;
	public int G;
	public int B;

	//Constructor method that initializes a given body object
	public Body(double parameterMass, double parameterX, double parameterY, double parameterVX, double parameterVY, double parameterRadius, int r, int g, int b) {
		mass = parameterMass;
		x = parameterX;
		y = parameterY;
		vx = parameterVX;
		vy = parameterVY;
		radius = parameterRadius; 
		
		R = r;
		G = g;
		B = b;
	}  
	

	//Method that draws each initialized body object (planet)
	public void draw(double PIXEL_PER_METER) {
		StdDraw.setPenColor(R, G, B);
		StdDraw.filledCircle(x * PIXEL_PER_METER, y * PIXEL_PER_METER, radius);
	}


	//Method that updates the X & Y coordinates by the velocity
	public void updatePosition(double timestep) {
		x = x + vx * timestep;
		y = y + vy * timestep;
	}

	//Method that updates the X & Y velocity by the acceleration, every planet is rotating around the sun DIFFERENTLY so their cycles are very different
	public void updateVelocity(double ax, double ay, double timestep) {
		vx = vx + ax * timestep;
		vy = vy + ay * timestep;
	}
	
	public static void main(String[] args) {
	//int f = Body(1, 1, 1, 1, 1, 1 ,1 ,1 ,1);
	}

}
