//CSI 201 Assignment 3: chalkboard.java – Chalkboard
// Writer: Surendra Persaud
// Date assigned: 9/13/15
package shortAssignmentHomeworks;

import edu.princeton.cs.introcs.StdDraw;


public class chalkboard {
	
	private int x;
	private int y;
	private int h;


	public chalkboard(int xP, int yP, int Hp){
		x = xP;
		y = yP;
		h = Hp; 
		int[] c = new int[10];
	}
	
	public void grow(){
		
	}
	
	//Method to draw the background and print instructions
	public static void drawBackground(){
		
		//Sets the canvas background and draw it 
		StdDraw.setXscale(0,200);
		StdDraw.setYscale(0,200);
		StdDraw.clear(StdDraw.BLACK);
		
		//Sets the pen radius and color to white
		StdDraw.setPenRadius(0.009);
		StdDraw.setPenColor(StdDraw.WHITE);
		
		//Prints instructions for color change
		System.out.println("To change color to WHITE press SPACEBAR");
		System.out.println("To change color to BLUE press B");
		System.out.println("To change color to RED press R");
		System.out.println("To change color to GREEN press G");
		System.out.println("To clear canvas press C");
		
	}
	
	//Method to draw on Chalk board
	public static void drawChalkboard(){

		//Variables to store mouse coordinates
		boolean mousePressed;
		double mouseX, mouseY, oldMouseX, oldMouseY;
		oldMouseX = 1;
		oldMouseY = 1;
		
		while (true) {
						
			//Declares variables to check boolean value and mouseX/Y value
			mousePressed = StdDraw.mousePressed();
			mouseX = StdDraw.mouseX();
			mouseY = StdDraw.mouseY();
			
				//Checks if the mouse is pressed then draws where mouse is
				if(mousePressed == true){
				
					//Stores the old mouse values as variables 
					if (oldMouseX == 1 & oldMouseY == 1){
						oldMouseX = mouseX;
						oldMouseY = mouseY;
					}
					//Draws the points given the mouse coordinates
					StdDraw.line(oldMouseX, oldMouseY, mouseX, mouseY);
					oldMouseX = mouseX;
					oldMouseY = mouseY;	
				}
				//If the mouse is not pressed, the values for oldMouseX and oldMouseY are reset
				if (mousePressed == false){
					oldMouseX = 1;
					oldMouseY = 1;
				}
				
			//Code to change color on key pressed
			
			//Boolean variables to check if key has been pressed
			boolean isBKeyTyped, isRKeyTyped, isGKeyTyped, isSpaceKeyTyped, isCKeyTyped; 
			
			//Each parameter for the isKeyPressed function is the ASCII value for that letter on the keyboard
			isBKeyTyped = StdDraw.isKeyPressed(66);
			isRKeyTyped = StdDraw.isKeyPressed(82);
			isGKeyTyped = StdDraw.isKeyPressed(71);
			isCKeyTyped = StdDraw.isKeyPressed(67);
			isSpaceKeyTyped = StdDraw.isKeyPressed(32);
			
			//if "b" key is pressed, change the color to blue
		    if(isBKeyTyped == true)  {
				StdDraw.setPenColor(StdDraw.BLUE);
		    }
		    //if "r" key is pressed, change the color to red
		    if(isRKeyTyped == true)  {
				StdDraw.setPenColor(StdDraw.RED);
		    }
		    //if "g" key is pressed, change the color to green
		    if(isGKeyTyped == true)  {
				StdDraw.setPenColor(StdDraw.GREEN);
		    }
		    //if "space" key is pressed, change the color back to white
		    if(isSpaceKeyTyped == true)  {
				StdDraw.setPenColor(StdDraw.WHITE);
		    }
		    //if "c" key is pressed, the canvas clears to black
		    if(isCKeyTyped == true)  {
				StdDraw.clear(StdDraw.BLACK);
			}
			
		}
	   
		
	}
	
	
	public static void main(String[] args) {
       drawBackground();
       drawChalkboard();

	}
}
