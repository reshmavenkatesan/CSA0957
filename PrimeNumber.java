import java.util.Scanner;
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();
        int divisor = 2;
        int sqrt = (int)Math.sqrt(number);
        while (divisor <= sqrt) {
            if (number % divisor == 0) {
                break;
            }
            divisor++;
        }
        if (number > 1 && divisor > sqrt) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }
        scanner.close();
    }
}