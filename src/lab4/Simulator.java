/**
 * CSI 201 EC Lab 4: Simulator.java – Simulator
 * @author Surendra Persaud NETID: SP155681
 * @dateAssigned 11/30/16
 * 
 */

package lab4;

import edu.princeton.cs.introcs.StdDraw;

public class Simulator {

	//Method to run given parameters assigned by user.
	public static void runSimulation(int numRobots, double speed, int Length, int Width, double minCoverage, int numTrials, boolean visualize){

		int[] trialsCollection = new int[numTrials];

		//Runs loop for number of trials
		for(int i = 0; i < numTrials; i++){


			Room thisRoom = new Room(Length, Width); //creates Room object given parameter
			Robot robo = new Robot(); //creates Robot object 'robo'

			//Conditional that produces visualization if true
			if (visualize == true){		
				StdDraw.setCanvasSize(Length * 100, Width * 100);
				StdDraw.setXscale(0, Length * 100);
				StdDraw.setYscale(0, Width * 100);

				int j = 0;
				while (j == 0) {
					thisRoom.drawGrid(); 			//Draws grid
					robo.drawRobot(robo, 0, 0);		//Draws Robot
					robo.moveRobot(robo, speed);	//Moves robot at 'speed'
					StdDraw.show(20);				//Pauses for 20 milliseconds
					thisRoom.cleanRoom(robo);		//Makes the robot clean the Room

				}
			}
			//If not, the simulation is run without visualization 
			else {
				robo.moveRobot(robo, speed);			
				thisRoom.cleanRoom(robo);
			}	
		}
	}

	public static void main(String[] args) {	
		runSimulation(1, 10, 5, 5, 0, 1, true);
	}

}


