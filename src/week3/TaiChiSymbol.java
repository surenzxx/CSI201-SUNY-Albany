package week3;
import edu.princeton.cs.introcs.StdDraw;

public class TaiChiSymbol {

	public static void main(String[] args) {
		
		//Sets X and Y Scale of Canvas to 200x200
		StdDraw.setXscale(0, 200);
		StdDraw.setYscale(0, 200);
		
		//Draws a black filled circle
		StdDraw.filledCircle(100, 100, 50);
		
		//Sets pen color to white
		StdDraw.setPenColor(StdDraw.WHITE);
		
		//Draws a rectangle to make the left half of he circle white
		StdDraw.filledRectangle(75, 100, 25, 50);
		
		//Draws the circle to create the white space for the black side of the symbol
		StdDraw.filledCircle(100, 125, 25);
		
		//Sets the pen color to black
		StdDraw.setPenColor(StdDraw.BLACK);
		
		//Draws a circle to complete the curve o the black side of the symbol
		StdDraw.filledCircle(100, 75, 25);
		
		//Creates the black dot in the white side of the symbol
		StdDraw.filledCircle(100, 125, 8);
		
		//Sets the pen color to white
		StdDraw.setPenColor(StdDraw.WHITE);
		
		//Draws the white dot in the black side of the symbol
		StdDraw.filledCircle(100, 75, 8);
		
		//Sets the pen color to black
		StdDraw.setPenColor(StdDraw.BLACK);
		
		//Draws the black outline for the symbol using an unfilled circle 
		StdDraw.circle(100, 100, 50);
		
	}

}
