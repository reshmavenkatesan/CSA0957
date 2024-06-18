import java.util.ArrayList;
import java.util.Scanner;
public class NumberFactors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        ArrayList<Integer> factors = new ArrayList<>();
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors.add(i);
            }
        }
        System.out.println("Number of factors: " + factors.size());
        System.out.print("Factors: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println();
        System.out.print("Enter the value of n to find the nth factor: ");
        int n = scanner.nextInt();
        if (n > 0 && n <= factors.size()) {
            System.out.println("The " + n + "th factor is: " + factors.get(n - 1));
        } else {
            System.out.println("Invalid value of n. Please enter a value between 1 and " + factors.size() + ".");
        }
        scanner.close();
    }
}
