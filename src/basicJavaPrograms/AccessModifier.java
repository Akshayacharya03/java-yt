package basicJavaPrograms;

   class A2 
   {
	 public int x=10;
	 
	 public void akshay() 
	 {
		 System.out.println("Hi, Akshay!");
	 }
	 
   }
    class AccessModifier 
    {
	public static void main(String[] args) {
		A2 obj=new A2();
		System.out.println(obj.x);
		obj.akshay();
	 }
    }
		
		

