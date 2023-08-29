import java.util.Scanner;
public class Calculator {

	public static void main(String[] args) {
	
		int a,b,c,ch;
		//Create an object of scanner class to take runtime input from user
		Scanner s=new Scanner(System.in);     
		
		System.out.print("Enter any two numbers: ");
		a=s.nextInt();
		b=s.nextInt();
		
		System.out.print("Enter your choice: ");
        ch=s.nextInt();
        
        switch(ch)
        {
        case 1: c=a+b;
		System.out.print("Addition "+c);
		break;
		
        case 2: c=a-b;
		System.out.print("Substraction "+c);
		break;
		
        case 3: c=a*b;
		System.out.print("multiplication "+c);
		break;
		
        case 4:c=a/b;
		System.out.print("Division "+c);
		break;
		
        case 5: c=a%b;
		System.out.print("Remainder "+c);
		break;
		
		default:
			System.out.println("Invalid choice...");
        }
	}
}


