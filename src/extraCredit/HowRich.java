//CSI 201 Extra Credit 1: how rich am i – HowRich.java
// Writer: Surendra Persaud NetID: SP155681
// Date assigned: 10/04/16
package extraCredit;

public class HowRich {
	
	public static final int TIME_PERIOD = 2016;						//constant for the amount of years the balances will grow by
	public static final double MY_INTEREST_RATE = 0.05; 			//constant 5% | the amount added to myBalance each year
	public static final double PORTIA_INTEREST_RATE = 0.04; 		//constant 4% | the amount added to portiaBalance each year

	
	public static void problem1() {
		int myTimePeriodCounter = 0; 		//the counter variable that will increment
		double myBalance = 1; 				//variable for the balance at the starting value, 1$
		
			while(myTimePeriodCounter < TIME_PERIOD){				//checks if the counter value is less than the time period
				myBalance = myBalance *  (1 + MY_INTEREST_RATE);	//myBalance is incremented by the formula for exponential growth 
				myTimePeriodCounter = myTimePeriodCounter + 1;		//increments myTimePeriod counter by 1
			}
			
		System.out.println("I had " + myBalance + " dollars in  the year " + TIME_PERIOD );		//prints the final balance with the year
	}
	
	public static void problem2() {
		int portiaTimePeriodCounter = 0;		//the counter variable that will increment
		double myBalance = 1;					//variable for myBalance at the starting value, 1$ to compare 
		double portiaBalance = 100000;			//variable for portiaBalance at the starting value, $100,000
			
			while(portiaTimePeriodCounter < TIME_PERIOD){						//checks if the counter value is less than the time period
				myBalance = myBalance * (1 + MY_INTEREST_RATE);					//myBalance is incremented by the formula for exponential growth 
				portiaBalance = portiaBalance * (1 + PORTIA_INTEREST_RATE);		//portiaBalance is incremented by the formula for exponential growth
				portiaTimePeriodCounter = portiaTimePeriodCounter + 1;			//increments portiaTimePeriod counter by 1
				
				//Compares myBalance to portiaBalance; if myBalance exceeds portiaBalance then the year and amount is printed and the method stops
				if (myBalance > portiaBalance){						
					System.out.println("My balance exceeded Portia's in the year " + portiaTimePeriodCounter + " where my balance was " + myBalance + " dollars and Portia's balance was " + portiaBalance + " dollars." );
					return;
				}
				

			}

				
	}
	
	public static void main(String[] args) {
		problem1();
		problem2();
	}

}
