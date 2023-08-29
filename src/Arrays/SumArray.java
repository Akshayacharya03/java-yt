              /* find sum of array element */
package Arrays;

import java.util.Scanner;
public class SumArray {

	public static void main(String[] args) {
		
		int a[]=new int[5]; int sum=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter elements in array ");
		for(int i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Array elements ");
		for(int i=0;i<5;i++)  // suppose i=0 then, 0<5 so condition is true // i=1 then, 1<5 so condition is true
		{
			System.out.println(a[i]+" ");
			sum=a[i]+sum; // then a[o]+sum 
			              //      10+0=10 so now sum is 10   
			              // then a[2]+10  
			              //      20+10=30 so now sum is 30
			              // again go to loop & repeat it until condition is false
		}
		System.out.println("Addition of array element "+sum);  // we will write this print statement becauese we want only one loop
		

	}

}


/* In this program, we will find sum(addition) of all elements of array and print it */