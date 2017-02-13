package extraCredit;

public class ShuffleSolution {
	
	//Fields needed to store the values of the instances of object ShuffleSolution
    public int[] nums;
	private int[] copyOfArray;
	
    public ShuffleSolution(int[] nums) {
    	this.copyOfArray = nums.clone(); 			//Clever way found on Google to clone the value of the original array
        this.nums = nums;   
    }
     
    /** Resets the array to its original configuration and return it. */
    public int[] reset() {
    	
    	for (int i = 0; i < copyOfArray.length; i++){
    		System.out.println("The original order of the array is " + copyOfArray[i]);
    	}
    	
         return copyOfArray;
    }
     
    /** Returns a random shuffling of the array. */
    public int[] shuffle() {
		
    	//Used previous Cards code for help
		for(int maxCounter = nums.length - 1; maxCounter >= 0; maxCounter-- ){
			int randomIndex = (int) (Math.random() * (maxCounter + 1));					// Math to cast an int of a randomly generated number between 0 and counter + 1
			int temp = nums[randomIndex];												// because of the restriction of the random library
			nums[randomIndex] = nums[maxCounter];
			nums[maxCounter] = temp;
    		System.out.println("The random order of the array is " + nums[maxCounter]);

		}
		return nums;
    }

	public static void main(String[] args) {
		// Init an array with set 1, 2, and 3.
		int[] nums = {1,2,3};
		
		ShuffleSolution solution = new ShuffleSolution(nums);
//		// Shuffle the array [1,2,3] and return its result. Any permutation of [1,2,3] must equally likely to be returned.
		solution.shuffle();
//		 
//		// Resets the array back to its original configuration [1,2,3].
		solution.reset();
//		 
//		// Returns the random shuffling of array [1,2,3].
		solution.shuffle();
	}

}
