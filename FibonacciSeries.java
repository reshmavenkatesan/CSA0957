
import java.util.Scanner;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of terms in the Fibonacci series: ");
        int n = scanner.nextInt();
        int f1 = 0, f2 = 1;
        for (int i = 1; i <= n; ++i) {
            System.out.print(f1 + " ");
            int f3 = f1 + f2;
            f1 = f2;
            f2 = f3;
        }
        scanner.close();
    }
}
