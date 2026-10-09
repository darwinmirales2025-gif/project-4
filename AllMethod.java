public class AllMethod {

    // Method 1: Example - Sum of array elements
    public static int sumArray(int[] arr) {
        int sum = 0;
        for (int num : arr) {
            sum += num;
        }
        return sum;
    }

    // Method 2: Example - Find maximum element in array
    public static int findMax(int[] arr) {
        if (arr == null || arr.length == 0) {
            return Integer.MIN_VALUE; // Or throw an exception
        }
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    // Method 3: Example - Reverse an array
    public static int[] reverseArray(int[] arr) {
        if (arr == null) {
            return null;
        }
        int[] reversed = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            reversed[i] = arr[arr.length - 1 - i];
        }
        return reversed;
    }

    // Method 4: Example - Check if an array contains a specific element
    public static boolean containsElement(int[] arr, int element) {
        if (arr == null) {
            return false;
        }
        for (int num : arr) {
            if (num == element) {
                return true;
            }
        }
        return false;
    }

    // Method 5: Example - Sort an array in ascending order (Bubble Sort)
    public static void sortArray(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return;
        }
        int n = arr.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j + 1]) {
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] myArray = {5, 2, 9, 1, 5, 6};

        System.out.println("Sum of array: " + sumArray(myArray));
        System.out.println("Maximum element: " + findMax(myArray));

        int[] reversedArray = reverseArray(myArray);
        System.out.print("Reversed array: ");
        for (int num : reversedArray) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Array contains 9: " + containsElement(myArray, 9));
        System.out.println("Array contains 10: " + containsElement(myArray, 10));

        sortArray(myArray);
        System.out.print("Sorted array: ");
        for (int num : myArray) {
            System.out.print(num + " ");
        }
        System.out.println();
    }
}
