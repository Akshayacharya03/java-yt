                       
                             ///compare arrays using equals() methods

package Arrays;

import java.util.Arrays;

public class BiggestArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		int b[]= {10,20,30,40,50};
		
		if(Arrays.equals(a,b))
		{
			System.out.printf("both are equal");
		}
		else
		{
			System.out.printf("both are not equal");
		}
	}

}

/* when we want to compare value of the array then use equal() method

 In this program, we have to compare objects of array a and b to check if they are equal or not
 
  
   Arrays.equals() method compares the elements of the two arrays a and b. 
   The elements of a and b are the same, so the method returns true.
                                                            */