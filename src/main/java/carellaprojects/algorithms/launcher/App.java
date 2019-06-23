package carellaprojects.algorithms.launcher;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

@SuppressWarnings("unused")
public class App {
    public static void main(String[] args) {
        String str = "NewString"; 
    new App().reverseString(str);
    }

    public void reverseString(String str) {
        String reversedString = reverseString(0, str.length() - 1, str);
        System.out.println(":::String Manupulation");
        System.out.println(reversedString);
    }

    public String reverseString(int start, int end, String str) {
        char[] charArray = str.toCharArray();
        if (start > end) {
            str = charArray.toString();
            return str;
        }
        char temp = charArray[start];
        charArray[start]= charArray[end];
        charArray[end]= temp;
        return reverseString(start + 1, end - 1, str);
    }
}
