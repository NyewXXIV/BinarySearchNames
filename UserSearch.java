
import java.io.*;
import java.util.Scanner;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;
import java.util.ArrayList;

public class UserSearch {
	
	public static void main(String[] args) throws IOException {
		
		int result; // to store results

		String searchValue;// for string value needed to be searched

		String input;// to hold user keyboard input.

		// An array of names to search.
		List<String> nameList = new ArrayList<String>();

		Scanner keyboard = new Scanner(System.in);
		
		try {

			
			DataInputStream dis = new DataInputStream(new FileInputStream("names.txt"));
			
			BufferedReader br = new BufferedReader(new InputStreamReader(dis));
			
			int i = 0;
			
			String line;

			while ((line = br.readLine()) != null) {
				
				nameList.add(line);
			}
			br.close();
			
		} 
		
		catch (Exception exc) {
			
			System.out.println(exc.getMessage());
		}

		String[] names = new String[nameList.size()];

		nameList.toArray(names);

		QuickSort.quickSort(names);

		// ObjectQuickSorter.quickSort(names);

		do {
			// Get a value to search for.
			System.out.print("Enter a value to search for: ");
			
			searchValue = keyboard.nextLine();

			// Search for the value
			
			result = BinarySearch.search(names, searchValue);

			
			
			if (result == -1)
				System.out.println(searchValue + " was not found.");
			else {
				System.out.println(searchValue + " was found at " + " " + result);
			}

			
			System.out.print("Search again? (Y or N): ");
			
			input = keyboard.nextLine();
		} 
		
		while (input.charAt(0) == 'y' || input.charAt(0) == 'Y');
	}

}
