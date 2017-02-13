package classroomLab;

public class GoldenRatio {
	
	
	//Recursively
	
	public static int goldenRatioRecursively(int numberParameter){
		int n = numberParameter;
		
		//base case
		if (n == 0) {
			return n;
		} else{
			return 1 + goldenRatioRecursively(n - 1); 
		}
	}
	
	public static void main(String[] args) {
		goldenRatioRecursively(5);
		
	}

}
