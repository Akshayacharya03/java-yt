                      /* Program to create String using String literal */
package StringPrograms;

public class StringLiteral {

	public static void main(String[] args) {
		
		String a="Akshay"; //this is how we created string object called "Akshay" and it refers to variable/object reference "a"
		System.out.println(a); // print this string		
		
		// if we have to create another object
		String b="Akshay"; //we have created another string. Now the String object of b variable not used. "b" reference variables refers to String object of "a" variable called "Akshay" because it found the same object in memory
		System.out.println(b);

	}

}
