package classroomLab;

public class coinToss {

//	private coinToss coin = new coinToss();
	
	public static boolean isHead() {
		double toss = Math.random();
		if (toss < 0.5) {
			return true;
		}
		return false;
	}
	
	public static void main(String[] args){
		int counter = 0;
		int headTosses = 0;
		int tailTosses = 0;
		
		while (counter < 100){
			isHead();
			
			if (isHead() == true){
				headTosses++;
			}
			else {
				tailTosses++;
			}
			counter++;

		}
		
		System.out.println("The amount of heads tosses are " + headTosses);
		System.out.println("The amount of tails tosses are " + tailTosses);
	}
	

}
