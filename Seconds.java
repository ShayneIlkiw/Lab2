import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class Seconds
{
	
	public static void main (String[] args){

		int seconds;
		int minutes;
		int remainder;

		Scanner sc = new Scanner (System.in);

		// Prompt the user to enter an amount of seconds
		System.out.println ("Enter an amount of time in seconds: ");
		seconds = sc.nextInt();

		// Convert seconds to minutes
		minutes = seconds / 60;
		remainder = seconds % 60;

		System.out.println("The seconds you enter in miutes are " + minutes + ":" + remainder);


	}
}