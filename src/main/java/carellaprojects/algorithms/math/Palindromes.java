package carellaprojects.algorithms.math;

/**
 * <p>
 * A class that detects whether or not a number or string is a palindrome.
 * </p>
 * 
 * @author Anthony Carella
 *
 */
public class Palindromes {
    /**
     * <p>
     * Overloaded method that checks if a number is a palindrome.
     * </p>
     * 
     * @param number The number that  needs to be checked  to see if it  is or is not a palindrome.
     * @return true Returns true if the returned number reversedNumber equals the number parameter.
     *         Otherwise, returns false.
     */
    public static boolean isPalindrome(int number) {
        int reversedNumber = Palindromes.reverse(number);
        if (number == reversedNumber) {
            System.out.println(number + " is a palindrome.");
            return true;
        } else {
            System.out.println(number + " is not a palindrome.");
            return false;
        }
    }

    /**
     * <p>
     * Overloaded method that checks if a string is a palindrome.
     * </p>
     * @param word
     * @return true if the returned word reversedWord equals the word parameter.
     *         Otherwise, returns false.
     */
    public static boolean isPalindrome(String word) {
        String reversedWord = Palindromes.reverse(word);
        if (word.equals(reversedWord)) {
            System.out.println(word + " is a palindrome.");
            return true;
        } else {
            System.out.println(word + " is not a palindrome.");
            return false;
        }
    }

    /**
     * <p>
     * Reverses a number.
     * </p>
     * 
     * @param number
     * @return a reversed version of the number parameter.
     */
    private static int reverse(int number) {
        int reverse = 0;
        while(number != 0) {
            reverse = reverse * 10;
            reverse = reverse + number % 10;
            number = number / 10;
        }
        return reverse;
    }

    /**
     * <p>
     * Reverses a string. Strings are reversed in this method by using a {@code for} loop to
     * traverse the {@code characterString} parameter from the strings {@code length() - 1} to 0.
     * </p>
     * 
     * @param characterString
     * @return a reversed version of the word parameter.
     */
    private static String reverse(String characterString) {
        String reversedString = new String();
        for (int i = characterString.length() - 1; i >= 0; i--) {
            reversedString = reversedString + characterString.charAt(i);
        }
        return reversedString;
    }

    /**
     * <p>
     * Main method that launches the application.
     * </p>
     * 
     * @param args Optional arguments from standard main method.
     */
    public static void main(String[] args) {
        Palindromes.isPalindrome(24442);
        Palindromes.isPalindrome("abba");
    }
}
