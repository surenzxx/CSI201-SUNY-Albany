package week3;

public class sumOfOddNumbers {
	
	public static void main (String[] args){
	
	int number = 15;
	int counter = 1;
	int sum = 0;
	
	while (counter <= (2*number - 1)){
		sum = sum + counter; 
		counter = counter + 2;
	}
	System.out.print("The sum is " + sum);
		
	}
	
}
