/**
	Write a method names showCar. The method should accept two arguments: a 
	reference to a string object and an integer. The integer argument is a 
	character position within the String, with the first character being at 
	position 0. When the method executes, it should display the character at 
	that character position. Here is a example of a call to that method: 
		showCar("New York", 2);
*/
import java.util.Scanner;		// Load the Scanner class. 
public class Challenge5_1
{
	public static void main(String[] args)
	{
		String s = " "; 	// declare a string argument. 
		int position; 		// String position to be displayed. 
		
		Scanner input = new Scanner(System.in);
		
		// Prompt user for a string.		
		System.out.print("Please enter a string: "); 
		s = input.nextLine();
		
		// Prompt user for a character position. 
		System.out.print("Enter a string position to be displayed: ");
		position = input.nextInt(); 
		
		// Call the showCar() method:
		showCar(s, position);
	}
		
	public static void showCar(String myString, int myPos)
	{
		char result = myString.charAt(myPos);
		System.out.print("Display '" + result + "', because it is in position " + 
						myPos + ".");
	}
}	// End of class.
		