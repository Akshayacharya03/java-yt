            /*take runtime input and print numbers */

  import java.util.Scanner;
  public class TakeRuntimeInput {

	public static void main(String[] args) {

		var sc=new Scanner(System.in); //create object of scanner class to take input from user
		int size=sc.nextInt();
		
		int numbers[]=new int[size]; 
		
		for(int i=0;i<size;i++)
		{
			System.out.println(numbers[i]);
		}	
		
	}

}
