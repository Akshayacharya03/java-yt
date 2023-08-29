   /*print array element using for each loop*/
public class ArraysExample2 {

	public static void main(String[] args) {
		
		int a[]=new int[3]; // declare integer array 'a' and allocates memory for 3 elements
		a[0]=10;            // initialize elements
		a[1]=20;
		a[2]=30;
		
		for(int b:a)
		{
			System.out.println(b);
		}

	}

}

