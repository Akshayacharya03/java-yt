                   /* Search Array Elements */
// a[5] = 10 20 30 40 50
// Search item 30 ---> item found
// if Search item 70 ---> item not found
package Arrays;
import java.util.Scanner;
public class SearchArray {

	public static void main(String[] args) {
		
		int a[]=new int[5]; int n, count=0;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter array elements ");
		for(int i=0;i<a.length;i++)    
		{
			a[i]=s.nextInt();   // nextInt method stores integer values in array  // input a items
		}
		System.out.println("Array elements ");
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]+" ");  //print array elements    // output a items
		}
		System.out.println("Enter Search elements ");
		// now we take runtime input to search array element
		n=s.nextInt();  // for that we use nextInt method. call this method by referance of scanner and stores this searching items in variable n. n is searching variable.
		for(int i=0;i<a.length;i++)
		{
			if(a[i]==n)  //if array i is equal to searching items     // condition in for loop
			{
				count++;   // then it increases the value. we take variable named count.
			}
		}
			if(count>0)  // suppose, count value occuers greater then 0  // another condition(separetely)
				System.out.println("Item found "+count+" times");  // then it prints this message
		    else
				System.out.println("Item not found"); // otherwise prints this message (count less then 0)	
			}
				
		}

		

