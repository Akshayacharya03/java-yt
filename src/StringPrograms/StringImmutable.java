package StringPrograms;

public class StringImmutable {

	public static void main(String[] args) {
		
		String a="Akshay"; //this is how we created string object called "Akshay" and it refers to variable/object reference "a"
		System.out.println(a); // print this string		
		
		// if we have to create another object
		String b="Akshay"; //we have created another string. Now the String object of b variable not used. "b" reference variables refers to String object of "a" variable called "Akshay" because it found the same object in memory
		System.out.println(a);
		
		//concate the string (object of a and b)
		a.concat("Kumar"); //now, we concate(bind two string) "a" to "kumar". so In String const pool memory, "AkshayKumar" referred as variable/object referance "a". previously b variable was referred on object of a. Now object of a changed. so what will "b" variable do? thats why java developer put string as immutable.
	}

}
