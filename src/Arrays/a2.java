package Arrays;

import java.util.Scanner;

public class a2 {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		Scanner s= new Scanner(System.in);
		System.out.print("Enter array Elements ");
		for(int i=0;i<a.length;i++)  // ( Tip: Also, you can take i<5 instead of i<a.length. this will execute array from start to end index )
		{
			a[i]=s.nextInt();  // take runtime input (array ke 5 input kr diye)
		}
		System.out.print("Print array elements ");
		// 5 elements ko loop through print kr diya
		for(int i=0;i<a.length;i++)
		{
			System.out.print(a[i]+" ");  // this is how we will print this stored array
		}
		System.out.println("\nArray size is "+a.length);
		
	}

}
