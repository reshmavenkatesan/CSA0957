import java.util.Scanner;

public class RomanToInteger {
    public static int romanToInt(String roman) {
        int result = 0;
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};

        for (int i = 0; i < symbols.length; i++) {
            while (roman.startsWith(symbols[i])) {
                result += values[i];
                roman = roman.substring(symbols[i].length());
            }
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a Roman numeral: ");
        String roman = scanner.nextLine();

        int integer = romanToInt(roman);

        System.out.println("The integer value is: " + integer);
    }
}