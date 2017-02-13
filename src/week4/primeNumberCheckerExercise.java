package week4;

public class primeNumberCheckerExercise {
	//A method to check if a given number N is a prime number
	
	public static void main(String[] args){

	int numberToCheck = 25;
	int evenChecker = 2;
	int oddChecker = 3;
	
	//checks if number is a multiple of 2
	if(numberToCheck % evenChecker == 0){
		return;
	}
	//checks if n is a multiple of 3

	while(oddChecker* oddChecker <= numberToCheck) {
		oddChecker += 2;
				if(numberToCheck % oddChecker == 0){
					return;
				}
			System.out.print("prime");
		}
		
	

	
	}
}
