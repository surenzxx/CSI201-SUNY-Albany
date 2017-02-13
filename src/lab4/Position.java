/**
 * CSI 201 EC Lab 4: Position.java – Position
 * @author Surendra Persaud NETID: SP155681
 * @dateAssigned 11/30/16
 * 
 */

package lab4;

public class Position {

	public double x;
	public double y;

	//Position constructor used to create position Object.
	public Position(double xParameter, double yParameter) {
		x = xParameter;
		y = yParameter;
	}
	
	//An update position methos used to update the position objects.
	public void updatePosition(double x_new, double y_new) {
		x = x_new;
		y = y_new;

	}

}
