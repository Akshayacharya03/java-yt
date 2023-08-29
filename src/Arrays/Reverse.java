      /* Print array elements in reverse order */
// input a[5] = 10 20 30 40 50   ---->  50 40 30 20 10

package Arrays;

import java.util.Scanner;

public class Reverse {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		Scanner r=new Scanner(System.in);
		System.out.println("Enter Elements ");
		// for loop through value input krenge runtime me
		for(int i=0;i<a.length;i++)
		{
			a[i]=r.nextInt(); // nextInt() method se values input krenge array a me loop wise
		}
		System.out.print("Array elements are: ");
		// for loop through stored input value print krenge
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");  // spacewise array a ko print krenge
		}
		System.out.println("Reverse array are: ");
		// for loop through printed values ko reverse krenge
		for(int i=a.length-1;i>=0;i--)
		{
			System.out.println(a[i]+" ");
		}

	}

}
