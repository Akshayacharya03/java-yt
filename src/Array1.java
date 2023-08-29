     /*print array elements using for loop*/
public class Array1 {

	public static void main(String[] args) {

		int a[];   //declaration
		a=new int[3]; //creation
		//int a[]=new int[3]; // declare & allocate memory for array
		
		a[0]=10;
		a[1]=20;
		a[2]=30;
		
		for(int i=0;i<3;i++)  //using for loop
		{
			System.out.print(a[i]+" ");
		}

	}

}




