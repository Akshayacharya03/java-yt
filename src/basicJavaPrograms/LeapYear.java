package basicJavaPrograms;
                                /* Java Program to Check Leap Year */
import java.util.Scanner;
public class LeapYear {

	public static void main(String[] args) {
		
		Scanner s = new Scanner(System.in); 
		
		System.out.println("Enter year:");
		int year = s.nextInt();

		boolean isLeapYear = false;
		
		if(year % 4 == 0) {
			isLeapYear=true;
		} else if(year % 100 == 0 && year % 400 == 0) {
			isLeapYear = true;
		}
		if(isLeapYear)
		{
			System.out.println(year + " is a leap year.");
		} else {
			System.out.println(year + " is not leap year.");
	}

	}

}

// A leap year is a year that has 366 days instead of the usual 365 days. This is done to keep the calendar year synchronized with the astronomical year, which is the time it takes the Earth to orbit the Sun.
/* The rules for leap years are as follows:
     - A year is a leap year if it is divisible by 4.
     - However, a year that is divisible by 100 is not a leap year unless it is also divisible by 400. */

/* Algorithm:
    - first prompts the user to enter a year.
    - Then, it checks if the year is divisible by 4. If it is, then the year is a leap year unless it is also divisible by 100. If the year is divisible by 100 and not by 400
    - use if else statement to print leap year or not   */