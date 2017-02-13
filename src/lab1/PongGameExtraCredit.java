/**
 * CSI 201 Lab Assignment 1: PongGame.java – Pong
 * @author Surendra Persaud NETID: SP155681
 * @dateAssigned 9/20/16
 * @collaborators Khoa, Abeer, Mitchell
 * 
 */
package lab1;

import java.awt.Color;
import java.util.Random;
import edu.princeton.cs.introcs.StdDraw;


public class PongGameExtraCredit {
	
	//Defines color variables
	public static Color BACKGROUND_COLOR = StdDraw.GREEN;
	public static Color PADDLE_COLOR = StdDraw.BLACK;
	public static Color BALL_COLOR = StdDraw.BLUE;
	
	
	//Defines constant variables for the scale, paddles, and ball 
	public static final int SCALE_MIN = 0;
	public static final int SCALE_MAX = 512;
	public static final int PADDLE_WIDTH = 20;
	public static final int PADDLE_HEIGHT = 80;
	public static final int DELTA_PADDLE = 10;
	public static final int BALL_RADIUS = 10;
	
	static Random random = new Random();
	static int randomNumberX = (random.nextInt(8) + 4 ) * 1;
	static int randomNumberY = (random.nextInt(6) + 2 ) * 1;

	
	//Defines global variables for the ball (will change)
	public static double ballX = SCALE_MAX / 2;
	public static double ballY = SCALE_MAX / 2;
	public static int ballXVelocity = randomNumberX;
	public static int ballYVelocity = randomNumberY;
	

	
	//Defines global variables used for the location of both player's paddles (will change)
	public static double player1X = PADDLE_WIDTH; 					
	public static double player1Y = SCALE_MAX - PADDLE_HEIGHT;		
	public static double player2X = SCALE_MAX - PADDLE_WIDTH;			
	public static double player2Y = PADDLE_HEIGHT;					

	//Main method
	public static void main(String[] args) {
		
		backgroundDraw();
	
		while (true) {
			
			StdDraw.clear(BACKGROUND_COLOR);
			restartGame();
			ballDraw();			
			paddleDraw();
			
			ballCollisionChecker();
			horizontalCollisionChecker();
			verticalCollisionChecker();
			
			StdDraw.show(20);
			quitGame();
			
			
		}
		
	}
	
	
	//Method to draw the basic info for canvas
	public static void backgroundDraw() {
		StdDraw.setXscale(SCALE_MIN, SCALE_MAX); //Sets XScale
		StdDraw.setYscale(SCALE_MIN, SCALE_MAX); //Sets YScale
		StdDraw.clear(BACKGROUND_COLOR); //Clears to background color set by user
		
	}
	
	//Method to restart the game on 'Space bar' key press
	public static void restartGame() {
		
		if (StdDraw.isKeyPressed(32)) {
			
				//draws paddles in their original location
				player1X = PADDLE_WIDTH;
				player1Y = SCALE_MAX - PADDLE_HEIGHT;
				player2X = SCALE_MAX - PADDLE_WIDTH;
				player2Y = PADDLE_HEIGHT;
				
				//draws ball in the original location
				ballX = SCALE_MAX / 2;
				ballY = SCALE_MAX / 2;
				
				//sets ballVelocity to random
				ballXVelocity = random.nextInt(8) + 4 *  1;
				ballYVelocity = random.nextInt(6) + 2 * 1;

		}
		
	}
	
	//Method that draws the ball with initial values then new values
	public static void ballDraw(){
		StdDraw.setPenColor(BALL_COLOR);
		StdDraw.filledCircle(ballX,ballY,BALL_RADIUS);
		
		//changes the velocity of the ball by incrementing using the velocity values
		ballX = ballX + ballXVelocity;
		ballY = ballY + ballYVelocity;
	}

	
	//Method to draw the paddles as their being changed by key press
	public static void paddleDraw() {		
		StdDraw.setPenColor(PADDLE_COLOR);
		
		//EXTRA CREDIT CODE
		StdDraw.picture(player1X, player1Y, "file:sabertooth.gif", PADDLE_WIDTH, PADDLE_HEIGHT);
		StdDraw.picture(player2X, player2Y, "file:wolverine.gif", PADDLE_WIDTH, PADDLE_HEIGHT);

//		StdDraw.filledRectangle(player1X, player1Y, PADDLE_WIDTH, PADDLE_HEIGHT); //draws the initial paddle 1 and then the new paddle1 
//		StdDraw.filledRectangle(player2X, player2Y, PADDLE_WIDTH, PADDLE_HEIGHT); //draws the initial paddle 2 and then the new paddle2
		
			//If "W" is pressed move paddle1 up
			if(StdDraw.isKeyPressed(87)) { 
				player1Y = player1Y + DELTA_PADDLE; 					//increments player1Y by adding which gives the new paddle values
				
				if(player1Y > SCALE_MAX - PADDLE_HEIGHT){				//stops the paddles from going over the boundaries 
					player1Y = SCALE_MAX - PADDLE_HEIGHT;
				}
				
				} 
			
			//If "S" is pressed move paddle1 down
			if(StdDraw.isKeyPressed(83))  {							
				player1Y = player1Y - DELTA_PADDLE;					//decrements player1Y by subtracting which gives the paddle values
					if(player1Y < PADDLE_HEIGHT){					//stops the paddles from going over the boundaries
						player1Y = PADDLE_HEIGHT;
					}
					
				}
			
			//If "I" is pressed move paddle2 up
			if(StdDraw.isKeyPressed(73))  {
				player2Y = player2Y + DELTA_PADDLE;					//increments player2Y by adding which gives the new paddle values
					if(player2Y > SCALE_MAX - PADDLE_HEIGHT){			//stops the paddles from going over the boundaries
						player2Y = SCALE_MAX - PADDLE_HEIGHT;	
					}
				}
			
			 //If "K" is pressed move paddle2 down
			if(StdDraw.isKeyPressed(75))  {
				player2Y = player2Y - DELTA_PADDLE;					//decrements player2Y by subtracting which gives the new paddle values
					if(player2Y < PADDLE_HEIGHT){					//stops the paddles from going over the boundaries
						player2Y = PADDLE_HEIGHT;
						
					}
				}
		}
	

	
	//Method to check if the ball collides with either paddle
	public static void ballCollisionChecker() {
		
		int random = (int)(Math.random() * 3 + 1);
		
		//Checks if the ball collides with the first paddle and changes the ball's direction
		if (SCALE_MIN + PADDLE_WIDTH - BALL_RADIUS <= ballX && ballX <= PADDLE_WIDTH + BALL_RADIUS) {
			if (player1Y - PADDLE_HEIGHT <= ballY && ballY <= player1Y + PADDLE_HEIGHT ) { 				
				ballXVelocity = -1 * ballXVelocity;
				
				//EXTRA CREDIT CODE
				ballXVelocity = ballXVelocity + random;
				ballYVelocity = ballYVelocity + random;
				BALL_COLOR = Color.getHSBColor((float) Math.random(), .8f, .8f);
			}
			
		}
		
		//Checks if the ball collides with the second paddle and changes the ball's direction
		
		if (SCALE_MAX - PADDLE_WIDTH - BALL_RADIUS <= ballX && ballX <= SCALE_MAX - PADDLE_WIDTH) {
			if (player2Y - PADDLE_HEIGHT  <= ballY && ballY <= player2Y + PADDLE_HEIGHT ) {
				ballXVelocity = -1 * ballXVelocity;		
				
				//EXTRA CREDIT CODE
				ballXVelocity = ballXVelocity - random;
				ballYVelocity = ballYVelocity - random;
				BALL_COLOR = Color.getHSBColor((float) Math.random(), .8f, .8f);
			}
		}
		
		
	}
	
	//Method to check if the ball collides with the X axis and if it does: the velocity of each ball is multiplied by -1 respectively
	public static void horizontalCollisionChecker() {
		if (ballY >= SCALE_MAX) {
			ballYVelocity = -1 * ballYVelocity;			
		}
		
		if (ballY <= SCALE_MIN) {
			ballYVelocity = -1 * ballYVelocity;
		}
		
	}
	
	//Method to check if the ball collides with the Y axis and if it does: the game ends 
	public static void verticalCollisionChecker() {
		if(ballX >= SCALE_MAX - BALL_RADIUS || ballX <= SCALE_MIN + BALL_RADIUS) {
			StdDraw.clear(BACKGROUND_COLOR);
			StdDraw.text(SCALE_MAX / 2, SCALE_MAX / 2, "Gameover, bub. Press Space to restart or Q to quit! – Wolverine");
		}
	
	}
	
	//Method to stop running the game on "Q" key press
	public static void quitGame() {
		
		if (StdDraw.isKeyPressed(81)) {
			while(true){
				StdDraw.clear(BACKGROUND_COLOR);
				StdDraw.text(SCALE_MAX / 2, SCALE_MAX / 2, "You have stopped the game...Wolverine is sad ):");
				StdDraw.show();	
			}
		}
		
	}

}


