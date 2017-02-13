package week2;

public class sept8 {
	
	public static void solveQuadraticEquationExcercise() {
	
	double a, b, c, xAddition, xSubtraction;
	a = 2;
	b = 5;
	c = 3;
	
	xAddition = (-1*b + Math.sqrt( (b*b) - (4*a*c) ) ) / (2*a) ;
	xSubtraction = (-1*b - Math.sqrt( (b*b) - (4*a*c) ) ) / (2*a) ;

	System.out.println(xAddition);
	System.out.println(xSubtraction);
	}
	
	public static void loopExcercise() {
		int i = 0;
		while(i<10){
			i++;
			System.out.println("The values be: " + i);
		}
		
	}

	public static void main(String[] args) {
		loopExcercise();
	}
}