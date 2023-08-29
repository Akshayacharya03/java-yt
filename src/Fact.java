import java.util.Scanner;

/* Find factorial of a number */
// input 5 -----> 120  (5*4*3*2*1)
 
class Fact {

	public static void main(String[] args) {
	
		int n,fact=1;
		System.out.println(" Enter any Number ");
		Scanner r=new Scanner(System.in); //Create scanner class object to take user to input
		n=r.nextInt();  //it stores the user's input in the variable n.
		
		for(int i=1;i<=n;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial "+fact);
	}

}

/*  The factorial of a number is the product of all the positive integers less than or equal to that number. 
   For example, the factorial of 5 is 120, because 5! = 1 * 2 * 3 * 4 * 5 = 120.
 
    int n,fact=1;
 This code declares two variables, n and fact. The variable n will store the number, and the variable fact 
 will store the factorial of the number.

*/