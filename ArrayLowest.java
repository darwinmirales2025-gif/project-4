public class ArrayLowest {
    public static void main(String[] args) {
        // Given array
        int[] array = {0, 9, 1, 7, 7, 6, 1, 8, 0, 1, 2};

        // Initialize the lowest element with the first element
        int lowest = array[0];

        // Loop through the array to find the lowest element
        for (int i = 1; i < array.length; i++) {
            if (array[i] < lowest) {
                lowest = array[i]; // Update the lowest value
            }
        }

        // Display the lowest element
        System.out.println("Lowest element in the array: " + lowest);
    }
}