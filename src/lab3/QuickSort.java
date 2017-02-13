package lab3;

public class QuickSort {

	public static int partition(City[] cityObjectArray, int left, int right, String field) { //split array
		City pivot = cityObjectArray[right - 1];
		int i = left - 1;
		int j = left;
		City temp;
		while (j < right - 1) {

			// Conditional to check if field equals "name"
			if (field.equals("name")) { 
				if (cityObjectArray[j].compareToCity(pivot) < 0) {
					i++;
					temp = cityObjectArray[i];
					cityObjectArray[i] = cityObjectArray[j];
					cityObjectArray[j] = temp;
				}

			}
			
			// Conditional to check if field equals "latitude"
			if (field.equals("latitude")) {
				if (cityObjectArray[j].compareToLatitude(pivot) < 0) {
					i++;
					temp = cityObjectArray[i];
					cityObjectArray[i] = cityObjectArray[j];
					cityObjectArray[j] = temp;

				}

			}
			
			// Conditional to check if field equals "population"
			if (field.equals("population")) { 
				if (cityObjectArray[j].compareToPopulation(pivot) > 0) {
					i++;
					temp = cityObjectArray[i];
					cityObjectArray[i] = cityObjectArray[j];
					cityObjectArray[j] = temp;

				}

			}
			j++;
		}
		temp = cityObjectArray[i + 1];
		cityObjectArray[i + 1] = cityObjectArray[right - 1];
		cityObjectArray[right - 1] = temp;
		return (i + 1);
	}
	
	//Method that sorts the array, QUICKSORT! 
	public static void quickSort(City[] cityObjectArray, int p, int r, String field) { 
		int q = partition(cityObjectArray, p, r, field);
		if (q > p) {
			quickSort(cityObjectArray, p, q, field);
		}
		if (r > q + 1)
			quickSort(cityObjectArray, q + 1, r, field);
		}

}

