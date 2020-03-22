package carellaprojects.algorithms.math;

import java.util.Scanner;

/**
 * Simple Base Converter Program
 * Takes number and radix from a base and to a base. If the from radix or to radix are lower than 2 or higher than 36,
 * then they default to base 10.
 *
 * @author  Anthony Carella
 * @version 1.0
 * @since   2019-08-14
 */
public class SimpleBaseConverter {
    public static String convert(int num, int fromBase, int toBase) {
        return convert(Integer.toString(num), fromBase, toBase);
    }
    public static String convert(String num, int fromBase, int toBase) {
        if (fromBase < Character.MIN_RADIX || fromBase > Character.MAX_RADIX) {
            System.out.println("The fromBase number is not within the radix range. Using base 10 as the default fromBase radix.");
            fromBase = 10;
        }
        if (toBase < Character.MIN_RADIX || toBase > Character.MAX_RADIX) {
            System.out.println("The toBase number is not within the radix range. Using base 10 as the default toBase radix.");
            toBase = 10;
        }
        int convertToBase10 = Integer.parseInt(num, fromBase);
        String convertedNumber = Integer.toString(convertToBase10, toBase);
        return convertedNumber;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println(":::::: Simple Base Converter Program ::::::");
        System.out.println("Input number that will be converted:");
        String numString = scanner.nextLine();
        System.out.println("Input what the base of that number is:");
        String fromBaseString = scanner.nextLine();
        System.out.println("Input what base that number should be converted to:");
        String toBaseString = scanner.nextLine();
        int num = Integer.parseInt(numString);
        int fromBase = Integer.parseInt(fromBaseString);
        int toBase = Integer.parseInt(toBaseString);
        String convertedNumber = SimpleBaseConverter.convert(num, fromBase, toBase);
        System.out.println("Number: " + num + " ::: From Base: " + fromBase + " ::: To Base: " + toBase + " ::: Converted Number: " + convertedNumber);
    }
}
