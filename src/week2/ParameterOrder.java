package week2;

import edu.princeton.cs.introcs.StdDraw;

public class ParameterOrder {

	public static void main(String[] args) {
		// Sets X & Y of canvas
		StdDraw.setXscale(0,200);
		StdDraw.setYscale(0,200);
		
		//draws circle
		StdDraw.clear();
		
		StdDraw.circle(150, 50, 25);
		StdDraw.filledCircle(50, 100, 25);
		
		StdDraw.show();
	}
	
}
