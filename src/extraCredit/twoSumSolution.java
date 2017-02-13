/**
 * CSI 201 EC 11:
 * @author Surendra Persaud NETID: SP155681
 * @dateAssigned 11/017/16
 * 
 */
package extraCredit;

public class twoSumSolution {

	public static int[] twoSumSolution (int[] nums, int target) {
	    
		//Loops through all elements in array
		for (int i = 0; i < nums.length; i++) {
	        //Nested loop to check the actual length of the array, not the index length
			for (int j = i; j < nums.length; j++) {
	            //Checks if a  value of the target number minus the i value exists
				if (nums[j] == target - nums[i]) {
	            	//returns two numbers that add up to the target
					int[] answer = {i, j};
	                return answer;
	            }
	        }
	    }
//	    int[] noSolution = {0, 0 ,0, 0};
//	    System.out.println(noSolution);
	    return null;
	}
	
	public static void main(String[] args) {
		int[] numbers = {2, 7, 11, 15};
		int target = 9;
		twoSumSolution(numbers, target);
	}
	
	
	
}

