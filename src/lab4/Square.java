/**
 * CSI 201 EC Lab 4: Square.java – Square
 * @author Surendra Persaud NETID: SP155681
 * @dateAssigned 11/30/16
 * 
 */


package lab4;

import java.awt.Color;

public class Square {
	Color color;
	double size, x_coord, y_coord;

	//Method to draw the squares
	public Square(double sizeParameter, double xParameter, double yParameter, Color colorParameter) {
		size = sizeParameter;
		x_coord = xParameter;
		y_coord = yParameter;
		color = colorParameter;
	}

}
