import java.util.Arrays;

public class InsertElement {
    public static void main(String[] args) {
        int[] originalArray = {21,7,45,90,66,32,86};
        int element = 99;
        int position = 2; 
        System.out.println("Original array: " + Arrays.toString(originalArray));
        int[] newArray = insertElement(originalArray, element, position);
        System.out.println("New array after insertion: " + Arrays.toString(newArray));
    }
    public static int[] insertElement(int[] array, int element, int position) {
        int[] newArray = new int[array.length + 1];
        System.arraycopy(array, 0, newArray, 0, position);
        newArray[position] = element;
        System.arraycopy(array, position, newArray, position + 1, array.length - position);
        return newArray;
    }
}
