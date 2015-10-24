/*************************************
 * Brendan Shine 
 * Mr. Kiedes Period 2               *
 * 10-20-15             
 * Palindrome                        *
 *                                   *
 ************************************/

// Lab08vst.java
// The "Palindrome" Program
// This is the student starting file.

import java.util.Scanner;

public class Lab08vst {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		boolean notFinished = false;
		do {
			System.out.print("Enter a string  ===>>  ");
			String str = input.nextLine();
			System.out.println();
			System.out.println("Entered String:     " + str);
			System.out.println("Palindrome:         " + Palindrome.isPal(str));
			System.out.println("Almost Palindrome:  "
					+ Palindrome.almostPal(str));
			System.out
					.print("Do you wish to repeat this program [Y/N]?  ===>>  ");
			String repeat = input.nextLine();
			notFinished = (repeat.equals("Y")) || (repeat.equals("y"));
			System.out.println();
		} while (notFinished);
	}
}

class Palindrome {
	/*
	 * Precondition: s is an arbitrary String. Postcondition: The value of true
	 * is returned if s is a Palindrome, false otherwise. Note: This method is
	 * required for both the 80 point and the 100 point.
	 */
	
	//checks to be a palindrome or not
	public static boolean isPal(String s) {
		String lowerC = s.toLowerCase(); //makes everything lowercase
		String s2 = "";
		for (int k = s.length() - 1; k >= 0; k--) {
			s2 += lowerC.charAt(k); //string backwards

		}

		if (lowerC.equals(s2))
			
			return true; // This statement is provided to allow initial
							// compiling.
		else
			return false;
	}
	
	/*
	 * Precondition: s is a String of one character. Postcondition: The value of
	 * true is returned if s is a letter and false otherwise. Note: >>>>> This
	 * method is only completed for the 100 point version <<<<<
	 */
	private static boolean isLetter(char letter) {
		//see if character is letter
		if(letter >= 'a' && letter <= 'z')
		   	return true;
		else
		 return false;
			
	}
	/*
	 * Precondition:  s is an arbitrary String.
	 * Postcondition: All non-letter characters are removed from s, and this "purged" String is returned.
    * Note:          >>>>> This method is only completed for the 100 point version  <<<<<
	 */
	private static String purge(String s)
	//finds the non letters of the String
	{
		String lowerC = s.toLowerCase();
		   String purgedL = "";
		   //finds characters in the index from isLetter and adds the letter to the String
		   for(int k = 0;k < lowerC.length();k++)
		   	{
			   if(isLetter(lowerC.charAt(k))== true)
				   purgedL += lowerC.charAt(k);
		   	}
		   return purgedL;        // This statement is provided to allow initial compiling.
	}
   
	

	/*
	 * Precondition: s is an arbitrary String. Postcondition: All non-letter
	 * characters are removed from s. Note: This method is only completed for
	 * the 100 point version. private static String purge(String s) { return "";
	 * // This statement is provided to allow initial compiling. }
	 * 
	 * /* Precondition: s is an arbitrary String. Postcondition: After purging
	 * all non-letter characters from s, the value of true is returned if the
	 * resulting String is a Palindrome, false otherwise. Note: This method is
	 * only completed for the 100 point version.
	 */
	public static boolean almostPal(String s) {
		//returns the almost palindrome
			if (isPal(s) == false)
				return isPal(purge(s)); // This statement is provided to allow initial
							// compiling.
			else
			return false;
		
		}

}
