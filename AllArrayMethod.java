import java.util.Arrays;

public class AllMethod {
    public static void main(String[] args) {
        int[] array = {0, 9, 1, 7, 7, 6, 1, 8, 0, 1, 2};

        // Display original array
        System.out.println("Original Array: " + Arrays.toString(array));

        // Find max and min
        int max = Arrays.stream(array).max().getAsInt();
        int min = Arrays.stream(array).min().getAsInt();
        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        // Calculate sum
        int sum = Arrays.stream(array).sum();
        System.out.println("Sum: " + sum);

        // Reverse the array
        reverseArray(array);
        System.out.println("Reversed Array: " + Arrays.toString(array));
    }

    public static void reverseArray(int[] arr) {
        int left = 0, right = arr.length - 1;
        while (left < right) {
            int temp = arr[left];
            arr[left] = arr[right];
            arr[right] = temp;
            left++;
            right--;
        }
    }
}