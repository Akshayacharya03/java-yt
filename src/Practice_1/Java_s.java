package Practice_1;

public class Java_s {

	public static void main(String[] args) {
		//create a string literal
		String str1 = "Akshay";
	
		//create a string using new keyword
		String str2 = new String("Acharya");
				
		// print the string
		System.out.println(str1);
		System.out.println(str2);
		
		//concat the two string & print the result
		System.out.println(str1+ " " +str2);
		
		//find the length of string "Akshay"
		System.out.println(str1.length());
		
		//check two string are equal or not
		System.out.println(str2.equals(str1));
		
		//using trim method. 
		String c= "  Dada  ";
		System.out.println(c.trim()); //this method remove blank spaces.
		
		//using isEmpty
		String d = " ";
		System.out.println(d.isEmpty()); // it returns true if the value of d is empty
		
		

	}

}
