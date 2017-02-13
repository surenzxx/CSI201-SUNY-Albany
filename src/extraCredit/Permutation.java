package extraCredit;

public class Permutation {
	  public static void perm(String s) {
	    perm ("", s);
	  }
	  public static void perm(String prefix, String s) {
	    int n = s.length();
	    if (n == 0) {
	      System.out.println(prefix);
	    }
	    for (int i = 0; i < n; i++) {
	      perm(prefix + s.charAt(i), s.substring(0, i) + s.substring(i+1, n));
	    }
	  }
	 
	  public static void main(String[] args) {
//	    int n = 9;
//	    String alphabet = "abcdefghijklmnopqrstuvwxyz";
//	    perm(alphabet.substring(0, n));
		  
		  System.out.println(true || false && false || true && (true || false));
	  }
}