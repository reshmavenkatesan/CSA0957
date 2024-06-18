import java.util.Arrays;

public class SegregateZerosOnes {
    public static void main(String[] args) {
        int[] array = {0, 1, 0, 1, 1, 0, 0, 1, 0};
        
        System.out.println("Original array: " + Arrays.toString(array));
        
        segregateZerosAndOnes(array);
        
        System.out.println("Array after segregation: " + Arrays.toString(array));
    }

    public static void segregateZerosAndOnes(int[] array) {
        int left = 0;
        int right = array.length - 1;

        while (left < right) {
            while (array[left] == 0 && left < right) {
                left++;
            }
            while (array[right] == 1 && left < right) {
                right--;
            }
            if (left < right) {
                array[left] = 0;
                array[right] = 1;
                left++;
                right--;
            }
        }
    }
}
