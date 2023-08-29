/**
 * 
 */
package Inheritance;

   class Inheritance1 
   {
	   int a, b;
	   String name;
	   
	   void disp()
	   {
		   System.out.println("Enter value of a,b and name: "+a+" "+b+" "+name);
	   }  
   }
   class Inheritance2 extends Inheritance1
   {
	   int c,d;
	   
	   void disp2()
	   {
		   a=10; b=20; name="Akshaybhai"; c=30; d=40;
		   System.out.println("Enter value of a,b and name: "+a+" "+b+" "+c+" "+d+" ");
	   }
   }
   class Inheritance_P {
	public static void main(String[] args) {
		
		Inheritance2 o= new Inheritance2();
		o.disp();
		o.disp2();
		
	}
   }
