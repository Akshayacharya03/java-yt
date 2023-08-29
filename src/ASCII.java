           /* print ASCII value of character */
 // input  A ------> 65

 import java.util.Scanner;
 class ASCII 
 {
	public static void main(String[] args) {
	
		char ch;
		System.out.println("Enter any Character ");
		Scanner r=new Scanner(System.in);
		ch=r.next().charAt(0);  // A
		
		int a=ch;  // 65 = A
		System.out.println("ASCII value of "+ch +" is "+ a);

	}

}
