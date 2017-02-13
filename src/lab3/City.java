/**
 * CSI 201 Lab 2: City.java – Data
 * @author Surendra Persaud NETID: SP155681
 * @dateAssigned 11/09/16
 * @collaborators Khoa, Daryl
 * 
 */

package lab3;

public class City {
	
	//Global variables for methods
	public  String countryCode;
	public  String cityName; 
	public  String cityRegion;
	public  int cityPopulation;
	public  double cityLatitude;
	public  double cityLongitude;

	//Constructor method that takes in parameters by user and sets it to global variables 
	public City(String countryCodeP, String cityNameP, String cityRegionP, int cityPopulationP, double cityLatitudeP, double cityLongitudeP) {
		countryCode = countryCodeP;
		cityName = cityNameP;
		cityRegion = cityRegionP;
		cityPopulation = cityPopulationP;
		cityLatitude = cityLatitudeP;
		cityLongitude = cityLongitudeP;

	}

	//Method that returns a String value given parameters from constructor
	public String toString() {	
		String objectString = "";
		objectString = cityName + "," + cityPopulation + "," + cityLatitude + "," + cityLongitude;
		return objectString;  
	}
	
	//Method that compares the names of the cities
	public int compareToCity(City C){ 
		return (cityName.toLowerCase().compareTo(C.cityName.toLowerCase()));
	}
	
	//Method that compares the population of the cities
	public int compareToPopulation(City C){ 
		return cityPopulation - C.cityPopulation;
	}
	
	//Method that compares the latitude of the cities
	public double compareToLatitude(City C){
		return  cityLatitude - C.cityLatitude;
	}


}
