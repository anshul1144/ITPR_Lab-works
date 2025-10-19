// Writee a program to create an array of 15 numbers and find the greatest number among them.
import java.util.Scanner; //importing Scanner class for user input
/*----- Defining a class for Finding Greatest Number ----*/
class GreatestNumberFinder
{
	int[] numbers; // declaration of array to store numbers
	
	//Constructor
	public GreatestNumberFinder()
	{
		//initializing number of elements to be stored
		numbers = new int[15];
		
		//Creating object of Scanner class to initialize elements into the array
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter any 15 numbers : ");
		for(int index = 0; index < numbers.length; index++)
		{
			numbers[index] = sc.nextInt(); //Reading input and storing number at given index in array
		}
		System.out.println("--------------------------------------------");
		sc.close(); //closing scanner object to avoid resource leak
	}
	
	//method to find the greatest number in the array
	private void findGreatest()
	{
		int greatest = numbers[0]; // assuming first element is greatest initially
		for(int index = 1; index < numbers.length; index++)
		{
			if(numbers[index] > greatest)
			{
				greatest = numbers[index]; // updating greatest number
			}
		}
		System.out.println("Greatest Number = " + greatest);
	}
	
	//method to display data
	public void displayData()
	{
		//Displaying numbers to the user
		System.out.println("Numbers are : ");
		for(int index = 0; index < numbers.length; index++)
		{
			System.out.print(numbers[index] + " , ");
		}
		System.out.println("\n----------------------------------");
		
		//method for finding greatest number 
		findGreatest();
	}
}
/*------------------------*/
public class Greatest_Number{

	public static void main(String[] args) {
		// Creating object
		GreatestNumberFinder g = new GreatestNumberFinder();
		g.displayData();
	}
}