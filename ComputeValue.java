import java.util.Scanner;

public class ComputeValue {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = scanner.nextInt();
        int nn = Integer.parseInt("" + n + n);
        int nnn = Integer.parseInt("" + n + n + n);
        int result = n + nn + nnn;
        System.out.println("The value of n + nn + nnn is: " + result);

        scanner.close();
    }
}
