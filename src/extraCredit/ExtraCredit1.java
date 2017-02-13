//CSI 201 Extra Credit 1: how rich am i – ExtraCredit1.java
// Writer: Surendra Persaud NetID: SP155681
// Date assigned: 10/04/16
package extraCredit;

public class ExtraCredit1 {
	
	public static final int TIME_PERIOD = 2016;
	public static double myEndBalance = 0;
	public static double portiaEndBalance = 0;

	
	public static void problem1() {
//		int myTimePeriodCounter = 0;
//		double myInitialBalance = 1;
//		double MY_INTEREST_RATE = 0.05;
//		
//		while(myTimePeriodCounter < TIME_PERIOD){
//			myEndBalance = myInitialBalance *(Math.pow((1+ MY_INTEREST_RATE ), TIME_PERIOD));
//			myTimePeriodCounter = myTimePeriodCounter + 1;
//		}
//		System.out.println("I had " + myEndBalance + " dollars in year " + TIME_PERIOD );
	}
	
	public static void problem2(){
//		int portiaTimePeriodCounter = 0;
//		double portiaInitialBalance = 100000;
//		double PORTIA_INTEREST_RATE = 0.04;
//		
//		while(portiaTimePeriodCounter < TIME_PERIOD){
//			portiaEndBalance = portiaInitialBalance *(Math.pow((1+ PORTIA_INTEREST_RATE ), TIME_PERIOD));
//			portiaTimePeriodCounter = portiaTimePeriodCounter + 1;
//		}
//		System.out.println("Portia had " + portiaEndBalance + " dollars in year " + TIME_PERIOD );
//		
	}

	public static void main(String[] args) {
		
		int myTimePeriodCounter = 0;
		double myInitialBalance = 1;
		double MY_INTEREST_RATE = 0.05;
		
		int portiaTimePeriodCounter = 0;
		double portiaInitialBalance = 100000;
		double PORTIA_INTEREST_RATE = 0.04;
		
		while(myTimePeriodCounter < TIME_PERIOD){
			myEndBalance = myInitialBalance *(Math.pow((1+ MY_INTEREST_RATE ), TIME_PERIOD));
			myTimePeriodCounter = myTimePeriodCounter + 1;
		}
		
		while(portiaTimePeriodCounter < TIME_PERIOD){
			portiaEndBalance = portiaInitialBalance *(Math.pow((1+ PORTIA_INTEREST_RATE ), TIME_PERIOD));
			portiaTimePeriodCounter = portiaTimePeriodCounter + 1;
		}
		
		System.out.println("I had " + myEndBalance + " dollars in year " + TIME_PERIOD );
		System.out.println("Portia had " + portiaEndBalance + " dollars in year " + TIME_PERIOD );
		
	}

}
