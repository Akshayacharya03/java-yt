package Inheritance;

    class Inheritance3 
{
	   protected int a, b;
	   String name;
	   
	   void disp()
	   {
		   System.out.println("Enter value of a,b and name: "+a+" "+b+" "+name);
	   }  
}
class Inheritance4 extends Inheritance3
{
	   int c,d;
	   
	   void disp2()
	   {
		   a=10; b=20; name="Akshaybhai"; c=30; d=40;
		   System.out.println("Enter value of a,b and name: "+a+" "+b+" "+c+" "+d+" ");
	   }
}
class Inhe_Test {
	public static void main(String[] args) {
		
		Inheritance4 o= new Inheritance4();
		o.disp2();
		
	}
}
