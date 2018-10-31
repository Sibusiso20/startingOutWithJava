/** 
	2. Retail Price Calculator
	We write a program that asks a user to enter an item's wholesale cost and it's 
	markup percentage. It should then display the item's retail price. For example:
	* If an item's wholesale cost is $5.00 and it's markup percentage is 100 percent, 
	then the item's retail price is $10. 
	* If an item's wholesale cost is $5, and its markup percentage is 50 percent, 
	then the item's retail price is $7.50. 
	
	The program should have a method named calculateRetail that recieves the 
	wholesale cost and markup percentage as arguments, and returns the retail price
	of the item.
*/
import java.util.Scanner;		// Bring in the scanner class.
public class Challenge5_2
{
	public static void main(String[] args)
	{
		double wholesaleCost;
		double markUpPercent;
		//double retailPrice;
		
		// Ask for user input
		Scanner keyboard = new Scanner(System.in);
		
		// Enter the items wholesale cost
		System.out.print("Wholesale cost ($): ");
		wholesaleCost = keyboard.nextDouble();
		
		// Enter the items mark up percentage;
		System.out.print("Mark up percentage (%): ");
		markUpPercent = keyboard.nextDouble();
		
		// Let's put some limits over percent values
		while (markUpPercent < 0 || markUpPercent > 100)
		{
			System.out.print("Percent values lie between 0 and 100." 
							+ " Please re-enter value: ");
			markUpPercent = keyboard.nextDouble();
		}
		
		calculateRetail(wholesaleCost, markUpPercent);
		
		//retailPrice = wholesaleCost * (1 + markUpPercent);
	}
	
	/**
		Method recieves the wholesale cost and markup percentage as arguments, 
		and returns the retail price of the item.
	*/
		
	public static void calculateRetail(double wCost, double mUpPercent)
	{
		double retailPrice;
		final int TOTAL_PERCENT = 100;
		retailPrice = wCost * (1 + mUpPercent/TOTAL_PERCENT);
		System.out.printf("The retail price of the item is $%.2f", retailPrice);	
	}
		
}