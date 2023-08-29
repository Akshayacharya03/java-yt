           // program to find length of an array
package Arrays;

import java.util.Scanner;

public class a1 {

	public static void main(String[] args) {
		
		int a[]=new int[5]; // here we created an array and allocates memory for 5 integers.
		Scanner s=new Scanner(System.in);   // create object of scanner class to give runtime input
		System.out.print("Enter Elements "); // we pass this message to show elements have to enter
		// We write/take this loop to take input from user. we use nextInt() integer method by calling Scanner referance r and
		//it stored in array variable/referance 
		for(int i=0;i<5;i++)
		{ 
			a[i]=s.nextInt();  // input values by nextInt() method and it stored in array (runtime input)
		}
		System.out.print("Array Elements ");  // we pass this message tell us this is printed array
		// we take this loop to print stored elements
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]+" ");  // print the elements space wise
		}
		System.out.println("Array size is "+a.length); // print the length of an array using length attribute

	}

}
  


/* we use for loop in this program. but why? bacause it travels start to end and if we wrint inside it then work according to it. for example, 
if we take loop for 1 to 5, it traverse element index wise and index start from 0 so 0,1,2,3,4. And then if we call object refarence 
and assign array index then it means we can store elements of array in runtime. so it works according to what you put inside for loop.*/ 