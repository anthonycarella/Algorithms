package carellaprojects.algorithms.misc;

public class Palindromes {
    public static boolean isPalindrome(int number) {
        int reversedNumber = Palindromes.reverseNumber(number);
        if (number == reversedNumber) {
            System.out.println(number + " is a palindrome.");
            return true;
        } else {
            System.out.println(number + " is not a palindrome.");
            return false;
        }
    }

    public static boolean isPalindromeString(int number) {
        int reversedNumber = Palindromes.reverseNumberString(number);
        if (number == reversedNumber) {
            System.out.println(number + " is a palindrome.");
            return true;
        } else {
            System.out.println(number + " is not a palindrome.");
            return false;
        }
    }
    
    private static int reverseNumber(int number) {
        int reverse = 0;
        while(number != 0) {
            reverse = reverse * 10;
            reverse = reverse + number % 10;
            number = number / 10;
        }
        return reverse;
    }

    private static int reverseNumberString(int number) {
        String numberString = Integer.toString(number);
        String reversedNumberString = new String();
        for (int i = numberString.length() - 1; i >= 0; i--) {
            reversedNumberString = reversedNumberString + numberString.charAt(i);
        }
        int newReversedNumber = Integer.parseInt(reversedNumberString);
        return newReversedNumber;
    }

    public static void main(String[] args) {
        Palindromes.isPalindrome(24442);
        Palindromes.isPalindromeString(9229);
    }
}
