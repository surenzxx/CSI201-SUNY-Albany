/**
 * CSI 201 EC 7: RotateArray.java – Rotate Array
 * @author Surendra Persaud NETID: SP155681
 * @dateDue 10/29/16
 * 
 */
package extraCredit;

public class RotateArray {

    public void rotate(int[] nums, int k) {
        int temp;
        int last;
        for (int i = 0; i < k; i++) {
        	
            last = nums[nums.length];
            
            for (int j = 0; j < nums.length; j++) {
                temp = nums[j];
                nums[j] = last;
                last = temp;
            }
        }
    }
}
