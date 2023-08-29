package javalearning;
import java.util.Scanner;            //java package
public class Sum {

	public static void main(String[] args) {

       //variable declaration
		int a,b,c;
		
		//print statement
		System.out.println("enter any two number:");
		
		//create object
		Scanner ss=new Scanner(System.in);
		
		a=ss.nextInt();       //Read user input
		b=ss.nextInt();       //Read user input
		
		c=a+b;              //sum of two number
		System.out.println("sum of two number: "+c);
	}

}
                                              