import java.util.Scanner;

public class Temperature
{
	public static void main (String[] args){

		int temp1;
		int temp2;
		int temp3;
		int averageTemp;

		Scanner sc = new Scanner (System.in);

		//Prompt the user to enter three seperate temperatures in celsius.

		System.out.println ("Enter the temperature on the first day in celsius: ");
		temp1 = sc.nextInt();

		System.out.println ("Enter the temperature on the second day in celsius: ");
		temp2 = sc.nextInt();

		System.out.println ("Enter the temperature on the third day in celsius: ");
		temp3 = sc.nextInt();

		// Calculate the average temperature of the three days.
		averageTemp = (temp1 + temp2 + temp3) / 3;

		// Print the fina temperature.
		System.out.println ("The average temperature is " + averageTemp + " degrees celsius.");





	}
}