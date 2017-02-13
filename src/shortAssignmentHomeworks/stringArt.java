//CSI 201 Assignment 2: stringArt.java – String Art ( I still quite don't get it)
// Writer: Surendra Persaud
// Date assigned: 9/6/15
package shortAssignmentHomeworks;

import edu.princeton.cs.introcs.StdDraw;

public class stringArt {
	
	//Method to set the canvas background and draw it 
	public static void drawBackground() {
		StdDraw.clear(StdDraw.BLACK);
		StdDraw.setXscale(0,200);
		StdDraw.setYscale(0,200);
	}
	
	//Method to draw the string art
	public static void drawStringArt(){
		
		/* Draws sticks */
		
			//Sets the pen radius and pen color to draw the two sticks
	        StdDraw.setPenRadius(0.01);
	        StdDraw.setPenColor(StdDraw.MAGENTA);
	        
		    double x1a, y1a, x2a, y2a, x1b, y1b, x2b, y2b;
	        
		    //Sets points for left stick as variables 
		        x1a = 14;
		        y1a = 150;
		        x2a = 38;
		        y2a = 76;
		        
		    //Sets points for right stick as variables 
		        x1b = 164;
		        y1b = 164;
		        x2b = 126;
		        y2b = 100;
		        
		    //Draws the two sticks    
	        StdDraw.line(x1a, y1a, x2a, y2a);
	        StdDraw.line(x1b, y1b, x2b, y2b);
        
        /* Draws strings */
        
	        //Sets the pen radius back to default, sets pen color to to green, and draws the initial line
	        StdDraw.setPenRadius();
	        StdDraw.setPenColor(0, 255, 0);
		    StdDraw.line(x1a, y1a, x2b, y2b);
		    
		    //Loop to draw strings and change color
		    
		    int counter = 0;
		    int greenValue = 255;
		    int blueValue = 0;
		    int redValue = 255;
			
		    while(counter < 20){
			   
		    	//Calculates the difference between each new string
		    	x1a = x1a + 1.2; 
			    y1a = y1a - 3.7;
			    x2b = x2b + 1.9;
			    y2b = y2b + 3.2;
			    
			    //Calculate the difference for the color gradient
			    greenValue = greenValue - 12;
			    blueValue = blueValue + 10;
			    redValue = redValue - 8;
		        
			    //Draws the new string while changing the color and increments
			    StdDraw.setPenColor(redValue, greenValue, blueValue);
			    StdDraw.line(x1a, y1a, x2b , y2b);
				counter++;
	
			}		
	 
	}
	
	public static void main(String[] args) {
		drawBackground();
		drawStringArt();
	}
}
