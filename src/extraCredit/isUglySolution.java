/**
 * CSI 201 EC 3: isUglySolution.java – Ugly Number
 * @author Surendra Persaud NETID: SP155681
 * @dateDue 10/15/16
 * 
 */
package extraCredit;

public class isUglySolution {

	public boolean isUgly(int num) {
		
	    if(num%2==0){
	        num=num/2;
	        return isUgly(num);
	    }
	 
	    if(num%3==0){
	        num=num/3;
	        return isUgly(num);
	    }
	 
	    if(num%5==0){
	        num=num/5;
	        return isUgly(num);
	    }
	 
	    return false;
	}
}
