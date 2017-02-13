/**
 * CSI 201 EC 13: MinMovesSolution.java – Min Moves Solution
 * @author Surendra Persaud NETID: SP155681
 * @dateAssigned 12/06/16
 * 
 */
package extraCredit;

import java.util.Arrays;

public class MinMovesSolution {

	public static int minMoves(int[] nums) {
		
		Arrays.sort(nums);
		
		//Indices of the first and last elements in the array  
		int first = 0;
		int last = nums.length -1;
		
		//Counter
		int i = 0;
		
		//Finds the difference of the numbers that equal the amount of moves necssary 
		//Increments the first element as until the numbers are equal 
		while (first < last) {
			i = i + nums[last] - nums[first]; 
			first++;
			last--;
		}
		
		return i;
	}

	public static void main(String[] args) {
		int[] testArray = {1, 2, 3};
		
		System.out.println(minMoves(testArray));
	}

}
