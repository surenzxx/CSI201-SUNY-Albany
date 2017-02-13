package shortAssignmentHomeworks;


import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;

public class shortAssignment3Review {
	
	//Method to draw background
	public static void drawBackground(){
		// Sets the X&Y Scale and changes the radius of the pen
		StdDraw.setXscale(0, 100);
		StdDraw.setYscale(0, 100);
		StdDraw.setPenRadius(0.006);
	}
	
	//Method to draw the exponential line
	public static void drawLineCurve(double growthRate){
		
		//Variables to track the X&Y values of the line each time it is drawn
		double counter, xStart, yStart, xEnd, yEnd ;
		xStart = 0;
		yStart = 0;
		xEnd = 1;
		yEnd = 1;
		
		//Randomizes the pen color and draws the first line
		StdDraw.setPenColor(Color.getHSBColor((float) Math.random(), .8f, .8f));
		StdDraw.line(xStart, yStart, xEnd, yEnd);
		
		//While loop to draw the line at an exponential rate
		counter = 1;
		while (counter < 100){
			
			//The X&Y Coordinates when the lines finishes drawing becomes the new starting coordinates
			xStart = xEnd;
			yStart = yEnd;
			
			//Variable for the new X is always increasing by 1, where the Y value is increasing by the growthRate set by the parameter
			xEnd++;
			yEnd= Math.pow(counter, growthRate);
			
			//Draws the line and iterates
			StdDraw.line(xStart, yStart, xEnd, yEnd);
			counter++;
		}
	}
		
	
	public static void main (String [] args) {
		drawBackground();
		
		//While loop to draw the line X times at a random exponential rate
		int methodCounter = 0;
		while(methodCounter < 7){
			drawLineCurve(Math.random() + Math.random());
			methodCounter++;
		}
		
		
	}

}
