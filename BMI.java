import java.util.Scanner;

public class BMI 
{
	public static void main (String[] args){

		int weight;
		int height;


		Scanner sc = new Scanner (System.in);

		System.out.println ("BMI Calculator");

		// Prompt the user to input their weight in pounds

		System.out.println ("Enter your weight in pounds: ");
		weight = sc.nextInt();

		// Prompt the user to input their height in feet

		System.out.println ("Enter your height in feet: ");
		height = sc.nextInt();

		// Convert pounds to kilograms and feet to meters.

		double kilograms = weight / 2.205;
		double meters = height / 3.281;

		System.out.println ("Your weight in kilograms is: " + kilograms);
		System.out.println ("Your height in meters is: " + meters);

		// Create a code to calculate the BMI

		double bmi = kilograms / (meters*meters);

		System.out.println ("Your BMI is: " + bmi);






	}
}