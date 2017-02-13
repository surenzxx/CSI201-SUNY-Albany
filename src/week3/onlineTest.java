package week3;

import edu.princeton.cs.introcs.StdDraw;

public class onlineTest {

	 public static void main(String[] args) {


    while (true) {
        
    	// mouse location
        double x = StdDraw.mouseX();
        double y = StdDraw.mouseY();
		StdDraw.setPenRadius(0.05);

        // mouse click
    	if(StdDraw.mousePressed()){
    		StdDraw.point(x, y);
    	} 

        StdDraw.show();
    }
    
	 }
}
