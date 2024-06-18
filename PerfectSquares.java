import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class PerfectSquares {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the start of the range: ");
        int start = scanner.nextInt();
        System.out.print("Enter the end of the range: ");
        int end = scanner.nextInt();
        List<Integer> result = new ArrayList<>();
        for (int i = start; i <= end; i++) {
            if (isPerfectSquare(i) && isSumOfDigitsLessThanTen(i)) {
                result.add(i);
            }
        }
        System.out.println("The perfect squares with sum of digits less than 10 in the range [" + start + ", " + end + "] are: " + result);
    }

    public static boolean isPerfectSquare(int num) {
        int sqrt = (int) Math.sqrt(num);
        return sqrt * sqrt == num;
    }

    public static boolean isSumOfDigitsLessThanTen(int num) {
        int sum = 0;
        while (num > 0) {
            int digit = num % 10;
            sum += digit;
            num /= 10;
        }
        return sum < 10;
    }
}