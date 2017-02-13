///**
// * CSI 201 Extra Credit 10: badVersionSolution.java – First bad version
// * @author Surendra Persaud NETID: SP155681
// * @dateAssigned 11/15/16
// * @collaborators Daryl
// * 
// */
//package extraCredit;
//
//
////You are given an API bool isBadVersion(version) which will return whether version is bad. Implement a function to find the first bad version. 
////You should minimize the number of calls to the API.
//
//public class badVersionSolution {
//
//	public int firstBadVersion(int n) {
//		//Variables that store the min and max values
//		int min = 1;
//		int max = n;
//
//		//Base case
//		if(n == 1){ 
//			return 1;
//		}
//		
//		while(min < max) {
//			int medium = min + (max)/2;			//Calculates the medium value number
//			
//			if(isBadVersion(medium) == true){ 	//If the medium value is the bad version, then the max value is the new medium
//				max = medium;
//			}
//			if(isBadVersion(medium) == false){ //If the medium value is not the bad version, then increments medium to check another number
//				min = medium + 1;
//			}
//		}
//		return min;	
//	}
//
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}
//
//}
