/**
 * CSI 201 EC 2: powerOfSolution.java – Power of ?
 * @author Surendra Persaud NETID: SP155681
 * @dateDue 10/08/16
 * 
 */
package extraCredit;

public class powerOfSolution {

	public static boolean powerOfNumber(int num, int base) {

		if (num == 1 && base == 1) {
			return true;
		} else if (num == 1 || base == 1) {
			return false;
		}

		while (num >= base) {

			if (num % base != 0) {
				return false;
			}

			num = num / base;

		}
		if (num == 1) {
			return true;
		} else {
			return false;
		}
	}

	public static void main(String[] args) {

		System.out.println(powerOfNumber(121, 11));
	}


}
