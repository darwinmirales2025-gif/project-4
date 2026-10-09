public class ArrayLargest {
    public static void main(String[] args) {
        // Given array
        int[] array = {0, 9, 1, 7, 7, 6, 1, 8, 0, 1, 2};

        // Initialize max with the first element
        int max = array[0];

        // Loop through the array to find the largest element
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }

        // Display the largest element
        System.out.println("The largest element in the array is: " + max);
    }
}