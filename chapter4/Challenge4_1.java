/**
	Write a program that asks the user for a positive nonzero integer value. The 
	program should use a loop to get a sum of all the integers from 1 up to the 
	number entered. For example, if the user enters 50, the loop will find the sum
	of 1, 2, 3, 4, ... 50. 
*/
import java.util.Scanner;		// Bring in the Scanner class.
public class Challenge4_1
{
	public static void main(String[] args)
	{
		int userNum = 0;
		int total = 0;
		
		// Allow user to input data.
		Scanner input = new Scanner(System.in);
		
		// Ask the user to enter an integer.
		System.out.print("Enter a positive nonzero integer: ");
		userNum = input.nextInt();
		
		for (int count = 1; count <= userNum; count++)
		{
			total += count;
		}
		
		// Print out the sum of all integers from 1 to user entered value. 
		System.out.println("The sum of integers is: " + total);
	}
}