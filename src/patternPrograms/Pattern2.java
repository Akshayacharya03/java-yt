package patternPrograms;
 // program to print reverse trangle pattern
/*  AAAAA
    AAA
    AA
    A                                          */
public class Pattern2 {

	public static void main(String[] args) {
		int n = 5; // size of n declared
		for(int i=1;i<=n;i++)  // outer loop. it prints rows
		{
			for(int j=i;j<=n;j++) // inner loop it prints columns //or for(int j=5;j<=i;j--)
			{
				System.out.print("A"); // we have to print trangle in 'A' alphabets.
		}
			//when one row is printed,we need to add a new line
		System.out.println(); 

	}

	}
}
