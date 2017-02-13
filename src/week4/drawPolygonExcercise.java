package week4;

import edu.princeton.cs.introcs.StdDraw;

public class drawPolygonExcercise {

	public static void main(String[] args) {
		StdDraw.setXscale(0,200);
		StdDraw.setYscale(0,200);
		
		double[] x = {161, 119, 100, 81, 39, 70, 63, 100, 137, 130};
		double[] y = {86, 80, 43, 80, 86, 116, 158, 138, 158, 116};
		
		StdDraw.setPenColor(StdDraw.RED);
		StdDraw.filledPolygon(x, y);
	}

}
