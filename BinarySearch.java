
public class BinarySearch {

	public static int search(String[] array, String value) {

		int first; // First array element

		int last; // Last array element

		int middle; // Mid point of search

		int position; // Position of search value

		boolean found; // Flag

		// Set the values.

		first = 0;

		last = array.length - 1;

		position = -1;

		found = false;

		// Search.

		while (!found && first <= last) {

			middle = (first + last) / 2; // to find the middle point

			// set the parameters for locating the middle

			if (array[middle].compareTo(value) == 0) {

				found = true;

				position = middle;
			}
			// value is in lower half

			else if (array[middle].compareTo(value) > 0)

				last = middle - 1;

			// value is in upper half
			else

				first = middle + 1;
		}

		return position;
	}
}
