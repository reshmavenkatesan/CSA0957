
import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a decimal number: ");
        int d = scanner.nextInt();
        String b = "";
        while (d > 0) {
            int r = d % 2;
            b = r + b;
            d = d / 2;
        }
        System.out.println("Binary equivalent: " + b);
        scanner.close();
    }
}
