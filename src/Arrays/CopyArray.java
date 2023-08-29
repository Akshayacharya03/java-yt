                                  /* Copy array elements */
// first a[]= 10 20 30   ---->  second b[]= 10,20,30   
package Arrays;
import java.util.Scanner;
public class CopyArray {

	public static void main(String[] args) {
		
		int a[]=new int[5];
		int b[]=new int[5];
		Scanner s=new Scanner(System.in);
		System.out.println("Enter value in first array ");
		for(int i=0;i<5;i++)
		{
			a[i]=s.nextInt();
		}
		System.out.println("Print elements of first array ");
		for(int i=0;i<5;i++)
		{
			System.out.println(a[i]+" ");
		}
		System.out.println("print elements of second array");
		for(int i=0;i<5;i++)
		{
		b[i]=a[i];  // copy element of array a to array b
		System.out.println(b[i]+" ");
		}
	

	}

}


/* In this program, we will copy elements of array a to array b. so size and type of array b should be same as array a.
its ok to big size of array b but should not less then array a bacause when size of b is less then array a then it occur problem 
storing data */