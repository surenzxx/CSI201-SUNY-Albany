package lab3;

import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.Out;
import edu.princeton.cs.introcs.StdDraw;

public class WorldCities {

	//Method that creates and output and writes to a text file
	public static void writeTofile(String filename, City[] cityObjectArray) { 
		Out output = new Out(filename);
		for (int i = 0; i < cityObjectArray.length; i++) {
			output.println(cityObjectArray[i].toString());
		}

	}
	
	//Method that draws the number of cities
	public static void displayCities(City[] cityObjectArray, int count, int time) { 

		int windowWidth = 720;
		int windowHeight = 360;
		double x = 0;
		double y = 0;
		StdDraw.setCanvasSize(windowWidth, windowHeight);
		StdDraw.setXscale(0, windowWidth);
		StdDraw.setYscale(0, windowHeight);
		StdDraw.picture(windowWidth / 2, windowHeight / 2, "file:world.png");
		StdDraw.setPenColor(StdDraw.RED);

		for (int index = cityObjectArray.length - 1; index > cityObjectArray.length - count - 1; index--) {
			x = windowWidth / 2 + cityObjectArray[index].cityLatitude / 180 * 360;
			y = windowHeight / 2 + cityObjectArray[index].cityLongitude / 90 * 180;
			StdDraw.filledRectangle(x, y, 5, 5);
			StdDraw.pause(time);
		}
	}


	public static void main(String[] args) {
		City[] cityObjectArray = new City[47913];
		
		//Imports file to be used and creates an output file
		In input = new In("world_cities.txt");
		int i = 0;
		
		//Logic to check if the input file is filled with text
		while (!input.isEmpty()) { // read text file and arrange elements
			String cityString = input.readLine();
			String[] splitArray = cityString.split(",");
			cityObjectArray[i] = new City(splitArray[0], splitArray[2], splitArray[1], Integer.parseInt(splitArray[3]),Double.parseDouble(splitArray[4]), Double.parseDouble(splitArray[5]));
			
//			output.println(cityObjectArray[i].toString());
			
			i++;

		}
		//Test code
		QuickSort.quickSort(cityObjectArray, 0, cityObjectArray.length, "name");
		
		writeTofile("cities_alpha.txt", cityObjectArray);
		
		QuickSort.quickSort(cityObjectArray, 0, cityObjectArray.length, "latitude");
		writeTofile("cities_latitude.txt", cityObjectArray);
		QuickSort.quickSort(cityObjectArray, 0, cityObjectArray.length, "population");
		writeTofile("cities_population.txt", cityObjectArray);
		
		displayCities(cityObjectArray, 50, 1000);
		
	

	}

}