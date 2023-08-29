package Arrays;
                                   /*print array elements using for loop in 1D array*/
public class Array1 {

	public static void main(String[] args) {

		int a[];   //declaration
		a=new int[3]; //creation                or   int a[]=new int [3];
		// initialization 
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		for(int i=0;i<3;i++)  //using for loop
		{
			System.out.print(a[i]+" ");
		}

	}

}
/* Algorithm 
 
     1. first declare an array called a. The new keyword is used to allocate memory for the array. The 3 in the new int[3] statement specifies the size of the array.
     2. Once the memory has been allocated, the array can be used to store data. index 0 store 10 element, index 1 store 20 element etc.
     3. to access the elements of the array, you can use a[index_no]                                             */



