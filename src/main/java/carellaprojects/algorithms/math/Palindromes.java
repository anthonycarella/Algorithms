package carellaprojects.algorithms.math;

/**
 * A class that detects whether or not a number or string is a palindrome.
 * @author Anthony Carella
 *
 */
public class Palindromes {
    /**
     * Overloaded method that checks if a number is a palindrome.
     * @param number
     * @return true if the returned number reversedNumber equals the number parameter.
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
     * Overloaded method that checks if a string is a palindrome.
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
     * Reverses a number.
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
     * Reverses a string.
     * @param word
     * @return a reversed version of the word parameter.
     */
    private static String reverse(String word) {
        String reversedString = new String();
        for (int i = word.length() - 1; i >= 0; i--) {
            reversedString = reversedString + word.charAt(i);
        }
        return reversedString;
    }

    public static void main(String[] args) {
        Palindromes.isPalindrome(24442);
        Palindromes.isPalindrome("abba");
    }
}
