package basicJavaPrograms;
                                    /* Java Program to Check Whether a Number is Positive or Negative */
import java.util.Scanner;
public class PositiveNum {

	public static void main(String[] args) {
		
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter number:");
		int num= sc.nextInt();
		
		if (num>0)
		{
			System.out.println(num + " number is positive number.");
		} else if (num<0) {
			System.out.println(num + " number is negative number.");
		} else { 
				System.out.println(num+ " number is not either positive or negative.");
			}
		}

	}


/* first prompts the user to enter a number. (crete scanner object )
   Then, it checks if the number is greater than 0. 
   If it is, then the number is positive. If the number is less than 0, then the number is negative. Otherwise, the number is neither positive nor negative. */

