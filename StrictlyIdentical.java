import java.util.*;
public class StrictlyIdentical {

	/**
	 * @param args
	 */
	public static void main(String[] args) { 
	// Sample run: Enter 5 elements of list 1: 23 55 31 2 10
				// Enter 5 elements of list 2: 23 55 31 2 10
				// Both lists are strictly identical
		
	// create a code that prompts the user to enter two lists of integers of size 5 and displays whether the two are identical
	// create a space for user to enter list 1
		Scanner input = new Scanner(System.in);
		System.out.println("Enter 5 elements of list 1: ");
		int size = 5;
		
	// declare array for list 1
		int[] list1 = new int[5];
		for (int i = 0; i < size; i++)
		{ 
			list1[i] = input.nextInt();// system saves the input of list 1 to the array
		}
		
	// create a space for user to enter list 2
		System.out.println("Enter 5 elements of list 2: ");
		 
	// declare array for list 2
		int[] list2 = new int[5];
		for (int i = 0; i < size; i++)
		{ 
			list2[i] = input.nextInt();// system saves the input of list 2 to the array
		}
		
	// system will check if both the lists are identical. If identical then it will return a statement stating that. If the lists are not identical, then the system will return a statement stating that they are not identical.
		if (equals(list1, list2)) 
		{
			System.out.println("Both lists are strictly identical");
		} else
			{
			System.out.println("Both list are not strictly identical");
			}
		
		
	}
	// create boolean statement. if both list are identical then the statement will return as true. If both list are not identical, then the statement will return as false.
	public static boolean equals(int[] array1, int[] array2) 
	{
		if (array1.length != array2.length) 
		{
		return false;
		}
		
		for (int i = 0; i < array1.length; i++)
		{
			if (array1[i] != array2[i]) 
			{
				return false;
			}
			
		}
		
		return true;
		
	}
	
}
	


