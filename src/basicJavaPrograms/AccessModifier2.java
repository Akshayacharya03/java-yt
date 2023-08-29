package basicJavaPrograms;

class A3 {
	 Protected int x=10;
	 public void akshay() {
		 System.out.println("Hi,Akshay!");
	 }
	 
}
 class AccessModifier2 {
	public static void main(String[] args) {
		A3 obj=new A3();
		System.out.println(obj.x);
		obj.akshay();
	 }
 }
		