import java.util.Arrays;

public class SwapFirstLast {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5};
        System.out.println("Original array: " + Arrays.toString(originalArray));
        
        int[] newArray = swapFirstLast(originalArray);
        System.out.println("New array after swapping: " + Arrays.toString(newArray));
    }

    public static int[] swapFirstLast(int[] array) {
        if (array.length < 2) return array.clone();
        
        int[] newArray = array.clone();
        newArray[0] = array[array.length - 1];
        newArray[array.length - 1] = array[0];
        
        return newArray;
    }
}
