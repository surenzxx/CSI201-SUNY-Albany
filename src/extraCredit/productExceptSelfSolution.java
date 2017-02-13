/**
 * CSI 201 EC 6: productExceptSelf.java – Product Except Self
 * @author Surendra Persaud NETID: SP155681
 * @dateDue 10/27/16
 * 
 */
package extraCredit;

public class productExceptSelfSolution {

	public int[] productExceptSelf(int[] nums) {
	    int[] resultArray = new int[nums.length];
	 
	    int[] test1 = new int[nums.length];
	    int[] test2 = new int[nums.length];
	 
	    test1[0]=1;
	    test2[nums.length-1]=1;
	 
	    //Loop that checks from left to right
	    for(int i=0; i <nums.length; i++){
	        test1[i] = nums[i] * test1[i];
	    }
	 
	    //Loop that checks from right to left
	    for(int i=nums.length; i>0; i--){
	        test2[i] = test2[i] * nums[i];
	    }
	 
	    //Loop that multiplies numbers 
	    for(int i=0; i<nums.length; i++){
	        resultArray[i] = test1[i] * test2[i];
	    }
	 
	    return resultArray;
	}
	
}
