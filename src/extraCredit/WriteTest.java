package extraCredit;

public class WriteTest {
	   
	  public static boolean isPrime(int n) {
	    boolean prime = true;
	    int i = 2;
	    while (i <= n / 2) {
	      if (n % i == 0) {
	        return false;
	      }
	      i += 1;
	    }
	    return true;
	  }
	 
	  public static void main(String[] args) {
	    // TODO Auto-generated method stub
	 System.out.println(isPrime(7));
	  }
	}