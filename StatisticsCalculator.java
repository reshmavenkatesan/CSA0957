
import java.util.Scanner;
public class StatisticsCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int size = scanner.nextInt();
        int[] numbers = new int[size];
        System.out.println("Enter the numbers:");
        for (int i = 0; i < size; i++) {
            numbers[i] = scanner.nextInt();
        }
        int sum = 0;
        for (int i = 0; i < size; i++) {
            sum += numbers[i];
        }
        int mean = sum / size;
        for (int i = 0; i < size - 1; i++) {
            for (int j = 0; j < size - i - 1; j++) {
                if (numbers[j] > numbers[j + 1]) {
                    int temp = numbers[j];
                    numbers[j] = numbers[j + 1];
                    numbers[j + 1] = temp;
                }
            }
        }
        int median;
        if (size % 2 == 0) {
            median = (numbers[size / 2 - 1] + numbers[size / 2]) / 2;
        } else {
            median = numbers[size / 2];
        }
        int mode = numbers[0];
        int maxCount = 0;
        for (int i = 0; i < size; i++) {
            int count = 0;
            for (int j = 0; j < size; j++) {
                if (numbers[j] == numbers[i]) {
                    count++;
                }
            }
            if (count > maxCount) {
                maxCount = count;
                mode = numbers[i];
            }
        }
        System.out.println("Mean: " + mean);
        System.out.println("Median: " + median);
        System.out.println("Mode: " + mode);
        scanner.close();
    }
}

