 // practices of varibles, methods 
package Practice_1;

class demo {
  int a=10;  //instance variable
  static int b=20;  //static variable
  
// for creating a method 
// syntax: accessmodifer returntype methodname() {......code....}
public static void m1() {            // method M1()
  System.out.println("this is method1"); 
	int c=30;
	System.out.println(c);
}
public static void Addition(int a, int b) {    //method Addition()
  System.out.println(a+b);
}
public static void main(String[] args) 
  {
    System.out.println(Demo.b); // calling static variable using classname.variablename
		Demo.m1(); // calling method m1  
		Demo.Addition(10, 20);  //initialize Addition methods parameters
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

//you can create another class for main method ()
