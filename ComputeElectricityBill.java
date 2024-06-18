import java.util.Scanner;

class ComputeElectricityBill {
    public static double calculateBill(int units) {
        double bill = 0.0;

        if (units <= 100) {
            bill = units * 1.0;
        } else if (units <= 200) {
            bill = 100 * 1.0 + (units - 100) * 2.5;
        } else if (units <= 500) {
            bill = 100 * 1.0 + 100 * 2.5 + (units - 200) * 4.0;
        } else {
            bill = 100 * 1.0 + 100 * 2.5 + 300 * 4.0 + (units - 500) * 6.0;
        }

        return bill;
    }

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of units: ");
        int units = scanner.nextInt();

        System.out.println("The electricity bill is: " + calculateBill(units));
    }
}