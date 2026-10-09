import java.util.Arrays;

public class ArrayConcatenate {
    public static void main(String[] args) {
        int[] array1 = {0, 9, 1, 7, 7, 6};
        int[] array2 = {1, 8, 0, 1, 2};

        // Create new array with size of both arrays combined
        int[] concatenatedArray = new int[array1.length + array2.length];

        // Copy elements of first array
        System.arraycopy(array1, 0, concatenatedArray, 0, array1.length);

        // Copy elements of second array
        System.arraycopy(array2, 0, concatenatedArray, array1.length, array2.length);

        // Display concatenated array
        System.out.println("Concatenated Array: " + Arrays.toString(concatenatedArray));
    }
}