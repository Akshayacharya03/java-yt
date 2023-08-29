/**
 *                                                Simple inheritance
 */
package Inheritance;

  class Student   //Superclass (parent class)
  {
	  int roll,marks;
	  String name;
	  
	  void input()
	  {
		  System.out.println("Enter roll, name and marks: ");
	  }
  }
  class Akshay extends Student   //subclass
  {
	  void disp()
	  {
		roll=1; name="Akshay"; marks=84;
		System.out.println(roll+" "+name+" "+marks);
	  }
	  public static void main(String[] args)
	  {
		  Akshay obj= new Akshay();     // here, I have created new object (obj) of subclass Akshay. becz subclass "Akshay" inherits all features of superclass "student" so Akshay contains more feature so we created object of "Akshay" class.  
		  obj.input();  // using this object obj we are calling input method of student class.
		  obj.disp();   // using this object obj we are calling disp() method of Akshay class.
	  }
  }

//you can create separate class for main method in which can can create main method and also you can create object, initialize and call methods & data members(variables) in main method. save this source file by this class name.