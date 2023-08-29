package basicJavaPrograms;
                            /* Java Program to Check Alphabet using if else (compile time) */
public class Alphabet {

    public static void main(String[] args) {

        char c = '*';

        if( (c >= 'a' && c <= 'z') || (c >= 'A' && c <= 'Z'))
            System.out.println(c + " is an alphabet.");
        else
            System.out.println(c + " is not an alphabet.");
    }
}

/* 
          The output is: * is not an alphabet.
          This is because the character * is not a letter in the English alphabet. The English alphabet consists of the 26 letters A-Z and a-z. The character * is not one of these letters, so it is not considered an alphabet.

   In this case, the character c is the asterisk *. The ASCII value for * is 42, which is not between the ASCII values for a and z or A and Z. Therefore, the code prints the message * is not an alphabet. */