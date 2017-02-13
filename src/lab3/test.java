package lab3;

import edu.princeton.cs.introcs.In;
import edu.princeton.cs.introcs.Out;



public class test {

	public static City[] cityCollection;

	public test() {
		// TODO Auto-generated constructor stub
	}

	public static void main(String[] args) {
		In input = new In("file:world_cities.txt");
		int indexCounter = 0;
		while(!input.isEmpty()){
			String cityString = input.readLine();
			//Split commas and parse to set variables
			String[] parsedArray = cityString.split(",");
			cityCollection[indexCounter] = new City(parsedArray[0], parsedArray[1], parsedArray[2], Integer.parseInt(parsedArray[3]), Double.parseDouble(parsedArray[4]), Double.parseDouble(parsedArray[5]) );
			indexCounter++;
			
		}
	}

}
