
package week5;

public class tuesday {
	
		
	public static void main (String[] args){
		int f = 0, g = 1;
		int i = 0;
		while (i <= 15) {
		   System.out.println(f);
		   f = f + g;
		   g = f - g;
		   i = i + 1;
		}
	}

}

