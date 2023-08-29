
public class Girl 
{
	int age=21;           
	int weight=47;      
	String color="light";    
	
	void drink()      // method/function
	{
		System.out.println("She is drinking water");
	}
   void sleep()
   {
	   System.out.println("She is sleeping on the bed");
   }
	public static void main(String[] args) 
	{
		Girl girl1=new Girl();    // creating new object (girl1)
		
		//accessing variables using object/variable reference
		System.out.println(girl1.age);   
		System.out.println(girl1.weight);
		System.out.println(girl1.color);
		
		//accessing function using object/variable reference
		girl1.drink();
		girl1.sleep();
		
	}

}