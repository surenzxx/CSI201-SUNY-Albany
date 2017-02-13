/**
 * CSI 201 Lab Assignment 1: Body.java – Solar System
 * @author Surendra Persaud NETID: SP155681
 * @dateAssigned 10/18/16
 * @collaborators Khoa, Abeer, Mitchell
 * 
 */

//I commented your code @Professor Wang -_- 

package lab2.oldVersion;
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
	public Body(double px, double py, double ivx, double ivy, double pradius, int r, int g, int b) {
		x = px;
		y = py;
		vx = ivx;
		vy = ivy;
		radius = pradius; 
		R = r;
		G = g;
		B = b;
	 }

	//Method that sets the mass of the parameter as the value of mass variable
	public void setMass(double m) {
		mass = m;
	  }
	
	//Method that draws the system object which contains ball objects (planets)
	public void draw(double PIXEL_PER_METER) {
		    StdDraw.setPenColor(R, G, B);
		    StdDraw.filledCircle(x * PIXEL_PER_METER, y * PIXEL_PER_METER, radius);
		     
	}
	
	//Method that updates the X & Y coordinates by the velocity
	public void updatePosition(double timestep) {
		 x = x + vx * timestep;
		 y = y + vy * timestep;
	   }
	
	//Method that updates the X & Y velocity by the acceleration
	public void updateVelocity(double ax, double ay, double timestep) {
		 vx = vx + ax * timestep;
		 vy = vy + ay * timestep;
	   }
}
