package basicJavaPrograms;

import java.util.Scanner;
public class Alphabet1 {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);  // create object of scanner class to take input from user
		
		System.out.println("Enter a characters: ");
		char c = sc.next().charAt(0);  
		
		if((c>='a') && (c<='z') || (c>='A') && (c<='Z'))
			System.out.println(c + " is an alphabet");
		else
			System.out.println(c + " is not an alphabet");
	}

}
