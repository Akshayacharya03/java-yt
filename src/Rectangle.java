              /*  Area of rectangle program  */
// input length
// input breadth
// formula length*breadth
  import java.util.Scanner;
  class Rectangle 
   {
   public static void main(String[] args) {
		 
	 int l,b,area;
	 System.out.println("enter value of sides ");
     Scanner r=new Scanner(System.in); // take input from user
     l=r.nextInt();  // 12
     b=r.nextInt();  // 13
     area=l*b;       // 12*13=156
     System.out.println("Area of rectangle "+area);
     
	}

}
