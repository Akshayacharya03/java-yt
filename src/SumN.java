         /* Sum of first N Natural numbers */
 import java.util.Scanner;   // imports the Scanner class, which is used to read input from the user.
 class SumN 
 {
	public static void main(String[] args) {
	
		int n,sum=0;
		System.out.println("Enter no. of terms ");
		Scanner r=new Scanner(System.in);
		n=r.nextInt();
		
		for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
        System.out.println("ADDITION " +sum);
	}

}

 /* 
 The code you provided will print the sum of the first n natural numbers. For example, 
  if you enter 5 as the number of terms, the code will print the sum of 1+2+3+4+5, which is 15.
                                                                                               
      int n,sum=0;
      This code declares two variables, n and sum. The variable n will store the number of terms, 
      and the variable sum will store the sum of the first n natural numbers. 
      
     Scanner r=new Scanner(System.in);
		n=r.nextInt();
	This code prompts the user to enter the number of terms, and then it stores the user's input in the variable n.
		         
		        
	for(int i=1;i<=n;i++)
		{
			sum=sum+i;
		}
	We use loop to calculate the sum of the first n natural numbers. The loop starts at 1 and
    increments by 1 until it reaches n. For each iteration of the loop, the value of i is added to the variable sum.	         
		         
		         */