/**
 * CSI 201 EC 12: CountingBits.java – Counting Bits
 * @author Surendra Persaud NETID: SP155681
 * @dateDue 11/24/16
 * 
 */
package extraCredit;

public class CountingBitsSolution {
	
	public int[] countBits(int numParameter) {
	    int[] outcome = new int[numParameter+1];
	 
	    for(int i=0; i<=numParameter; i++){
	        outcome[i] = countEach(i);
	    }
	 
	    return outcome;
	}
	 
	public int countEach(int numParameter){
	    int outcome = 0;
	 
	    while(numParameter != 0){
	        if(numParameter%2 == 1){
	            outcome++;
	        }
	        numParameter = numParameter/2;
	    }
	 
	    return outcome;
	}
}
