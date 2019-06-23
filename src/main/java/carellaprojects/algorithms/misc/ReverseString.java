package carellaprojects.algorithms.misc;

import java.util.Scanner;

public class ReverseString {
    private String reverseString(String str, String algorithmType) {
        String reversedString;
        if (algorithmType.toLowerCase().equals("recursive")) {
            System.out.println("Using recursive method to reverse string.");
            reversedString = reverseString(str, 0, str.length() - 1);
        } else if (algorithmType.toLowerCase().equals("iterative")) {
            System.out.println("Using iterative method to reverse string.");
            reversedString = reverseString(str);
        } else {
            System.out.println("Using Java standard library (StringBuilder().reverse() method) to reverse a string.");
            reversedString = reverseString(new StringBuilder(str));
        }
        return reversedString;
    }

    private String reverseString(String str, int start, int end) {
        if (start > end) return str;
        char[] charArray = str.toCharArray();
        char temp = charArray[start];
        charArray[start] = charArray[end];
        charArray[end] = temp;
        return reverseString(new String(charArray), start + 1, end - 1);
    }

    private String reverseString(String str) {
        char[] charArray = str.toCharArray();
        StringBuilder reversedString = new StringBuilder();
        for (int i = str.length() - 1; i >= 0; i--) {
            reversedString.append(charArray[i]);
        }
        return reversedString.toString();
    }

    private String reverseString(StringBuilder str) {
        return str.reverse().toString();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to reverse:");
        String str = scanner.nextLine();
        System.out.println("Enter the algorithm (1, 2 or 3) you would like to use to reverse this string:");
        System.out.println("1 = recursive");
        System.out.println("2 = iterative");
        System.out.println("3 = java standard library");
        String algorithmSelection = scanner.nextLine();
        String algorithmType;
        if (algorithmSelection.equals("1")) algorithmType = "recursive";
        else if (algorithmSelection.equals("2")) algorithmType = "iterative";
        else algorithmType = "java";
        System.out.println("String: ".concat(str));
        System.out.println("Reversing string...");
        String reversedString = new ReverseString().reverseString(str, algorithmType);
        System.out.println("Reversed string: ".concat(reversedString));
        scanner.close();
    }
}