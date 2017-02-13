//package lab3;
//
//import java.util.Arrays;
//
//public class CityBackup {
//	
//	public static String toStringCityObjectArray;
//	public static String countryCode;
//	public static String cityName; 
//	public static String cityRegion;
//	public static int cityPopulation;
//	public static double cityLatitude;
//	public static double cityLongitude;
//	public static Object[] cityObjectArray = new Object[4];
//
//	public CityBackup(String countryCodeP, String cityNameP, String cityRegionP, int cityPopulationP, double cityLatitudeP, double cityLongitudeP) {
//		countryCode = countryCodeP;
//		cityName = cityNameP;
//		cityRegion = cityRegionP;
//		cityPopulation = cityPopulationP;
//		cityLatitude = cityLatitudeP;
//		cityLongitude = cityLongitudeP;
//		
//	}
//	
//	public String toString() {
//		cityObjectArray[0] = new String(cityName);
//		cityObjectArray[1] = new Integer(cityPopulation);
//		cityObjectArray[2] = new Double(cityLatitude);
//		cityObjectArray[3] = new Double(cityLongitude);
//
//		toStringCityObjectArray = Arrays.toString(cityObjectArray);		
//		return toStringCityObjectArray;  
//
//	}
//
//	public static void main(String[] args) {
//		City testInstance = new City("countryCode","cityName","cityRegion",100,2000.44445,2000.544446);
//		System.out.print(testInstance.toString());
//	}
//
//}
//
//package Data;
//import java.util.ArrayList;
//
//import edu.princeton.cs.introcs.In;
//import edu.princeton.cs.introcs.Out;
//
///*
// * Daryle Henry
// * NedId: DH329122
// * In this instance, you cannot use the input.readString() and other associated methods to read the input, because the contents are separated by commas, but the readString method needs space to stop reading a String. So, you need to use the split method. Play with it a little bit before you start working on the rest.
//You also need to convert different String into integers and doubles. To convert a String s into an integer (if you are sure it is an integer), you will need to call methodInteger.parseInt(s), and the method returns an integer. Similarly, if you want to convert a String to a double variable, you need to call Double.parseDouble(s).
//Once you have a list of information in a particular line of the file, you can send that information into the City constructor. Since split gives you a list, you can just index into that list for each item. Remember that some of the instance variables in a City object are not strings, and so you will have to convert these strings (returned by the split method) to the appropriate types. This is an example of the importance of knowing the exact format of data you work with.
//The City constructor will give you back, as you undoubtedly know, a reference to a City object. You should append that reference to a list that you’re building up. When you’re done, the list should comprise 47913 references to City objects, one for each line in world_cities.txt. For simplicity, you should use an Array to store all the cities, notice NOT the ArrayList.
//
// */
//public class ReadCity {
//	
//	public static void main(String[] args) {
//		//String cvsSplitBy = ",";
//		City[] sortedList = new City[47913];
//		In input = new In("file:world_cities.txt");
//		// Make an array for the content of the world_cities.txt
//		int index = 0;
//		while(!input.isEmpty()){
//			String line = input.readLine();
//			String[] parsedList = line.split(",");
//	        
//			String countryCode = parsedList[0];
//			String cityName = parsedList[1];
//			String cityRegion = parsedList[2];
//			//Convert String variables to appropriate types
//			int population = Integer.parseInt(parsedList[3]);;
//			double latitude = Double.parseDouble(parsedList[4]);;
//			double longitude = 	Double.parseDouble(parsedList[5]);;
//			
//			//Constructor 
//			City world = new City(countryCode, cityName, cityRegion, population, latitude, longitude);
//			sortedList[index] = world;
//			System.out.println(sortedList[index].toString());
//			index++;
//
//		    Out output = new Out("cities_out.txt");
//		    output.println();
//			
//		
//			
//			
////			for(int i = 0; i < parsedList.length; i++){
////				if(i == 3){
////					String numberAsString = parsedList[i];
////					Integer.parseInt(numberAsString);
////				}
////				if(i == 4){
////					String numberAsString = parsedList[i];
////					Double.parseDouble(numberAsString);
////				}
////				if(i == 5){
////					String numberAsString = parsedList[i];
////					Double.parseDouble(numberAsString);
////				}
////				//System.out.println(parsedList[i]);
////			}
//			
//		}
//	}
//	
//   
//	
//}
//
////package lab3;
////
////import java.util.Arrays;
////
////public class City {
////	
////	public static String toStringCityObjectArray;
////	public static String countryCode;
////	public static String cityName; 
////	public static String cityRegion;
////	public static int cityPopulation;
////	public static double cityLatitude;
////	public static double cityLongitude;
////	public static Object[] cityObjectArray = new Object[4];
////
////	public City(String countryCodeP, String cityNameP, String cityRegionP, int cityPopulationP, double cityLatitudeP, double cityLongitudeP) {
////		countryCode = countryCodeP;
////		cityName = cityNameP;
////		cityRegion = cityRegionP;
////		cityPopulation = cityPopulationP;
////		cityLatitude = cityLatitudeP;
////		cityLongitude = cityLongitudeP;
////		
////	}
////	
////	public String toString() {	
////		cityObjectArray[0] = new String(cityName);
////		cityObjectArray[1] = new Integer(cityPopulation);
////		cityObjectArray[2] = new Double(cityLatitude);
////		cityObjectArray[3] = new Double(cityLongitude);
////		
////		for(int i=0; i < 5; i++){
////			cityObjectArray[i].toString(); 
////			System.out.print(cityObjectArray[i].toString() + ",");
////		}
////
//////		toStringCityObjectArray = cityObjectArray.toString() + ",";		
////		
////		return toStringCityObjectArray;  
////
////	}
////
////	public static void main(String[] args) {
////		City testInstance = new City("countryCode","cityName","cityRegion",100,2000.44445,2000.544446);
////		testInstance.toString();
////
////	}
////
////}
