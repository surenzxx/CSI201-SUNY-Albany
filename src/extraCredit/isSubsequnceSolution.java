/**
 * CSI 201 EC 13: isSubsequenceSolution.java – is Subsequence
 * @author Surendra Persaud NETID: SP155681
 * @dateAssigned 11/29/16
 * 
 */

package extraCredit;

public class isSubsequnceSolution {

	public boolean isSubsequence(String shortString, String longString) {
	    int counter=0;
	    int i=0;
	    
	    while( counter < shortString.length() && i < longString.length() ){
	        if(shortString.charAt(counter) == longString.charAt(i)){
	            counter++;
	        }
	        i++;
	 
	        if(counter == shortString.length()){
	            return true;
	        }
	    }
	 
	    return false;
	}

}
