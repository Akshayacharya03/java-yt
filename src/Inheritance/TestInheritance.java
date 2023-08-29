                                              
  package Inheritance;
                                       /* Simple Inheritance (I used different approach)  */
  class Student1   //Superclass 
  {
	  int roll,marks;
	  String name;
	  
	  void input()
	  {
		  System.out.println("Enter roll, name and marks: ");
	  }
  }
  class Akshay1 extends Student1   //subclass
  {
	  void disp()
	  {
		roll=2; name="Akshay"; marks=94;
		System.out.println(roll+" "+name+" "+marks);
	  }
  }
  class TestInheritance {                          // create separate class in which add main method. it look easy to read
	  public static void main(String[] args)
	  {
		  Akshay1 obj= new Akshay1();     // here, I have created new object (obj) of subclass Akshay. becz subclass "Akshay" inherits all features of superclass "student" so Akshay contains more feature so we created object of "Akshay" class.  
		  obj.input();  // call input() method
		  obj.disp();   // call disp() method
	  }
  }

