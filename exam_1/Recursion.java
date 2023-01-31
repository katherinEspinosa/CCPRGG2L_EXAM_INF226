public class Recursion {
    
    public static void main(String[] args) {
        
        // Remove letters (30 pts)

        // Instructions (Important!)

        // Without using arrays or loops or regular expressions, apply recursion to remove specific letters in
        // your full name.

        // 1. If the last letter of your surname is a vowel, remove all vowels in
        // your full name.

        // 2. If the last letter of your surname is a consonant, remove all
        // consonants in your full name.

        // 3. Use only lowercase letters
        
        // 4. Each letter should be removed one by one.

        // Example:
        // Full name is "elizer ponio jr".
        // The output should be "lzr pn jr".

        // Put your complete name in the "fullName" variable.
        // Example:
        // String fullName = "elizer ponio jr";

        String fullname = "katherine maegan espinosa";		
	
		removingLetter();
		removeLetter("Output : "+ fullname);
		System.out.println();
		letterRemoved();

        System.out.println();
        System.out.println("Submitted by: Katherine Maegan G. Espinosa (2022-105190)");


    }
        static void removeLetter(String str) {

            if (str.isBlank()){
            return;
            }
        
            char vowel = str.charAt(0);
            if (isLetter (vowel)) {
            	removeLetter(str.substring(1));
            } else {
            	System.out.print(vowel);
            	removeLetter(str.substring(1));
            }
            
        } static boolean isLetter (char v) {
        	return v == 'a' || v == 'e' || v == 'i' || v == 'o';
        }

        static void removingLetter () {
            System.out.println ("Removing vowels");
        }

        static void letterRemoved () {
            System.out.println("Vowels removed");
        }

}



