package week3;

import edu.princeton.cs.introcs.StdDraw;


public class test {
	
	 public static void main(String[] args) {

		 	boolean isMousePressed;
		 	isMousePressed = StdDraw.mousePressed();
		 	
			while (isMousePressed == true) {
	            double x = StdDraw.mouseX();
	            double y = StdDraw.mouseY();
	            
	            // mouse click
	        	if (StdDraw.mousePressed()) {
	        		StdDraw.setPenRadius(0.006);
	        		StdDraw.setPenColor(StdDraw.BLACK);
		            StdDraw.point(x, y);
		            System.out.println(x);
	        	}
	        	else {
	        	}


	        }
	    }

}

