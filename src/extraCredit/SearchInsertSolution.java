package extraCredit;

public class SearchInsertSolution {
	
	public static void rotateArray(int[] nums, int k) {
		
	    int arrayLengthCounter = nums.length-1;
	    
	    for(int i = 0; i<= arrayLengthCounter;){
	    	
	        int middle = ( i + arrayLengthCounter) / 2;
	   	 
	        if(k > nums[middle]){
	            i = middle + 1;
	            
	        } else{
	        	System.out.print(middle);
	            return;
	        }
		    System.out.println(i);
	    }
	    return;
	}
	  public static void main(String[] args) {
		 int[] testArray = new int[] {1, 1, 3, 4};
		 rotateArray(testArray, 4);
	  
	  }
	  

}
