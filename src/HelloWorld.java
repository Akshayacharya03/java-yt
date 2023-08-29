  // java program to take input from keyboaed

   import java.util.Scanner;
   class HelloWorld 
   {
    public static void main(String[] args) 
    {
    	int a;
     // create object of Scanner class to take input from user(keyboard)
	 Scanner obj=new Scanner(System.in);
	 System.out.println(" Enter value:");
     a=obj.nextInt();
     System.out.println(a);
    }

}
