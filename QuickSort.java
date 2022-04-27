/*
 * Tim Rainey
 * BinarySearchLab 
 * 3/17/2022
 */
public class QuickSort {
	
	public static void quickSort(String[] array) {
		
		qSort(array, 0, array.length - 1);
	}

	
	 //The qSort method uses the QuickSort algorithm to sort a string array.
	 
	public static void qSort(String[] array, int start, int end) {
		
		if (start < end) {
			// Get the pivot point.
			
			int q = Partition(array, start, end);

			// Sort the first sub list.
			qSort(array, start, q - 1);

			// Sort the second sub list.
			qSort(array, q + 1, end);
		}
	}

	/*
	 * This method selects a pivot value in an array and arranges the array
	 * into two sub lists. All the values less than the pivot will be stored in the
	 * left sub list and all the values greater than or equal to the pivot will be
	 * stored in the right sub list.
	 * 
	
	 */
	private static int Partition(String[] array, int start, int end) {
		
		String x = array[end];
		
		int i = start - 1;
		
		String temp;

		/*
		 * Scan the entire list and move any values that are less than the pivot value
		 * to the left sub list.
		 */
		for (int k = start; k < end; k++) {
			
			if (array[k].compareTo(x) <= 0) {
			
				i++;
				
				temp = array[i];
				
				array[i] = array[k];
				
				array[k] = temp;
			}
		}

		// Swaps the contents of two elements in a string array.
		
		temp = array[i + 1];
		
		array[i + 1] = array[end];
		
		array[end] = temp;
		
		return (i + 1);
	}
}
