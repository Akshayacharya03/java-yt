package Arrays;

public class CompareArray {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		int b[]= {10,20,30,40,50};
		
		if(a==b)
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Both are not equal");
		}

	}

}

/* There is two ways to compare arrays in java, 1.== 2. equals() 

Alorithm:
1. declare & initialize array a and array b of type int.
2. take if else condition to check the array is equal or not

 Output is "both are not equal" but why? because when we compare array with == operator,== oerator only
 see referance variable(array variable). In, this program, we created object(object) that refers referance                       
 variable                                                                              */