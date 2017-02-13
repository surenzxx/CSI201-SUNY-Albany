/**
 * CSI 201 EC 4: isAnagramSolution.java – Anagram
 * @author Surendra Persaud NETID: SP155681
 * @dateDue 10/20/16
 * 
 */
package extraCredit;

public class isAnagramSolution {

	public boolean AnagramChecker(String s, String t) {
	    if(s==null){
	        return false;
	    }
	    
	    if(s.length() != t.length()){
	        return false;
	    }
	    
	    int[] array = new int[26];		//amount of letters in the alphabet
	    
	    for(int i=0; i<s.length(); i++){
	    	
	        array[s.charAt(i)-'a']++;
	        array[t.charAt(i)-'a']--;
	        
	    }
	 
	    return true;
	}

}
