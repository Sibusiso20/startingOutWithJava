/**
	2. Distance traveled modification
	The distance a vehicle travels can be calculated as follows:
	Distance = Speed * Time
	For example if a train travels at 40MPH for three hours, the distance traveled 
	is 120 miles. Write a program that asks for the speed of a vehicle (in MPH) and 
	the number of hours it has traveled. It should use a loop to display the distance 
	a vehicle has traveled for each hour of a time period specified by the user. For example
	if the vehicle is traveling at 40 MPH for a three hour period, it should display a report 
	similar to the one as follows:
		Hour		Distance traveled
		1			40
		2			80
		3			120
	
	Input validation: Do not accept a negative number for speed and do not accept any value less than 
	1 for time traveled. 
	
	Write a method named distance that accepts a vehicle's speed and time as arguments, and returns the 
	distance the vehicle has traveled. 
*/

import java.util.Scanner;		// Load the Scanner class
public class Challenge5_9
{
	// Main method begins. 
	public static void main(String[] args)
	{
		int speed; 				// Speed of vehicle
		double hours;			// Hours traveled
		
		// Create a scanner object for keyboard input. 
		Scanner keyboard = new Scanner(System.in); 
		
		// Ask the user to input speed.
		System.out.print("What is the speed you're traveling at? ");
		speed = keyboard.nextInt(); 
		
		// Validate that speed is not negative
		while (speed < 0)
		{
			System.out.print("Please note that speed cannot be less than zero. Re-enter a positive number: ");
			speed = keyboard.nextInt();
		}
		
		// Ask the user to input time of travel.
		System.out.print("How long, in hours, have you been traveling for? ");
		hours = keyboard.nextDouble(); 
		
		// Validate that time is >= 1
		while (hours < 1)
		{
			System.out.print("Please enter time traveled at least 1 hour: ");
			hours = keyboard.nextDouble(); 
		}
		
		// call the distance() method.
		distance(speed, hours);
	}	// End main method.
		
	// Method that accepts speed & time as arguments.
	public static void distance(int mph, double hrs)
	{
		double mileage = 0;	// Distance traveled
		
		System.out.println("Hour" + "\t" + "Distance traveled"); 
		
		// Display distance traveled for each hour
		for (int time = 1; time <= hrs; time++)
		{
			for (int pace = 0; pace <= mph; pace++)
			{
				mileage = pace * time;
			}
			System.out.printf(time + "\t\t" + mileage + "\n");
		}
	}	// End distance() method.
}		// End class.

		
		
		
	