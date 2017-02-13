/**
 * CSI 201 Short Assignment 6: Tree.java – Recursive Tree
 * @author Surendra Persaud NETID: SP155681
 * @dateAssigned 11/01/16
 * @collaborators Khoa, Daryl, Joel
 * 
 */
package shortAssignmentHomeworks;
import edu.princeton.cs.introcs.StdDraw;
import java.awt.Color;

public class RecursiveTree {

	//Static variables
	public static final int DELTA_ANGLE_DEGREES = 15;
	public static final int TEMP_ANGLE = 15;
	public static final int SCALE_MAX = 800;
	public static final Color kTrunkColor = new Color(83, 53, 10);
	public static final Color kLeafColor = Color.GREEN;

	//Main method
	public static void main(String[] args) {
		setupCanvas();
		drawTree(SCALE_MAX / 2, SCALE_MAX / 200, 90, 200, 0.015, 8, 5);

	}

	//Method to set the canvas size and default pen color
	public static void setupCanvas(){
		StdDraw.setCanvasSize(SCALE_MAX, SCALE_MAX);
		StdDraw.setXscale(0,SCALE_MAX);
		StdDraw.setYscale(0,SCALE_MAX);
		StdDraw.setPenColor(kTrunkColor);

	}

	//Method to drawTree given parameters: X, Y, angle (degrees), length (scale), thickness, number of branches, and order of recursion 
	public static void drawTree(double initialX, double initialY, double angleDegrees, double branchLength, double branchThickness, int numberOfBranches, int orderOfRecursion) {

		//Base case – nothing will be drawn
		if (orderOfRecursion == 0) return;

		double angleRadians = Math.toRadians(angleDegrees);			//Variable that stores the converted angleDegrees parameter to Radians
		double branchReduction = 0.7;								//Variable that sets the branchLength reduction amount

		//Variable that computes the final X&Y values using Trigonometry (TA helped with logic)
		double finalX = initialX +  Math.cos(angleRadians) * branchLength;
		double finalY = initialY +  Math.sin(angleRadians) * branchLength;

		// Conditional to color branch at the last order of recursion
		if (orderOfRecursion == 1){ 
			StdDraw.setPenColor(kLeafColor);
		}
		else{
			StdDraw.setPenColor(kTrunkColor);
		}

		StdDraw.setPenRadius(branchThickness);
		StdDraw.line(initialX, initialY, finalX, finalY);

		//Conditional that checks if the numberOfBranches is odd
		if ((numberOfBranches % 2) == 1) {

			//Variable for how many times the loop runs
			int angleIncrement = (numberOfBranches - 1) / 2;

			//For loop that runs at the negative value of the angleIncrement to the positive value of angleIncrement
			//This logic is for the angles to be drawn on the right and left
			for (int i = (-1)*angleIncrement; i <= angleIncrement; i++) {

				//Recursive call of drawTree function, loops until 'orderOfRecursion' meets 0 and returns
				drawTree(finalX, finalY, angleDegrees + (i * DELTA_ANGLE_DEGREES), branchLength * branchReduction, branchThickness * branchReduction, numberOfBranches, orderOfRecursion - 1);
				//'angleDegrees' parameter is altered by the counter 'i' value multiplied by the change in degrees each call
				//branchLength parameter is being reduced by 70% each call
				//branchThickness parameter is being reduced by 70% each call
			}
		}

		//Conditional that checks if the numberOfBranches is even
		if ((numberOfBranches % 2) == 0) {

			//Variable for how many times the loop runs
			int angleIncrement = numberOfBranches / 2;

			//For loop that runs at the negative value of the angleIncrement to the positive value of angleIncrement
			//This logic is for the angles to be drawn on the right and left
			for (int i = (-1)*angleIncrement; i <= angleIncrement; i++) {
				
				
				//Conditional that checks if angle drawn will be positive
				if (i > 0) {
					//Recursive call of drawTree function, loops until 'orderOfRecursion' meets 0 and returns
					drawTree(finalX, finalY, angleDegrees + (i * DELTA_ANGLE_DEGREES) - TEMP_ANGLE, branchLength * branchReduction, branchThickness * branchReduction, numberOfBranches, orderOfRecursion - 1);
					/* 'angleDegrees' parameter is altered by the counter 'i' value multiplied by DELTA_ANGLE_DEGREES 
        				 for each call. This is subtracted from 'TEMP_ANGLE' so even number drawTrees are not in the center. */

				}

				//Conditional that checks if angle drawn will be negative
				if (i < 0) {
					drawTree(finalX, finalY, angleDegrees + (i * DELTA_ANGLE_DEGREES) + TEMP_ANGLE, branchLength * branchReduction, branchThickness * branchReduction, numberOfBranches, orderOfRecursion - 1);
					/* 'angleDegrees' parameter is altered by the counter 'i' value multiplied by DELTA_ANGLE_DEGREES 
   				 for each call. This is added with 'TEMP_ANGLE' so even number drawTrees are not in the center. */
				}
			}
		}

	}

}
