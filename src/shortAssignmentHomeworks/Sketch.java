//CSI 201 Assignment 1: Sketch.java – Sketch of my Favorite Children's Book
//Surendra Persaud 
package shortAssignmentHomeworks;

import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;

public class Sketch {
	
	//Method to draw the background and set the canvas
	public static void drawBackground() {
		StdDraw.clear(new Color(221, 72, 65));
		StdDraw.setXscale(0,400);
		StdDraw.setYscale(0,400);
	}
	
	//Method to draw the book "Corduroy"
	public static void drawChairAndTeddyBear() {
		//Draws the Chair
			StdDraw.ellipse(125, 100, 100, 35);
			StdDraw.ellipse(225, 100, 100, 35);
			StdDraw.setPenColor(new Color(221, 72, 65));
			StdDraw.filledEllipse(175, 85, 200, 35);
				
			//button on the chair
			StdDraw.setPenColor(new Color(226,209, 226));
			StdDraw.filledCircle(230, 105, 5);
		
		//Draws the Teddy bear
			
			// body
			StdDraw.setPenColor(new Color(29, 148, 77));
			StdDraw.filledRectangle(160, 175, 30, 70);
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.line(163, 155, 163, 105);
			StdDraw.line(163, 155, 163, 105);
			StdDraw.rectangle(182, 215, 8, 30);
			StdDraw.rectangle(139, 230, 8, 15);
			StdDraw.filledCircle(138, 222, 3);
			StdDraw.setPenColor(new Color(226,209, 226));
			StdDraw.filledCircle(182, 195, 5);
			
			// feet
			StdDraw.setPenColor(new Color(218, 191, 56));
			StdDraw.filledRectangle(150, 95, 20, 10);
			StdDraw.filledRectangle(180, 95, 20, 10);
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.line(165, 105, 165, 85);
			
			// arms
			StdDraw.setPenColor(new Color(218, 191, 56));
			StdDraw.filledRectangle(220, 235, 30, 10);
			StdDraw.filledRectangle(120, 215, 10, 30);
			
			// head and ears
			StdDraw.filledCircle(160, 275, 32);
			StdDraw.filledCircle(185, 295, 15);
			StdDraw.filledCircle(135, 295, 15);
			
			// face
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.filledCircle(145, 280, 5);
			StdDraw.filledCircle(175, 280, 5);
			StdDraw.filledCircle(160, 270, 2.5);
			StdDraw.line(152, 255, 167, 255);
			
		//Draws name
		StdDraw.setPenColor(new Color(237, 241, 15));
		StdDraw.text(200, 20, "Corduroy by Surendra Persaud");
		
	}
	
	
	public static void drawCorduroy(){
		drawBackground();
		drawChairAndTeddyBear();

	}
	
	public static void main(String[] args) {
		drawCorduroy();
	}
}
