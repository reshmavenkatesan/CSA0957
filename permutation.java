import java.util.*;

public class permutation {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        String num = scanner.next();
        permutation(num.toCharArray(), 0);
    }

    private static void permutation(char[] chars, int index) {
        if (index == chars.length - 1) {
            System.out.println(new String(chars));
        } else {
            for (int i = index; i < chars.length; i++) {
                swap(chars, index, i);
                permutation(chars, index + 1);
                swap(chars, index, i);
            }
        }
    }

    private static void swap(char[] chars, int i, int j) {
        char temp = chars[i];
        chars[i] = chars[j];
        chars[j] = temp;
    }
}