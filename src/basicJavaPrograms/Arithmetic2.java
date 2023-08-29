package basicJavaPrograms;
                        // program to perform Arithmetic operation & giving user input
import java.util.Scanner;

public class Arithmetic2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);  // create object of scanner class to take input from user
		
		System.out.println("Enter two number: ");
		int a= sc.nextInt();    //reads an integer from the user and stores it in the variable a
		int b= sc.nextInt();
		
		System.out.println("Addition\t" + (a + b));
		System.out.println("Substraction\t" + (a - b));
		System.out.println("Multiplication\t" + (a * b));
		System.out.println("Division\t" + (a / b));
		System.out.println("Division\t" + (a % b));

	}

}

// you can separate declare a and b like int a,b; but it is easiest way.