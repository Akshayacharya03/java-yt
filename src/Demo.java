
public class Demo {
	
	int a= 10; // instance variable
	static int b=20; // staic variable
	
	// for creating a method 
	// syntax: accessmodifer returntype methodname() {......code....}
	
	public static void m1() {
		System.out.println("this is method1"); 
		int c=30;
		System.out.println(c);
	}
	public static void Addition(int a, int b) {
		System.out.println(a+b);
	}
	

	public static void main(String[] args) {
	  
		System.out.println(Demo.b); // calling static variable using classname.variablename
		Demo.m1(); // calling method m1  
		Demo.Addition(10, 20);
		Demo.Addition(129, 297);
		
		Demo test= new Demo(); // class object
		System.out.println(test.a);  //10
		System.out.println(test.b);//   20.... static variable can also be called using class object
		
		test.a = 1000;
		test.b = 2000;
		System.out.println(test.a);   //1000
		System.out.println(test.b);   //2000
		Demo test1= new Demo();
		System.out.println(test1.a);   //10
		System.out.println(test1.b);   //2000
		

	}

}

/*Algorithm:
	
	1. The class Demo is defined with two variables: a (instance variable) and b (static variable).
	2. Two static methods are defined:
         public static void m1(): This method does not return any value (void). It prints "this is method1" to the console and declares a local variable c with a value of 30 and prints its value.
         public static void Addition(int a, int b) - This method takes two integer parameters a and b and prints their sum.
    3. The main method is the entry point of the program:
         It prints the value of the static variable b using the class name Demo.
         Calls the static method m1().
         Calls the static method Addition() with different sets of integer arguments.
         Creates a new object test of class Demo.
         Prints the value of instance variable a and static variable b using the test object.
         Modifies the values of instance variable a and static variable b using the test object.
         Creates another object test1 of class Demo.
         Prints the values of instance variable a and static variable b using the test1 object.
	                                                                                                    */
	