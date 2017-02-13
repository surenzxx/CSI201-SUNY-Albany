/**
 * CSI 201 EC 5: isPalindrome.java – Palindrome
 * @author Surendra Persaud NETID: SP155681
 * @dateDue 10/20/16
 * 
 */
package extraCredit;

public class isPalindrome {
	
	public static boolean palindromeChecker(String s){
	    for(int i = 0; i < s.length()/2; i++){
	    	
	        int j = s.length() - 1 - i;
	        
	        if(s.charAt(i) != s.charAt(j))
	            return false;
	    }
	    return true;
	}
}
