/**
 * CSI 201 EC Lab 4: Room.java – Room
 * @author Surendra Persaud NETID: SP155681
 * @dateAssigned 11/30/16
 * 
 */


package lab4;

import edu.princeton.cs.introcs.StdDraw;

public class Room {

	public Square[][] gridArray;
	public static int stored_Length;
	public static int stored_Width;
	public static int Window_Length;
	public static int Window_Width;
	public static int SCALE = 10;

	//Room constructor that creates 2D array with given parameters
	public Room(int Length, int Width) {
		gridArray = new Square [Length][Width];
		stored_Length = Length;
		stored_Width = Width;
		Window_Length = Length * SCALE * SCALE;
		Window_Width = Width * SCALE * SCALE;
		
		//Logic that creates a scaled room with a correct size
		for (int i = 0; i < stored_Length; i++) {
			for (int j = 0; j < stored_Width; j++) {
				gridArray[i][j] = new Square((stored_Width * SCALE), (i * SCALE * SCALE) + (stored_Width * SCALE), (j * SCALE * SCALE) + (stored_Width * SCALE), StdDraw.GRAY);
			}
		}

	}
	
	//Method that cleans the Room given a robot object
	public void cleanRoom(Robot r) {

		//Logic that computes the bounds that the Robot will clean in 
		for (int i = 0; i < stored_Length; i++) {

			for (int j = 0; j < stored_Width; j++) {

				if (r.p.x < gridArray[i][j].x_coord + (stored_Length * SCALE) && r.p.x > gridArray[i][j].x_coord - (stored_Length * SCALE)
						&& r.p.y < gridArray[i][j].y_coord + (stored_Width * SCALE) && r.p.y > gridArray[i][j].y_coord - (stored_Width * SCALE)) {

					gridArray[i][j].color = StdDraw.WHITE;

				}

			}
		}

	}
	
	//Method that draws the grid
	public void drawGrid() {
		
		//TA helped with this for loop: draws the grid Array
		for (Square[] r : gridArray) {
			for (Square c : r) {
				StdDraw.setPenColor(c.color);
				StdDraw.filledSquare(c.x_coord, c.y_coord, c.size);

			}
		}
		
		//Draws the lines for the scale
		for (int i = 0; i < stored_Length; i++) {
			StdDraw.setPenRadius(.002);
			StdDraw.setPenColor(StdDraw.BLACK);
			StdDraw.line(0, i * 100, (stored_Length * SCALE * SCALE), i * 100);
			StdDraw.line(i * 100, 0, i * 100, (stored_Width * SCALE * SCALE));

		}

	}

}
