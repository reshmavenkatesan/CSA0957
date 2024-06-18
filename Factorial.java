
import java.util.Scanner;
public class Factorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to calculate its factorial: ");
        int n = scanner.nextInt();
        int f = 1;
        for (int i = 1; i <= n; ++i) {
            f *= i;
        }
        System.out.println("Factorial of " + n + " is: " + f);
        scanner.close();
    }
}
