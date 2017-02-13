package week2;

import edu.princeton.cs.introcs.StdDraw;

public class smileExercise {
	
	//Method for in class "Smile" Excercise
	public static void drawSmileyFace() {
		
		int xCenter = 150;
		int yCenter = 150;
		
		//Set canvas size 
		StdDraw.setXscale(0,300);
		StdDraw.setYscale(0,300);
		
		//Draws big circle background
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.filledCircle(xCenter, yCenter, 90);
		
		//Draws smile
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.circle(xCenter, yCenter, 60);
		StdDraw.setPenColor(StdDraw.YELLOW);
		StdDraw.filledRectangle(xCenter, yCenter + 30, 62, 35);

		//Draws eyes
		StdDraw.setPenColor(StdDraw.BLACK);
		StdDraw.filledCircle(xCenter - 35, yCenter + 30, 10);
		StdDraw.filledCircle(xCenter + 35, yCenter + 30, 10);
		
	}
	
	public static void main(String[] args) {
		drawSmileyFace();
	}
}
