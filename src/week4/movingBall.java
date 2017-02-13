package week4;

import edu.princeton.cs.introcs.StdDraw;

public class movingBall {

	public static void main(String[] args) {
		int x = 10, y = 10;
		StdDraw.setXscale(0,200);
		StdDraw.setYscale(0,200);
		
		while(true){
			StdDraw.clear();
			StdDraw.filledCircle(x, y, 10);
			StdDraw.show(20);
			x = x+1;
			y = y+2;
		}
	}

}
