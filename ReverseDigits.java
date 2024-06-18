
import java.util.Scanner;
public class ReverseDigits {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int r = 0;
        while (n != 0) {
            int d = n % 10;
            r = r * 10 + d;
            n = n / 10;
        }
        System.out.println("Reversed number: " + r);
        scanner.close();
    }
}
