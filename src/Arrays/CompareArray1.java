package Arrays;
//compare arrays using equals() methods
import java.util.Arrays;  // Array class java ke util package me hota hai so we have to import it.
public class CompareArray1 {

	public static void main(String[] args) {
		
		int a[]= {10,20,30,40,50};
		int b[]= {10,20,30,40,50};
		
		if(Arrays.equals(a,b)) 	// equals accept as a parameters so we take a & b. equals() is method of Array class so we call this method by Arrays
		{
			System.out.println("Both are equal");
		}
		else
		{
			System.out.println("Both are not equal");
		}

	}
}
	/*
//    equals() ye sirf array ke andr ka data check krata hai, uska referance variable
      se koi lena dena nhi hota    */