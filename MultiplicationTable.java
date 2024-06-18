
import java.util.Scanner;
public class MultiplicationTable {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number for the multiplication table: ");
        int n = scanner.nextInt();
        System.out.print("Enter the limit of the table: ");
        int l = scanner.nextInt();
        System.out.println("Multiplication table for " + n + " up to " + l + ":");
        for (int i = 1; i <= l; ++i) {
            System.out.println(n + " * " + i + " = " + (n * i));
        }
        scanner.close();
    }
}

